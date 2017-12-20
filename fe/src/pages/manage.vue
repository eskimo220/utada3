<template>
	<el-container class="fillcontain">
		<el-header height="55px">
			<theheader/>
		</el-header>
		<el-container>
			<el-aside width="210px">
				<el-menu :default-active="this.$route.path.replace('/', '')" background-color="#324057" text-color="#fff" style="height: 100%;" router>
					<el-menu-item index="manage">
						<i class="el-icon-menu"></i>{{$t('message.Sidebar[0][0]')}}</el-menu-item>
					<el-submenu index="2">
						<template slot="title">
							<i class="el-icon-document"></i>{{$t('message.Sidebar[1][0]')}}</template>
						<el-menu-item index="userList">用户列表</el-menu-item>
						<el-menu-item index="shopList">商家列表</el-menu-item>
						<el-menu-item index="foodList">食品列表</el-menu-item>
						<el-menu-item index="orderList">订单列表</el-menu-item>
						<el-menu-item index="adminList">管理员列表</el-menu-item>
					</el-submenu>
					<el-submenu index="3">
						<template slot="title">
							<i class="el-icon-plus"></i>{{$t('message.Sidebar[2][0]')}}</template>
						<el-menu-item index="addShop">添加商铺</el-menu-item>
						<el-menu-item index="addGoods">添加商品</el-menu-item>
					</el-submenu>
					<el-submenu index="4">
						<template slot="title">
							<i class="el-icon-star-on"></i>{{$t('message.Sidebar[3][0]')}}</template>
						<el-menu-item index="visitor">用户分布</el-menu-item>
					</el-submenu>
					<el-submenu index="5">
						<template slot="title">
							<i class="el-icon-edit"></i>{{$t('message.Sidebar[4][0]')}}</template>
						<el-menu-item index="vueEdit">文本编辑</el-menu-item>
					</el-submenu>
					<el-submenu index="6">
						<template slot="title">
							<i class="el-icon-setting"></i>{{$t('message.Sidebar[5][0]')}}</template>
						<el-menu-item index="adminSet">管理员设置</el-menu-item>
					</el-submenu>
					<el-submenu index="7">
						<template slot="title">
							<i class="el-icon-warning"></i>{{$t('message.Sidebar[6][0]')}}</template>
						<el-menu-item index="explain">说明</el-menu-item>
					</el-submenu>
				</el-menu>
			</el-aside>
			<el-main style="padding:0;">
				<keep-alive>
					<router-view></router-view>
				</keep-alive>
			</el-main>
		</el-container>
	</el-container>
</template>

<script>
import theheader from "../components/header";
export default {
  components: {
    theheader
  }
};
</script>
<style lang="scss">
@import "../style/mixin";
</style>
