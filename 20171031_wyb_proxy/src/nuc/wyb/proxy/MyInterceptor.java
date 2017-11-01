package nuc.wyb.proxy;

/**
 * Created by 吴亚斌 on 2017/11/1.
 */
public class MyInterceptor {
    public void method1(){
        System.out.println("拦截器执行前");
    }
    public void method2(){
        System.out.println("拦截器执行后");
    }
}
