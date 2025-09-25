import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // создаем стек
        Stack<Character> stack = new Stack<>();
        
        stack.push('q'); // добавляем элемент 'q' в стек
        stack.push('l'); // добавляем элемент 'l' в стек
        stack.push('w'); // добавляем элемент 'w' в стек
        
        // выводим все элементы стека
        System.out.println(stack);
    }
}
