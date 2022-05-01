Ext.define('Bdeck.view.VariantsPanel', {
    extend: 'Ext.form.Panel',
    alias: 'widget.variants-panel',
    width: 370,
    height: '100%',
    bodyPadding: 10,
    title: 'Пройди свой опрос!',
    pollLabel: 'Варианты ответов',
    firstCheckboxLabel: 'Анчоусы - 1 вариант',
    secondCheckboxLabel: 'Салями - 2 вариант',
    thirdCheckboxLabel: 'Грибы - 3 вариант',
    fourthCheckboxLabel: 'Ананасы - 4 вариант',

    bbar: [
        {
            text: 'Редактировать',
            handler: function () {
                Ext.create('Bdeck.view.UpdateWindow').show();
            }
        },
        '-',
        {
            text: 'Выбрать все',
            handler: function () {
                Ext.getCmp('checkbox1').setValue(true);
                Ext.getCmp('checkbox2').setValue(true);
                Ext.getCmp('checkbox3').setValue(true);
                Ext.getCmp('checkbox4').setValue(true);
            }
        },
        {
            text: 'Отменить все',
            handler: function () {
                Ext.getCmp('checkbox1').setValue(false);
                Ext.getCmp('checkbox2').setValue(false);
                Ext.getCmp('checkbox3').setValue(false);
                Ext.getCmp('checkbox4').setValue(false);
            }
        }
    ],
    initComponent: function () {
        var me = this;

        Ext.apply(me, {
            items: [
                {
                    xtype: 'fieldcontainer',
                    fieldLabel: this.pollLabel,
                    labelWidth: 130,
                    defaultType: 'checkboxfield',
                    items: [
                        {
                            boxLabel: this.firstCheckboxLabel,
                            name: 'topping',
                            inputValue: '1',
                            id: 'checkbox1'
                        }, {
                            boxLabel: this.secondCheckboxLabel,
                            name: 'topping',
                            inputValue: '2',
                            id: 'checkbox2'
                        }, {
                            boxLabel: this.thirdCheckboxLabel,
                            name: 'topping',
                            inputValue: '3',
                            id: 'checkbox3'
                        }, {
                            boxLabel: this.fourthCheckboxLabel,
                            name: 'topping',
                            inputValue: '4',
                            id: 'checkbox4'
                        }
                    ]
                },
            ],
        });

        me.callParent();
    }
});
