public class StackRunner 
{
    public static void main(String[] args)
	{
    Stack s1 = new Stack();
		System.out.println("Empty: " + s1.empty());
		System.out.println("Push new Integer(5): " + s1.push(new Integer(5)));
		System.out.println("Push new Integer(2): " + s1.push(new Integer(2)));
		System.out.println("Push new Integer(5): " + s1.push(new Integer(5)));
		System.out.println("Push new Integer(8): " + s1.push(new Integer(8)));
		System.out.println("Peek: " + s1.peek());
		System.out.println("Push new Integer(13): " + s1.push(new Integer(13)));
		System.out.println("Peek: " + s1.peek());
		System.out.println("Push new Integer(26): " + s1.push(new Integer(26)));
		System.out.println("Pop: " + s1.pop());
		System.out.println("Peek: " + s1.peek());
		System.out.println("Empty: " + s1.empty());
  }
}
