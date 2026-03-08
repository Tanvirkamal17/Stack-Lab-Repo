public class MyStackTest {

    public static void main(String[] args) {

        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());

        stack.pop();

        System.out.println("Top after pop: " + stack.top());
        System.out.println("Size: " + stack.getSize());
        System.out.println("Empty: " + stack.isEmpty());
    }
}