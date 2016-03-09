/*�������� ����� ����� (hw2.Number), ����������� ��������� ��������:
 - ��������� ��������� (����� int get())
 - �������� (����� Number add(Number num))
 - ��������� (����� Number sub(Number num))
 - ��������� (����� Number mul(Number num))
 - ������� (����� Number div(Number num))
 - ���������� � ������� (����� Number pow(Number exponent))
 - ���������� ���������� (����� Number fact())
 - ���������� ������� �� ������� (����� Number mod(Number num)) */

package hw2;
	
public class Number {
	private double value;
	public Number(double a){
		this.value=a;//������� ����������� � �������������� ���������; ����������� ���������� ������ ���������� ������(int �)
	}
	public int get(){
		double v=0;
		double k = value-(int)value;
		if(k>=0.5) v =0.5;
		return (int)(value+v);
	}
	public double getDouble(){	
		return value;
	}
	public void set(int a){
		this.value=a;
	}
	public Number add(Number num){
		double sum = this.value + num.get();
		Number Sum = new Number(sum);// ������� ������ ��� ���� ������ � ������� ������������ 
		return Sum;
	}
	public Number sub(Number num){
		double sub = this.value - num.get();
		Number Sub = new Number(sub); 
		return Sub;
	}
	public Number mul(Number num){
		double mul = this.value * num.get();
		Number Mul = new Number(mul); 
		return Mul;
	}
	public Number div(Number num){
		double div = this.value / num.get();
		Number Div = new Number(div); 
		return Div;
	}
	public Number pow(Number exponent){
		double pow = 1;// Math.pow (this.value,exponent.get());
			for(int i=0;i<exponent.get();i++){
				pow *= this.value;
			}
		Number Pow = new Number(pow); 
		return Pow;
	}
	public Number fact(){
		double f = 1;
		for (int i = 1;i<=this.value;i++){
			f = f*i; 
		}
		Number Fact = new Number(f); 
		return Fact;
	}
	public Number mod(Number num){
		double mod  = (this.value / num.get())-(int)(this.value/num.get());
		Number Mod = new Number(mod); 
		return Mod;
	}
	
	
	/*public static void main(String[] args){
		Number A = new Number(5);
		Number B = new Number(3);
		System.out.println("Summa="+"["+A.add(B).get()+"]");
		System.out.println("Raznica="+"["+A.sub(B).get()+"]");
		System.out.println("Umnozenie="+"["+A.mul(B).get()+"]");
		System.out.println("Delenie="+"["+A.div(B).getDouble()+"]");
		System.out.println("VStepeni="+"["+A.pow(B).get()+"]");
		System.out.println("Factorial="+"["+A.fact().get()+"]");
		System.out.println("Vichislenie ostatka="+"["+A.mod(B).getDouble()+"]");
	} */
}

