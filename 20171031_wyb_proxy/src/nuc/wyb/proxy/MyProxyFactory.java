package nuc.wyb.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by 吴亚斌 on 2017/11/1.
 */
public class MyProxyFactory {
    public static Object getProxy(Object o,String methodName){
        ProxyHandler handler = new ProxyHandler(o,methodName);

        return Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces(),handler);
    }
}
