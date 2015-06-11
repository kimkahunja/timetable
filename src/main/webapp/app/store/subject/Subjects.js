/*
 * Store for managing Subjects
 */
Ext.define('TimeTabler.store.subject.Subjects',{
	extend:'Ext.data.Store',
	alias: 'store.subject.subjects',
	requires:[
	          'TimeTabler.model.subject.Subject'
	          ],
	model:'TimeTabler.model.subject.Subject',  
	//restPath: 'resources/categories',
	storeId: 'Subjects',
	remoteSort: true,
    remoteFilter: true,
    remoteGroup: true,
    //autoLoad: true,
    pageSize: 20,
    proxy: {
        type: 'ajax',
       // url:'Categories/fetchCategories.action',//'resources/categories.json'
        api: {
            create  : 'subject/saveSubject.action',
            read    : 'subject/fetchSubjects.action',
            update  : 'subject/saveSubject.action',
            destroy : 'subject/deleteSubject.action'
        },
        reader: {
            type: 'json',
            totalProperty: 'data.count',
            root: 'data.data',
            successProperty: 'success'
        },
     }
});
