package nuc.wyb.convertion;

import nuc.wyb.model.Address;
import nuc.wyb.model.Tel;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by 吴亚斌 on 2017/10/17.
 */
public class TelConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        System.out.println("string--------->address");
        String[] tels=strings[0].split("-");
        Tel tel=new Tel(tels[0],tels[1]);
        return tel;
    }

    @Override
    public String convertToString(Map map, Object o) {
        System.out.println("address--------->string");
        Tel tel= (Tel) o;
        String s=tel.getAreaNo()+"-"+tel.getTelNo();
        return s;
    }
}
