package hw4;

public class Node {
	private int value;
	private Node next = null;
	
	public Node(int v){
		this.value=v;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int v){
		this.value=v;
	}
	public Node getNext(){
		return next;
	}
	public void addNext(int n){
		this.next = new Node (n);
	}
	public void addNode(Node e){
		this.next=e;
	}
}