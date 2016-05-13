<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
    <title>My JSP 'hello.jsp' starting page</title>
  </head>
  
  <body>
    <h1>您好：<s:property value="userName"/></h1>
    <h6>${requestScope.userName}</h6>
    <s:radio name="a" list="{'打飞机','打手枪','打什么','打大炮'}" label="选择测试"></s:radio>
    <s:property value="#attr.m"/>
  </body>
</html>
