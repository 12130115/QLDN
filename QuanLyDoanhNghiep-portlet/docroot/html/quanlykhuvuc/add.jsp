<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@include file="/init.jsp" %>
<portlet:defineObjects/>
<portlet:renderURL var="cancelURL">
	<portlet:param name="mvcPath" value="/html/quanlykhuvuc/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="addKV" var="addKVURL" />
<h3><%=LanguageUtil.format(pageContext, "add-khu-vuc",
					new Object())%></h3>
<aui:form action="<%=addKVURL.toString()%>" method="post">
	<aui:fieldset>
		<aui:input name="tenKv">
		<aui:validator name="required" errorMessage="no-empty"/>
		</aui:input>
		<aui:input name="diaChi">
		<aui:validator name="required" errorMessage="no-address"/>
		</aui:input>
		<aui:button-row>
			<aui:button type="submit" value="them" />
			<aui:button type="cancel" value="cancel" onClick="<%= cancelURL.toString()%>"></aui:button>
		</aui:button-row>
	</aui:fieldset>
	
</aui:form>