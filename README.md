# MyTomcat
tomcat简单实现

即把URL对应处理的Servlet关系形成，解析HTTP协议，封装请求响应对象，利用反射实例化具体类的Servlet进行处理

1. 封装请求/响应对象（MyRequest/MyResponse）
    * 请求：通过输入流，对HTTP协议进行解析，拿到HTTP请求头的方法以及URL
    * 响应: 基于HTTP协议的格式进行输出写入
2. Servlet请求处理(MyServlet)
    * 提供Servlet常用的doGet()/doPost()/service()方法
    * 自身编写的Servlet只需继承该类，即可完成对Servlet的请求处理
3. Servlet配置(ServletMappingConfig)
    * 实现Web服务器中web.xml的类注册功能，即哪个URL交给哪个Servlet处理
4. 启动类(MyTomcat)