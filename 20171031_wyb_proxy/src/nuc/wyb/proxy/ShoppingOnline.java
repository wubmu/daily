package nuc.wyb.proxy;

/**
 * Created by 吴亚斌 on 2017/10/31.
 */
public class ShoppingOnline implements BookSubject{
    private BookPublicter  real= new BookPublicter();

    public void preSale(){
        System.out.println("网上宣传");
    }
    @Override
    public void saleBook() {

        this.postSale();
        real.saleBook();
        this.postSale();
    }

    public void postSale(){
        System.out.println("网上售后");
    }
}
