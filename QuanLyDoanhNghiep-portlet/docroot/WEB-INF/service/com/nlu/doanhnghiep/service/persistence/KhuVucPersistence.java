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

package com.nlu.doanhnghiep.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.nlu.doanhnghiep.model.KhuVuc;

/**
 * The persistence interface for the khu vuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Anh ba khia
 * @see KhuVucPersistenceImpl
 * @see KhuVucUtil
 * @generated
 */
public interface KhuVucPersistence extends BasePersistence<KhuVuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KhuVucUtil} to access the khu vuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the khu vuc in the entity cache if it is enabled.
	*
	* @param khuVuc the khu vuc
	*/
	public void cacheResult(com.nlu.doanhnghiep.model.KhuVuc khuVuc);

	/**
	* Caches the khu vucs in the entity cache if it is enabled.
	*
	* @param khuVucs the khu vucs
	*/
	public void cacheResult(
		java.util.List<com.nlu.doanhnghiep.model.KhuVuc> khuVucs);

	/**
	* Creates a new khu vuc with the primary key. Does not add the khu vuc to the database.
	*
	* @param kvid the primary key for the new khu vuc
	* @return the new khu vuc
	*/
	public com.nlu.doanhnghiep.model.KhuVuc create(long kvid);

	/**
	* Removes the khu vuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kvid the primary key of the khu vuc
	* @return the khu vuc that was removed
	* @throws com.nlu.doanhnghiep.NoSuchKhuVucException if a khu vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nlu.doanhnghiep.model.KhuVuc remove(long kvid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nlu.doanhnghiep.NoSuchKhuVucException;

	public com.nlu.doanhnghiep.model.KhuVuc updateImpl(
		com.nlu.doanhnghiep.model.KhuVuc khuVuc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the khu vuc with the primary key or throws a {@link com.nlu.doanhnghiep.NoSuchKhuVucException} if it could not be found.
	*
	* @param kvid the primary key of the khu vuc
	* @return the khu vuc
	* @throws com.nlu.doanhnghiep.NoSuchKhuVucException if a khu vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nlu.doanhnghiep.model.KhuVuc findByPrimaryKey(long kvid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nlu.doanhnghiep.NoSuchKhuVucException;

	/**
	* Returns the khu vuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param kvid the primary key of the khu vuc
	* @return the khu vuc, or <code>null</code> if a khu vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.nlu.doanhnghiep.model.KhuVuc fetchByPrimaryKey(long kvid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the khu vucs.
	*
	* @return the khu vucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nlu.doanhnghiep.model.KhuVuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the khu vucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nlu.doanhnghiep.model.impl.KhuVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khu vucs
	* @param end the upper bound of the range of khu vucs (not inclusive)
	* @return the range of khu vucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nlu.doanhnghiep.model.KhuVuc> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the khu vucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nlu.doanhnghiep.model.impl.KhuVucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khu vucs
	* @param end the upper bound of the range of khu vucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of khu vucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.nlu.doanhnghiep.model.KhuVuc> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the khu vucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of khu vucs.
	*
	* @return the number of khu vucs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}