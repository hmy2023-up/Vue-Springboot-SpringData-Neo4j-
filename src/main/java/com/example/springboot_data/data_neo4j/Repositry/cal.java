package com.example.springboot_data.data_neo4j.Repositry;

import com.example.springboot_data.data_neo4j.Node.Disease;
import com.example.springboot_data.data_neo4j.Node.Systom;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface cal extends CrudRepository<Disease,String> {
    @Query(value = "match (n:Disease) where(n.name= {name}) return n")
    List<Disease> findByname(@Param("name") String name);
    @Query("match (n:Systom) where(n.systom= {systom}) return n")
    List<Systom> findByname1(@Param("systom") String systom);
}
