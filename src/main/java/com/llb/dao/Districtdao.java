package com.llb.dao;

import com.llb.po.District;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Only LLB
 * @create 2019-03-05-14:01
 */
@Repository
public interface Districtdao {
    public List<District> findalldis();
}
