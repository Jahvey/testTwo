<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="bean.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="dao.*" %>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
	
	<script>
	$(document).ready(function(){
		function test(){	
			//alert(""+Date());
		$.getScript("deleteAJob");
		$("#time").innerHTML=(Date()+"");
		}
		setInterval(test,10000);
		
	})
	</script>
  <title>Document</title>
 </head>
 <body>
 <%
 session=pageContext.getSession();
  qiye use=(qiye)session.getAttribute("use");
 // List<zhaopin> list=(List<zhaopin>)session.getAttribute("list");
  zhaopinDao dao=(zhaopinDao)session.getAttribute("zhaopinDao");
  List<zhaopin> list=dao.queryByOwnerId(use.getNum());
  submitResumeDao date=(submitResumeDao)session.getAttribute("resumeDao");
  int[] a=date.getsubmitResumeNumByPnum(use.getNum());
 %>
  <div class="container">
	<div class="row clearfix">
	<div class="page-header">
				<h1>
					<a href="fastPage">web求职网 </a><small>we are different</small>
				</h1>
			</div>
	       <div class="page-header">
				<h1>
					企业信息 <small>company information</small>
				</h1>
				<h1><small><%=use.getName() %></small></h1>
			</div>
		<div class="col-md-8 column">
			<h3>
				以诚相待
			</h3><img alt="140x140" src="v3/default3.jpg" />
			<h2>
				公司简介
			</h2>
			<p>
				<%=use.getDescription() %>
			</p>
			<p>
				 <a class="btn" href="#">View details »</a>
			</p> Time<span class="label label-success" id="time"></span>
			<h2>招聘表单</h2>
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
							招聘人数
						</th>
						<th>
						    发布时间
						</th>
						<th>
							已投简历
						</th>
					</tr>
				</thead>
				<tbody>
				<%
			//System.out.println(date.getsubmitResumeNumByPnum("2"));
				
				
				  for(int i=0;i<list.size();i++){
				%>
					<tr class="success" id="tr<%=list.get(i).getPnumber()%>">
						<td >
							<%=list.get(i).getPnumber() %>
						</td>
						<td>
							<%=list.get(i).getPname() %>
						</td>
						<td>
							<%=list.get(i).getNum() %>
						</td>
						<td>
							<%=list.get(i).getTime() %>
						</td>
						<td>
						
							<a href="turnToJobDesc?Pnum=<%=list.get(i).getPnumber() %>" ><label ><%=a[i] %></label></a>
						</td>
						<td> <a href="deleteAJob?Pnum=<%=list.get(i).getPnumber()%>">停止招聘</a></td>
					</tr>
					<%} %>
					
				</tbody>
			</table> <address> <strong>地址:<%=use.getAddress() %></strong> <br /> <abbr title="Phone">电话:</abbr> <%=use.getPhone() %></address>
		</div>
		<div class="col-md-4 column">
		 <ul>
		 <li><a href="addJob.jsp">新增招聘</a></li>
		 <li></li>
		 </ul>
		</div>
	</div>
</div>
 </body>
</html>
