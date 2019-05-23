import java.util.*;
public class Queue<Type> {

private LinkedList<Type> list;


public Queue() {
	
	list = new LinkedList<Type>();
	
}

public void enqueue(Type obj) {
	
	list.add(obj);
}

public Type dequeue() {
	
	
	
	 if (list.size() > 0) {
		return list.removeFirst();
	}
	else {
		System.out.println("The List is Empty");
			return null;
	}
		}
	
	
	


public boolean isEmpty() {
	
	if(list.size() == 0) {
		return true;
	}
	
	return false;
}

}
