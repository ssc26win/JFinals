package com.shangsc.platform.controller.app;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.shangsc.platform.core.auth.anno.RequiresPermissions;
import com.shangsc.platform.core.controller.JCBaseController;
import com.shangsc.platform.core.util.DateUtils;
import com.shangsc.platform.core.util.FileUtils;
import com.shangsc.platform.core.util.JqGridModelUtils;
import com.shangsc.platform.core.view.InvokeResult;
import com.shangsc.platform.model.AppVersion;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.upload.UploadFile;

public class AppVersionController extends JCBaseController {
	
	@RequiresPermissions(value={"/app"})
	public void index() {
		this.setAttr("static_url", PropKit.get("static_url"));
		render("index.jsp");
	}
	
	@RequiresPermissions(value={"/app"})
	public void getListData() {
		Page<AppVersion> pageInfo=AppVersion.dao.getPage(this.getPage(), this.getRows(),this.getOrderby());
		this.renderJson(JqGridModelUtils.toJqGridView(pageInfo)); 
	}
	
	@RequiresPermissions(value={"/app"})
	public void setVisible(){
		int visible=this.getParaToInt("visible");
		String ids=this.getPara("ids");
		InvokeResult result=AppVersion.dao.setVisible(ids, visible);
		this.renderJson(result);
	}
	@RequiresPermissions(value={"/app"})
	public void addApp(){
		Integer id=getParaToInt("id");
		String action="add";
		if(id!=null){
			this.setAttr("item", AppVersion.dao.findById(id));
			action="edit";
		}
		this.setAttr("action", action);
		render("app_add.jsp");
	}
	@RequiresPermissions(value={"/app"})
	public void saveApp(){
		Integer id=getParaToInt("id");
		String content=getPara("content");
		String linkUrl=getPara("linkUrl");
		Integer natureNo=getParaToInt("natureNo");
		String os=getPara("os");
		String url=getPara("url");
		String versionNo=getPara("versionNo");
		Integer status=getParaToInt("status");
		Integer isForce=getParaToInt("isForce");
		InvokeResult result=AppVersion.dao.saveAppVersion(id, content, linkUrl,
				natureNo,os, url, versionNo, status, isForce);
		this.renderJson(result);
	}
	
	@RequiresPermissions(value={"/app"})
	public void uploadApk() {
		String dataStr=DateUtils.format(new Date(), "yyyyMMddHHmm");
		List<UploadFile> flist = this.getFiles("/temp", 1024*1024*50);
		Map<String,Object> data=Maps.newHashMap();
		if(flist.size()>0){
			UploadFile uf=flist.get(0);
			String status_url=PropKit.get("static_url");
			String fileUrl="apk/"+dataStr+"/"+uf.getFileName();
			String newFile=PropKit.get("uploadPath")+fileUrl;
			FileUtils.mkdir(newFile, false); 
			FileUtils.copy(uf.getFile(), new File(newFile), BUFFER_SIZE);
			uf.getFile().delete();
			data.put("staticUrl",status_url);
			data.put("fileUrl",fileUrl);
			renderJson(data);
		}
	}
}