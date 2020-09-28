package com.tcwong;

import java.lang.reflect.Proxy;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/9/28
 * Since 1.8
 */
public class RpcProxyClient {
    public <T> T clientProxy(final Class<T> interfaceClass, final String host, final Integer port) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[]{interfaceClass}
        , new RemoteInvocationHandler(host,port));
    }
}
