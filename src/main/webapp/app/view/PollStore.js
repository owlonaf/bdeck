Ext.define('Bdeck.view.PollStore', {
    extend: 'Ext.data.Store',
    alias: 'widget.poll-store',
    firstCheckboxLabel: 'Анчоусы',
    secondCheckboxLabel: 'Салями',
    thirdCheckboxLabel: 'Грибы',
    fourthCheckboxLabel: 'Ананасы',
    fields: ['rate', 'name'],
    data: [
        { 'name': 'firstCheckboxLabel', 'rate':27.72},
        { 'name': 'secondCheckboxLabel', 'rate':19.76},
        { 'name': 'thirdCheckboxLabel', 'rate':40},
        { 'name': 'fourthCheckboxLabel', 'rate':31.38}
    ]
})