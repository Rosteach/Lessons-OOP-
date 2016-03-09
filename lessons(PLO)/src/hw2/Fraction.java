/*�������� ����� ����� (hw2.Fraction), ����������� ��������� ��������:
	- �������� ������ (����� Fraction add(Fraction frac))
	- ��������� (����� Fraction sub(Fraction frac))
	- ��������� (����� Fraction mul(Fraction frac))
	- ������� (����� Fraction div(Fraction frac))
	- ���������� � ������(����� String toString())
	- ����� (����� void print())*/

package hw2;

public class Fraction {
	private double value;
	public Fraction(double frac){
		this.value=frac;
	}
	public double get(){
		return value;
	}
	public Fraction add (Fraction frac){
		double add = this.value+frac.get();
		Fraction Add = new Fraction(add);
		return Add;
	}
	public Fraction sub (Fraction frac){
		double sub = this.value-frac.get();
		Fraction Sub = new Fraction(sub);
		return Sub;
	}
	public Fraction mul (Fraction frac){
		double mul = this.value*frac.get();
		Fraction Mul = new Fraction(mul);
		return Mul;
	}
	public Fraction div (Fraction frac){
		double div = this.value/frac.get();
		Fraction Div = new Fraction(div);
		return Div;
	}
	public String toString(){
		return "The result of your operation = [  "+value+"  ]";
	}
	public void print(){
		System.out.println(this.toString());
	}
	public static void main(String[] args){
		Fraction A = new Fraction(0.3);
		Fraction B = new Fraction(1.4);
		A.mul(B).print();
		//System.out.println("Sum="+A.add(B).get());
		//System.out.println("Subtraction="+A.sub(B).get());
		//System.out.println("Multiplication="+A.mul(B).get());
		//System.out.println("Division="+A.div(B).get());
	}
}
