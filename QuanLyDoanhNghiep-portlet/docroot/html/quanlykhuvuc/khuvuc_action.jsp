
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

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
	ResultRow result = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	KhuVuc kv = (KhuVuc) result.getObject();
	String name = KhuVuc.class.getName();
	String primKey = String.valueOf(kv.getPrimaryKey());

	User currentUser = PortalUtil.getUser(request);
%>
<liferay-ui:icon-list>
	
	<portlet:renderURL var="editURL">
		<portlet:param name="jspPage" value="/html/quanlykhuvuc/edit.jsp" />
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:renderURL>
	<liferay-ui:icon image="edit" message="edit"
		url="<%=editURL.toString()%>" />
	<portlet:actionURL name="deleteKV" var="deleteURL">
		<portlet:param name="resourcePrimKey" value="<%=primKey%>" />
	</portlet:actionURL>
	<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
</liferay-ui:icon-list>