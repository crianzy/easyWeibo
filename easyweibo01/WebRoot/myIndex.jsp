<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'myIndex.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<p>${user.username }</p>
	<p>${user.fansCount }</p>
	<p>${user.followCount }</p>
	<p>------------------------------</p>
	<s:form>
		<table>
			<tr>
				<td>有什么话要说？</td>
			</tr>
			<tr>
				<td><s:textarea name="message"></s:textarea></td>
			</tr>
			<tr align="left">
				<td><s:submit value="发表" /></td>
			</tr>
		</table>
	</s:form>
</body>
</html>
