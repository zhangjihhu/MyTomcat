package com.hhu;

import lombok.Data;

import java.io.IOException;
import java.io.OutputStream;

@Data
public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String content) throws IOException {
        /**
         * HTTP响应协议
         * HTTP/1.1 200 OK
         * Content-Type: text/html
         * <html><body></body><html/>
         */
        StringBuffer httpResponse = new StringBuffer();
        httpResponse
                .append("<html><body>")
                .append("<h2>")
                .append(content)
                .append("</h2>")
                .append("</body></html>");
        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();
    }



}
