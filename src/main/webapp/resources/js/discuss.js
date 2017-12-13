$(function(){
    $("#discuss").click(function() {
        var username = $("#getusername").val();
        if(''==username){
          alert("请先登录");
          location.href="gologin";
        }else {
            var discussmes = $("#message").text();
            var  articleid= $("#getarticleid").val();
            $.ajax({
                url:"insdiscuss",
                type:"post",
                async:true,
                data:{'disarticleid':articleid,
                    'discussauthor':username,
                    'discussmes':discussmes
                },
                success:function(value){
                    if(value=="insok"){
                        alert("评论成功");
                        location.reload();
                    }else{
                        alert("评论失败");
                    }
                }
            });
        }

    });
});