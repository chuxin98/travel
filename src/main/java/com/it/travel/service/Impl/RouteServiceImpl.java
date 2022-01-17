package com.it.travel.service.Impl;

import com.it.travel.mapper.RouteMapper;
import com.it.travel.pojo.Route;
import com.it.travel.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteMapper routeMapper;
    @Override
    public List<Route> getRouteList(){
        List<Route> routelist = routeMapper.getRouteList();
        return routelist;
    }

    @Override
    public Route getRouteByRid(Integer rid) {
        Route route = routeMapper.getRouteByRid(rid);
        return route;
    }

    @Override
    public List<Route> RouteSearch(String query) {
        List<Route> queryrlist = routeMapper.RouteSearch(query);
        return queryrlist;
    }
}
