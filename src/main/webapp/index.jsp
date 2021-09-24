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
            var numberField=Ext.create('Ext.Panel', {
                width:280,
                height:120,
                items:
                    [{
                        xtype: 'numberfield',
                        fieldLabel: 'Выберите число',
                        minValue: -5,
                        maxValue: 100,
                        allowDecimals: true,
                        decimalPrecision: 1,
                        step: 0.5
                    }],
                renderTo: Ext.getBody()
            });
        });
    </script>
</head>
<body>
</body>
</html>