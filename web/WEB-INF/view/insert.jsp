<%--
  Created by IntelliJ IDEA.
  User: only llb
  Date: 2019/3/5
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form action="insert">
    <table align="center" border="1">
        <tr>
            <td>检测区域</td>
            <td><select name="district.id">

                <c:forEach items="${lists}" var="dis">
                    <option value="${dis.id}">${dis.name}</option>
                </c:forEach>

            </select></td>
        </tr>
        <tr>
            <td>检测日期</td>
            <td><input type="text" name="monitorTime"></td>
        </tr>
        <tr>
            <td>PM10值</td>
            <td><input name="PM10"></td>
        </tr>
        <tr>
            <td>PM2.5</td>
            <td><input name="PM25"></td>
        </tr>
        <tr>
            <td>监测站</td>
            <td><input name="monitoringSation"></td>
        </tr>
        <tr><td colspan="2"><input type="submit" value="提交">
        <input type="reset" value="重置"><button><a href="/findall">返回</a></button></td>
        </tr>
    </table>
</form>
</body>
</html>
