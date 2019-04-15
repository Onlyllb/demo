package com.llb.service;

import com.llb.dao.Districtdao;
import com.llb.po.District;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Only LLB
 * @create 2019-03-05-14:59
 */
@Service
public class Districtserviceimpl implements Districtservice {
    @Resource
    private Districtdao districtdao;
    public List<District> findalldis() {
        return districtdao.findalldis();
    }
}
