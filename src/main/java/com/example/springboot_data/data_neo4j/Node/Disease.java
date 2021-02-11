package com.example.springboot_data.data_neo4j.Node;


import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node("Disease")
@Data
public class Disease {
    @Id
    private String name;
    private String cost;
    private String TargetPop;
    private String percentOfCure;
    private String Infectivity;
    private String relatedSystom;
    private String cureMedicine;
    private String isMedicalInsurance;

//    @Relationship(type = "leaded",direction = Relationship.Direction.INCOMING)
//private Systom systoms;

    public Disease(String name,String cost,String TargetPop,String percentOfCure
            ,String Infectivity,String relatedSystom,String cureMedicine
            ,String isMedicalInsurance){
        this.cost = cost;
        this.name = name;
        this.TargetPop =TargetPop;
        this.percentOfCure = percentOfCure;
        this.Infectivity = Infectivity;
        this.relatedSystom =relatedSystom;
        this.cureMedicine = cureMedicine;
        this.isMedicalInsurance = isMedicalInsurance;
    }
}
