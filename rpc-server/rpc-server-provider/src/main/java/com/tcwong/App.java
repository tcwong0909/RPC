package com.tcwong;

import com.tcwong.service.HelloServiceImpl;
import com.tcwong.service.RpcProxyServer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        HelloServiceImpl helloService = new HelloServiceImpl();
        RpcProxyServer rpcProxyServer = new RpcProxyServer();
        rpcProxyServer.publisher(8000,helloService);
    }
}
