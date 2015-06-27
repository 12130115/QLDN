<%@page import="com.nlu.QLDN3.db.service.NhanVienLocalServiceUtil"%>
<%@page import="com.nlu.QLDN3.db.model.NhanVien"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ include file="/html/qldn3/init.jsp"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/security"
	prefix="liferay-security"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/qldn3/view.jsp" />
</portlet:renderURL>
<portlet:actionURL name="suaNhanVien" var ="suaNhanVienURL">
</portlet:actionURL>
<%
String maNhanVien = ParamUtil.getString(request, "resourcePrimKey");
request.setAttribute("ad", maNhanVien);
 NhanVien nv = NhanVienLocalServiceUtil.getNhanVien(maNhanVien);
%>
<h3>sua-nhan-vien</h3>
<aui:form name = "suaNhanVien" action="<%=suaNhanVienURL.toString() %>">
<aui:input name="tenNhanVien" type="text" value="<%=nv.getTenNhanVien() %>" />
<aui:input name="ngaySinh" type="text" value="<%=nv.getNgaySinh()%>" label="" />
<aui:input name="SDT" type="text" value="<%=nv.getSDT()%>" label="" />
<aui:input name="ngayVaoLam" type="text" value="<%=nv.getNgayVaoLam()%>" label="" />
<aui:button-row>
<aui:button type="Submit"  value="Submit"/>
<aui:button type="Cancel" value="Cancel"
				onClick="<%=cancelURL.toString()%>" />

</aui:button-row>

</aui:form>