import java.util.*;

public class Stack<E> {
    private Object[] list;
    private int count;

    Stack() {
        this.count = 0;
        this.list = new Object[10];
    }

    public boolean empty() {
        return this.count == 0;
    }

    public E peek() {
        return (E)this.list[count - 1];
    }

    public E pop() {
        if (this.empty())
            throw new EmptyStackException();

        E returnedItem = (E)this.list[count - 1];
        this.list[count - 1] = null;
        count --;

        return returnedItem;
    }

    public E push(E item) {
        if (this.count == this.list.length) {
            Object[] newList = new Object[this.list.length * 2];

            for (int i = 0; i < this.list.length; i++)
                newList[i] = this.list[i];

            this.list = newList;
        }

        this.list[count++] = (Object)item;
        return item;
    }

}
