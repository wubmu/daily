package nuc.wyb.model;

/**
 * Created by 吴亚斌 on 2017/10/17.
 */
public class Address {
    private String province;
    private String city;
    private String section;
    private String street;

    public Address(String province, String city, String section, String street) {
        this.province = province;
        this.city = city;
        this.section = section;
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return province+city+section+street;
    }
}
