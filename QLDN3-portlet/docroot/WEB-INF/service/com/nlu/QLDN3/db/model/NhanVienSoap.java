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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.nlu.QLDN3.db.service.http.NhanVienServiceSoap}.
 *
 * @author ThanhToa-PC
 * @see com.nlu.QLDN3.db.service.http.NhanVienServiceSoap
 * @generated
 */
public class NhanVienSoap implements Serializable {
	public static NhanVienSoap toSoapModel(NhanVien model) {
		NhanVienSoap soapModel = new NhanVienSoap();

		soapModel.setMaNhanVien(model.getMaNhanVien());
		soapModel.setMaCongTy(model.getMaCongTy());
		soapModel.setTenNhanVien(model.getTenNhanVien());
		soapModel.setNgaySinh(model.getNgaySinh());
		soapModel.setGioiTinh(model.getGioiTinh());
		soapModel.setSDT(model.getSDT());
		soapModel.setNgayVaoLam(model.getNgayVaoLam());

		return soapModel;
	}

	public static NhanVienSoap[] toSoapModels(NhanVien[] models) {
		NhanVienSoap[] soapModels = new NhanVienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NhanVienSoap[][] toSoapModels(NhanVien[][] models) {
		NhanVienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NhanVienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NhanVienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NhanVienSoap[] toSoapModels(List<NhanVien> models) {
		List<NhanVienSoap> soapModels = new ArrayList<NhanVienSoap>(models.size());

		for (NhanVien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NhanVienSoap[soapModels.size()]);
	}

	public NhanVienSoap() {
	}

	public String getPrimaryKey() {
		return _maNhanVien;
	}

	public void setPrimaryKey(String pk) {
		setMaNhanVien(pk);
	}

	public String getMaNhanVien() {
		return _maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		_maNhanVien = maNhanVien;
	}

	public String getMaCongTy() {
		return _maCongTy;
	}

	public void setMaCongTy(String maCongTy) {
		_maCongTy = maCongTy;
	}

	public String getTenNhanVien() {
		return _tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		_tenNhanVien = tenNhanVien;
	}

	public String getNgaySinh() {
		return _ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		_ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return _gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		_gioiTinh = gioiTinh;
	}

	public String getSDT() {
		return _SDT;
	}

	public void setSDT(String SDT) {
		_SDT = SDT;
	}

	public String getNgayVaoLam() {
		return _ngayVaoLam;
	}

	public void setNgayVaoLam(String ngayVaoLam) {
		_ngayVaoLam = ngayVaoLam;
	}

	private String _maNhanVien;
	private String _maCongTy;
	private String _tenNhanVien;
	private String _ngaySinh;
	private String _gioiTinh;
	private String _SDT;
	private String _ngayVaoLam;
}