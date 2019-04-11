class Stack{
	private statuc class StackNode<T>{
		private T data;
		private StackNode<T> next;

		public StackNode(T data){
			this.data = data;
		}
	}
	private int min;
	private StackNode<T> top;

	Stack(){
		min = 999999999;
	}

	public T pop(){
		if(top==null) throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
	}

	public void push(T item){
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
		if(min>item){
			item = min;
		}
	}

	public T peek(){
		if(top==null) throw new EmptyStackException();
		return top.data;
	}

	public boolean isEmpty(){
		return top==null;
	}

	public getMin(){
		return min;
	}
}
