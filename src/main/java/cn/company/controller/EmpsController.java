package cn.company.controller;

import cn.company.domain.Emps;
import cn.company.service.EmpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpsController {

    @Autowired
    private EmpsService empsService;

    @ResponseBody
    @RequestMapping("findAll")
    public List<Emps> findAll(){
        System.out.println("abc....");
        return empsService.findAll();
    }
}
