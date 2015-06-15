Ext.define('TimeTabler.view.subject.List',{
	extend:'Ext.grid.Panel',
	alias:'widget.subject.list',
	requires: [
	           'Ext.toolbar.Paging',	         
	       ],	       
	autoWidth:true,
	store: 'subject.Subjects',
    initComponent: function() {
       var me = this;
       Ext.applyIf(me,{    	 
           columns: {
               defaults: {},
               items: [                                     
                    {
                        text: 'Short Desc',
                        dataIndex: 'subShtDesc'
                    },
                    {
                        text: 'Description',
                        dataIndex: 'subDescription'
                    }
               ]
           },
           dockedItems: [
               {
                   xtype: 'toolbar',
                   dock: 'top',
                   ui: 'footer',
                   items: [
                       {
                           xtype: 'button',
                           itemId: 'add',
                           iconCls: 'add',
                           text: 'Add'
                       },
                       {
                           xtype: 'button',
                           itemId: 'edit',
                           iconCls: 'edit',
                           text: 'Edit'
                       },
                       {
                           xtype: 'button',
                           itemId: 'delete',
                           iconCls: 'delete',
                           text: 'Delete'
                       }
                   ]
               },
               {
                   xtype: 'pagingtoolbar',
                   ui: 'footer',
                   defaultButtonUI: 'default',
                   dock: 'bottom',
                   displayInfo: true,
                   store: me.getStore()
               }
           ]
       });
       me.callParent( arguments );
   }        
});