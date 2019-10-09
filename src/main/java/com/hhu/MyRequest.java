package com.hhu;

import lombok.Data;

import java.io.IOException;
import java.io.InputStream;

@Data
public class MyRequest {

    private String url;
    private String method;

    public MyRequest(InputStream inputStream) throws IOException {
        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];
        int length = 0;
        if ((length = inputStream.read(httpRequestBytes)) > 0) {
            httpRequest = new String(httpRequestBytes, 0, length);
        }
        /**
         * Http请求协议
         * GET /favicon.ico HTTP/1.1
         * Host: localhost:8080
         */
        String httpHead = httpRequest.split("\n")[0];
        System.out.println("httpHead: " + httpHead);
        url = httpHead.split("\\s")[1];
        method = httpHead.split("\\s")[0];
        System.out.println(this);
    }

}
