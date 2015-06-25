/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nlu.doanhnghiep.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KhuVuc}.
 * </p>
 *
 * @author Anh ba khia
 * @see KhuVuc
 * @generated
 */
public class KhuVucWrapper implements KhuVuc, ModelWrapper<KhuVuc> {
	public KhuVucWrapper(KhuVuc khuVuc) {
		_khuVuc = khuVuc;
	}

	@Override
	public Class<?> getModelClass() {
		return KhuVuc.class;
	}

	@Override
	public String getModelClassName() {
		return KhuVuc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kvid", getKvid());
		attributes.put("userId", getUserId());
		attributes.put("ngayAdd", getNgayAdd());
		attributes.put("tenKv", getTenKv());
		attributes.put("diaChi", getDiaChi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long kvid = (Long)attributes.get("kvid");

		if (kvid != null) {
			setKvid(kvid);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date ngayAdd = (Date)attributes.get("ngayAdd");

		if (ngayAdd != null) {
			setNgayAdd(ngayAdd);
		}

		String tenKv = (String)attributes.get("tenKv");

		if (tenKv != null) {
			setTenKv(tenKv);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}
	}

	/**
	* Returns the primary key of this khu vuc.
	*
	* @return the primary key of this khu vuc
	*/
	@Override
	public long getPrimaryKey() {
		return _khuVuc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this khu vuc.
	*
	* @param primaryKey the primary key of this khu vuc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_khuVuc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the kvid of this khu vuc.
	*
	* @return the kvid of this khu vuc
	*/
	@Override
	public long getKvid() {
		return _khuVuc.getKvid();
	}

	/**
	* Sets the kvid of this khu vuc.
	*
	* @param kvid the kvid of this khu vuc
	*/
	@Override
	public void setKvid(long kvid) {
		_khuVuc.setKvid(kvid);
	}

	/**
	* Returns the user ID of this khu vuc.
	*
	* @return the user ID of this khu vuc
	*/
	@Override
	public long getUserId() {
		return _khuVuc.getUserId();
	}

	/**
	* Sets the user ID of this khu vuc.
	*
	* @param userId the user ID of this khu vuc
	*/
	@Override
	public void setUserId(long userId) {
		_khuVuc.setUserId(userId);
	}

	/**
	* Returns the user uuid of this khu vuc.
	*
	* @return the user uuid of this khu vuc
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khuVuc.getUserUuid();
	}

	/**
	* Sets the user uuid of this khu vuc.
	*
	* @param userUuid the user uuid of this khu vuc
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_khuVuc.setUserUuid(userUuid);
	}

	/**
	* Returns the ngay add of this khu vuc.
	*
	* @return the ngay add of this khu vuc
	*/
	@Override
	public java.util.Date getNgayAdd() {
		return _khuVuc.getNgayAdd();
	}

	/**
	* Sets the ngay add of this khu vuc.
	*
	* @param ngayAdd the ngay add of this khu vuc
	*/
	@Override
	public void setNgayAdd(java.util.Date ngayAdd) {
		_khuVuc.setNgayAdd(ngayAdd);
	}

	/**
	* Returns the ten kv of this khu vuc.
	*
	* @return the ten kv of this khu vuc
	*/
	@Override
	public java.lang.String getTenKv() {
		return _khuVuc.getTenKv();
	}

	/**
	* Sets the ten kv of this khu vuc.
	*
	* @param tenKv the ten kv of this khu vuc
	*/
	@Override
	public void setTenKv(java.lang.String tenKv) {
		_khuVuc.setTenKv(tenKv);
	}

	/**
	* Returns the dia chi of this khu vuc.
	*
	* @return the dia chi of this khu vuc
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _khuVuc.getDiaChi();
	}

	/**
	* Sets the dia chi of this khu vuc.
	*
	* @param diaChi the dia chi of this khu vuc
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_khuVuc.setDiaChi(diaChi);
	}

	@Override
	public boolean isNew() {
		return _khuVuc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_khuVuc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _khuVuc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_khuVuc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _khuVuc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _khuVuc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_khuVuc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _khuVuc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_khuVuc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_khuVuc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_khuVuc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KhuVucWrapper((KhuVuc)_khuVuc.clone());
	}

	@Override
	public int compareTo(com.nlu.doanhnghiep.model.KhuVuc khuVuc) {
		return _khuVuc.compareTo(khuVuc);
	}

	@Override
	public int hashCode() {
		return _khuVuc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nlu.doanhnghiep.model.KhuVuc> toCacheModel() {
		return _khuVuc.toCacheModel();
	}

	@Override
	public com.nlu.doanhnghiep.model.KhuVuc toEscapedModel() {
		return new KhuVucWrapper(_khuVuc.toEscapedModel());
	}

	@Override
	public com.nlu.doanhnghiep.model.KhuVuc toUnescapedModel() {
		return new KhuVucWrapper(_khuVuc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _khuVuc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _khuVuc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_khuVuc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhuVucWrapper)) {
			return false;
		}

		KhuVucWrapper khuVucWrapper = (KhuVucWrapper)obj;

		if (Validator.equals(_khuVuc, khuVucWrapper._khuVuc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KhuVuc getWrappedKhuVuc() {
		return _khuVuc;
	}

	@Override
	public KhuVuc getWrappedModel() {
		return _khuVuc;
	}

	@Override
	public void resetOriginalValues() {
		_khuVuc.resetOriginalValues();
	}

	private KhuVuc _khuVuc;
}