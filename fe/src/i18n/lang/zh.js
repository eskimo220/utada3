import zhLocale from 'element-ui/lib/locale/lang/zh-CN'

const zh = {...zhLocale,
love : "爱",
message: {
    userName: '用户名',
    password: '密码',
    systemTitle: 'elm后台管理系统',
    pleaseInput: '请输入{0}',
    login: '登录',
    content: '内容',
    loginMessage : [
      "温馨提示：",
      "未登录过的新用户，自动注册",
      "注册过的用户可凭账号密码登录"
    ],
    topNav: [
      '处理中心',
      '资源'
    ],
    Sidebar:[
      ["首页"],
      ["数据管理"],
      ["添加数据"],
      ["图表"],
      ["编辑"],
      ["设置"],
      ["说明"]
    ]
  }
};

export default zh