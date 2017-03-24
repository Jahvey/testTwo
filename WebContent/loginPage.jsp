<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
	<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="js/test2.js"></script>
  <title>Document</title>
 </head>
 <body>

 <div class="container">
	<div class="row clearfix">
		<div class="col-md-2 column">
		</div>
		<div class="col-md-6 column">
			<h3 class="text-center">
				用户登录
			</h3>
			<div class="tabbable" id="tabs-717830">
				<ul class="nav nav-tabs">
					<li>
						 <a href="#panel-871116" data-toggle="tab">登录</a>
					</li>
					<li class="active">
						 <a href="#panel-954195" data-toggle="tab">注册</a>
					</li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane" id="panel-871116">
					<form class="form-horizontal" role="form" action="login" methond="GET">
				        <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">账号</label>
					    <div class="col-sm-10">
						<input type="text" class="form-control" id="user1" name="user1"/>
					    </div>
				       </div>
				       <div class="form-group">
					   <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
					   <div class="col-sm-10">
						<input type="password" class="form-control" id="inputPassword1"name="pass1" />
					  </div>
				     </div>
				   <div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							 <label><input type="radio" name="dif" value="geren"/>个人</label>
							 <label><input type="radio" name="dif" value="qiye"/>企业</label>
						</div>
					</div>
				   </div>
				  <div class="form-group">
					  <div class="col-sm-offset-2 col-sm-10">
						 <input type="submit" id="denglu" class="btn btn-default" value="登录" onclick="checkLogin()">
					  </div>
				  </div>
				  <div class="form-group">
					  <div class="col-sm-offset-2 col-sm-10">
						 <input type="reset" class="btn btn-default" value="取消">
					  </div>
				  </div>
			   </form>
					</div>
					<div class="tab-pane active" id="panel-954195">
						<form class="form-horizontal" role="form" action="zhuce" methond="GET">
				<div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							 <label><input type="radio" id="qiuzhiradio" checked="true" name="dif" value="geren"/>个人</label>
							 <label><input type="radio" id="qiyeradio" name="dif" value="qiye"/>企业</label>
						</div>
					</div>
				</div>
				
				<div id="qiuzhi">
				
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">账号</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="phone" name="Qnumber"/>
					</div>
				</div>
			 <div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">手机号</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="phone" name="Qphone"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="name" name="Qname"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="sex" name="Qsex"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">年龄</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="phone" name="Qage"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">出生日期</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="bir" name="Qbirthday"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">家庭住址</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="address" name="Qaddress"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">毕业学校</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="phone" name="Qgraduate"/>
					</div>
				</div>
				
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="pass21"name="pass21" />
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">重新输入密码</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="pass22" name="pass22"/>
					</div>
				</div>
				
				</div>
				<div id="qiye"  style="display:none">
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">企业账号(数字)</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="Fnumber" name="Fnumber"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">企业名称</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="Fname" name="Fname"/>
					</div>
				</div>
                  <div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">电话号码</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="Fphone" name="FPhone"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">地址</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="Faddress" name="Faddress"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">描述</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="Fname" name="Fname"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">业务</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="Fskill" name="Fskill"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="FPassword"name="Fpass" />
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">重新输入密码</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="Fpass1" name="Fpass2" />
					</div>
				</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 <input type="submit" id="zhuce" class="btn btn-default" value="提交">
					</div>
				</div>
				<div class="form-group">
					  <div class="col-sm-offset-2 col-sm-10">
						 <a href="#panel-871116"><button type="button" class="btn btn-default">返回登录</button></a>
					  </div>
				  </div>
			 
				</div>
			</form>
				</div>
			</div>
			
			
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
</div>
 </body>
</html>
