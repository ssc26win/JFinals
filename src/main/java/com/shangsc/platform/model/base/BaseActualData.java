package com.shangsc.platform.model.base;

import com.shangsc.platform.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseActualData<M extends BaseActualData<M>> extends BaseModel<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}

	public void setCompanyId(Long companyId) {
		set("company_id", companyId);
	}

	public Long getCompanyId() {
		return get("company_id");
	}

	public void setLineNum(String lineNum) {
		set("line_num", lineNum);
	}

	public String getLineNum() {
		return get("line_num");
	}

	public void setWatermeterNum(String watermeterNum) {
		set("watermeter_num", watermeterNum);
	}

	public String getWatermeterNum() {
		return get("watermeter_num");
	}

	public void setWatersType(Integer watersType) {
		set("waters_type", watersType);
	}

	public Integer getWatersType() {
		return get("waters_type");
	}

	public void setAlarm(String alarm) {
		set("alarm", alarm);
	}

	public String getAlarm() {
		return get("alarm");
	}

	public void setNetWater(Integer netWater) {
		set("net_water", netWater);
	}

	public Integer getNetWater() {
		return get("net_water");
	}

	public void setState(Integer state) {
		set("state", state);
	}

	public Integer getState() {
		return get("state");
	}

	public void setWriteTime(java.util.Date writeTime) {
		set("write_time", writeTime);
	}

	public java.util.Date getWriteTime() {
		return get("write_time");
	}

	public void setVoltage(String voltage) {
		set("voltage", voltage);
	}

	public String getVoltage() {
		return get("voltage");
	}

}
