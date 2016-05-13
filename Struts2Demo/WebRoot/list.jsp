<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
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
  <s:form action="" method="post">
	<s:iterator value="resultList" status="index" id="l">
		<s:if test="#id == '18'">
			test Success
		</s:if>
		<s:if test="#index.odd == true">
		<tr style="background-color:#FFFF00">
		</s:if>
		<s:else>
		<tr>
		</s:else>
		<td>用户名</td>
		<td>
		<s:property value="username"/>
		<s:property  value="love"/>
		<a href="Delete.action?id=<s:property id="l" value="id"/>">
		删除
		</a>
		
		<a href="Edit.action?id=<s:property id="l" value="id"/>">
		编辑
		</a>
		</td>
	</s:iterator>
	</s:form>
  </body>
</html>
