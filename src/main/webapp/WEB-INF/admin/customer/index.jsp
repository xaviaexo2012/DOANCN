<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 10/2/2022
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<c:set var="prefix" value="/admin/customer" scope="request"/>
<c:set var="form" value="${customer}" scope="request"/>

<h4 class="alert alert-success">QUẢN LÝ NGƯỜI DÙNG</h4>

<!-- tabs -->
<ul class="nav nav-tabs">
    <li class="active">
        <a data-toggle="tab" href="#edit">
            <span class="glyphicon glyphicon-edit"></span> CHỈNH SỬA
        </a>
    </li>
    <li>
        <a data-toggle="tab" href="#users">
            <span class="glyphicon glyphicon-list"></span> KHÁCH HÀNG
        </a>
    </li>
    <li>
        <a data-toggle="tab" href="#admins">
            <span class="glyphicon glyphicon-list"></span> QUẢN TRỊ ( ADMIN )
        </a>
    </li>
</ul>
<!-- tab content -->
<div class="tab-content">
    <div id="edit" class="tab-pane fade in active">
        <jsp:include page="_form.jsp"/>
    </div>
    <div id="users" class="tab-pane fade">
        <jsp:include page="_list-user.jsp"/>
    </div>
    <div id="admins" class="tab-pane fade">
        <jsp:include page="_list-admin.jsp"/>
    </div>
</div>