<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.nlu.doanhnghiep.service.KhuVucLocalServiceUtil"%>
<%@page import="com.nlu.doanhnghiep.model.KhuVuc"%>
<%@include file="/init.jsp"%>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<portlet:renderURL var="addlURL">
	<portlet:param name="mvcPath" value="/html/quanlykhuvuc/add.jsp" />
</portlet:renderURL>
<aui:button name="add" value="add-khu-vuc" onClick="<%= addlURL.toString()%>"></aui:button>


<a href="/html/quanlykhuvuc/add.jsp"></a>


<liferay-ui:search-container emptyResultsMessage="no-any-kv" delta="5">
	<liferay-ui:search-container-results>

		<%
			results = KhuVucLocalServiceUtil.getKhuVucs(
							searchContainer.getStart(),
							searchContainer.getEnd());
					total = KhuVucLocalServiceUtil.getKhuVucsCount();
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>


	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row
		className="com.nlu.doanhnghiep.model.KhuVuc" keyProperty="kvid"
		modelVar="kv">
		<liferay-ui:search-container-column-text name="khu-vuc-id">
			<%=kv.getKvid()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="khu-vuc-name">
			<%=kv.getTenKv()%>
		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text name="dia-chi">
			<%=kv.getDiaChi()%>
		</liferay-ui:search-container-column-text>
		<%
			DateFormat formatNgay = new SimpleDateFormat("dd/MM/yyyy");
					String date = formatNgay.format(kv.getNgayAdd());
		%>
		<liferay-ui:search-container-column-text name="ngay-them">
			<%=date%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-jsp cssClass="nhomenu"
			name="thao-tac" path="/html/quanlykhuvuc/khuvuc_action.jsp" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>