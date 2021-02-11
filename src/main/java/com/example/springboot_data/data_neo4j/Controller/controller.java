package com.example.springboot_data.data_neo4j.Controller;


import com.example.springboot_data.data_neo4j.Node.Disease;
import com.example.springboot_data.data_neo4j.Node.Systom;
//import com.example.springboot_data.data_neo4j.Relation.diseaseAndSystom;
import com.example.springboot_data.data_neo4j.Repositry.Cql;
import com.example.springboot_data.data_neo4j.Repositry.cal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private Cql cql;
    @Autowired
    private cal cal;

    @GetMapping("/get/{Disease}")
    public List<Disease> finByname(@PathVariable("Disease") String Disease){
//        System.out.println(cal.findByname(Disease));
        return  cal.findByname(Disease);
    }
    @GetMapping("/gets/{name}")
    public List<Systom> findrelationbyname(@PathVariable("name") String name){

        return cql.findRelationByname(name);
    }
    @PostMapping("/test")
    public List<Disease>  test( String name){
        System.out.println(name);
        return cal.findByname(name);
    }
}
