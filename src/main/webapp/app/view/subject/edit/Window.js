Ext.define('TimeTabler.view.subject.edit.Window', {
    extend: 'Ext.window.Window',
    alias: 'widget.subject.edit.window',
    requires: [
        'TimeTabler.view.subject.edit.Form'
    ],
    iconCls: 'icon_user',
    width: 600,
    modal: true,
    resizable: true,
    draggable: true,
    constrainHeader: true,
    layout: 'fit',
    initComponent: function() {
        var me = this;
        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'subject.edit.form'
                }
            ],
            dockedItems: [
                {
                    xtype: 'toolbar',
                    dock: 'bottom',
                    ui: 'footer',
                    items: [
                        {
                            xtype: 'button',
                            itemId: 'cancel',
                            text: 'Cancel',
                            iconCls: 'icon_delete'
                        },
                        '->',
                        {
                            xtype: 'button',
                            itemId: 'save',
                            text: 'Save',
                            iconCls: 'icon_save'
                        }
                    ]
                }
            ]
        });
        me.callParent( arguments );
    }
});