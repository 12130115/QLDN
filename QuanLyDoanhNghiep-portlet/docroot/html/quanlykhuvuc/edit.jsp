<%@page import="com.nlu.doanhnghiep.service.KhuVucLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.nlu.doanhnghiep.model.KhuVuc"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ include file="/init.jsp"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/security"
	prefix="liferay-security"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/quanlykhuvuc/view.jsp" />
</portlet:renderURL>
<portlet:actionURL name="editKV" var = "editKVURL">
</portlet:actionURL>
<%
long idKV = ParamUtil.getLong(request, "resourcePrimKey");
request.setAttribute("ad", idKV);
 KhuVuc kv = KhuVucLocalServiceUtil.getKhuVuc(idKV);
%>

<h3>edit-khu-vuc</h3>
<aui:form name = "editKV" action="<%=editKVURL.toString() %>"
>
<%=LanguageUtil.format(pageContext, "ten-khu-vuc", new Object()) %>
<aui:input name="tenkv" type="text" value="<%=kv.getTenKv() %>" label="" 
/>
<%=LanguageUtil.format(pageContext, "dia-chi", new Object()) %>
<aui:input name="diachi" type="text" value="<%=kv.getDiaChi() %>" label="" />
<aui:button-row>
<aui:button type="Submit"  value="Submit"/>
<aui:button type="cancel" value="Cancel"
				onClick="<%=cancelURL.toString()%>" />

</aui:button-row>

</aui:form>