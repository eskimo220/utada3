import Vue from 'vue'
import App from './App'
import router from './router'
//import store from './store/'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import 'element-ui/lib/theme-chalk/display.css';
import VueI18n from 'vue-i18n'
import ElementLocale from 'element-ui/lib/locale'
import zhLocale from './i18n/lang/zh'
import jaLocale from './i18n/lang/ja'

Vue.config.productionTip = false;

Vue.use(ElementUI);
Vue.use(VueI18n);

Vue.config.lang = 'ja'
Vue.locale('zh', zhLocale)
Vue.locale('ja', jaLocale)

new Vue({
	el: '#app',
	router,
	//store,
	template: '<App/>',
	components: { App }
})
