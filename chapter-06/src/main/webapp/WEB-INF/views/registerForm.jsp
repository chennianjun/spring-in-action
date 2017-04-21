<%--
  Created by IntelliJ IDEA.
  User: Subtimental
  Date: 2017/4/20
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title></title>

<style type="text/css">
    div.errors{
        background-color: #ffcccc;
        border: 2px solid red;
    }
    span.error{
        color: red;
    }

    label.error{
        color: red;
    }

    input.error{
        background-color: #ffcccc;
    }
</style>
</head>
<body>
<%--<h1><s:message code="spittr.welcome"/></h1>--%>
<form:form method="post" commandName="spitter" action="/validate">
    <form:errors path="*" element="div" cssClass="errors"/>
    <form:label path="firstName" cssErrorClass="error">First Name:</form:label>
    <form:input path="firstName" cssErrorClass="error"/>
    <span><form:errors path="firstName" cssClass="error"/></span><br/>
    Last Name:<form:input path="lastName"/>
    <span><form:errors path="lastName" cssClass="error"/></span><br/>
    Email:<form:input path="email" cssClass="error"/>
    <span><form:errors path="email" cssClass="error"/></span><br/>
    UserName:<form:input path="username"/>
    <span><form:errors path="username" cssClass="error"/></span><br/>
    Password:<form:password path="password"/>
    <span><form:errors path="password" cssClass="error"/></span><br/>
    <input type="submit" value="Register"/>
</form:form>
</body>
</html>
