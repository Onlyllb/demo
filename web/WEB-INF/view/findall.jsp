<%--
  Created by IntelliJ IDEA.
  User: only llb
  Date: 2019/3/5
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>查询全部</title>
</head>
<body>
<div align="center">
    <form action="findbyid">
        <select name="districtid">
            <option value="0">不限</option>
            <c:forEach items="${lists}" var="dis">
                <option value="${dis.id}">${dis.name}</option>
            </c:forEach>

        </select>
        <input type="submit" value="查询">
    </form>
</div>
<div align="center"><a href="findinsert">添加信息</a></div>
    <table align="center" border="1">
        <tr>
            <td>序号</td>
            <td>区域</td>
            <td>监测时间</td>
            <td>PM10指数</td>
            <td>PM2.5指数</td>
            <td>监测站</td>
        </tr>
        <c:forEach items="${list}" var="air" varStatus="ss">
            <tr <c:if test="${ss.index%2==0}">bgColor="red"</c:if> >

                <td><a href="findby?id=${air.id}">${air.id}</a></td>
                <td>${air.district.id}</td>
                <td>${air.monitorTime}</td>
                <td>${air.PM10}</td>
                <td>${air.PM25}</td>
                <td>${air.monitoringSation}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
