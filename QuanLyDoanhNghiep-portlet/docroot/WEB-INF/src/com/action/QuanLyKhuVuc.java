package com.action;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.nlu.doanhnghiep.model.KhuVuc;
import com.nlu.doanhnghiep.service.KhuVucLocalServiceUtil;


public class QuanLyKhuVuc extends MVCPortlet {
	public void addKV(ActionRequest request, ActionResponse response) throws SystemException, IOException{
		String tenkv = ParamUtil.getString(request,"tenKv");
		String diachi = ParamUtil.getString(request,"diaChi");
		
		long id = CounterLocalServiceUtil.increment(KhuVuc.class.getName());
		KhuVuc kv = KhuVucLocalServiceUtil.createKhuVuc(id);
		kv.setTenKv(tenkv);
		kv.setDiaChi(diachi);
		kv.setNgayAdd(new Date());
		kv = KhuVucLocalServiceUtil.updateKhuVuc(kv);
		response.setRenderParameter("jspPage", "/html/quanlykhuvuc/view.jsp");
		sendRedirect(request, response);
	}
	public void editKV(ActionRequest request, ActionResponse response) throws SystemException, IOException, PortalException{
		String tenkv = ParamUtil.getString(request, "tenkv");
		String diachi = ParamUtil.getString(request, "diachi");
		long kvId= ParamUtil.getLong(request, "resourcePrimKey");
		KhuVuc kv = KhuVucLocalServiceUtil.getKhuVuc(kvId);
		kv.setTenKv(tenkv);
		kv.setDiaChi(diachi);
		kv = KhuVucLocalServiceUtil.updateKhuVuc(kv);
		response.setRenderParameter("jspPage", "/html/quanlykhuvuc/view.jsp");
		sendRedirect(request, response);
		
	}
	public void deleteKV(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
		long kvId= ParamUtil.getLong(request, "resourcePrimKey");
		System.out.println(kvId);
			KhuVucLocalServiceUtil.deleteKhuVuc(kvId);
	}
}
