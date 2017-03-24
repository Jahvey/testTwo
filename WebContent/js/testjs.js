 $(document).ready(function(){
	$("#send1").css("background-color","red");
	$("#denglu").css("background-color","red");
	$("img").css("height","200");
	$("#panl1").hide();
	$("#dpanl1").click(function(){
	$("#panl1").fadeToggle();
	alert("test");
	});
	$("#test").css("background-color","red");
	//------woshifengexian-----------

	$("#denglu").click(function proLogin(){
	  var user=$.trim($("#user").val());
	  var pass=$.trim($("#pass").val());
	  if(user==null||pass==null){
	   alert("密码或账号不能为空");
	  return false;
	   }
     else{
		
	   
	 }
	
	});
 
	$("#zhuce").click(function zhuce(){
		var phone=$.trim($("#phone").val());
		var pass2=$.trim($("#pass2").val());
		var pass3=$.trim($("#pass3").val());
	  if(pass2!=pass3)
		  alert("ǰ�����벻һ��");
	  if(phone==null||pass2==null||pass3==null){
	  alert("������������");
	  }
	  else{
	
	  }
	});
//---------- ���Ƿָ���--------------

	
	
  })