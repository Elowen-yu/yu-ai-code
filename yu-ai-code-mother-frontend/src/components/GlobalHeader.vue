<script setup lang="ts">
import { ref } from 'vue'
import { useRouter } from 'vue-router'

type MenuItem = {
  key: string
  label: string
  path?: string
}

// 菜单项可通过后续配置/接口替换
const menuItems = ref<MenuItem[]>([
  { key: 'home', label: '首页', path: '/' },
  { key: 'about', label: '关于', path: '/about' }
])

const selectedKeys = ref<string[]>(['home'])
const router = useRouter()

function onMenuClick({ key }: { key: string }) {
  const item = menuItems.value.find(m => m.key === key)
  if (item?.path) {
    router.push(item.path)
  }
}
</script>

<template>
  <div class="header-wrap">
    <div class="left">
      <a-avatar :size="28" shape="square">A</a-avatar>
      <span class="title">网站标题</span>
    </div>

    <div class="middle">
      <a-menu
        mode="horizontal"
        :selectedKeys="selectedKeys"
        @click="onMenuClick"
      >
        <a-menu-item v-for="item in menuItems" :key="item.key">{{ item.label }}</a-menu-item>
      </a-menu>
    </div>

    <div class="right">
      <a-button type="primary">登录</a-button>
    </div>
  </div>
</template>

<style scoped>
.header-wrap {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 0 16px;
}

.left {
  display: flex;
  align-items: center;
  gap: 8px;
}

.title {
  font-size: 16px;
  font-weight: 600;
}

.middle {
  flex: 1;
  display: flex;
  justify-content: center;
}

.right {
  display: flex;
  align-items: center;
}

@media (max-width: 768px) {
  .title { display: none; }
}
</style>


