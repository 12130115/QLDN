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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.nlu.QLDN3.db.service.ClpSerializer;
import com.nlu.QLDN3.db.service.NhanVienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ThanhToa-PC
 */
public class NhanVienClp extends BaseModelImpl<NhanVien> implements NhanVien {
	public NhanVienClp() {
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
	public String getPrimaryKey() {
		return _maNhanVien;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setMaNhanVien(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _maNhanVien;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
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

	@Override
	public String getMaNhanVien() {
		return _maNhanVien;
	}

	@Override
	public void setMaNhanVien(String maNhanVien) {
		_maNhanVien = maNhanVien;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setMaNhanVien", String.class);

				method.invoke(_nhanVienRemoteModel, maNhanVien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaCongTy() {
		return _maCongTy;
	}

	@Override
	public void setMaCongTy(String maCongTy) {
		_maCongTy = maCongTy;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setMaCongTy", String.class);

				method.invoke(_nhanVienRemoteModel, maCongTy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenNhanVien() {
		return _tenNhanVien;
	}

	@Override
	public void setTenNhanVien(String tenNhanVien) {
		_tenNhanVien = tenNhanVien;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setTenNhanVien", String.class);

				method.invoke(_nhanVienRemoteModel, tenNhanVien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNgaySinh() {
		return _ngaySinh;
	}

	@Override
	public void setNgaySinh(String ngaySinh) {
		_ngaySinh = ngaySinh;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySinh", String.class);

				method.invoke(_nhanVienRemoteModel, ngaySinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGioiTinh() {
		return _gioiTinh;
	}

	@Override
	public void setGioiTinh(String gioiTinh) {
		_gioiTinh = gioiTinh;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinh", String.class);

				method.invoke(_nhanVienRemoteModel, gioiTinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSDT() {
		return _SDT;
	}

	@Override
	public void setSDT(String SDT) {
		_SDT = SDT;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setSDT", String.class);

				method.invoke(_nhanVienRemoteModel, SDT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNgayVaoLam() {
		return _ngayVaoLam;
	}

	@Override
	public void setNgayVaoLam(String ngayVaoLam) {
		_ngayVaoLam = ngayVaoLam;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayVaoLam", String.class);

				method.invoke(_nhanVienRemoteModel, ngayVaoLam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNhanVienRemoteModel() {
		return _nhanVienRemoteModel;
	}

	public void setNhanVienRemoteModel(BaseModel<?> nhanVienRemoteModel) {
		_nhanVienRemoteModel = nhanVienRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _nhanVienRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_nhanVienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NhanVienLocalServiceUtil.addNhanVien(this);
		}
		else {
			NhanVienLocalServiceUtil.updateNhanVien(this);
		}
	}

	@Override
	public NhanVien toEscapedModel() {
		return (NhanVien)ProxyUtil.newProxyInstance(NhanVien.class.getClassLoader(),
			new Class[] { NhanVien.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NhanVienClp clone = new NhanVienClp();

		clone.setMaNhanVien(getMaNhanVien());
		clone.setMaCongTy(getMaCongTy());
		clone.setTenNhanVien(getTenNhanVien());
		clone.setNgaySinh(getNgaySinh());
		clone.setGioiTinh(getGioiTinh());
		clone.setSDT(getSDT());
		clone.setNgayVaoLam(getNgayVaoLam());

		return clone;
	}

	@Override
	public int compareTo(NhanVien nhanVien) {
		String primaryKey = nhanVien.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NhanVienClp)) {
			return false;
		}

		NhanVienClp nhanVien = (NhanVienClp)obj;

		String primaryKey = nhanVien.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{maNhanVien=");
		sb.append(getMaNhanVien());
		sb.append(", maCongTy=");
		sb.append(getMaCongTy());
		sb.append(", tenNhanVien=");
		sb.append(getTenNhanVien());
		sb.append(", ngaySinh=");
		sb.append(getNgaySinh());
		sb.append(", gioiTinh=");
		sb.append(getGioiTinh());
		sb.append(", SDT=");
		sb.append(getSDT());
		sb.append(", ngayVaoLam=");
		sb.append(getNgayVaoLam());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.nlu.QLDN3.db.model.NhanVien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>maNhanVien</column-name><column-value><![CDATA[");
		sb.append(getMaNhanVien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maCongTy</column-name><column-value><![CDATA[");
		sb.append(getMaCongTy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenNhanVien</column-name><column-value><![CDATA[");
		sb.append(getTenNhanVien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySinh</column-name><column-value><![CDATA[");
		sb.append(getNgaySinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioiTinh</column-name><column-value><![CDATA[");
		sb.append(getGioiTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SDT</column-name><column-value><![CDATA[");
		sb.append(getSDT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayVaoLam</column-name><column-value><![CDATA[");
		sb.append(getNgayVaoLam());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _maNhanVien;
	private String _maCongTy;
	private String _tenNhanVien;
	private String _ngaySinh;
	private String _gioiTinh;
	private String _SDT;
	private String _ngayVaoLam;
	private BaseModel<?> _nhanVienRemoteModel;
	private Class<?> _clpSerializerClass = com.nlu.QLDN3.db.service.ClpSerializer.class;
}