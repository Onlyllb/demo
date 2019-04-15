package com.llb.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Only LLB
 * @create 2019-03-05-13:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Air {
    private int id;
    private District district;
    private String monitorTime;
    private int PM10;
    private int PM25;
    private String monitoringSation;

}
