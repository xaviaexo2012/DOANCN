<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 10/2/2022
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp" %>

<table class="table table-hover">
    <thead>
    <tr>
        <th>Mã</th>
        <th>Tên sản phẩm</th>
        <th>Giá</th>
        <th>Số lượng</th>
        <th>Giảm giá</th>
        <th>Tổng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${order.orderDetails}">
        <tr>
            <td>${item.product.id}</td>
            <td>${item.product.name}</td>
            <td>$<f:formatNumber value="${item.unitPrice}" pattern="#,###.00"/></td>
            <td>${item.quantity}</td>
            <td>${item.discount*100}%</td>
            <td>$<f:formatNumber value="${item.unitPrice*item.quantity*(1-item.discount)}" pattern="#,###.00"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>