package nuc.wyb.model;

/**
 * Created by 吴亚斌 on 2017/10/17.
 */
public class Tel {
    private String areaNo;
    private String telNo;

    @Override
    public String toString() {
        return "Tel{" +
                "areaNo='" + areaNo + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }

    public Tel() {
    }

    public Tel(String areaNo, String telNo) {

        this.areaNo = areaNo;
        this.telNo = telNo;
    }

    public String getAreaNo() {

        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
