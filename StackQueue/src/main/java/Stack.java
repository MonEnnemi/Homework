import java.util.ArrayList;

public class Stack<T> {

    private int size;
    private ArrayList<T>  stackArray;


    public Stack(int size) {

        this.size = size;
        stackArray = new ArrayList<T>(size);


    }

    /**
     * Добавить значение на вершину стека
     *
     * @param value значение для добавления
     */
    public void push(T value) {

        stackArray.add(0, value);

    }

    public T pop() {

        T head = stackArray.get(0);
        stackArray.remove(0);

        return head;
    }

    public boolean isEmpty()
    {
        if(stackArray.size() == 0)
            return true;
        else
            return false;

    }

    public int search(Object o)
    {
        return stackArray.indexOf(o)+1;
    }
}
