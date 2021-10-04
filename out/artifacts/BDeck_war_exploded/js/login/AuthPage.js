Ext.define('bdeck.AuthPage', {
    extend: 'Ext.panel.Panel',
    width: 500,
    height: 360,
    requires: 'bdeck.AuthPage',

    initComponent : function () {
        var me = this;

        var nameField = Ext.widget({
            xtype: 'textfield',
            name: 'name',
            fieldLabel: 'Name',
            margin: '10 0 0 5',
            allowBlank: false
        });

        var nicknameField = Ext.widget({
            xtype: 'textfield',
            name: 'nickname',
            fieldLabel: 'Nickname',
            margin: '10 0 0 5',
            allowBlank: false
        });

        var passwordField = Ext.widget({
            xtype: 'textfield',
            name: 'password',
            fieldLabel: 'Password',
            margin: '10 0 0 5',
            allowBlank: false
        });

        var confirmPasswordField = Ext.widget({
            xtype: 'textfield',
            name: 'confirmPassword',
            fieldLabel: 'Confirm Password',
            margin: '10 0 0 5',
            allowBlank: false
        });

        var textt = {
            xtype: 'text',
            itemId: 'textt',
            text: 'jfjdjd'
        };

        var confirmButton = Ext.create('Ext.Button', {
            text: 'Click me',
            handler: function() {
                var name = nameField.getValue();
                var nickname = nicknameField.getValue();
                var password = passwordField.getValue();
                var confirmPassword = confirmPasswordField.getValue();
            }
        });

        Ext.apply(me, {
            items: Ext.create('Ext.Panel', {
                title: "HBoxLayout Panel",
                layout: 'hbox',
                items: [
                    Ext.create('Ext.Panel', {
                        title: "VBoxLayout Panel",
                        layout:'vbox',
                        items: [
                            nameField,
                            nicknameField,
                            passwordField,
                            confirmPasswordField,
                        ]
                    }),
                    confirmButton,
                    textt,
                ]
            })
        });

        me.callParent(arguments);
    }
});