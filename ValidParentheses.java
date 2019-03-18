import java.util.Stack;

public class ValidParentheses {

    boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '[' || c[i] == '{')
                stack.push(c[i]);
            else if (stack.isEmpty()) return false;
            else if (c[i] == ')') {
                if (stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                    continue;
                }
            } else if (c[i] == ']') {
                if (stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                    continue;
                }
            } else {
                if (stack.peek() != '{') {
                    return false;
                }
                else {
                    stack.pop();
                    continue;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();

        System.out.println(v.isValid("(){}"));
        System.out.println(v.isValid("({)}"));
        System.out.println(v.isValid("[()]"));
        System.out.println(v.isValid(")]"));
    }
}