<script setup lang="ts">
import GlobalHeader from '../components/GlobalHeader.vue'
import GlobalFooter from '../components/GlobalFooter.vue'
</script>

<template>
  <a-layout style="min-height: 100vh">
    <!-- Header -->
    <a-layout-header style="padding: 0; background: #fff">
      <GlobalHeader />
    </a-layout-header>

    <!-- Content -->
    <a-layout-content style="padding: 16px; background: #f5f5f5">
      <router-view />
    </a-layout-content>

    <!-- Footer fixed at bottom -->
    <a-layout-footer style="padding: 0; background: transparent">
      <GlobalFooter />
    </a-layout-footer>
  </a-layout>
  
</template>

<style scoped>
:deep(.ant-layout-header) {
  line-height: normal;
}
</style>


