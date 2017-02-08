package com.ssm.demo.controller;

import com.ssm.demo.entity.DemoEntity;
import com.ssm.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

/**
 * Created by cyl on 2016/12/23.
 */
@Controller
@RequestMapping("demo")
public class DemoController {
    @Autowired
    private DemoService service;
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public String  show(
            @ModelAttribute("demoEntity") DemoEntity demoEntity,
            Model model){
        List<DemoEntity> empList= service.getEmp();
        System.out.println(empList.get(0).toString());
        model.addAttribute("info","nice++++++");
        model.addAttribute("empList",empList);
        return "show";
    }
}
