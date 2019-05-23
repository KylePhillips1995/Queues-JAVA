
public class QueuePriority<Type extends Priority>{

	Queue<Type>[] queue;
	
	int priorityMax;
	public QueuePriority(int priorities)
	{
		priorityMax = priorities;
		queue = new Queue[priorities];
		
		for(int i = 0; i < priorities; i++) {
			
			queue[i] = new Queue<Type>();
		}
	}
	
	public void enqueue(Type obj) {
		
		queue[obj.getPriority()-1].enqueue(obj);
		
		
	}
	
	public Type dequeue() {
	
		Type temp = null;
		boolean jumpout = true;
		int start = 0;
		while(jumpout = true && start < priorityMax) {
			
			if(!queue[start].isEmpty()) {
				temp = queue[start].dequeue();
				jumpout = false;
			}
			
			else { start++;
			}
		}//endwhile
		
		if(temp ==null) {
			
			System.out.println("Whole Queue is Empty");
			return temp;
		}
			
	}
		
	
	public boolean isEmpty() {
		
		queue.isEmpty();
		return true;
	
	}
	
}
