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

package com.nlu.doanhnghiep.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.nlu.doanhnghiep.model.KhuVuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KhuVuc in entity cache.
 *
 * @author Anh ba khia
 * @see KhuVuc
 * @generated
 */
public class KhuVucCacheModel implements CacheModel<KhuVuc>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{kvid=");
		sb.append(kvid);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", ngayAdd=");
		sb.append(ngayAdd);
		sb.append(", tenKv=");
		sb.append(tenKv);
		sb.append(", diaChi=");
		sb.append(diaChi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KhuVuc toEntityModel() {
		KhuVucImpl khuVucImpl = new KhuVucImpl();

		khuVucImpl.setKvid(kvid);
		khuVucImpl.setUserId(userId);

		if (ngayAdd == Long.MIN_VALUE) {
			khuVucImpl.setNgayAdd(null);
		}
		else {
			khuVucImpl.setNgayAdd(new Date(ngayAdd));
		}

		if (tenKv == null) {
			khuVucImpl.setTenKv(StringPool.BLANK);
		}
		else {
			khuVucImpl.setTenKv(tenKv);
		}

		if (diaChi == null) {
			khuVucImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			khuVucImpl.setDiaChi(diaChi);
		}

		khuVucImpl.resetOriginalValues();

		return khuVucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		kvid = objectInput.readLong();
		userId = objectInput.readLong();
		ngayAdd = objectInput.readLong();
		tenKv = objectInput.readUTF();
		diaChi = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(kvid);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(ngayAdd);

		if (tenKv == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenKv);
		}

		if (diaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChi);
		}
	}

	public long kvid;
	public long userId;
	public long ngayAdd;
	public String tenKv;
	public String diaChi;
}