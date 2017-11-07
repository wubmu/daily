package nuc.wyb.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by 吴亚斌 on 2017/11/7.
 */
public class DownInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        actionInvocation.getInvocationContext().getSession().get("");


        return null;
    }
}
