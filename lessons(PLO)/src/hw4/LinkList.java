/* �������� ����� LinkList, ���������� �������� ���� int,
������������ ��������� ������ � ������� �������� Node.
 ��� ������ LinkList �������� ������:

 1. ������ �������� �������� �� �������, ����� void set(int index, int element)
 2. �������� �������� �� �������, ����� void remove(int index)
 3. ����� �������� �� ��������, ����� int indexOf(int element)
 4. �������� ������� ������ � ��������� ��������, ����� void swapFirstLast()
 5. ����������� �������� � ������ � �������� �������, ����� void revert()
 6. �������� ������� ���������� � ���������� ��������, 
 � ������ ���� ���������� ��������� Comparable, ����� void swapMaxMin()
 7. �������� ����������� �������� ������, � ������ ���� ����������
 ��������� Comparable, ����� void sortPartial(int index)
 8. ��������� ���� �������, ����� boolean equals(LinkList list)
 9. �������� ���� �������, ����� LinkList concat(LinkList list)
 10*. ������������� ������, � ������ ���� ���������� ��������� Comparable, ����� void sort()
 11*. ������� ������������� �������� �� ������, � ������ ���� ���������� ��������� Comparable, ����� void removeDuplicates()*/

package hw4;

public class LinkList {
		//private int index;
		private int size;
		private Node first;
		//private int [] mass= new int [size];
		
		// ���������� �������� � ����� ������
		public void add(int value){
			Node last = null;
			if (first == null) {
				first = new Node(value);
				size++;
			}
			else { last = first;
				while(last.getNext() != null){
					last = last.getNext();
				}	
				last.addNext(value);
				size++;
			}
			//System.out.println("[Added "+value+"]");
		}
		//��������� �������� �� �������
		public int get(int index){
			if(index>=0){
				Node current;
				current = first;
				for(int i=0; i < index;i++){
					if(current!=null)
					current = current.getNext();
				}
				return current.getValue();	
			}
			else {
				System.out.println("Enter correct index: ");
				//sdelat' perevyzov metoda.
				return -1;
			}
		}
		
		//������ �������� �������� �� �������
		public void set(int index, int element){
			if(index>0){
				Node current;
				current = first;
				for(int i=0; i<index; i++){
					if(current!=null)
					current = current.getNext();
				}
				current.setValue(element);
			}
			else {
				System.out.println("Index out of Bounds enter correct index!");
			}
		}
		
		//�������� �������� �� �������
		public void remove(int index){
			if(index==0 && index<size){
				//System.out.println("["+first.getValue()+" is removed]");
				first=first.getNext();
				size--;
			}
			else if(index>0 && index<size){
				Node current;
				current = first;
				for(int i=1; i<index; i++){
					current = current.getNext();
				}
				//System.out.println("["+current.getNext().getValue()+" is removed]");
				
				current.addNode(current.getNext().getNext()); 
				size--;
			}
			else {
				System.out.println("Index out of Bounds enter correct index! (Nothing is removed.)");
			}
		}
		
		//����� �������� �� ��������
		public int indexOf(int value){
			Node current = first;
			for(int i=0; i < size;i++){
				if(current.getValue()==value){
					return i;
				}
				else current = current.getNext();
			}
			return -1;
		}
		
		//�������� ������� ������ � ��������� ��������, ����� void swapFirstLast()
		
		public void swapFirstLast(){
			System.out.println();
			Node last = first;
				while(last.getNext() != null){
					last = last.getNext();	
				}	
			Node insert = new Node(first.getValue());	
			first.setValue(last.getValue());
			last.setValue(insert.getValue());
			System.out.println(insert.getValue()+" has changed with "+first.getValue());	
		}	
		
		//����������� �������� � ������ � �������� �������, ����� void revert()
		public void revert(){
			
			LinkList reverted = new LinkList();
			Node curr;
			for(int i=10; first!=null&&i>0; i--)
			{
				curr=first;
				while(curr.getNext() != null)
				{
					curr = curr.getNext();
				}
				reverted.add(curr.getValue());
				this.remove(size-1);
				//System.out.println(this.get(size-1));
				//this.print();
			}
			curr = reverted.first;
			while(curr!= null){
				this.add(curr.getValue());
				curr=curr.getNext();
			}
		}	
		
		//������� ��������
		/*public boolean add(int index, int value){
			if(index>0){
				Node current;
				current = first;
				for(int i=0; i<index; i++){
					if(current!=null)
					current = current.getNext();
				}	
				Node insert = new Node(value);
				insert.addNode(current.getNext());
				current.addNode(insert);
				return true;
			}
			else {
				return false;
			}
		}*/
		
		//��������� ���� �������, ����� boolean equals(LinkList list)
		public boolean equals(LinkList list){
			
			return true;
		}
		//��������� ������� ������
		public int size(){
			return size;
		}
		public void print(){
			Node curr = first;
			if(curr==null) System.out.println("Empty");
			else{
				System.out.print("[");
				for(int i = 0; i<size-1;i++){
					System.out.print(curr.getValue()+",");
				    curr = curr.getNext();
				}
				System.out.println(curr.getValue()+"]");
			}
		}
	}


