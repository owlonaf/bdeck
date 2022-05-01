Ext.define('Bdeck.view.MainToolbar', {
    extend: 'Ext.panel.Panel',
    width: 1920,
    height: 360,
    alias: 'widget.main-toolbar',
    layout: 'vbox',
    hiddenProp: true,

    initComponent: function () {
        var me = this;

        var attrGrid = Ext.create('Ext.toolbar.Toolbar', {
            margin: '20 0 10',
            items: [
                {
                    text: 'Отобразить результаты',
                    handler: function () {
                        ggggg.show();
                        // ggggg.getLoader().load(me);
                    }
                },
                {
                    text: 'Перейти к обсуждению',
                    // icon: '../images/add.png',
                    handler: function () {
                        window.location.href = 'http://localhost:8888/';
                    }
                },

            ]
        });

        var mainTitle = Ext.create('Ext.panel.Panel', {
            html: '<div style="font: normal 18px cursive"><center><font size = "10">Страница для прохождения социальных опросов</font></center></div>',
            flex: 1,
        })
        // var changingImage = Ext.create('Ext.Img', {
        //     src: '../images/add.png',
        //     renderTo: Ext.getBody()
        // });
        var mainMenu = Ext.create('Ext.panel.Panel', {
            layout: 'hbox',
            items: [mainTitle, attrGrid]
        })
        var pppanel = Ext.create('Bdeck.view.VariantsPanel')

        var storee = Ext.create('Ext.data.Store', {
            fields: ['rate', 'name'],
            data: [
                { 'name': '1 вариант', 'rate':27.72, 'id': 'firstdata'},
                { 'name': '2 вариант', 'rate':19.76, 'id': 'seconddata'},
                { 'name': '3 вариант', 'rate':40, 'id': 'thirddata'},
                { 'name': '4 вариант', 'rate':31.38, 'id': 'fourthdata'}
            ],
        });

        var ggggg = Ext.create('Ext.chart.Chart', {
            renderTo: Ext.getBody(),
            width: 800,
            height: 600,
            padding: '5 0 0 0',
            store: storee,
            axes: [
                {
                    title: 'Количество голосов',
                    type: 'Numeric',
                    position: 'left',
                    fields: ['rate']
                },
                {
                    title: 'Варианты ответов',
                    type: 'Category',
                    position: 'bottom',
                    fields: ['name']
                }
            ],
            series: [
                {
                    type: 'bar',
                    xField: 'name',
                    yField: 'rate',
                    column: true
                }
            ],
            theme: 'Green',
        });

        ggggg.hide();

        var hidbutton = Ext.create('Ext.button.Button', {
            text: 'kekw',
            handler: function () {
                Ext.getCmp('ggggg').setHidden(true);
            }
        })

        var basepanel = Ext.create('Ext.panel.Panel', {
            layout: 'hbox',
            items: [
                pppanel, ggggg
            ],
            height: 640,
        })

        Ext.apply(me, {
            items: [
                mainMenu,
                basepanel
            ]
        });

        me.callParent();
    },

    sethiddd: function () {
        Ext.getCmp('ggggg').hide();
    }
});
