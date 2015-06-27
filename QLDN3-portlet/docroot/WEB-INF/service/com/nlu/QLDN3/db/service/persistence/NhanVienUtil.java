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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.nlu.QLDN3.db.model.NhanVien;

import java.util.List;

/**
 * The persistence utility for the nhan vien service. This utility wraps {@link NhanVienPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ThanhToa-PC
 * @see NhanVienPersistence
 * @see NhanVienPersistenceImpl
 * @generated
 */
public class NhanVienUtil {
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
	public static void clearCache(NhanVien nhanVien) {
		getPersistence().clearCache(nhanVien);
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
	public static List<NhanVien> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NhanVien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NhanVien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static NhanVien update(NhanVien nhanVien) throws SystemException {
		return getPersistence().update(nhanVien);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static NhanVien update(NhanVien nhanVien,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(nhanVien, serviceContext);
	}

	/**
	* Caches the nhan vien in the entity cache if it is enabled.
	*
	* @param nhanVien the nhan vien
	*/
	public static void cacheResult(com.nlu.QLDN3.db.model.NhanVien nhanVien) {
		getPersistence().cacheResult(nhanVien);
	}

	/**
	* Caches the nhan viens in the entity cache if it is enabled.
	*
	* @param nhanViens the nhan viens
	*/
	public static void cacheResult(
		java.util.List<com.nlu.QLDN3.db.model.NhanVien> nhanViens) {
		getPersistence().cacheResult(nhanViens);
	}

	/**
	* Creates a new nhan vien with the primary key. Does not add the nhan vien to the database.
	*
	* @param maNhanVien the primary key for the new nhan vien
	* @return the new nhan vien
	*/
	public static com.nlu.QLDN3.db.model.NhanVien create(
		java.lang.String maNhanVien) {
		return getPersistence().create(maNhanVien);
	}

	/**
	* Removes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param maNhanVien the primary key of the nhan vien
	* @return the nhan vien that was removed
	* @throws com.nlu.QLDN3.db.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nlu.QLDN3.db.model.NhanVien remove(
		java.lang.String maNhanVien)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nlu.QLDN3.db.NoSuchNhanVienException {
		return getPersistence().remove(maNhanVien);
	}

	public static com.nlu.QLDN3.db.model.NhanVien updateImpl(
		com.nlu.QLDN3.db.model.NhanVien nhanVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nhanVien);
	}

	/**
	* Returns the nhan vien with the primary key or throws a {@link com.nlu.QLDN3.db.NoSuchNhanVienException} if it could not be found.
	*
	* @param maNhanVien the primary key of the nhan vien
	* @return the nhan vien
	* @throws com.nlu.QLDN3.db.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nlu.QLDN3.db.model.NhanVien findByPrimaryKey(
		java.lang.String maNhanVien)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nlu.QLDN3.db.NoSuchNhanVienException {
		return getPersistence().findByPrimaryKey(maNhanVien);
	}

	/**
	* Returns the nhan vien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param maNhanVien the primary key of the nhan vien
	* @return the nhan vien, or <code>null</code> if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nlu.QLDN3.db.model.NhanVien fetchByPrimaryKey(
		java.lang.String maNhanVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(maNhanVien);
	}

	/**
	* Returns all the nhan viens.
	*
	* @return the nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nlu.QLDN3.db.model.NhanVien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.nlu.QLDN3.db.model.NhanVien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.nlu.QLDN3.db.model.NhanVien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nhan viens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nhan viens.
	*
	* @return the number of nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NhanVienPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NhanVienPersistence)PortletBeanLocatorUtil.locate(com.nlu.QLDN3.db.service.ClpSerializer.getServletContextName(),
					NhanVienPersistence.class.getName());

			ReferenceRegistry.registerReference(NhanVienUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(NhanVienPersistence persistence) {
	}

	private static NhanVienPersistence _persistence;
}