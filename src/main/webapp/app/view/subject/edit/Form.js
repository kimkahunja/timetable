Ext.define('TimeTabler.view.subject.edit.Form', {
    extend: 'Ext.form.Panel',
    alias: 'widget.subject.edit.form',
    requires: [
        'Ext.form.FieldContainer',
        'Ext.form.field.Date',
        'Ext.form.field.Text',
        'Ext.form.field.ComboBox',
        //'TimeTabler.ux.form.field.RemoteComboBox',        
    ],
    bodyPadding: 5,
    initComponent: function() {
        var me = this;
        Ext.applyIf(me, {
        	items: [
        	        {
        	            xtype: 'form',
        	            bodyPadding: 5,
        	            layout: {
        	                type: 'hbox',
        	                align: 'stretch'
        	            },
        	            items: [
        	                {
        	                    xtype: 'fieldset',
        	                    flex: 2,
        	                    title: 'User Information',
        	                    defaults: {
        	                        afterLabelTextTpl: TimeTabler.util.Util.required,
        	                        anchor: '100%',
        	                        xtype: 'textfield',
        	                        //width:60,
        	                        allowBlank: false,
        	                        labelWidth: 80
        	                    },
        	                    items: [
        	                        {
        	                            xtype: 'hiddenfield',
        	                            fieldLabel: 'Label',
        	                            name: 'subId'
        	                        },        	                        
        	                        {
        	                            fieldLabel: 'Description',
        	                            width:100,
        	                            maxLength: 100,
        	                            name: 'subDescription'
        	                        },
        	                        {
        	                            fieldLabel: 'Short Descr.',
        	                            maxLength: 20,
        	                            name: 'subShtDesc'
        	                        },
        	                        {
        	                        	xtype:'ux.colorpicker.colorpickerfield',
        	                            fieldLabel: 'Font Color',
        	                            maxLength: 50,
        	                            name: 'subColor'
        	                        },
        	                        
        	                        {
        	                            xtype: 'filefield',
        	                            fieldLabel: 'Picture',
        	                            name: 'subImage',
        	                            allowBlank: true,
        	                            afterLabelTextTpl: ''
        	                        }
        	                    ]
        	                },
        	                {
        	                    xtype: 'fieldset',
        	                    title: 'Picture',
        	                    width: 170,
        	                    items: [
        	                        {
        	                            xtype: 'image',
        	                            height: 150,
        	                            width: 150,
        	                            src: ''
        	                        }
        	                    ]
        	                }
        	            ]
        	        }
        	    ],
        });
        me.callParent( arguments );
    }
});