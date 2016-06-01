import java.util.ArrayList;

/**
 * Created by Svetlana on 02.06.2016.
 */
public class Queue<T> {

    private int size;
    private ArrayList<T> queueArray;

    public Queue(int size) {
        this.size = size;
        queueArray = new ArrayList<T>(size);
    }

    public boolean add(T value) {
        if (queueArray.size() != size) {
            queueArray.add(queueArray.size(), value);
            return true;
        } else
            return false;
    }

    public T poll() {
        if (queueArray.size() == 0)
            return null;
        else {
            T head = queueArray.get(0);
            queueArray.remove(0);
            return head;
        }
    }


}
