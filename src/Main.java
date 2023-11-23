/*
Interface Character เป็น supertype ของ Mage, Tank
    attack: ใช้โจมตี Character อี่น
    equip: สวมใส่ Accessories
  subtype Mage
    heal: ฮีล Character อี่น + ตัวเอง
    levelup: เพิ่มเวลให้ตัวอี่นได้
    buff_atk: เพิ่ม atk ให้เพื่อนได้
  subtype Tank
    defecnce: ป้องกันเพื่อนได้
Interface Accessories เป็น supertype ของ ring, boot
    decrease_speed: ลดความเร็วต้วละครตามชนิดของ accessories ที่ใช้
    levelup_Accessories: ใข้เพิ่มเวลให้อุปกรณ์
  subtype ring
    increaseMana: เพิ่มมานาให้ตัวละครที่สวม
  subtype boot
    speedInc: เพิ่ม speed ให้ตัวละครที่ใส่
*/

public class Main {
    public static void main(String[] args) {
    }
    public interface Character{
        void attack(Character c);
        void equip(Accessories a);
    }
    public interface Mage extends Character{
        void heal(Character c);
        void levelup(Character c);
        void buff_atk(Character c);
    }
    public interface Tank extends Character{
        void defence(Character c);
    }
    public interface Accessories{
        void decrease_speed(Character c);
        void levelup_Accessories(Accessories a);
    }
    public interface ring extends Accessories{
        void increaseMana(Character c);
    }
    public  interface boot extends Accessories{
        void speedInc(Character c);
    }
}