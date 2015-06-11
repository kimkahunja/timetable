Ext.define('TimeTabler.model.subject.Subject', {
    extend: 'Ext.data.Model',
    idProperty: 'subId',

    fields: [
        {
            name: 'subId'
        },
        {
            name: 'subShtDesc'
        },
        {
            name: 'subDescription'
        },
        {
            name: 'subColor'
        },
        {
            name: 'subImage'
        }
    ]
});