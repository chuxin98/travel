package com.it.travel.mapper;

import com.it.travel.pojo.Route;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RouteMapper {
    public List<Route> getRouteList();
    public Route getRouteByRid(Integer rid);
    public List<Route> RouteSearch(String query);
}
