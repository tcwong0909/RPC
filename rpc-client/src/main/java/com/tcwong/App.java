package com.tcwong;

import com.tcwong.modle.User;
import com.tcwong.service.HelloService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("susu");
        user.setPassword("123456");
        user.setAge(18);
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
        HelloService helloService = rpcProxyClient.clientProxy(HelloService.class, "localhost", 8000);
        String result = helloService.sayHello(user);
        System.out.println(result);
    }
}
