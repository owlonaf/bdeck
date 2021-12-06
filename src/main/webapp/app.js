Ext.application({
    name: 'Bdeck',

    views: [
        'AddCarFormView',
        'CarCatalogView',
        'CarGridView',
        'NewGrid',
    ],

    launch: function () {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype  : 'carCatalogView'
            }
        });
    }
});
