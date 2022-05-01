Ext.define('Bdeck.view.PollsGraph', {
    extends: 'Ext.panel.Panel',
    alias: 'widget.polls-graph',
    width: 800,
    height: 500,
    layout: 'hbox',

    initComponent: function () {
        var me = this;

        var store = Ext.create('Bdeck.view.VariantsPanel');

        Ext.apply(me, {
            items: [store],
        });

        me.callParent();
    }
});
