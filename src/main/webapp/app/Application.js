Ext.define('TimeTabler.Application', {
    name: 'TimeTabler',

    extend: 'Ext.app.Application',

    views: [
            'Viewport',
    ],

    controllers: [
                  'Menu',
    ],

    stores: [
        // TODO: add stores here
    ],
	launch: function() {
	
	    Ext.tip.QuickTipManager.init();

	 Ext.create('TimeTabler.view.MyViewport');
	}
});
