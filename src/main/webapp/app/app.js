Ext.application({
    name: 'Bdeck',

    views: [
        'MainToolbar',
    ],

    launch: function () {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype  : 'main-toolbar'
            }
        });
    }
});
