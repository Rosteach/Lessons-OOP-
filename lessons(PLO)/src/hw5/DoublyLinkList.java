/*Написать класс DoublyLinkList, реалзизующем двусвязанный список с классом элемента DNode.
 Для класса DoublyLinkList написать методы:

 1. Вывести элементы списка в обратном порядке, метод void printRevert()
 2. Добавление элемента в начало, метод void addFirst(int element)
 3. Добавление элемента в конец, метод void addLast(int element)
 4. Перестроить элементы в списке в обратном порядке, метод void revert()
 5. Частично упорядочить элементы списка, в случае если реализован интерфейс Comparable, метод void sortPartial(int index)
 */
package hw5;

public class DoublyLinkList {
	private int size;
	   private DNode first;
	   private DNode last;
	   
	   public int size() {
	       return getSize();
	   }
	   
	   public DNode get() {
	       return first;
	   }
	 
	   public void setFirst(DNode first) {
	       this.first = first;
	   }
	 
	   public int getSize() {
	       return size;
	   }
	 
	   public void setSize(int size) {
	       this.size = size;
	   }
	 
	   public DNode getLast() {
	       return last;
	   }
	 
	   public void setLast(DNode last) {
	       this.last = last;
	   }
	  // Вывести элементы списка в обратном порядке, метод void printRevert()
	   
	   public void printRevert() {
	       DNode current = last;
	       while (current != null) {
	           System.out.print(current);
	           current = current.getPrevious();
	           if (current != null) {
	               System.out.print(" ok! ");
	           }
	       }        
	       System.out.println();
	   }
	   
	   
	   // Добавление элемента в начало, метод void addFirst(int element)
	   
	   public void addFirst(int element) {
	       if (first == null) {
	           first = new DNode(null, null);
	           last = first;
	       } else {
	           DNode curr = new DNode(first, null);
	           first.setPrevious(curr);
	           first = curr;
	       }
	       first.setValue(element);
	       size++;
	   }
	   // Добавление элемента в конец, метод void addLast(int element)
	   
	   public void addLast(int element) {
	       if (last == null) {
	           last = new DNode(null, null);
	           first = last;
	       } 
	       else {
	           DNode newTail = new DNode(null, last);
	           last.setNext(newTail);
	           last = newTail;
	       }
	       last.setValue(element);
	       size++;
	   }
	   
	   
	   public void print() {
	       DNode current = first ;
	       while (current != null) {
	           System.out.print(current);
	           current = current.getNext();
	           if (current != null) {
	               System.out.print(" -> ");
	           }
	       }        
	       System.out.println();
	   }
	   
	   // Перестроить элементы в списке в обратном порядке, метод void revert() 
	   
	   public void revert() {
	       if (size > 0) {
	           DNode current = first;
	           DNode temp = last;
	           last = first;
	           first = temp;
	           while (current != null) {
	               temp = current.getNext();
	               current.setNext(current.getPrevious());
	               current.setPrevious(temp);
	               current = temp;
	           }
	       }
	   }
	  // Частично упорядочить элементы списка, в случае если реализован интерфейс Comparable, метод void sortPartial(int index)
	   public DNode getElement(int index) {
	       if (first == null && index > size) {
	           return null;
	       } else {
	           DNode current = first;
	           int value = index;
	           while (value > 0) {
	               current = current.getNext();
	               value--;
	           }
	           return current;
	       }
	   }
	   private void swap(DNode el1, DNode el2) {
	       int temp = el1.getValue();
	       el1.setValue(el2.getValue());
	       el2.setValue(temp);
	   }
	   public void sortPartial(int index) {
	       DNode sortBase = getElement(index);
	       for (int i = 0; i < size; i++) {
	           int firstSwapIndex = 0;
	           while (getElement(firstSwapIndex).compareTo(sortBase) < 0 && firstSwapIndex < size) {
	               firstSwapIndex++;
	           }
	           int lastSwapIndex = size - 1;
	           while (getElement(lastSwapIndex).compareTo(sortBase) > 0 && lastSwapIndex > 0) {
	               lastSwapIndex--;
	           }
	           swap(getElement(firstSwapIndex), getElement(lastSwapIndex));
	       }
	   }
}
