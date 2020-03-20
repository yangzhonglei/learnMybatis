 

映射器  传入简单类型   返回简单类型



 ``` <select id="selectCountByStatus" parameterType="String" resultType="int">
  
        select count(*) from Blog  where  status = #{status}
  </select> 
```  


parameterType="String" resultType="int"   都是简单类型

