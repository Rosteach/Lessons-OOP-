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

public class MainTrack {
	public static void main(String[] args){
		Track track = new Track();
		Track strack = new Track();
			track.setNumber("1");
			strack.setNumber("s1");
				track.setRoll(true);
				strack.setRoll(true);
					track.setRoll(true);
						track.setStop(true);
						strack.setStop(false);
							strack.setStop(false);
								
								track.roll();
								strack.roll();
									track.roll();
									
	}
}
