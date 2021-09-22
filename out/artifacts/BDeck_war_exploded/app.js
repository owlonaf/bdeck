Ext.application({
    name: 'bdeck',


    launch: function () {
        var me = this;
        var view = Ext.create('bdeck.login.AuthPage', {});
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                view
            }
        });
    }
});