/* ������� ����� Track()(String number;)
������:
 roll() - ������ ��������( �� ������ �������� ��������, ���� ��� �������)
 stop() - ���������� �������( �� ������ �������� ������������, ���� ��� �����������) 
� �����: 
 - ������� ��� ������� ��������
 - ��� �����, 
 - ������ �������� ������ ��� ���
 - ��� ������� �������������
 - ������ ����� �������������
*/
package week2_lesson2_09_04_15;

public class Track {
	private String number;
	private Boolean roll;
	private Boolean stop;
	
	public String getNumber(){
		return number;
	}
		public void setNumber(String number){
			this.number=number;
		}
			public Boolean getRoll(){
				return roll;
			}
				public void setRoll(Boolean roll){
					this.roll=roll;
				}
					public Boolean getStop(){
						return stop;
					}
						public void setStop(Boolean stop){
							this.stop=stop;
						}
					
					public Track(){
		
					}	
						public void roll(){
							if(roll==true) System.out.println("Track:"+"["+number+"] "+"already roll, so can't roll again");
						}
							public void stop(){
								if(roll==false) System.out.println("Track:"+number+"stopped & can't stopped again");
							}
}
