package structural.bridge.example1;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T> {

	//this act as bridge 
	private LinkedList<T> list;

	public Queue(LinkedList<T> list) {
		this.list = list;
	}

	@Override
	public void offer(T element) {
		list.addLast(element);
	}

	@Override
	public T poll() {
		return list.removeFirst();
	}

}
