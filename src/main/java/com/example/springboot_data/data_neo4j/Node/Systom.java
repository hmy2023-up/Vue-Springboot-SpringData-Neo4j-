package com.example.springboot_data.data_neo4j.Node;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node("Systom")
@Data
public class Systom {
    @Id
    private String systom;
    private String relatedDisease;
    private  String briefIntroduction;
    private  String imgLocation;


//    private Disease disease;
//
//    @Relationship(type = "contain",direction = Relationship.Direction.INCOMING)
//    private Disease diseases;


    public Systom(String systom,String relatedDisease,String briefIntroduction,
                  String imgLocation){

        this.systom = systom;
        this.relatedDisease = relatedDisease;
        this.briefIntroduction = briefIntroduction;
        this.imgLocation = imgLocation;
    }
}
