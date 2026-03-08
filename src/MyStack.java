import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> elements;

    public MyStack() {
        elements = new ArrayList<>();
    }

    public void push(T n) {
        elements.add(n);
    }

    public void pop() {
        if (!isEmpty()) {
            elements.remove(elements.size() - 1);
        }
    }

    public T top() {
        if (!isEmpty()) {
            return elements.get(elements.size() - 1);
        }
        throw new RuntimeException("Stack empty");
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int getSize() {
        return elements.size();
    }
}