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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.nlu.doanhnghiep.model.KhuVuc;

import java.util.List;

/**
 * The persistence utility for the khu vuc service. This utility wraps {@link KhuVucPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Anh ba khia
 * @see KhuVucPersistence
 * @see KhuVucPersistenceImpl
 * @generated
 */
public class KhuVucUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(KhuVuc khuVuc) {
		getPersistence().clearCache(khuVuc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<KhuVuc> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KhuVuc> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KhuVuc> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static KhuVuc update(KhuVuc khuVuc) throws SystemException {
		return getPersistence().update(khuVuc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static KhuVuc update(KhuVuc khuVuc, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(khuVuc, serviceContext);
	}

	/**
	* Caches the khu vuc in the entity cache if it is enabled.
	*
	* @param khuVuc the khu vuc
	*/
	public static void cacheResult(com.nlu.doanhnghiep.model.KhuVuc khuVuc) {
		getPersistence().cacheResult(khuVuc);
	}

	/**
	* Caches the khu vucs in the entity cache if it is enabled.
	*
	* @param khuVucs the khu vucs
	*/
	public static void cacheResult(
		java.util.List<com.nlu.doanhnghiep.model.KhuVuc> khuVucs) {
		getPersistence().cacheResult(khuVucs);
	}

	/**
	* Creates a new khu vuc with the primary key. Does not add the khu vuc to the database.
	*
	* @param kvid the primary key for the new khu vuc
	* @return the new khu vuc
	*/
	public static com.nlu.doanhnghiep.model.KhuVuc create(long kvid) {
		return getPersistence().create(kvid);
	}

	/**
	* Removes the khu vuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kvid the primary key of the khu vuc
	* @return the khu vuc that was removed
	* @throws com.nlu.doanhnghiep.NoSuchKhuVucException if a khu vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nlu.doanhnghiep.model.KhuVuc remove(long kvid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nlu.doanhnghiep.NoSuchKhuVucException {
		return getPersistence().remove(kvid);
	}

	public static com.nlu.doanhnghiep.model.KhuVuc updateImpl(
		com.nlu.doanhnghiep.model.KhuVuc khuVuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(khuVuc);
	}

	/**
	* Returns the khu vuc with the primary key or throws a {@link com.nlu.doanhnghiep.NoSuchKhuVucException} if it could not be found.
	*
	* @param kvid the primary key of the khu vuc
	* @return the khu vuc
	* @throws com.nlu.doanhnghiep.NoSuchKhuVucException if a khu vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nlu.doanhnghiep.model.KhuVuc findByPrimaryKey(long kvid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nlu.doanhnghiep.NoSuchKhuVucException {
		return getPersistence().findByPrimaryKey(kvid);
	}

	/**
	* Returns the khu vuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param kvid the primary key of the khu vuc
	* @return the khu vuc, or <code>null</code> if a khu vuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nlu.doanhnghiep.model.KhuVuc fetchByPrimaryKey(long kvid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(kvid);
	}

	/**
	* Returns all the khu vucs.
	*
	* @return the khu vucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nlu.doanhnghiep.model.KhuVuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.nlu.doanhnghiep.model.KhuVuc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.nlu.doanhnghiep.model.KhuVuc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the khu vucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of khu vucs.
	*
	* @return the number of khu vucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KhuVucPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KhuVucPersistence)PortletBeanLocatorUtil.locate(com.nlu.doanhnghiep.service.ClpSerializer.getServletContextName(),
					KhuVucPersistence.class.getName());

			ReferenceRegistry.registerReference(KhuVucUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KhuVucPersistence persistence) {
	}

	private static KhuVucPersistence _persistence;
}