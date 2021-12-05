Ext.application({
    name: 'CarCatalog',

    views: [
        'AddCarFormView',
        'CarCatalogView',
        'CarGridView',
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
