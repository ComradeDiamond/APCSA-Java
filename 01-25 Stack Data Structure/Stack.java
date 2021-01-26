import java.util.ArrayList;

/**
 * Code for java stack data structure
 * @author Justin
 * @since 1/25/21
 */
public class Stack
{
    private ArrayList internalList;
    
    public Stack()
    {
        this.internalList = new ArrayList<>();
    }

    public boolean empty()
    {
        return internalList.size() == 0;
    }

    public Object peek()
    {
        if (this.empty())
        {
            return null;
        }

        return this.internalList.get(this.internalList.size() - 1);
    }

    public Object push(Object item)
    {
        this.internalList.add(item);
        return item;
    }

    public Object pop()
    {
        Object popped = this.internalList.remove(this.internalList.size() - 1);
        return popped;
    }
}