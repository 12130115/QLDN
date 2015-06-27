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

package com.nlu.QLDN3.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.nlu.QLDN3.db.model.NhanVien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing NhanVien in entity cache.
 *
 * @author ThanhToa-PC
 * @see NhanVien
 * @generated
 */
public class NhanVienCacheModel implements CacheModel<NhanVien>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{maNhanVien=");
		sb.append(maNhanVien);
		sb.append(", maCongTy=");
		sb.append(maCongTy);
		sb.append(", tenNhanVien=");
		sb.append(tenNhanVien);
		sb.append(", ngaySinh=");
		sb.append(ngaySinh);
		sb.append(", gioiTinh=");
		sb.append(gioiTinh);
		sb.append(", SDT=");
		sb.append(SDT);
		sb.append(", ngayVaoLam=");
		sb.append(ngayVaoLam);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NhanVien toEntityModel() {
		NhanVienImpl nhanVienImpl = new NhanVienImpl();

		if (maNhanVien == null) {
			nhanVienImpl.setMaNhanVien(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setMaNhanVien(maNhanVien);
		}

		if (maCongTy == null) {
			nhanVienImpl.setMaCongTy(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setMaCongTy(maCongTy);
		}

		if (tenNhanVien == null) {
			nhanVienImpl.setTenNhanVien(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setTenNhanVien(tenNhanVien);
		}

		if (ngaySinh == null) {
			nhanVienImpl.setNgaySinh(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setNgaySinh(ngaySinh);
		}

		if (gioiTinh == null) {
			nhanVienImpl.setGioiTinh(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setGioiTinh(gioiTinh);
		}

		if (SDT == null) {
			nhanVienImpl.setSDT(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setSDT(SDT);
		}

		if (ngayVaoLam == null) {
			nhanVienImpl.setNgayVaoLam(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setNgayVaoLam(ngayVaoLam);
		}

		nhanVienImpl.resetOriginalValues();

		return nhanVienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		maNhanVien = objectInput.readUTF();
		maCongTy = objectInput.readUTF();
		tenNhanVien = objectInput.readUTF();
		ngaySinh = objectInput.readUTF();
		gioiTinh = objectInput.readUTF();
		SDT = objectInput.readUTF();
		ngayVaoLam = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (maNhanVien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maNhanVien);
		}

		if (maCongTy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maCongTy);
		}

		if (tenNhanVien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenNhanVien);
		}

		if (ngaySinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ngaySinh);
		}

		if (gioiTinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gioiTinh);
		}

		if (SDT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SDT);
		}

		if (ngayVaoLam == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ngayVaoLam);
		}
	}

	public String maNhanVien;
	public String maCongTy;
	public String tenNhanVien;
	public String ngaySinh;
	public String gioiTinh;
	public String SDT;
	public String ngayVaoLam;
}