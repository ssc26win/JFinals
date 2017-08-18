package com.shangsc.platform.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("access_token", "uid", AccessToken.class);
		arp.addMapping("app_version", "id", AppVersion.class);
		arp.addMapping("dict_data", "id", DictData.class);
		arp.addMapping("dict_type", "id", DictType.class);
		arp.addMapping("sys_log", "id", SysLog.class);
		arp.addMapping("sys_login_record", "id", SysLoginRecord.class);
		arp.addMapping("sys_res", "id", SysRes.class);
		arp.addMapping("sys_role", "id", SysRole.class);
		arp.addMapping("sys_role_res", "id", SysRoleRes.class);
		arp.addMapping("sys_user", "id", SysUser.class);
		arp.addMapping("sys_user_role", "id", SysUserRole.class);
	}
}

