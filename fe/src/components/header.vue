<template>
  <section>
    <h1 class="logo-h1">
      <img src="../assets/logo1.svg" alt="logo" class="hidden-sm-and-down" />
      <img src="../assets/logo2.svg" alt="logo" class="hidden-md-and-up" />
    </h1>
    <el-menu :default-active="activeIndex" class="el-menu-demo logo-right" mode="horizontal" style="border-bottom:0px;">
      <li tabindex="0" class="el-menu-item" style="cursor: auto;">
        <el-input placeholder="请输入内容" prefix-icon="el-icon-search" v-model="input21" size="mini">
        </el-input>
      </li>
      <el-menu-item index="1">处理中心</el-menu-item>
      <el-menu-item index="3">
        <a href="https://www.ele.me" target="_blank">订单管理</a>
      </el-menu-item>
      <li tabindex="0" class="el-menu-item">
        <el-dropdown style="line-height: 14px;font-size: 14px;">
          <span class="el-dropdown-link">
            语言
            <i class="el-icon-arrow-down" style="line-height: 14px;font-size: 14px;"></i>
          </span>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>中文</el-dropdown-item>
            <el-dropdown-item>日语</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </li>
    </el-menu>
  </section>
</template>

<script>
export default {};
</script>
<style lang="scss">
.logo-h1 {
  float: left;
  line-height: 85px;
  min-width: 210px;
}
.logo-right {
  float: right;
}
.drop-lang {
  line-height: 14px;
  font-size: 14px;
}
.el-dropdown-link {
  cursor: pointer;
  color: #409eff;
}
.hamburger {
  display: block;
  position: relative;
  font-size: 0;
  width: 48px;
  height: 48px;
  border: none;
  cursor: pointer;
}

.hamburger:focus {
  outline: none;
}

.hamburger span {
  display: block;
  position: absolute;
  height: 4px;
  top: 22px;
  left: 8px;
  right: 8px;
  background-color: #fff;
}

.hamburger span:before,
.hamburger span:after {
  content: "";
  display: block;
  position: absolute;
  width: 100%;
  height: 4px;
  background: #fff;
}
.hamburger span:before {
  top: -10px;
}
.hamburger span:after {
  bottom: -10px;
}
</style>

