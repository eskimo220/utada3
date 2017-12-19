<template>
    <el-row :gutter="20" type="flex" align="middle" style="height: 100%;">

        <el-col :span="3">
            <button class="hamburger">
                <span>menu</span>
            </button>

        </el-col>
        <el-col :span="6">
            <img src="../assets/logo1.svg" alt="logo" class="hidden-sm-and-down" />
            <img src="../assets/logo2.svg" alt="logo" class="hidden-md-and-up" />
        </el-col>
        <el-col :span="6"></el-col>
        <el-col :span="6"></el-col>
        <el-col :span="6"></el-col>
    </el-row>
</template>

<script>
export default {};
</script>
<style lang="scss">
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

