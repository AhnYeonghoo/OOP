package TankInfo;

class TankInfo {
    private int damage;
    private int health;
    private int defense;
    float DPM;
    private float reload;
    // 데미지, 체력, 방어력, DPM, 재장전 시간

    TankInfo() {
        this(0,0,0,0.0f);
    }

    TankInfo(int damage, int health, int defense, float reload) {
        super();
        this.damage = damage;
        this.health = health;
        this.defense = defense;
        this.reload = reload;
        this.DPM = (float)damage * 60.0f / reload;
    }

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
}

class Attack extends TankInfo {
    String tan;
    Attack(int damage, int health, int defense, float reload, String tan) {
        super();
        this.tan = tan;
    }
    Attack() {
        super();
        this.tan = "none";
    }

    static int Attack(int damage, int defense, int health) {
        int result;
        if (damage <= defense) {
            System.out.println("빗 나갔습니다!");
            result = health;
        } else {
            result = damage - health;
        }
        return result;
    }
}
class Progetto extends TankInfo {
    Attack ProgettoAttack = new Attack();
    String tier;
    Progetto(int damage, int health, int defense, float reload,  String tier) {
        super();
        this.tier = tier;
    }


}
public class WorldOfTanksBlitz {
    public static void main(String[] args) {
        Progetto proGet = new Progetto(180, 1500, 140, 10, "8tier" );
        System.out.println();


    }
}
