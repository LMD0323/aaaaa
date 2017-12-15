$(function(){
    $("#adduser").click(function() {
        var userPhone = $(".phone").val();
        var userPwd = $(".password").val();
        var checkCode=$("#checkCode").val();
        var code = $("#code").val();
        if(code == checkCode){
        	$.ajax({
            	url:"toaddusers.action",
                type:"post",
                data:{ "userPhone":userPhone,
                	"userPwd":userPwd
                	},
                success:function(value){
                alert(value);
      	        			if(value=="ok"){
      	        			alert("注册成功");
      	        			location.href="login.jsp";
      	        			}else if(value=="isExist"){
      	        			alert("已存在，请重新输入");
      	        			location.href="index.jsp";
      	        			}else{
      	        				alert("注册失败");
      	        			}
      	        		}
            })
        }else{
        	alert("验证码输入错误");
        	$("#checkCode").css('display', 'none');
			$("#btnSendCode").css('display', 'none');
        	$("#checkCode1").css('display', 'block');
			$("#code1").css('display', 'block');
        	
        }
        
    });
});