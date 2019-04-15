<%--
  Created by IntelliJ IDEA.
  User: only llb
  Date: 2019/3/5
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>添加</title>
</head>
<body>

    <table align="center" border="1">
        <tr>
            <td>检测区域</td>
            <td><input name="district.name" value="${air.district.name}"></td>
        </tr>
        <tr>
            <td>检测日期</td>
            <td><input type="text" name="monitorTime" value="${air.monitorTime}"></td>
        </tr>
        <tr>
            <td>PM10值</td>
            <td><input name="PM10" value="${air.PM10}"></td>
        </tr>
        <tr>
            <td>PM2.5</td>
            <td><input name="PM25" value="${air.PM25}"></td>
        </tr>
        <tr>
            <td>监测站</td>
            <td><input name="monitoringSation" value="${air.monitoringSation}"></td>
        </tr>
        <tr><td colspan="2"><a href="/delete?id=${air.id}">删除</a>
            <<button><a href="/findall">返回</a></button></td>
        </tr>
    </table>

</body>
</html>

