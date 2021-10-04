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
            Ext.create('Ext.panel.Panel', {
                renderTo: Ext.getBody(),
                width: 300,
                height: 230,
                padding:10,
                title: 'Основной контейнер',
                items: [
                    {
                        xtype: 'panel',
                        title: 'Внутренняя панель 1',
                        height: 100,
                        width: '100%'
                    },
                    {
                        xtype: 'panel',
                        title: 'Внутренняя панель 2',
                        height: 100,
                        width: '100%'
                    }
                ]
            });
        });
    </script>
</head>
<body>
</body>
</html>