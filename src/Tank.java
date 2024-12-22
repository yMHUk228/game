
public class Tank {

    private int hp;
    private int damage;

    public Tank(int hp, int damage){
        setValue(hp, damage);
        getValue();
    }

    protected void setValue(int hp,int damage) {
        this.damage = damage;
        this.hp = hp;
    }

    protected void getValue() {
        System.out.println("Hp = " + this.hp + ". Damage = " + this.damage);
    }

    public int getHp(){
        return this.hp;
    }

    public int getDamage (){
        return this.damage;
    }

//    public int def(int hp, int damage) {
//        double a = 10 * (Math.random());
//        int b = (int)a%2;
//        System.out.print(b + "  ");
//        if (b == 0)
//            System.out.println("промахнулся.");
//        else {
//            System.out.println("попал.");
//            this.hp = hp - ((int) b * damage);
//        }
//        return this.hp;
//    }

    public int def(int hp, int damage) {
        if (miss())
            System.out.println("промахнулся.");
        else {
            System.out.println("попал.");
            this.hp = hp - damage * crit();
        }
        return this.hp;
    }

    private boolean miss() {
        int a = (int)((10 * (Math.random()))%2);
        if (a == 0)
            return false;
        else
            return true;
    }

    private int crit() {
        int a = (int)((10 * (Math.random()))%2);
        if (a != 0) {
            System.out.println("крит");
            return 2;
        }
        else {
            System.out.println("не крит");
            return 1;
        }
    }

}