
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="com.book.service.BookService"%>
<%@page import="com.book.pojo.Category"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>图书网后台管理系统</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/mgr.css"/>
  </head>  
  <body>
    <div id="container">
    	<!-- header -->
    	<%@ include file="admin_include/header.jsp" %>
    	<!-- /header -->
    	<div id="main">
			<div class="section-left">    	
				<h2>图书信息列表</h2>		
				<table class="table" cellspacing="0" style="font-size: 12px;">
			    	<tr>
			    		<td class="header" width="100">书名</td>
			    		<td class="header" width="60">作者</td>
			    		<td class="header" width="60">类型</td>
			    		<td class="header" width="60">售价</td>
			    		<td class="header" width="60">操作</td>
			    	</tr>
			    	<tr>
			    		<td>三国演义</td>
			    		<td>罗贯中</td>
			    		<td>小说</td>
			    		<td>￥52.5</td>
			    		<td><a href="#">删除</a>&nbsp;<a href="book-edit.html">编辑</a></td>
			    	</tr>
			    	<tr>
			    		<td>西游记</td>
			    		<td>吴承恩</td>
			    		<td>小说</td>
			    		<td>￥36.0</td>
			    		<td><a href="#">删除</a>&nbsp;<a href="book-edit.html">编辑</a></td>
			    	</tr>
			    	<tr>
			    		<td>史记</td>
			    		<td>司马迁</td>
			    		<td>历史</td>
			    		<td>￥78.0</td>
			    		<td><a href="#">删除</a>&nbsp;<a href="book-edit.html">编辑</a></td>
			    	</tr>
			    	<tr>
			    		<td>红楼梦</td>
			    		<td>曹雪芹</td>
			    		<td>小说</td>
			    		<td>￥92.5</td>
			    		<td><a href="#">删除</a>&nbsp;<a href="book-edit.html">编辑</a></td>
			    	</tr>
			    </table>
			</div>
			<div class="section-right">
				<h2>添加图书信息</h2>
				<%
					if(request.getAttribute("error") !=null){
						out.write("<h4 style='color:red;'>"+request.getAttribute("error")+"</h4>");
						
						
					}
				
				%>
				
				<form action="${pageContext.request.contextPath}/addBook" method="post" enctype="multipart/form-data">
					<p>图书书名：<input type="text" name="bookName"  /></p>
					<p>图书作者：<input type="text" name="author"  /></p>
					<p>图书分类：
						<select name=categoryId">

							<c:forEach  items="${categories}" var="ss">
						<option value=${ss.id }>${ss.category }</option>
    				
    				 
    					
    					</c:forEach>		
						
						</select>
					</p>
					<p>图书售价：<input type="text" name="price" step="0.01" /></p>
					<p>图书出版社：<input type="text" name="publisher"  /></p>   
					<p>图书图片：<input type="file" name="bphoto"  required="required"  /></p>    				 				
					<p><input type="submit" value=" 保 存 "  /></p>
				</form>
			</div>			
			<div class="cf"></div>
		</div>  	
		<!-- footer -->
		<%@ include file="admin_include/footer.jsp" %>
		<!-- /footer -->
	</div>
  </body>
</html>
