/**
 * @author subei
 * @create 2020-05-19 13:34
 */
module day13 {
    requires JDK9Test;  //requires 包名---》接收包
    requires junit;//若要调用JDK9以上版本的测试类，需要引入
    exports github;
    exports github2;
    exports github3;
    requires java.net.http;
}