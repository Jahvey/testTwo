<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="dao.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
	
<title>Insert title here</title>
</head>
<body>
<%

session=pageContext.getSession();
zhaopinDao dao=(zhaopinDao)session.getAttribute("jobDao");
submitResumeDao resumeDao=new submitResumeDao();
resumeDao=(submitResumeDao)session.getAttribute("resumeDao");
List<submitResume> list=(List<submitResume>)session.getAttribute("list");
qiuzhiDao manDao=(qiuzhiDao)session.getAttribute("manDao");
int Pnum=(int)session.getAttribute("Pnum");

%>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3>
				企业招聘简述
			</h3>
			<dl>
				<dt>
				Job	Description
				</dt>
				<dd>
					要求
				</dd>
				<dt>
					Euismod
				</dt>
				<dd>
					发布时间
				</dd>
				<dd>
					Donec id elit non mi porta gravida at eget metus.
				</dd>
				<dt>
					Malesuada porta
				</dt>
				<dd>
					Etiam porta sem malesuada magna mollis euismod.
				</dd>
				<dt>
					Felis euismod semper eget lacinia
				</dt>
				<dd>
					Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
				</dd>
			</dl>
			<table class="table">
				<thead>
					<tr>
						<th>
							编号
						</th>
						<th>
							已投递人员姓名
						</th>
					    
						<th>
							状态
						</th>
					</tr>
				</thead>
				<tbody>
				<%
				int j=0;
				for(int i=0;i<list.size();i++){
					qiuzhi date=manDao.queryByIdqiuzhi(list.get(i).getQnumber());
					j=i+1;
				%>
					<tr class="success">
						<td>
							<%=list.get(i).getPnumber() %>
						</td>
						<td>
							<a href="#"><%=date.getName() %></a>
						</td>
						
						<td>
						  <%
						  if(list.get(i).getResult().equals("false")){
						  %>
							<a href="interviewInvit?Qnum=<%=date.getNum()%>&Pnum=<%=Pnum%>">面试邀请</a>
							<%}else{ %>
							已邀请<%} %>
						</td>
					</tr>
					<% }
					%>
				</tbody>
			</table>
			<a href="#">返回</a>
		</div>
	</div>
</div>
</body>
</html>