<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script type="text/javascript">
	function doUpdate(){
	  	document.forms[0].action="./Update.action";
  		document.forms[0].submit();
	}
	</script>
  </head>
  
  <body>
  <s:form action="saveStudent.action" method="post">	
 <s:hidden name="sa.id"></s:hidden>
    <table>    
    
    <s:textfield name="sa.username" label="用户名"></s:textfield>
    <s:textfield name="sa.love" label="爱 好"></s:textfield>
    <s:textfield name="sa.dece" label="描述"></s:textfield>
    </table>
    <s:if test="%{sa.id == null}">
    <s:submit name="submit" value="提交"></s:submit>
    </s:if>
    <s:else>
    <s:submit name="submit" value="更新" onclick="doUpdate();"></s:submit>
    </s:else>
    </s:form>
  </body>
</html>
