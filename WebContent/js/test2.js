$(document).ready(function(){
	 
	 $("#denglu").css("background-color","blue");
    $("#qiyeradio").click(function(){
		
	   $("#qiuzhi").css("display","none");
	   $("#qiye").css("display","block");
	});
	$("#qiuzhiradio").click(function(){
	   $("#qiye").css("display","none");
	   $("#qiuzhi").css("display","block");
	});
	$("#pass22").blur(function checkSignUp(){
		//alert("test");
		if($("#pass21").value!==$("#pass22").value)
			{
			alert("重复输入的密码不同");
			return false;
			}
	} );
	function checkLogin(){
		  alert("test");
		  var user=$.trim($("#user").val());
		  var pass=$.trim($("#pass").val());
		  if(user==null||pass==null){
		   alert("密码或账号不能为空");
		   //check.preventDefault();
		  return false;
		  }
		  return true;
		   
		}
})