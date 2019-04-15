package com.llb.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Only LLB
 * @create 2019-03-05-13:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public District(int id){
       this.id=id;
    }
}

