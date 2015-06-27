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

package com.nlu.QLDN3.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.nlu.QLDN3.db.model.NhanVien;

/**
 * The persistence interface for the nhan vien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhToa-PC
 * @see NhanVienPersistenceImpl
 * @see NhanVienUtil
 * @generated
 */
public interface NhanVienPersistence extends BasePersistence<NhanVien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NhanVienUtil} to access the nhan vien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the nhan vien in the entity cache if it is enabled.
	*
	* @param nhanVien the nhan vien
	*/
	public void cacheResult(com.nlu.QLDN3.db.model.NhanVien nhanVien);

	/**
	* Caches the nhan viens in the entity cache if it is enabled.
	*
	* @param nhanViens the nhan viens
	*/
	public void cacheResult(
		java.util.List<com.nlu.QLDN3.db.model.NhanVien> nhanViens);

	/**
	* Creates a new nhan vien with the primary key. Does not add the nhan vien to the database.
	*
	* @param maNhanVien the primary key for the new nhan vien
	* @return the new nhan vien
	*/
	public com.nlu.QLDN3.db.model.NhanVien create(java.lang.String maNhanVien);

	/**
	* Removes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param maNhanVien the primary key of the nhan vien
	* @return the nhan vien that was removed
	* @throws com.nlu.QLDN3.db.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nlu.QLDN3.db.model.NhanVien remove(java.lang.String maNhanVien)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nlu.QLDN3.db.NoSuchNhanVienException;

	public com.nlu.QLDN3.db.model.NhanVien updateImpl(
		com.nlu.QLDN3.db.model.NhanVien nhanVien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the nhan vien with the primary key or throws a {@link com.nlu.QLDN3.db.NoSuchNhanVienException} if it could not be found.
	*
	* @param maNhanVien the primary key of the nhan vien
	* @return the nhan vien
	* @throws com.nlu.QLDN3.db.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nlu.QLDN3.db.model.NhanVien findByPrimaryKey(
		java.lang.String maNhanVien)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nlu.QLDN3.db.NoSuchNhanVienException;

	/**
	* Returns the nhan vien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param maNhanVien the primary key of the nhan vien
	* @return the nhan vien, or <code>null</code> if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nlu.QLDN3.db.model.NhanVien fetchByPrimaryKey(
		java.lang.String maNhanVien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the nhan viens.
	*
	* @return the nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nlu.QLDN3.db.model.NhanVien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the nhan viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nlu.QLDN3.db.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nlu.QLDN3.db.model.NhanVien> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the nhan viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nlu.QLDN3.db.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nlu.QLDN3.db.model.NhanVien> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the nhan viens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nhan viens.
	*
	* @return the number of nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}