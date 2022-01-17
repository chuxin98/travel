package com.it.travel.service;

import com.it.travel.pojo.Route;

import java.util.List;

public interface RouteService {
    public List<Route> getRouteList();
    public Route getRouteByRid(Integer rid);
    public List<Route> RouteSearch(String query);
}
