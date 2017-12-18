import VueI18n from 'vue-i18n'

const i18n = new VueI18n({
    locale: 'ja',    // 语言标识
    messages: {
        'zh': require('./lang/zh'),   // 中文语言包
        'ja': require('./lang/ja')    // 英文语言包
    }
})

console.log(i18n);

export default i18n