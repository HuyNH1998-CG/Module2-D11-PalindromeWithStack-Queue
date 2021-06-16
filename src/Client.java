import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        boolean isPalin = true;
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String string = "Able was I ere I saw Elba";
        string = string.toLowerCase();
        String[] strings = string.split("");
        for (String s : strings) {
            stack.push(s);
            queue.add(s);
        }
        while (!queue.isEmpty()) {
            if (queue.remove().equals(stack.pop())) {
                continue;
            } else {
                isPalin = false;
                break;
            }
        }
        if (!isPalin) {
            System.out.println("Not Palin");
        } else {
            System.out.println("Palin");
        }
    }
}
