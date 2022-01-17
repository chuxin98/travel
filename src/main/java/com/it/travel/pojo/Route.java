package com.it.travel.pojo;

import lombok.*;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Route {
    private int rid;
    private String rname;
    private double price;
    private String routeIntroduce;
    private String rflag;
    private String rdate;
    private String isThemeTour;
    private int count;
    private int cid;
    private String rimage;
    private int sid;
    private String sourceId;
}
