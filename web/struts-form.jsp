<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Form Entry</title>
</head>
<body>
<s:form action="tutorials/getTutorial">
	<s:textfield label="param" key="param" />
	<s:submit />
</s:form>
<a href="index.jsp">home</a><br/>
</body>
</html>