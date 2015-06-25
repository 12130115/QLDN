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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.nlu.doanhnghiep.service.ClpSerializer;
import com.nlu.doanhnghiep.service.KhuVucLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anh ba khia
 */
public class KhuVucClp extends BaseModelImpl<KhuVuc> implements KhuVuc {
	public KhuVucClp() {
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
	public long getPrimaryKey() {
		return _kvid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setKvid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _kvid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getKvid() {
		return _kvid;
	}

	@Override
	public void setKvid(long kvid) {
		_kvid = kvid;

		if (_khuVucRemoteModel != null) {
			try {
				Class<?> clazz = _khuVucRemoteModel.getClass();

				Method method = clazz.getMethod("setKvid", long.class);

				method.invoke(_khuVucRemoteModel, kvid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_khuVucRemoteModel != null) {
			try {
				Class<?> clazz = _khuVucRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_khuVucRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getNgayAdd() {
		return _ngayAdd;
	}

	@Override
	public void setNgayAdd(Date ngayAdd) {
		_ngayAdd = ngayAdd;

		if (_khuVucRemoteModel != null) {
			try {
				Class<?> clazz = _khuVucRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayAdd", Date.class);

				method.invoke(_khuVucRemoteModel, ngayAdd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenKv() {
		return _tenKv;
	}

	@Override
	public void setTenKv(String tenKv) {
		_tenKv = tenKv;

		if (_khuVucRemoteModel != null) {
			try {
				Class<?> clazz = _khuVucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenKv", String.class);

				method.invoke(_khuVucRemoteModel, tenKv);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _diaChi;
	}

	@Override
	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;

		if (_khuVucRemoteModel != null) {
			try {
				Class<?> clazz = _khuVucRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_khuVucRemoteModel, diaChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKhuVucRemoteModel() {
		return _khuVucRemoteModel;
	}

	public void setKhuVucRemoteModel(BaseModel<?> khuVucRemoteModel) {
		_khuVucRemoteModel = khuVucRemoteModel;
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

		Class<?> remoteModelClass = _khuVucRemoteModel.getClass();

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

		Object returnValue = method.invoke(_khuVucRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KhuVucLocalServiceUtil.addKhuVuc(this);
		}
		else {
			KhuVucLocalServiceUtil.updateKhuVuc(this);
		}
	}

	@Override
	public KhuVuc toEscapedModel() {
		return (KhuVuc)ProxyUtil.newProxyInstance(KhuVuc.class.getClassLoader(),
			new Class[] { KhuVuc.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KhuVucClp clone = new KhuVucClp();

		clone.setKvid(getKvid());
		clone.setUserId(getUserId());
		clone.setNgayAdd(getNgayAdd());
		clone.setTenKv(getTenKv());
		clone.setDiaChi(getDiaChi());

		return clone;
	}

	@Override
	public int compareTo(KhuVuc khuVuc) {
		long primaryKey = khuVuc.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhuVucClp)) {
			return false;
		}

		KhuVucClp khuVuc = (KhuVucClp)obj;

		long primaryKey = khuVuc.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
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
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{kvid=");
		sb.append(getKvid());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", ngayAdd=");
		sb.append(getNgayAdd());
		sb.append(", tenKv=");
		sb.append(getTenKv());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.nlu.doanhnghiep.model.KhuVuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kvid</column-name><column-value><![CDATA[");
		sb.append(getKvid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayAdd</column-name><column-value><![CDATA[");
		sb.append(getNgayAdd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenKv</column-name><column-value><![CDATA[");
		sb.append(getTenKv());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _kvid;
	private long _userId;
	private String _userUuid;
	private Date _ngayAdd;
	private String _tenKv;
	private String _diaChi;
	private BaseModel<?> _khuVucRemoteModel;
	private Class<?> _clpSerializerClass = com.nlu.doanhnghiep.service.ClpSerializer.class;
}