
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.nlu.QLDN3.db.model.NhanVien"%>
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
<portlet:defineObjects />
<liferay-theme:defineObjects />
<%
ResultRow resultRow = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
NhanVien nv = (NhanVien)resultRow.getObject();
String name = NhanVien.class.getName();
String primaryKey = String.valueOf(nv.getPrimaryKey());
User userCurrent = PortalUtil.getUser(request);
%>
<liferay-ui:icon-list>

<portlet:renderURL var="suaNhanVienURL">
<portlet:param name="jspPage" value="/html/qldn3/suaNhanVien.jsp" />
<portlet:param name="resourcePrimKey" value="<%=primaryKey%>" />
</portlet:renderURL>

<liferay-ui:icon image="edit" message="edit"
		url="<%=suaNhanVienURL.toString()%>" />
		
		<portlet:actionURL name="xoaNhanVien" var="xoaNhanVienURL">
		<portlet:param name="resourcePrimKey" value="<%=primaryKey%>" />
	</portlet:actionURL>
		<liferay-ui:icon-delete url="<%=xoaNhanVienURL.toString() %>" />
</liferay-ui:icon-list>

