<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 10/2/2022
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8"%>
<div id="fb-root"></div>
<script async defer crossorigin="anonymous"
        src="https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v9.0"
        nonce="pUqLiPKl"></script>
<div class="fb-comments"
     data-href="http://localhost:8080/product/detail/${prod.id}"
     data-numposts="5" data-width="100%"></div>