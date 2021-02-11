<template>
  <div id="hello">
    <input type="text" id="text1" v-model="name">
    <input type="button" value="查询" @click="select">
    <Hello v-bind:cdisease="Disease"></Hello>
  </div>
</template>

<script>
import axios from "axios";
import qs from 'qs';
import Hello from "./Hello";

export default {
  name : 'HelloWorld',
  data () {
    return {
      name: '',
      Disease:[{}]
    }
  },
  components:{
    Hello
  },
  methods:{
    select(){
      let name1 = qs.stringify({'name':this.name})
      axios.post("http://localhost:8081/test", name1,{headers:{'Content-Type':'application/x-www-form-urlencoded;charset=UTF-8'}})
          .then((response)=>{this.Disease = response.data})
          .catch((err)=>{console.log(err)})
    }
  }
}
</script>

<style>

</style>
