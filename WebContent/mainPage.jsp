<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="bean.*"%>
    <%@ page import="java.util.*" %>
    

<html lang="zh">
 <head>
  <meta charset="utf-8"> 
	
 
	<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
	<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src=""></script>

 	
  <title>Document</title>
 </head>
 <body>

 <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<ul class="nav nav-tabs">
				<li class="active">
					 <a href="#">首页</a>
				</li>
				<li>
				<%
				session=pageContext.getSession();
				if(session.getAttribute("user")!=null){
					if(session.getAttribute("user").equals("geren")){
				%>
					 <a href="personInfo.jsp">个人信息</a>
					 <%
				}else{
						 %>
						  <a href="qiyeInfo.jsp">个人信息</a>
						 <% 
					 }
				}else{
					 %>
					 <a href="loginPage.jsp">个人信息</a>
					 <%} %>
				</li>
				<li class="disabled">
					 <a href="#">其他</a>
				</li>
				<li class="dropdown pull-right">
				<% 
								
				if(session.getAttribute("user")!=null){
				%>
					 <a href="loginOut" id="loginlOut">  <label><%=session.getAttribute("user") %>注销登录</label></a>
					 <% 
				}else{
					 %>
					 <a href="#" data-toggle="dropdown" class="dropdown-toggle">下拉<strong class="caret"></strong></a>
					
					<ul class="dropdown-menu">
						<li>
							 <a href="loginPage.jsp">登录</a>
						</li>
						<li>
							 <a href="loginPage.jsp">注册</a>
						</li>
						
					</ul>
					<%} %>
				</li>
			</ul>
			<div class="carousel slide" id="carousel-3663">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-3663">
					</li>
					<li data-slide-to="1" data-target="#carousel-3663">
					</li>
					<li data-slide-to="2" data-target="#carousel-3663">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="image/img1.jpg" />
						<div class="carousel-caption">
							<h4>
								First Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="image/img2.jpg" />
						<div class="carousel-caption">
							<h4>
								Second Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="image/img3.jpg" />
						<div class="carousel-caption">
							<h4>
								Third Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-3663" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-3663" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
			<div class="row clearfix">
				<div class="col-md-2 column">
					<ul class="list-unstyled list-inline">
						<li id="java">
							<a href="#">JAVA</a>
						</li>
						<li id="php">
							<a href="#">PHP</a>
						</li>
						<li id="#">
							<a href="#
							">Android</a>
						</li>
						<li id="shujuku">
							<a href="#">数据库</a>
						</li>
						
						<li id="ceshi">
							<a href="#">测试</a>
						</li>
						<li id="qianduan">
							<a href="#">前端</a>
						</li>
						
					</ul>
				</div>
				<div class="col-md-6 column">
					<div class="panel panel-default">
					
						<%
						 
						 List<zhaopin> list=(List<zhaopin>)request.getAttribute("date");
						 zhaopin date=new zhaopin();
						System.out.println(list.size());
						     for(int i=0;i<list.size();i++){
								  
								  
								  date=list.get(i);
						     
								%>
						
						<div id="dpanl1" class="panel-heading">
							
							<h3 class="panel-title">招聘单位：
							
							  <%=date.getOwner().getName() %>
								
							</h3>
						</div>
						<div id="panl1" class="panel-body">
							招聘内容：<%=date.getLimit() %>
						</div>
						<form methond="GET" action="sendResume">
						<div class="panel-footer">
						    <input type="hidden" name="para" value="<%=date.getPnumber() %>">
							<input id="send1" type="submit" value="投递简历"/>
						</div>
						</form>
						<%} %>
						
					</div>
					
					
					<div class="panel panel-default">
							 <ul class="pagination">
				<li>
					 <a href="#">Prev</a>
				</li>
				<li>
					 <a href="turnPage?page=1">1</a>
				</li>
				<li>
					 <a href="turnPage?page=2">2</a>
				</li>
				<li>
					 <a href="turnPage?page=3">3</a>
				</li>
				<li>
					 <a href="#">4</a>
				</li>
				<li>
					 <a href="#">5</a>
				</li>
				<li>
					 <a href="#">Next</a>
				</li>
			</ul>
		</div>
					</div>
				</div>
				<div class="col-md-4 column">
					<table class="table">
						<thead>
							<tr>
								<th>
									热门职位
								</th>
								
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									1
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									01/04/2012
								</td>
								<td>
									Default
								</td>
							</tr>
							<tr class="success">
								<td>
									1
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									01/04/2012
								</td>
								<td>
									Approved
								</td>
							</tr>
							<tr class="error">
								<td>
									2
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									02/04/2012
								</td>
								<td>
									Declined
								</td>
							</tr>
							<tr class="warning">
								<td>
									3
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									03/04/2012
								</td>
								<td>
									Pending
								</td>
							</tr>
							<tr class="info">
								<td>
									4
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									04/04/2012
								</td>
								<td>
									Call in to confirm
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div  class="jumbotron">
				<h1>
					Hello, do you want join our team?
				</h1>
				<p>
					This is a 本工作组介绍 for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="#">Learn more</a>
				</p>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-4 column">
			<h2>
				我们的生活
			</h2>
			<p>
				Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
			</p>
			<p>
				 <a class="btn" href="#">View details »</a>
			</p>
		</div>
		<div class="col-md-4 column">
			<h2>
				我们的团队
			</h2>
			<p>
				Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
			</p>
			<p>
				 <a class="btn" href="#">View details »</a>
			</p>
		</div>
		<div class="col-md-4 column">
			<h2>
				我们的工作
			</h2>
			<p>
				Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
			</p>
			<p>
				 <a class="btn" href="#">View details »</a>
			</p>
		</div>
	</div>
</div>
 </body>
</html>
