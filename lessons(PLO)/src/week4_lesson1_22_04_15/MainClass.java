/*Задача:
public interface Humanable {
 public void takeGlass(AbstractGlass glass);
 public void putGlass();
 public void pourWaterOnTable(AbstractTable table);
 public void fillGlass();
 public void printAboutMe();
}
public interface Glassable {
 public void pourFromMe();
}
public interface Tablable {
 public boolean isDry();
}

Интерфейсы: Humanable, Tablable, Glassable, 
Абстрактные классы: AbstractGlass, AbstractHuman, AbstractTable
Классы: HumanWoman, HumanMan, GlassCircle, GlassSquare, Table, MainClass

Когда выливается вода из стакана-стакан кричит я стакан круглый(или квадратный) выливаюсь.
 
Задание в Main:
1. Создать 4-ре человека разного пола(пол определяется с помощью Math.random)
2. Создать список из 10 столов.
3. Каждый на угад берет стаканы.
4. Провести перекличку( для каждого вызвать метод printAboutMe(Я м/ж и (если есть) у меня стакан кр/кв))
5. Для каждого человека с консоли определяем индекс стола, человек выливает воду на стол(если у него есть стакан).
6. Провести опрос столов на предмет сухости (вызов методов isDry).*/

package week4_lesson1_22_04_15;

public class MainClass {
	
	
}
