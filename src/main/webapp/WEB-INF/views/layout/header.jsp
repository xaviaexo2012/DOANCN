<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 10/2/2022
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp"%>

<div class="row">
    <div class="col-sm-9">
        <jsp:include page="_header-info.jsp"></jsp:include>
    </div>
    <div class="col-sm-3">
        <c:import url="/header/cart"></c:import>
    </div>
</div>