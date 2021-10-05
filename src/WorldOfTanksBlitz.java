class Tank {
    private int damage;
    private int health;
    private int defense;
    private float DPM;
    private float reload;

    public void setDamage(int dm) {
        if (dm > 2000 || dm < 50) return;
        damage = dm;
    }

    public void setHealth(int ht) {
        if (ht > 3400 || ht < 300) return;
        health = ht;
    }

    public void setReload(float rd) {
        if (rd < 1 || rd > 23) return;
        reload = rd;
    }

    public void attack() {
         System.out.println("공격을 시전합니다!");
         System.out.println(this.damage + "의 데미지를 주었습니다.");
         System.out.println("재장전중.." + reload + "s");
     }


}
public class WorldOfTanksBlitz {
    public static void main(String[] args) {
        Tank t = new Tank();
        t.setDamage(230);
        t.setHealth(1523);
        t.setReload(2.3f);
        t.attack();


    }
}
