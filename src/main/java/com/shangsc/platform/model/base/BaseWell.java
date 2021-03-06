package com.shangsc.platform.model.base;

import com.shangsc.platform.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWell<M extends BaseWell<M>> extends BaseModel<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}

	public void setCode(String code) {
		set("code", code);
	}

	public String getCode() {
		return get("code");
	}

	public void setName(String name) {
		set("name", name);
	}

	public String getName() {
		return get("name");
	}

	public void setCompanyId(Long companyId) {
		set("company_id", companyId);
	}

	public Long getCompanyId() {
		return get("company_id");
	}

	public void setTownship(String township) {
		set("township", township);
	}

	public String getTownship() {
		return get("township");
	}

	public void setVillage(String village) {
		set("village", village);
	}

	public String getVillage() {
		return get("village");
	}

	public void setAddress(String address) {
		set("address", address);
	}

	public String getAddress() {
		return get("address");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setWellDepth(Integer wellDepth) {
		set("well_depth", wellDepth);
	}

	public Integer getWellDepth() {
		return get("well_depth");
	}

	public void setGroundDepth(Integer groundDepth) {
		set("ground_depth", groundDepth);
	}

	public Integer getGroundDepth() {
		return get("ground_depth");
	}

	public void setOneselfWell(Integer oneselfWell) {
		set("oneself_well", oneselfWell);
	}

	public Integer getOneselfWell() {
		return get("oneself_well");
	}

	public void setInnerDiameter(Integer innerDiameter) {
		set("inner_diameter", innerDiameter);
	}

	public Integer getInnerDiameter() {
		return get("inner_diameter");
	}

	public void setMaterial(String material) {
		set("material", material);
	}

	public String getMaterial() {
		return get("material");
	}

	public void setApplication(String application) {
		set("application", application);
	}

	public String getApplication() {
		return get("application");
	}

	public void setElectromechanics(Integer electromechanics) {
		set("electromechanics", electromechanics);
	}

	public Integer getElectromechanics() {
		return get("electromechanics");
	}

	public void setCalculateWater(Integer calculateWater) {
		set("calculate_water", calculateWater);
	}

	public Integer getCalculateWater() {
		return get("calculate_water");
	}

	public void setPumpModel(String pumpModel) {
		set("pump_model", pumpModel);
	}

	public String getPumpModel() {
		return get("pump_model");
	}

	public void setCalculateType(Integer calculateType) {
		set("calculate_type", calculateType);
	}

	public Integer getCalculateType() {
		return get("calculate_type");
	}

	public void setAboveScale(Integer aboveScale) {
		set("above_scale", aboveScale);
	}

	public Integer getAboveScale() {
		return get("above_scale");
	}

	public void setGeomorphicType(Integer geomorphicType) {
		set("geomorphic_type", geomorphicType);
	}

	public Integer getGeomorphicType() {
		return get("geomorphic_type");
	}

	public void setGroundType(Integer groundType) {
		set("ground_type", groundType);
	}

	public Integer getGroundType() {
		return get("ground_type");
	}

	public void setNameCode(String nameCode) {
		set("name_code", nameCode);
	}

	public String getNameCode() {
		return get("name_code");
	}

	public void setWaterType(Integer waterType) {
		set("water_type", waterType);
	}

	public Integer getWaterType() {
		return get("water_type");
	}

	public void setUseEfficiency(String useEfficiency) {
		set("use_efficiency", useEfficiency);
	}

	public String getUseEfficiency() {
		return get("use_efficiency");
	}

	public void setMethod(String method) {
		set("method", method);
	}

	public String getMethod() {
		return get("method");
	}

	public void setLicence(Integer licence) {
		set("licence", licence);
	}

	public Integer getLicence() {
		return get("licence");
	}

	public void setLicenceCode(String licenceCode) {
		set("licence_code", licenceCode);
	}

	public String getLicenceCode() {
		return get("licence_code");
	}

	public void setWaterWithdrawals(Integer waterWithdrawals) {
		set("water_withdrawals", waterWithdrawals);
	}

	public Integer getWaterWithdrawals() {
		return get("water_withdrawals");
	}

}
