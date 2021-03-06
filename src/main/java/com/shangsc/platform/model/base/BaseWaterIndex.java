package com.shangsc.platform.model.base;

import com.shangsc.platform.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWaterIndex<M extends BaseWaterIndex<M>> extends BaseModel<M> implements IBean {

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

	public void setWaterUse(String waterUse) {
		set("water_use", waterUse);
	}

	public String getWaterUse() {
		return get("water_use");
	}

	public void setWaterIndex(Integer waterIndex) {
		set("water_index", waterIndex);
	}

	public Integer getWaterIndex() {
		return get("water_index");
	}

	public void setJanuary(Integer January) {
		set("January", January);
	}

	public Integer getJanuary() {
		return get("January");
	}

	public void setFebruary(Integer February) {
		set("February", February);
	}

	public Integer getFebruary() {
		return get("February");
	}

	public void setMarch(Integer March) {
		set("March", March);
	}

	public Integer getMarch() {
		return get("March");
	}

	public void setApril(Integer April) {
		set("April", April);
	}

	public Integer getApril() {
		return get("April");
	}

	public void setMay(Integer May) {
		set("May", May);
	}

	public Integer getMay() {
		return get("May");
	}

	public void setJune(Integer June) {
		set("June", June);
	}

	public Integer getJune() {
		return get("June");
	}

	public void setJuly(Integer July) {
		set("July", July);
	}

	public Integer getJuly() {
		return get("July");
	}

	public void setAugust(Integer August) {
		set("August", August);
	}

	public Integer getAugust() {
		return get("August");
	}

	public void setSeptember(Integer September) {
		set("September", September);
	}

	public Integer getSeptember() {
		return get("September");
	}

	public void setOctober(Integer October) {
		set("October", October);
	}

	public Integer getOctober() {
		return get("October");
	}

	public void setNovember(Integer November) {
		set("November", November);
	}

	public Integer getNovember() {
		return get("November");
	}

	public void setDecember(Integer December) {
		set("December", December);
	}

	public Integer getDecember() {
		return get("December");
	}

}
