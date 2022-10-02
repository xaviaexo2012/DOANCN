<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 10/2/2022
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp"%>

<div class="panel panel-danger">
    <div class="panel-heading">
        <h3 class="panel-title">
            <strong>TỔNG HỢP THEO LOẠI SẢN PHẨM</strong>
        </h3>
    </div>
    <table class="table table-hover">
        <thead class="bg-success">
        <tr>
            <th class="text-center">Loại sản phẩm</th>
            <th class="text-center">Số lượng</th>
            <th class="text-center">Doanh số</th>
            <th class="text-center">Giá bán thấp nhất</th>
            <th class="text-center">Giá bán cao nhất</th>
            <th class="text-center">Trung bình</th>
        </tr>
        </thead>
        <tbody class="text-center">
        <c:set var="total" value="0" />
        <c:forEach var="a" items="${rpcates}">
            <c:set var="total" value="${total + a[2]}" />
            <tr>
                <td class="text-left">${a[0]}</td>
                <td><f:formatNumber value="${a[1]}" pattern="#,###" /></td>
                <td>$<f:formatNumber value="${a[2]}" pattern="#,###.00" /></td>
                <td>$<f:formatNumber value="${a[3]}" pattern="#,###.00" /></td>
                <td>$<f:formatNumber value="${a[4]}" pattern="#,###.00" /></td>
                <td>$<f:formatNumber value="${a[5]}" pattern="#,###.00" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <jsp:include page="_revenue-by-category-chart.jsp" />
    <div class="panel-footer">
        <strong>Tổng doanh số: $<f:formatNumber value="${total}"
                                                pattern="#,###.00" /></strong>
    </div>
</div>
