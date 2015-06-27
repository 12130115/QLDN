<%@page import="com.nlu.QLDN3.db.service.NhanVienLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page
	import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Order"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Criterion"%>
<%@page
	import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ page import="java.util.HashMap"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ResourceBundle"%>
<%@ page import="com.liferay.counter.service.CounterLocalServiceUtil"%>
<%@ page import="com.liferay.portal.NoSuchUserException"%>
<%@ page
	import="com.liferay.portal.kernel.captcha.CaptchaMaxChallengesException"%>
<%@ page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@ page import="com.liferay.portal.kernel.bean.BeanParamUtil"%>
<%@ page import="com.liferay.portal.kernel.bean.BeanPropertiesUtil"%>
<%@ page import="com.liferay.portal.kernel.cal.Recurrence"%>
<%@ page import="com.liferay.portal.kernel.configuration.Filter"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.DAOParamUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@ page import="com.liferay.portal.kernel.dao.search.TextSearchEntry"%>
<%@ page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@ page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@ page import="com.liferay.portal.kernel.io.unsync.UnsyncStringReader"%>
<%@ page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@ page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageWrapper"%>
<%@ page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.log.Log"%>
<%@ page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.log.LogUtil"%>
<%@ page import="com.liferay.portal.kernel.messaging.DestinationNames"%>
<%@ page import="com.liferay.portal.kernel.messaging.MessageBusUtil"%>
<%@ page import="com.liferay.portal.kernel.portlet.DynamicRenderRequest"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@ page
	import="com.liferay.portal.kernel.portlet.LiferayPortletRequest"%>
<%@ page
	import="com.liferay.portal.kernel.portlet.LiferayPortletResponse"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayPortletURL"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="com.liferay.portal.kernel.search.Field"%>
<%@ page import="com.liferay.portal.kernel.servlet.BrowserSnifferUtil"%>
<%@ page import="com.liferay.portal.kernel.servlet.ServletContextUtil"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ page import="com.liferay.portal.kernel.util.ArrayUtil"%>
<%@ page import="com.liferay.portal.kernel.util.BooleanWrapper"%>
<%@ page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.util.CalendarUtil"%>
<%@ page import="com.liferay.portal.kernel.util.CharPool"%>
<%@ page import="com.liferay.portal.kernel.util.Constants"%>
<%@ page import="com.liferay.portal.kernel.util.ContentTypes"%>
<%@ page import="com.liferay.portal.kernel.util.DateFormatFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.util.DateUtil"%>
<%@ page
	import="com.liferay.portal.kernel.util.FastDateFormatFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.util.FileUtil"%>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@ page import="com.liferay.portal.kernel.util.Http"%>
<%@ page import="com.liferay.portal.kernel.util.HttpUtil"%>
<%@ page import="com.liferay.portal.kernel.util.IntegerWrapper"%>
<%@ page import="com.liferay.portal.kernel.util.JavaConstants"%>
<%@ page import="com.liferay.portal.kernel.util.KeyValuePair"%>
<%@ page import="com.liferay.portal.kernel.util.KeyValuePairComparator"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="com.liferay.portal.kernel.util.LocaleUtil"%>
<%@ page import="com.liferay.portal.kernel.util.LocalizationUtil"%>
<%@ page import="com.liferay.portal.kernel.util.LongWrapper"%>
<%@ page import="com.liferay.portal.kernel.util.MathUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ObjectValuePair"%>
<%@ page
	import="com.liferay.portal.kernel.util.ObjectValuePairComparator"%>
<%@ page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@ page import="com.liferay.portal.kernel.util.OrderedProperties"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PrefsParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PropertiesParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PropertiesUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PropsKeys"%>
<%@ page import="com.liferay.portal.kernel.util.Randomizer"%>
<%@ page import="com.liferay.portal.kernel.util.ReleaseInfo"%>
<%@ page import="com.liferay.portal.kernel.util.ServerDetector"%>
<%@ page import="com.liferay.portal.kernel.util.SetUtil"%>
<%@ page import="com.liferay.portal.kernel.util.SortedProperties"%>
<%@ page import="com.liferay.portal.kernel.util.StackTraceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.StringBundler"%>
<%@ page import="com.liferay.portal.kernel.util.StringComparator"%>
<%@ page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ page import="com.liferay.portal.kernel.util.Time"%>
<%@ page import="com.liferay.portal.kernel.util.TimeZoneUtil"%>
<%@ page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@ page import="com.liferay.portal.kernel.util.UnicodeProperties"%>
<%@ page import="com.liferay.portal.kernel.util.Validator"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Arrays"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Collection"%>
<%@ page import="java.util.Collections"%>
<%@ page import="java.util.Currency"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Enumeration"%>
<%@ page import="java.util.GregorianCalendar"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.HashSet"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.LinkedHashMap"%>
<%@ page import="java.util.LinkedHashSet"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Locale"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.MissingResourceException"%>
<%@ page import="java.util.Properties"%>
<%@ page import="java.util.ResourceBundle"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.Stack"%>
<%@ page import="java.util.TimeZone"%>
<%@ page import="java.util.TreeMap"%>
<%@ page import="java.util.TreeSet"%>
<%@ page import="javax.portlet.MimeResponse"%>
<%@ page import="javax.portlet.PortletConfig"%>
<%@ page import="javax.portlet.PortletContext"%>
<%@ page import="javax.portlet.PortletException"%>
<%@ page import="javax.portlet.PortletMode"%>
<%@ page import="javax.portlet.PortletPreferences"%>
<%@ page import="javax.portlet.PortletRequest"%>
<%@ page import="javax.portlet.PortletResponse"%>
<%@ page import="javax.portlet.PortletSession"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="javax.portlet.RenderRequest"%>
<%@ page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ page import="javax.portlet.ResourceURL"%>
<%@ page import="javax.portlet.UnavailableException"%>
<%@ page import="javax.portlet.ValidatorException"%>
<%@ page import="javax.portlet.WindowState"%>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%><%@ page
	import="com.liferay.portal.AddressCityException"%>
<%@ page import="com.liferay.portal.AddressStreetException"%>
<%@ page import="com.liferay.portal.AddressZipException"%>
<%@ page import="com.liferay.portal.CompanyMaxUsersException"%>
<%@ page import="com.liferay.portal.ContactFirstNameException"%>
<%@ page import="com.liferay.portal.ContactFullNameException"%>
<%@ page import="com.liferay.portal.ContactLastNameException"%>
<%@ page import="com.liferay.portal.CookieNotSupportedException"%>
<%@ page import="com.liferay.portal.DuplicateUserEmailAddressException"%>
<%@ page import="com.liferay.portal.DuplicateUserIdException"%>
<%@ page import="com.liferay.portal.DuplicateUserScreenNameException"%>
<%@ page import="com.liferay.portal.EmailAddressException"%>
<%@ page import="com.liferay.portal.NoSuchCountryException"%>
<%@ page import="com.liferay.portal.NoSuchListTypeException"%>
<%@ page import="com.liferay.portal.NoSuchRegionException"%>
<%@ page import="com.liferay.portal.NoSuchUserException"%>
<%@ page import="com.liferay.portal.PasswordExpiredException"%>
<%@ page import="com.liferay.portal.PhoneNumberException"%>
<%@ page import="com.liferay.portal.RequiredFieldException"%>
<%@ page import="com.liferay.portal.ReservedUserEmailAddressException"%>
<%@ page import="com.liferay.portal.ReservedUserIdException"%>
<%@ page import="com.liferay.portal.RequiredReminderQueryException"%>
<%@ page import="com.liferay.portal.ReservedUserScreenNameException"%>
<%@ page import="com.liferay.portal.SendPasswordException"%>
<%@ page import="com.liferay.portal.TermsOfUseException"%>
<%@ page import="com.liferay.portal.UserEmailAddressException"%>
<%@ page import="com.liferay.portal.UserIdException"%>
<%@ page import="com.liferay.portal.UserLockoutException"%>
<%@ page import="com.liferay.portal.UserPasswordException"%>
<%@ page import="com.liferay.portal.UserReminderQueryException"%>
<%@ page import="com.liferay.portal.UserScreenNameException"%>
<%@ page import="com.liferay.portal.WebsiteURLException"%>
<%@ page import="com.liferay.portal.security.auth.AuthException"%>
<%@ page import="com.liferay.portal.DuplicateOrganizationException"%>
<%@ page import="com.liferay.portal.OrganizationNameException"%>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<%@include file="/html/qldn3/init.jsp"%>

<portlet:renderURL var="themNhanVienURL">
<portlet:param name="mvcPath" value="/html/qldn3/themNhanVien.jsp"/>
</portlet:renderURL>
<aui:button name="add" value="themNhanVien" onClick="<%=themNhanVienURL.toString()%>"></aui:button>

<liferay-ui:search-container emptyResultsMessage="no-any-nv" delta="5">
<liferay-ui:search-container-results>
<%
results = NhanVienLocalServiceUtil.getNhanViens(searchContainer.getStart(), searchContainer.getEnd());
total = NhanVienLocalServiceUtil.getNhanViensCount();
pageContext.setAttribute("results", results);
pageContext.setAttribute("total", total);
%>

</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="com.nlu.QLDN3.db.model.NhanVien" keyProperty="maNhanVien" modelVar="nv">
<liferay-ui:search-container-column-text name="ma-nhan-vien"><%=nv.getMaNhanVien() %></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-text name="ma-cong-ty"><%=nv.getMaCongTy() %></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-text name="ten-nhan-vien"><%=nv.getTenNhanVien() %></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-text name="ngay-sinh"><%=nv.getNgaySinh() %></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-text name="SDT"><%=nv.getSDT() %></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-text name="ngay-vao-lam"><%=nv.getNgayVaoLam() %></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-jsp path="/html/qldn3/nhanvien_action.jsp"></liferay-ui:search-container-column-jsp>
</liferay-ui:search-container-row>
<liferay-ui:search-iterator />
</liferay-ui:search-container>