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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.nlu.doanhnghiep.service.http.KhuVucServiceSoap}.
 *
 * @author Anh ba khia
 * @see com.nlu.doanhnghiep.service.http.KhuVucServiceSoap
 * @generated
 */
public class KhuVucSoap implements Serializable {
	public static KhuVucSoap toSoapModel(KhuVuc model) {
		KhuVucSoap soapModel = new KhuVucSoap();

		soapModel.setKvid(model.getKvid());
		soapModel.setUserId(model.getUserId());
		soapModel.setNgayAdd(model.getNgayAdd());
		soapModel.setTenKv(model.getTenKv());
		soapModel.setDiaChi(model.getDiaChi());

		return soapModel;
	}

	public static KhuVucSoap[] toSoapModels(KhuVuc[] models) {
		KhuVucSoap[] soapModels = new KhuVucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KhuVucSoap[][] toSoapModels(KhuVuc[][] models) {
		KhuVucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KhuVucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KhuVucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KhuVucSoap[] toSoapModels(List<KhuVuc> models) {
		List<KhuVucSoap> soapModels = new ArrayList<KhuVucSoap>(models.size());

		for (KhuVuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KhuVucSoap[soapModels.size()]);
	}

	public KhuVucSoap() {
	}

	public long getPrimaryKey() {
		return _kvid;
	}

	public void setPrimaryKey(long pk) {
		setKvid(pk);
	}

	public long getKvid() {
		return _kvid;
	}

	public void setKvid(long kvid) {
		_kvid = kvid;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getNgayAdd() {
		return _ngayAdd;
	}

	public void setNgayAdd(Date ngayAdd) {
		_ngayAdd = ngayAdd;
	}

	public String getTenKv() {
		return _tenKv;
	}

	public void setTenKv(String tenKv) {
		_tenKv = tenKv;
	}

	public String getDiaChi() {
		return _diaChi;
	}

	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
	}

	private long _kvid;
	private long _userId;
	private Date _ngayAdd;
	private String _tenKv;
	private String _diaChi;
}