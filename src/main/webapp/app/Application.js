Ext.define('TimeTabler.Application', {
    name: 'TimeTabler',

    extend: 'Ext.app.Application',
    requires: [
               'TimeTabler.util.Util',
               'Ext.ux.colorpicker.ColorPicker',
               'Ext.ux.colorpicker.ColorPickerField'
               ],
    views: [
            'Viewport',
            'subject.List',
            'subject.edit.Form',
            'subject.edit.Window'
    ],

    controllers: [
                  'Menu',
                  'Subjects'
    ],

    stores: [
        // TODO: add stores here
    ],
	launch: function() {
	
	    Ext.tip.QuickTipManager.init();

	 Ext.create('TimeTabler.view.MyViewport');
	}
});
