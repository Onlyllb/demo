package com.llb.service;

import com.llb.po.Air;

import java.util.List;

/**
 * @author Only LLB
 * @create 2019-03-05-14:54
 */
public interface Airservice {
    public List<Air> findall();
    public String insert(Air air);
    public String delete(int id);
    public List<Air> findbyid(int id);
    public Air findby(int id);
}
