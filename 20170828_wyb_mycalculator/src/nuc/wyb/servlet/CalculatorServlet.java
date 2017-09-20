package nuc.wyb.servlet;

import nuc.wyb.vo.Calculator;

import java.io.IOException;


@javax.servlet.annotation.WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float result=0;
        Calculator calculator=new Calculator();
        calculator.setNum1(Float.parseFloat(request.getParameter("num1")));
        calculator.setNum2(Float.parseFloat(request.getParameter("num2")));
        calculator.setOp(request.getParameter("op"));
        switch (calculator.getOp()) {
            case "+":
                result = calculator.getNum1() + calculator.getNum2();
                break;
            case "-":
                result = calculator.getNum1() - calculator.getNum2();
                break;
            case "*":
                result = calculator.getNum1() * calculator.getNum2();
                break;
            case "/":
                result = calculator.getNum1() / calculator.getNum2();
                break;
        }
        request.setAttribute("calculator", calculator);
        request.setAttribute("result", result);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            doPost(request, response);
    }
}
