Ext.application({
    requires: ['Ext.container.Viewport'],
    name: 'BookApp',

    appFolder: 'app',

    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype: 'panel',
                html: '<h2>Библиотека</h2>'
            }
        });
    }
});