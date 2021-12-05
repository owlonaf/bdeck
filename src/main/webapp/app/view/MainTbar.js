Ext.define('Bdeck.Tbar', {
    alias: 'widget.maintbar',
    xtype: 'maintbar',
    extend: 'Ext.toolbar.Toolbar',

    dock: 'left',
    items: [
        {
            text: 'Кнопка'
        },{
            xtype: 'splitbutton',
            text : 'Кнопка с меню'
        },'->',{
            xtype    : 'textfield',
            name     : 'field',
            emptyText: 'Найти'
        }]
});