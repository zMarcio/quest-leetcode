package src;
import java.util.ArrayDeque;
import java.util.Deque;

class EvalRPN {


    //    Example 1:
//
//    Input: tokens = ["2","1","+","3","*"]
//    Output: 9
//    Explanation: ((2 + 1) * 3) = 9
//    Example 2:
//
//    Input: tokens = ["4","13","5","/","+"]
//    Output: 6
//    Explanation: (4 + (13 / 5)) = 6
//    Example 3:
//
//    Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//    Output: 22
//    Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//            = ((10 * (6 / (12 * -11))) + 17) + 5
//            = ((10 * (6 / -132)) + 17) + 5
//            = ((10 * 0) + 17) + 5
//            = (0 + 17) + 5
//            = 17 + 5
//            = 22
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int a;
        int b;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;
                default:
                    stack.push(Integer.valueOf(token));
                    break;
            }
        }
        return stack.pop();
    }
}
