<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>My JSP 'index.jsp' starting page</title>
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
	<p>注册</p>
	<s:form action="userAction_regist">
		<table>
			<tr>
				<td colspan="3">
					<!-- 显示错误 --> <font color="red">${registError } </font>
				</td>
			</tr>
			<tr>
				<td>用户名 ：</td>
				<td><s:textfield name="username" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><s:password name="password" /></td>
			</tr>
			<tr>
				<td>重复密码：</td>
				<td><s:password name="passowrd_repect" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册" /></td>
			</tr>
		</table>
	</s:form>
	<p></p>

	<p>登录</p>
	<s:form action="userAction_login">
		<table>
			<tr>
				<td colspan="3">
					<!-- 显示错误 --> <font color="red">${loginError }</font>
				</td>
			</tr>
			<tr>
				<td>用户名 ：</td>
				<td><s:textfield name="username" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><s:password name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录" /></td>
			</tr>
		</table>
	</s:form>
	<s:debug></s:debug>
</body>
</html>
