package com.wang.menu.controller;

import com.wang.menu.service.MenuService;
import com.wang.privilege.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuService service;
    /*
    *
     * @Author XiaochengWang
     * @Description //TODO 
     * @Param [map]
     * @return java.util.Map
     **/
    @RequestMapping("/getMenu.do")
    public List getMenu(@RequestParam Map map){
        List returnList = service.getMenu(map);
        System.out.println(returnList);
        return returnList;
    }
    @RequestMapping("/insertMenu.do")
    public Map insertMenu(@RequestParam Map map){
        service.insertMenu(map);
        return null;
    }


}
