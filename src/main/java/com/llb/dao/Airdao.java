package com.llb.dao;

import com.llb.po.Air;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author Only LLB
 * @create 2019-03-05-14:10
 */
@Repository
public interface Airdao {
    public List<Air> findall();
    public int insert(Air air);
    public int delete(int id);
    public List<Air> findbyid(int id);
    public Air findby(int id);
}
