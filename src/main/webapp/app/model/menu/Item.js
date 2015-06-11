Ext.define('TimeTabler.model.menu.Item', {
    extend: 'Ext.data.Model',

    uses: [
        'TimeTabler.model.menu.Root'
    ],

    idProperty: 'id',

    fields: [
        {
            name: 'text'
        },
        {
            name: 'iconcls'
        },
        {
            name: 'classname'
        },
        {
            name: 'id'
        },
        {
            name: 'parentId'
        }
    ],

    belongsTo: {
        model: 'TimeTabler.model.menu.Root',
        foreignKey: 'parentId'
    }
});