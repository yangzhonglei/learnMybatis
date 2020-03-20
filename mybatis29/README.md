
分表

根据变量  替换 sql的某一部分     但${year}这种变量的使用  有风险  
  <select id="getBill" parameterType="study.yzl.com.model.Bill" resultType="study.yzl.com.model.Bill"> 
  
     select id , amount  from t_bill_${year} where  id = #{id}
  
   </select>








