package com.hhu;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new ArrayList<>();

    static {
        servletMappingList.add(new ServletMapping("findGirl", "/girl", "com.hhu.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("helloWorld", "/world", "com.hhu.HelloWorldServlet"));
    }



}
