package nuc.wyb.proxy;

/**
 * Created by 吴亚斌 on 2017/10/31.
 */
public class BookPublicter implements BookSubject {
    @Override
    public void saleBook() {
        System.out.println("出版设卖书");
    }
    public void produceBook(){
        System.out.println("出版社出书");
    }
}
