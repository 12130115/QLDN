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

package com.nlu.QLDN3.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NhanVien}.
 * </p>
 *
 * @author ThanhToa-PC
 * @see NhanVien
 * @generated
 */
public class NhanVienWrapper implements NhanVien, ModelWrapper<NhanVien> {
	public NhanVienWrapper(NhanVien nhanVien) {
		_nhanVien = nhanVien;
	}

	@Override
	public Class<?> getModelClass() {
		return NhanVien.class;
	}

	@Override
	public String getModelClassName() {
		return NhanVien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("maNhanVien", getMaNhanVien());
		attributes.put("maCongTy", getMaCongTy());
		attributes.put("tenNhanVien", getTenNhanVien());
		attributes.put("ngaySinh", getNgaySinh());
		attributes.put("gioiTinh", getGioiTinh());
		attributes.put("SDT", getSDT());
		attributes.put("ngayVaoLam", getNgayVaoLam());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String maNhanVien = (String)attributes.get("maNhanVien");

		if (maNhanVien != null) {
			setMaNhanVien(maNhanVien);
		}

		String maCongTy = (String)attributes.get("maCongTy");

		if (maCongTy != null) {
			setMaCongTy(maCongTy);
		}

		String tenNhanVien = (String)attributes.get("tenNhanVien");

		if (tenNhanVien != null) {
			setTenNhanVien(tenNhanVien);
		}

		String ngaySinh = (String)attributes.get("ngaySinh");

		if (ngaySinh != null) {
			setNgaySinh(ngaySinh);
		}

		String gioiTinh = (String)attributes.get("gioiTinh");

		if (gioiTinh != null) {
			setGioiTinh(gioiTinh);
		}

		String SDT = (String)attributes.get("SDT");

		if (SDT != null) {
			setSDT(SDT);
		}

		String ngayVaoLam = (String)attributes.get("ngayVaoLam");

		if (ngayVaoLam != null) {
			setNgayVaoLam(ngayVaoLam);
		}
	}

	/**
	* Returns the primary key of this nhan vien.
	*
	* @return the primary key of this nhan vien
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _nhanVien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nhan vien.
	*
	* @param primaryKey the primary key of this nhan vien
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_nhanVien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ma nhan vien of this nhan vien.
	*
	* @return the ma nhan vien of this nhan vien
	*/
	@Override
	public java.lang.String getMaNhanVien() {
		return _nhanVien.getMaNhanVien();
	}

	/**
	* Sets the ma nhan vien of this nhan vien.
	*
	* @param maNhanVien the ma nhan vien of this nhan vien
	*/
	@Override
	public void setMaNhanVien(java.lang.String maNhanVien) {
		_nhanVien.setMaNhanVien(maNhanVien);
	}

	/**
	* Returns the ma cong ty of this nhan vien.
	*
	* @return the ma cong ty of this nhan vien
	*/
	@Override
	public java.lang.String getMaCongTy() {
		return _nhanVien.getMaCongTy();
	}

	/**
	* Sets the ma cong ty of this nhan vien.
	*
	* @param maCongTy the ma cong ty of this nhan vien
	*/
	@Override
	public void setMaCongTy(java.lang.String maCongTy) {
		_nhanVien.setMaCongTy(maCongTy);
	}

	/**
	* Returns the ten nhan vien of this nhan vien.
	*
	* @return the ten nhan vien of this nhan vien
	*/
	@Override
	public java.lang.String getTenNhanVien() {
		return _nhanVien.getTenNhanVien();
	}

	/**
	* Sets the ten nhan vien of this nhan vien.
	*
	* @param tenNhanVien the ten nhan vien of this nhan vien
	*/
	@Override
	public void setTenNhanVien(java.lang.String tenNhanVien) {
		_nhanVien.setTenNhanVien(tenNhanVien);
	}

	/**
	* Returns the ngay sinh of this nhan vien.
	*
	* @return the ngay sinh of this nhan vien
	*/
	@Override
	public java.lang.String getNgaySinh() {
		return _nhanVien.getNgaySinh();
	}

	/**
	* Sets the ngay sinh of this nhan vien.
	*
	* @param ngaySinh the ngay sinh of this nhan vien
	*/
	@Override
	public void setNgaySinh(java.lang.String ngaySinh) {
		_nhanVien.setNgaySinh(ngaySinh);
	}

	/**
	* Returns the gioi tinh of this nhan vien.
	*
	* @return the gioi tinh of this nhan vien
	*/
	@Override
	public java.lang.String getGioiTinh() {
		return _nhanVien.getGioiTinh();
	}

	/**
	* Sets the gioi tinh of this nhan vien.
	*
	* @param gioiTinh the gioi tinh of this nhan vien
	*/
	@Override
	public void setGioiTinh(java.lang.String gioiTinh) {
		_nhanVien.setGioiTinh(gioiTinh);
	}

	/**
	* Returns the s d t of this nhan vien.
	*
	* @return the s d t of this nhan vien
	*/
	@Override
	public java.lang.String getSDT() {
		return _nhanVien.getSDT();
	}

	/**
	* Sets the s d t of this nhan vien.
	*
	* @param SDT the s d t of this nhan vien
	*/
	@Override
	public void setSDT(java.lang.String SDT) {
		_nhanVien.setSDT(SDT);
	}

	/**
	* Returns the ngay vao lam of this nhan vien.
	*
	* @return the ngay vao lam of this nhan vien
	*/
	@Override
	public java.lang.String getNgayVaoLam() {
		return _nhanVien.getNgayVaoLam();
	}

	/**
	* Sets the ngay vao lam of this nhan vien.
	*
	* @param ngayVaoLam the ngay vao lam of this nhan vien
	*/
	@Override
	public void setNgayVaoLam(java.lang.String ngayVaoLam) {
		_nhanVien.setNgayVaoLam(ngayVaoLam);
	}

	@Override
	public boolean isNew() {
		return _nhanVien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nhanVien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nhanVien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nhanVien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nhanVien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nhanVien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nhanVien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nhanVien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nhanVien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nhanVien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nhanVien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NhanVienWrapper((NhanVien)_nhanVien.clone());
	}

	@Override
	public int compareTo(com.nlu.QLDN3.db.model.NhanVien nhanVien) {
		return _nhanVien.compareTo(nhanVien);
	}

	@Override
	public int hashCode() {
		return _nhanVien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.nlu.QLDN3.db.model.NhanVien> toCacheModel() {
		return _nhanVien.toCacheModel();
	}

	@Override
	public com.nlu.QLDN3.db.model.NhanVien toEscapedModel() {
		return new NhanVienWrapper(_nhanVien.toEscapedModel());
	}

	@Override
	public com.nlu.QLDN3.db.model.NhanVien toUnescapedModel() {
		return new NhanVienWrapper(_nhanVien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nhanVien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nhanVien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nhanVien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NhanVienWrapper)) {
			return false;
		}

		NhanVienWrapper nhanVienWrapper = (NhanVienWrapper)obj;

		if (Validator.equals(_nhanVien, nhanVienWrapper._nhanVien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NhanVien getWrappedNhanVien() {
		return _nhanVien;
	}

	@Override
	public NhanVien getWrappedModel() {
		return _nhanVien;
	}

	@Override
	public void resetOriginalValues() {
		_nhanVien.resetOriginalValues();
	}

	private NhanVien _nhanVien;
}