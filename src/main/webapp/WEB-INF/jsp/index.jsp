<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>咔嚓地</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <style type="text/css">
        html,body{
            width:100%;
            height:100%;
        }
        *{
            margin:0px;
            padding:0px;
        }
        body, button, input, select, textarea {
            font: 12px/16px Verdana, Helvetica, Arial, sans-serif;
        }
        p{
            width:603px;
            padding-top:3px;
            overflow:hidden;
        }
        .btn{
            width:142px;
        }
        #container{
            min-width:600px;
            min-height:767px;
        }
    </style>
    <script charset="utf-8" src="https://map.qq.com/api/js?v=2.exp"></script>
    <script>
        //直接加载地图
        window.onload = function(){

            //初始化地图函数  自定义函数名init
            function init() {
                //定义map变量 调用 qq.maps.Map() 构造函数   获取地图显示容器
                var map = new qq.maps.Map(document.getElementById("container"), {
                    center: new qq.maps.LatLng(39.916527,116.397128),      // 地图的中心地理坐标。
                    zoom:4                                                 // 地图的中心地理坐标。
                });
            }

            //调用初始化函数地图
            init();
        }
    </script>
</head>
<body>
<!--   定义地图显示容器   -->
<div id="container"></div>
</body>
</html>
