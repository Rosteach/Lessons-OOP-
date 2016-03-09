package hw5;

public class DNode implements Comparable<DNode> {
	private int value;
    private DNode next;
    private DNode previous;
    
    public DNode() {

    }
    
    public DNode(DNode next, DNode previous) {
        this();
        setNext(next);
        setPrevious(previous);
    }
    
    @Override
    public String toString () {
        return "" + value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public DNode getPrevious() {
        return previous;
    }

    public void setPrevious(DNode previous) {
        this.previous = previous;
    }

    @Override
    public int compareTo(DNode dnode) {
        return value - dnode.getValue();
    }
}

