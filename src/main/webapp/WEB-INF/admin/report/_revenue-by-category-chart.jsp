<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 10/2/2022
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page  pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp" %>
<html>
<head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
        google.charts.load("current", {packages:["corechart"]});
        google.charts.setOnLoadCallback(drawChart);
        function drawChart() {
            var data = google.visualization.arrayToDataTable([
                ['LOẠI', 'GIÁ TRỊ'],
                <c:forEach var="a" items="${rpcates}">
                ["${a[0]}",${a[2]}],
                </c:forEach>
            ]);

            var options = {
                title: 'BIỂU ĐỒ DOANH SỐ BÁN HÀNG THEO TỪNG LOẠI',
                titleTextStyle: {
                    color: "orangered",
                    fontName: "Impact",
                    fontSize: 20,
                },
                is3D: true,
            };

            var chart = new google.visualization.PieChart(document.getElementById('piechart_3d'));
            chart.draw(data, options);
        }
    </script>
</head>
<body>
<div id="piechart_3d" style="width: 900px; height: 500px;"></div>
</body>
</html>
