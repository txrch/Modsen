public class Task8 {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                if (top == -1) return false;

                char open = stack[top--];

                if ((c == ')' && open != '(') ||
                        (c == '}' && open != '{') ||
                        (c == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}
