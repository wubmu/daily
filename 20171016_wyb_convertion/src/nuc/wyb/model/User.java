package nuc.wyb.model;

/**
 * Created by 吴亚斌 on 2017/10/17.
 */
public class User {
    private Tel tel;
    private Address address;

    public Tel getTel() {
        return tel;
    }

    public void setTel(Tel tel) {
        this.tel = tel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
