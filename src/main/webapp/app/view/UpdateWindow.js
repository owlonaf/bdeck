Ext.define('Bdeck.view.UpdateWindow', {
    extend: 'Ext.window.Window',
    alias: 'widget.update-window',
    width: 400,
    height: 400,
    frame: true,
    title: 'Изменить варианты ответов',
    layout: 'vbox',

    initComponent: function () {
        var me = this;

        var textfield1 = Ext.create('Ext.form.field.Text', {
            xtype: 'textfield',
            padding: '10 5 3 10',
            fieldLabel: 'Вариант №1',
        })

        var textfield2 = Ext.create('Ext.form.field.Text', {
            xtype: 'textfield',
            padding: '10 5 3 10',
            fieldLabel: 'Вариант №2',
        })

        var textfield3 = Ext.create('Ext.form.field.Text', {
            xtype: 'textfield',
            padding: '10 5 3 10',
            fieldLabel: 'Вариант №3',
        })

        var textfield4 = Ext.create('Ext.form.field.Text', {
            xtype: 'textfield',
            padding: '10 5 3 10',
            fieldLabel: 'Вариант №4',

        })

        // var storee = Ext.create('Bdeck.view.PollStore');

        Ext.apply(me, {
            items: [
              textfield1, textfield2, textfield3, textfield4,
            ],
            bbar: [
                {
                    text: 'Отмена',
                    handler: function () {
                        me.hide();
                    }
                }, {
                    text: 'Сохранить',
                    handler: function () {
                        if(textfield1.getValue() !== '') {
                            Ext.getCmp('checkbox1').setBoxLabel(textfield1.getValue() + ' - 1 вариант');
                        }
                        if(textfield2.getValue() !== '') {
                            Ext.getCmp('checkbox2').setBoxLabel(textfield2.getValue() + ' - 2 вариант');
                        }
                        if(textfield3.getValue() !== '') {
                            Ext.getCmp('checkbox3').setBoxLabel(textfield3.getValue() + ' - 3 вариант');
                        }
                        if(textfield4.getValue() !== '') {
                            Ext.getCmp('checkbox4').setBoxLabel(textfield4.getValue() + ' - 4 вариант');
                        }
                        me.hide();
                    }
                }
            ],
            // store: storee,
        })

        me.callParent();
    }
});
