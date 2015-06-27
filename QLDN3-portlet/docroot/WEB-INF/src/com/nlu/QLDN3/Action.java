package com.nlu.QLDN3;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.nlu.QLDN3.db.model.NhanVien;
import com.nlu.QLDN3.db.service.NhanVienLocalServiceUtil;

public class Action extends MVCPortlet {

	public void themNhanVien(ActionRequest request, ActionResponse response) throws SystemException, IOException {
		String maNhanVien = ParamUtil.getString(request, "maNhanVien");
		String maCongTy = ParamUtil.getString(request, "maCongTy");
		String tenNhanVien = ParamUtil.getString(request, "tenNhanVien");
		String ngaySinh = ParamUtil.getString(request, "ngaySinh");
		String SDT = ParamUtil.getString(request, "SDT");
		String ngayVaoLam = ParamUtil.getString(request, "ngayVaoLam");
		
		long id = CounterLocalServiceUtil.increment(NhanVien.class.getName());
		NhanVien nv = NhanVienLocalServiceUtil.createNhanVien(maNhanVien);
		
		nv.setMaNhanVien(maNhanVien);
		nv.setMaCongTy(maCongTy);
		nv.setTenNhanVien(tenNhanVien);
		nv.setNgaySinh(ngaySinh);
		nv.setSDT(SDT);
		nv.setNgayVaoLam(ngayVaoLam);
		
		response.setRenderParameter("jspPage", "/html/qldn3/view.jsp");
		sendRedirect(request, response);
	}

	public void suaNhanVien(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		String tenNhanVien = ParamUtil.getString(request, "tenNhanVien");
		String ngaySinh = ParamUtil.getString(request, "ngaySinh");
		String SDT = ParamUtil.getString(request, "SDT");
		String ngayVaoLam = ParamUtil.getString(request, "ngayVaoLam");

		String maNhanVien = ParamUtil.getString(request, "resourcePrimkey");
		NhanVien nv = NhanVienLocalServiceUtil.getNhanVien(maNhanVien);

		nv.setTenNhanVien(tenNhanVien);
		nv.setNgaySinh(ngaySinh);
		nv.setSDT(SDT);
		nv.setNgayVaoLam(ngayVaoLam);
		nv = NhanVienLocalServiceUtil.updateNhanVien(nv);
		response.setRenderParameter("jspPage", "/html/qldn3/view.jsp");
		sendRedirect(request, response);
	}

	public void xoaNhanVien(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		String maNhanVien = ParamUtil.getString(request, "resourcePrimkey");
		NhanVienLocalServiceUtil.deleteNhanVien(maNhanVien);
	}

}
