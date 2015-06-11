Ext.define('TimeTabler.model.menu.Root', {
    extend: 'Ext.data.Model',

    uses: [
        'TimeTabler.model.menu.Item'
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
            name: 'id'
        }
    ],

    hasMany: {
        model: 'TimeTabler.model.menu.Item',
        foreignKey: 'parentId',
        name: 'items'
    }
});