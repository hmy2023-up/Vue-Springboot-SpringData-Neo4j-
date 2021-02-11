<template>
  <div>
      <table id="disease" align="center">
        <thead>
        <tr>
          <th>疾病名称</th>
          <th>治疗费用</th>
          <th>发病人群</th>
          <th>传染性</th>
          <th>相关症状</th>
          <th>治疗药物</th>
          <th>是否医保</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="item in cdisease">
          <td>{{item.name}}</td>
          <td>{{item.cost}}</td>
          <td>{{item.targetPop}}</td>
          <td>{{item.infectivity}}</td>
          <td>{{item.relatedSystom}}</td>
          <td>{{item.cureMedicine}}</td>
          <td>{{item.isMedicalInsurance}}</td>
        </tr>
        </tbody>
      </table>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "Hello",
  data(){
    return{
      Disease: [{}]
    }
  },
  props:{
    cdisease:Array
  }
  // created() {
  //   const a = this;
  //   axios.get('http://localhost:8081/get/早泄').then(function (resp) {
  //     console.log(resp.data)
  //    a.Disease = resp.data
  //     console.log(a.Disease.name)
  //     console.log(a.Disease === resp.data)
  //   })
  // }
}

</script>

<style scoped>
table{
  border: 1px solid #e9e9e9;
  border-collapse: collapse;
  border-spacing: 0;
}

th,td{
  padding: 8px 16px;
  border: 1px solid #e9e9e9;
  text-align: left;
}

th{
  background-color: #f7f7f7;
  color: #5c6b77;
  font-weight: 600;
}
</style>
