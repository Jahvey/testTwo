<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3>
				添加招聘
			</h3>
			<dl>
				<dt>
					简要描述
				</dt>
				<dd>
					Description lists
				</dd>
				<dt>
					Euismod
				</dt>
				<dd>
					Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
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
			<form role="form" methond="get" action="addAzhaopin">
				<div class="form-group">
					 <label for="exampleInputEmail1">职位名称</label><input type="text" class="form-control" name="name" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">招聘人数</label><input type="text" class="form-control"  name="num"/>
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">公资</label><input type="text" class="form-control" name="slavery" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">要求</label><input type="text" class="form-control" name="limit"/>
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">发布时间</label><input type="text" class="form-control" name="time" />
				</div>
				<div class="form-group">
				<%
				 qiye use=(qiye)session.getAttribute("use");
				String num=use.getNum();
				%>
					 <label for="exampleInputPassword1"></label><input type="hidden" value=<%=num %> name="ownerNum"/>
				</div>
				<div class="checkbox">
					<a href="qiyeInfo.jsp">返回</a>
					<button type="submit" class="btn btn-default">Submit</button>
				</div> 
			</form>
		</div>
	</div>
</div>
</body>
</html>