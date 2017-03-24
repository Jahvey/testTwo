<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="bean.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="dao.zhaopinDao" %>
<!doctype html>
<html lang="zh">
 <head>
  <meta charset="UTF-8">
 <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
	<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
  <title>Document</title>
 </head>
 <body>
  <%
	 qiuzhi user=(qiuzhi)session.getAttribute("use");
     List<submitResume> list=(List<submitResume>)session.getAttribute("list");
     zhaopinDao job=(zhaopinDao)session.getAttribute("jobDao");
				%>
 <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
		<div class="page-header">
				<h1>
					<a href="fastPage">web求职网 </a><small>we are different</small>
				</h1>
			</div>
			<div class="page-header">
			<h1>姓名<small>name</small></h1>
			<h1><small><%=user.getName() %></small></h1>
				<h1>
				  个人简介<small>introduction</small>
				</h1><h1>
				
				<small><%=user.getDescription() %></small>
				</h1>
			</div>
			<div class="row clearfix">
				<div class="col-md-2 column">
				</div>
				<div class="col-md-6 column">
				
					<img alt="140x140" src="v3/default3.jpg" /> <span class="label label-success">标签</span>
					<h2>
						个人简要
					</h2>
					<p id="descripe">
						
					</p>
					<h3>已投递的简历</h3>
					<table class="table">
						<thead>
							<tr>
								<th>
									编号
								</th>
								<th>
									职位
								</th>
								<th>
									时间
								</th>
								<th>
									回复状态
								</th>
							</tr>
						</thead>
						<tbody>
						<%
						int j=0;
						for(int i=0;i<list.size();i++){
						j=i+1;
						%>
							<tr class="success">
								<td>
									<%=job.queryzhaopinById(list.get(i).getPnumber()).getPnumber() %>
									
								</td>
								<td>
									<%=job.queryzhaopinById(list.get(i).getPnumber()).getPname() %>
									
								</td>
								<td>
									<%=job.queryzhaopinById(list.get(i).getPnumber()).getTime() %>
								</td>
								<td>
									<a href="#"><%=list.get(i).getResult() %></a>
								</td>
							</tr>
							<%} %>
						</tbody>
					</table> 
					<h3>个人简介</h3>
					<address> <strong>学历：<%=user.getLastEducation() %></strong><br /> 毕业学校:<%=user.getGraduate() %><br /> 地址：<%=user.getHomeland() %><br /> <abbr title="Phone">电话:<%=user.getPhone() %></abbr> </address>
				</div>
				<div class="col-md-4 column">
					
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
