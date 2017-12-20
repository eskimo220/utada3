import jaLocale from 'element-ui/lib/locale/lang/ja'

const ja = {...jaLocale,
love : "愛してる",
message: {
    userName: 'ユーザー名',
    password: 'パスワード',
    systemTitle: 'elmUI..システム',
    pleaseInput: '{0}を入力してください',
    login: 'ログイン',
    content: '内容',
    loginMessage : [
      "ヒント:",
      "ユーザ名パスワードが自由入力",
      "自動登録となり、次回から使える"
    ],
    topNav: [
      'センター',
      '他の情報'
    ],
    Sidebar:[
      ["トップページ"],
      ["データ管理"],
      ["データ追加"],
      ["グラフ"],
      ["編集"],
      ["設置"],
      ["説明"]
    ]
  }
};

export default ja