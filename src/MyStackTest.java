public class MyStackTest {

    public static void main(String[] args) {

        MyStack<Integer> intStack = new MyStack<>();

        intStack.push(10);
        intStack.push(20);

        System.out.println(intStack.top());

        MyStack<String> stringStack = new MyStack<>();

        stringStack.push("Java");
        stringStack.push("Stack");

        System.out.println(stringStack.top());
    }
}