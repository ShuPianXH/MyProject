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
    <script type="text/javascript" src="../layui/jquery-1.10.2.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script src="../layui/layui.js"></script>
</head>

<body>
<div class="layui-form layui-form-pane demoTable">
    <div class="layui-form-item">
        <label class="layui-form-label">输入框</label>
        <div class="layui-inline">
            <input type="text" id="coursename" name="coursename" required lay-verify="required" placeholder="请输题目中的关键字"
                   autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn " data-type="reload">查询</button>
            <a href="back">
                <button class="layui-btn layui-btn-primary " type="reset" id="reset">重置</button>
            </a>
        </div>
    </div>
</div>


<table class="layui-hide" id="test" lay-filter="demo"></table>
<script>
    //分页
    layui.use('table', function () {
        var table = layui.table;
        table.render({
            elem: '#test'
            , url: '/Jianda/findAll'
            , limit: 5
            , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
                layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
                , curr: 1 //设定初始在第 5 页
                , groups: 10 //只显示 1 个连续页码
                , first: true //不显示首页
                , last: true //不显示尾页
            }
            , cols: [[
                {field: 'title', title: '题目', sort: true}
                , {field: 'option1', title: '选项一', sort: true}
                , {field: 'option2', title: '选项二', sort: true}
                , {field: 'option3', title: '选项三', sort: true}
                , {field: 'option4', title: '选项四', sort: true}
                , {field: 'answer', title: '正确答案', sort: true}
                , {field: 'typeid', title: '科目', sort: true}
                , {field: 'testQuestionId', title: '题型', sort: true}
            ]]
        });
        var $ = layui.$, active = {
            reload: function () {
                var coursename = $('#coursename');
                table.reload('test', {
                    page: {
                        curr: 1//重新从第一页开始
                    },
                    where: {
                        coursename: coursename.val(),
                    },
                    url: '/select/findByName',
                    method: 'post'
                });
            }
        };

        $('.demoTable .layui-btn').on('click', function () {
            var type = $(this).data('type');
            alert(type);
            active[type] ? active[type].call(this) : '';
        });

    });
</script>
</body>
</html>
