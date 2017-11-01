package nuc.wyb.proxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 吴亚斌 on 2017/10/31.
 */
public class test {
    public static void main(String[] args) {
        BookSubject b = new BookPublicter();
        BookSubject b2 = (BookSubject) MyProxyFactory.getProxy(b,"saleBook");
        b2.saleBook();
    }
}
