$(function(){
    $(".deletearticle").click(function() {
        var articleid = $(".articleid").val();
        var articleauthor = $(".articleauthor").val();
alert(articleid);
alert(articleauthor)
        $.ajax({
            url:"deletearticleother",
            type:"post",
            async:true,
            data:{"articleid":articleid,
                "articleauthor":articleauthor
            },
            success:function(value){
                if(value=='ok'){
                    alert("删除成功");
                    location.href="gomyarticle";
                }else{
                    alert("权限不足");
                    location.href="gomyarticle";
                }
            }
        });
    });
});