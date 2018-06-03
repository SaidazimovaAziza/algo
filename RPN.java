/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author aziza
 */
public class RPN {
    String ss = "";

    public static void main(String[] args) throws Exception{
        String s = "3 + 6 - 24 * 2";
        String[] sss = s.split(" ");
        String ss = "";
        String []stt=new String[sss.length];
        ArrayList<String>st1=new ArrayList();
        Stack<String> st = new Stack<>();
        Map<String, Integer> pr = new HashMap<String, Integer>();
        pr.put("/", 2);
        pr.put("*", 2);
        pr.put("+", 1);
        pr.put("-", 1);
        ArrayList<String> cc = new ArrayList<>(Arrays.asList("+", "*", "/", "-"));
        for (int i = 0; i < sss.length; i++) {
            if (!cc.contains(sss[i])) {
                ss = sss[i] + " ";
                st1.add(sss[i]);
                System.out.print(ss);
            } else {
                if (st.empty()) {
                    st.add(sss[i]);
                } else {
                    String op = st.peek();
                    if (pr.get(op) >= pr.get(sss[i])) {
                        st.pop();
                        ss = op + "";
                        st.push(sss[i]);
                        st1.add(op);
                        System.out.print(ss + " ");
                    } else {

                        ss = op + "";
                        st.push(sss[i]);
                    }

                }

            }

        }
        while (!st.empty()) {
            String a = st.pop();
            ss = a + " ";
            st1.add(a);
            System.out.print(ss+"");
        }
        for(int i=0;i<st1.size();i++){
            stt[i]=st1.get(i);
        
        
        }
        System.out.println("   ");
        System.out.println(evalRPN(stt));
        
       
        
        
    }

    public static int evalRPN(String[] s1) {
        int returnValue = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<String>();

        for (String t : s1) {
            if (!operators.contains(t)) { //push to stack if it is a number
                stack.push(t);
            } else {//pop numbers from stack if it is an operator
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (t) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b - a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf( b / a));
                        break;
                }
            }
        }

        returnValue = Integer.parseInt(stack.pop());

        return returnValue;
    }

}
