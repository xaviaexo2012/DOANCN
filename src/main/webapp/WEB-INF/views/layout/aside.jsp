<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 10/2/2022
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp"%>

<!-- vùng search -->
<jsp:include page="_aside-search.jsp" />
<!-- vùng category -->
<c:import url="/home/aside/category" />
<!-- vùng những hàng đặc biệt -->
<jsp:include page="_aside-hot.jsp" />
