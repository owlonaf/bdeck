Ext.define('Bdeck.view.CarCatalogView', {
    extend: 'Ext.panel.Panel',
    width: 500,
    height: 360,
    alias: 'widget.carCatalogView',
    layout: 'border',
    items: [
        {
            xtype: 'newGrid',
            region: 'center'
        },
        {
            xtype: 'panel',
            html: '<div style="font: normal 18px cursive"><center><font size = "10">Каталог автомобилей</font></center></div>',
            region: 'north',
            height: 80
        },
    ],
    renderTo: Ext.getBody()
});
