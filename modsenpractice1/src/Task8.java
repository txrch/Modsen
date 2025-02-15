public class Task8 {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false; // Быстрая проверка на нечетную длину

        char[] stack = new char[s.length()]; // Массив для эмуляции стека
        int top = -1; // Указатель на верхний элемент в "стеке"

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c; // Добавляем элемент в "стек"
            } else {
                if (top == -1) return false; // Ошибка: нет открывающей скобки

                char open = stack[top--]; // Извлекаем верхний элемент

                if ((c == ')' && open != '(') ||
                        (c == '}' && open != '{') ||
                        (c == ']' && open != '[')) {
                    return false; // Ошибка: несоответствие скобок
                }
            }
        }

        return top == -1; // Если стек пуст — строка валидна
    }
}
