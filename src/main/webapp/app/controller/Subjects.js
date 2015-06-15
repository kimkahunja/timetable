Ext.define('TimeTabler.controller.Subjects', {
    extend: 'Ext.app.Controller',

    requires: [
        
    ], 

    models: [
    ],
    stores: [
        'subject.Subjects'
    ],
    views: [
        'subject.List',
        'subject.edit.Form',
        'subject.edit.Window'
    ],

    refs: [
        {
            ref: 'SubjectList',
            selector: '[xtype=subject.list]'
        },
        {
            ref: 'SubjectEditWindow',
            selector: '[xtype=subject.edit.window]'
        },
        {
            ref: 'SubjectEditForm',
            selector: '[xtype=subject.edit.form]'
        }
    ],
    init: function() {
        this.listen({
            controller: {},
            component: {
            	'grid[xtype=subject.list]': {
            		//edit: this.editCategory,
            		//canceledit: this.cancel,
            		//viewready: this.loadRecords,//beforerender: this.loadRecords,
            		//itemcontextmenu: this.showContextMenu
            	},
            	'grid[xtype=subject.list] button#add': {
            		click: this.add
            	},
            	'grid[xtype=subject.list] gridview': {
            		//itemadd: this.edit
            	}
            },
            global: {},
            store: {},
            //proxy: {} 
        });
    }, 
    /**
     * Creates a new record and prepares it for editing
     * @param {Ext.button.Button} button
     * @param {Ext.EventObject} e
     * @param {Object} eOpts
     */
    add: function( button, e, eOpts ) {
        var me = this,
            record = Ext.create( 'TimeTabler.model.subject.Subject' );
        // show window
        me.showEditWindow( record );
    },
    /**
     * Displays common editing form for add/edit operations
     * @param {Ext.data.Model} record
     */
    showEditWindow: function( record ) {
        var me = this,
            win = me.getSubjectEditWindow(),
            isNew = record.phantom;
        // if window exists, show it; otherwise, create new instance
        if( !win ) {
            win = Ext.widget( 'subject.edit.window', {
                title: isNew ? 'Add Subject' : 'Edit Subject'
            });
        }
        // show window
        win.show();
        // load form with data
        win.down( 'form' ).loadRecord( record );
    },
});