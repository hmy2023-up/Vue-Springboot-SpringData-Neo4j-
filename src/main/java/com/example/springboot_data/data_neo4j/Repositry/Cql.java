package com.example.springboot_data.data_neo4j.Repositry;

import com.example.springboot_data.data_neo4j.Node.Systom;

import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Cql extends CrudRepository<Systom,String> {
        @Query(value = "match (n:Disease)-[:contain]->(m:Systom) where(n.name={name}) return " +
                              "collect(m)as systoms")
        List<Systom> findRelationByname(@Param("name") String name);


}
