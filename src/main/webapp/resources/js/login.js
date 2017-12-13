$(function(){
    $("#userlogin").click(function() {
        var username = $("#username").val();
        var uerpwd = $("#userpwd").val();
        $.ajax({
            url:"tologin",
            type:"post",
            async:true,
            data:{"username":username,
                "uerpwd":uerpwd
            },
            success:function(value){
                if(value=='ok'){
                    alert("登录成功");
                    location.href="listCategory";
                }else{
                    alert("登录失败");
                    location.href="gologin";
                }
            }
        });
    });
});