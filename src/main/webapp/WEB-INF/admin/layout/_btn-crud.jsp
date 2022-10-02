<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 10/2/2022
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<button formaction="${prefix}/create" ${empty form.id ? '' : 'disabled'} class="btn btn-primary">
    <span class="glyphicon glyphicon-plus"></span> Thêm
</button>
<button formaction="${prefix}/update" ${empty form.id ? 'disabled' : ''} class="btn btn-success">
    <span class="glyphicon glyphicon-save"></span> Cập nhật
</button>
<button formaction="${prefix}/delete/${form.id}" ${empty form.id ? 'disabled' : ''} class="btn btn-danger">
    <span class="glyphicon glyphicon-trash"></span> Xóa
</button>
<a href="${prefix}/index" class="btn btn-info">
    <span class="glyphicon glyphicon-refresh"></span> Reset
</a>