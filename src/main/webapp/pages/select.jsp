<%--
  Created by IntelliJ IDEA.
  User: 54933
  Date: 2019/8/23 0023
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="jquery-1.10.2.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="layui/layui.js"></script>
</head>

<body>
<div id="top">
    <form class="layui-form" action="">
        <div style="padding: 15px;">
            <div class="layui-form-item">
                <label class="layui-form-label">输入框</label>
                <div class="layui-input-block">
                    <input type="text" name="title" required  lay-verify="required" placeholder="请输题目中的关键字" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">科目类型</label>
                <div class="layui-input-block">
                    <select name="city" lay-verify="required">
                        <option value=""></option>
                        <option value="0">Java</option>
                        <option value="1">C#</option>
                        <option value="2">C</option>
                        <option value="3">Python</option>
                        <option value="4">前端</option>
                        <option value="4">测试</option>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">题型选择</label>
                <div class="layui-input-block">
                    <input type="checkbox" name="like[write]" title="选择" checked>
                    <input type="checkbox" name="like[read]" title="填空" >
                    <input type="checkbox" name="like[dai]" title="判断">
                    <input type="checkbox" name="like[dai]" title="简答">
                </div>
            </div>

            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </div>
    </form>
</div>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
    //Demo
    layui.use('form', function(){
        var form = layui.form;

//监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
    $(function(){
        //获取src值
        $(".main_left a").on("click",function(){
            var address =$(this).attr("data-src");
            $("iframe").attr("src",address);
        });
        //一下代码是根据窗口高度在设置iframe的高度
        var frame = $("#aa");

        var frameheight = $(window).height();
        console.log(frameheight);
        frame.css("height",frameheight);
    });

</script>
</body>
</html>
