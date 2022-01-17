package com.it.travel.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.travel.pojo.Route;
import com.it.travel.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RouteController {
    @Autowired
    private RouteService routeService;

    @RequestMapping("routelist")
    public String getRouteList(@RequestParam(value = "pn",defaultValue = "1")Integer pn,Model model){
        PageHelper.startPage(pn,12);
        List<Route> routeList = routeService.getRouteList();
        PageInfo pageInfo = new PageInfo(routeList,8);
        model.addAttribute("pi",pageInfo);
        return "index";
    }
    @RequestMapping("routedetail")
    public String getRouteDetail(Model model,@RequestParam(name = "rid",defaultValue = "1") Integer rid){
        Route route = routeService.getRouteByRid(rid);
        model.addAttribute("route",route);
        return "route_detail";
    }
    @RequestMapping("routesearch")
    public String RouteSearch(Model model, @RequestParam(name = "search_input",defaultValue = "null")String search_input,@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,10);
        List<Route> routeList = routeService.RouteSearch(search_input);
        PageInfo pageInfo = new PageInfo(routeList,8);
        model.addAttribute("pi",pageInfo);
        model.addAttribute("search_input",search_input);
        return "route_list";
    }
}
