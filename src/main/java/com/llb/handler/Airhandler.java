package com.llb.handler;

import com.llb.po.Air;
import com.llb.service.Airservice;
import com.llb.service.Districtservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Only LLB
 * @create 2019-03-05-15:00
 */
@Controller
public class Airhandler {
    @Resource
    private Airservice airservice;
    @Resource
    private Districtservice districtservice;
    @RequestMapping("findall")
    public String findall(Model model){
        model.addAttribute("list",airservice.findall());
        model.addAttribute("lists",districtservice.findalldis());
        return "findall";
    }
    @RequestMapping("findbyid")
    public String findbyid(Model model,int districtid){
        model.addAttribute("lists",districtservice.findalldis());
        if (districtid==0) {
            model.addAttribute("list",airservice.findall());
        }else{
            model.addAttribute("list",airservice.findbyid(districtid));
        }

        return "findall";
    }
    @RequestMapping("findinsert")
    public String findinsert(Model model){
        model.addAttribute("lists",districtservice.findalldis());
        return "insert";
    }
    @RequestMapping("insert")
    public String insert(Air air, HttpServletResponse res){
        try {
            init(res,airservice.insert(air));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:findall";
    }
    //通用跳转方法
    public void init(HttpServletResponse res, String msg) throws IOException {
        res.getWriter().println("<script>alert('" +msg+ "');</script>");

    }
    @RequestMapping("findby")
    public String findby(Model model,int id){
        model.addAttribute("air",airservice.findby(id));
        return "select";
    }
    @RequestMapping("delete")
    public String delete(int id,HttpServletResponse res){
        try {
            init(res,airservice.delete(id));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:findall";
    }}
