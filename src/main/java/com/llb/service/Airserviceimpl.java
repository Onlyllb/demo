package com.llb.service;

import com.llb.dao.Airdao;
import com.llb.po.Air;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Only LLB
 * @create 2019-03-05-14:56
 */
@Service
public class Airserviceimpl implements Airservice {
    @Resource
    private Airdao airdao;
    public List<Air> findall() {
        return airdao.findall();
    }

    public String insert(Air air) {
        int i=airdao.insert(air);
        if (i>0) {
            return "添加成功";
        }
        return "添加失败";
    }

    public String delete(int id) {
        int i= airdao.delete(id);
        if (i>0) {
            return "删除成功";
        }
        return "删除失败";
    }

    public List<Air> findbyid(int id) {
        return airdao.findbyid(id);
    }

    public Air findby(int id) {
        return airdao.findby(id);
    }
}
