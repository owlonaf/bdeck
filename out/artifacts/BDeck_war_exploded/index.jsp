<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Каталог</title>
    <link rel="stylesheet" type="text/css" href="resources/packages/ext-theme-neptune/build/resources/ext-theme-neptune-all.css"/>
    <script type="text/javascript" src="resources/ext-all.js"></script>
    <script type="text/javascript" src="resources/packages/ext-theme-neptune/build/ext-theme-neptune.js"></script>
    <script>
        Ext.onReady(function(){
            var bigPannel=Ext.create('Ext.Panel', {
                title: 'Приложение Ext JS 4',
                width: 300,
                height: 200,
                renderTo:'tiptop'
            });
        });
    </script>
</head>
<body>
<div id="tiptop" style="margin-top: 50px; margin-left:50px; width:300px; height:300px;"></div>
</body>
</html>