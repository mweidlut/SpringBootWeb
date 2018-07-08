<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>咔嚓地</title>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <style type="text/css">
        body {
            font-family: 微软雅黑;
            background-color: rgb(239, 239, 239);
            height: 100%;
            margin: 0;
            display: block;
        }

        header {
            height: 74px;
            padding: 0 10px;
        }

        main {
            position: absolute;
            top: 74px;
            bottom: 10px;
            width: 100%;
        }

        .middle {
            content: "";
            display: inline-block;
            height: 100%;
            vertical-align: middle;
        }

        .left {
            width: 15%;
            float: left;
            height: 100%;
        }

        .right {
            width: 85%;
            float: left;
            height: 100%;
        }

    </style>
    <script charset="utf-8" src="https://map.qq.com/api/js?v=2.exp"></script>
    <script>
        //直接加载地图
        window.onload = function () {

            //初始化地图函数  自定义函数名init
            function init() {
                //定义map变量 调用 qq.maps.Map() 构造函数   获取地图显示容器
                var map = new qq.maps.Map(document.getElementById("mapContainer"), {
                    center: new qq.maps.LatLng(39.916527, 116.397128),      // 地图的中心地理坐标。
                    zoom: 1                                                 // 地图的中心地理坐标。
                });
            }

            //调用初始化函数地图
            init();
        }
    </script>
</head>
<body>
<header class="middle">
    <h1>简单地图</h1>
</header>
<main>
    <div class="left">
        <text>这里放点什么呢，广告？这辈子都不可在这个位置放广告的...</text>
    </div>
    <div class="right" id="mapContainer"></div>
</main>
</body>
</html>
