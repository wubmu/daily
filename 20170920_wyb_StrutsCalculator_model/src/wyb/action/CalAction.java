package wyb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import wyb.vo.Calculator;

/**
 * Created by 吴亚斌 on 2017/9/20.
 */
public class CalAction extends ActionSupport implements ModelDriven<Calculator> {
    private Calculator calculator=new Calculator();
    @Override
    public Calculator getModel() {
        return calculator;
    }

    public String execute(){
        float result=0;
        switch (calculator.getOp()){
            case "+":
                result = calculator.getNum1()+calculator.getNum2();
                break;
            case "-":
                result = calculator.getNum1()-calculator.getNum2();
                break;
            case "*":
                result = calculator.getNum1()*calculator.getNum2();
                break;
            case "/":
                result = calculator.getNum1()/calculator.getNum2();

        }
        ActionContext.getContext().put("result",result);
        return "cal";
    }
}
