<%--
Views should be stored under the WEB-INF folder so that
they are not accessible except through controller process.

This JSP is here to provide a redirect to the dispatcher
servlet but should be the only JSP outside of WEB-INF.
--%>
<html>
<%
String redirectURL = "index.action";
response.sendRedirect(redirectURL);
%>
</html>