<template>
  <div class="login_page fillcontain">
    <transition name="form-fade" mode="in-out">
      <section class="form_contianer" v-show="showLogin">
        <div class="manage_tip">
          <p>{{ $t("message.systemTitle") }}</p>
        </div>
        <el-form :model="loginForm" :rules="rule" ref="loginForm">
          <el-form-item prop="username">
            <el-input v-model="loginForm.username" :placeholder="$t('message.userName')">
              <span>dsfsf</span>
            </el-input>
          </el-form-item>
          <el-form-item prop="password">
            <el-input type="password" :placeholder="$t('message.password')" v-model="loginForm.password"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click.stop.prevent="submitForm('loginForm')" class="submit_btn">{{ $t("message.login") }}</el-button>
          </el-form-item>
        </el-form>
        <p class="tip" v-for="(one, index) in $t('message.loginMessage')" :key='index'>{{ one }}</p>
      </section>
    </transition>
  </div>
</template>

<script>
// import {login, getAdminInfo} from '@/api/getData'
// import {mapActions, mapState} from 'vuex'
import Vue from "vue";
export default {
  data() {
    return {
      loginForm: {
        username: "",
        password: ""
      },
      showLogin: false,
      rule: {
        username: [
          {
            required: true,
            message: this.$t("message.pleaseInput", [
              this.$t("message.userName")
            ]),
            trigger: "blur,change"
          }
        ],
        password: [
          {
            required: true,
            message: this.$t("message.pleaseInput", [
              this.$t("message.password")
            ]),
            trigger: "blur,change"
          }
        ]
      }
    };
  },
  mounted() {
    this.showLogin = true;
  },
  computed: {},
  methods: {
    message1() {
      this.rule.username[0].message = this.$t("message.pleaseInput", [
        this.$t("message.userName")
      ]);
      this.rule.password[0].message = this.$t("message.pleaseInput", [
        this.$t("message.password")
      ]);
    },

    submitForm() {
      // Vue.config.lang = Vue.config.lang =='zh' ? "ja" : "zh";
      // this.message1();
      // //this.$refs["loginForm"].resetFields();
      // this.$refs["loginForm"].clearValidate();
      this.$message({
        type: "success",
        message: this.$t("message.loginMessage")
      });
      this.$router.push("manage");
    }
  },
  watch: {}
};
</script>
<style lang="scss" scoped>
@import "../style/mixin";
.el-form-item {
  margin-bottom: 18px;
}

.login_page {
  background-color: #324057;
}
.manage_tip {
  position: absolute;
  width: 100%;
  top: -100px;
  left: 0;
  p {
    font-size: 34px;
    color: #fff;
  }
}
.form_contianer {
  @include wh(320px, 210px);
  @include ctp(320px, 210px);
  padding: 25px;
  border-radius: 5px;
  text-align: center;
  background-color: #fff;
  .submit_btn {
    width: 100%;
    font-size: 16px;
  }
}
.tip {
  font-size: 12px;
  color: red;
}
.form-fade-enter-active,
.form-fade-leave-active {
  transition: all 1s;
}
.form-fade-enter,
.form-fade-leave-active {
  transform: translate3d(0, -50px, 0);
  opacity: 0;
}
</style>