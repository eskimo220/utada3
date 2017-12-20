<template>
  <section>
    <h1 class="logo-h1">
      <img src="../assets/logo1.svg" alt="logo" class="hidden-sm-and-down" />
      <img src="../assets/logo2.svg" alt="logo" class="hidden-md-and-up" />
    </h1>
    <el-menu :default-active="activeIndex" class="el-menu-demo logo-right" mode="horizontal" style="border-bottom:0px;">
      <li tabindex="0" class="el-menu-item" style="cursor: auto;">
        <el-input :placeholder="$t('message.pleaseInput', [$t('message.content')])" prefix-icon="el-icon-search" v-model="input21" size="mini">
        </el-input>
      </li>
      <el-menu-item index="1">{{$t('message.topNav[0]')}}</el-menu-item>
      <el-menu-item index="2">
        <a href="https://www.ele.me" target="_blank">{{$t('message.topNav[1]')}}</a>
      </el-menu-item>
      <li tabindex="0" class="el-menu-item">
        <el-dropdown style="line-height: 14px;font-size: 14px;" @visible-change="visblechange" @command="handleCommand">
          <span class="el-dropdown-link">
            {{selectedlang}}
            <i class="el-icon-arrow-down" :class="{'el-icon-arrow-down-isactive' : openorclose}" style="line-height: 14px;font-size: 14px;"></i>
          </span>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item v-for="(one , index) in lang" :key="index" :command="one">{{one}}</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </li>
    </el-menu>
  </section>
</template>

<script>
import Vue from "vue";
export default {
  data() {
    return {
      openorclose: false,
      selectedlang: "日本語",
      lang: ["中文", "日本語"]
    };
  },
  methods: {
    visblechange(o) {
      console.log(o);
      this.openorclose = o;
    },
    handleCommand(command) {
      this.selectedlang = command;
      Vue.config.lang =
        this.selectedlang == "中文"
          ? "zh"
          : this.selectedlang == "日本語" ? "ja" : "ja";
    }
  }
};
</script>
<style lang="scss">
.logo-h1 {
  float: left;
  line-height: 80px;
  min-width: 210px;
}
.logo-right {
  float: right;
}
.el-dropdown-link {
  cursor: pointer;
  color: #409eff;
}
.el-icon-arrow-down {
  transition: 0.2s;
}
.el-icon-arrow-down-isactive {
  transform: rotate(180deg) translateY(3px);
}
.el-menu-item {
  height: 55px !important;
  line-height: 55px !important;
}
</style>

