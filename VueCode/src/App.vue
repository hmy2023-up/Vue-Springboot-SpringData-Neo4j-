<template>
  <div id="app">
    <h1>疾病查询</h1>
    <HelloWorld></HelloWorld>
    <router-view/>
  </div>
</template>

<script>
import HelloWorld from "./components/HelloWorld";
export default {
  name: 'App',
  components:{
    HelloWorld
  }
}
</script>

<style>
#app{
  text-align: center;
}
</style>
