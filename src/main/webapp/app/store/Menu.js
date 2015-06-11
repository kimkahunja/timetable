Ext.define('TimeTabler.store.Menu', {
    extend: 'Ext.data.Store',

    requires: [
        'TimeTabler.model.menu.Root'
    ],

    model: 'TimeTabler.model.menu.Root',
    
    proxy: {
        type: 'ajax',
        url: 'menu/fetchMenu.action',
        
        reader: {
            type: 'json',
            root: 'items'
        },
        listeners: {
            exception: function(proxy, response, operation){
                Ext.MessageBox.show({
                    title: 'REMOTE EXCEPTION',
                    msg: operation.getError(),
                    icon: Ext.MessageBox.ERROR,
                    buttons: Ext.Msg.OK
                });
            }
        }
    }
});