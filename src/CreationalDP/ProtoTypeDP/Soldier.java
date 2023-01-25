package CreationalDP.ProtoTypeDP;

public class Soldier implements Cloneable{
    private int health;

    private int speed;
    private int maxLifeTime;
    private int agility;
    private int power;
    private int rank;
    private String weapon;
    private boolean isAvailableForWar;

    public Soldier(int health, int speed, int maxLifeTime, int agility, int power, int rank, String weapon, boolean isAvailableForWar) {
        this.health = health;
        this.speed = speed;
        this.maxLifeTime = maxLifeTime;
        this.agility = agility;
        this.power = power;
        this.rank = rank;
        this.weapon = weapon;
        this.isAvailableForWar = isAvailableForWar;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "health=" + health +
                ", speed=" + speed +
                ", maxLifeTime=" + maxLifeTime +
                ", agility=" + agility +
                ", power=" + power +
                ", rank=" + rank +
                ", weapon='" + weapon + '\'' +
                ", isAvailableForWar=" + isAvailableForWar +
                '}';
    }

    public void showSoldierInfo(){
        System.out.println("Sağlık : "+health);
        System.out.println("Hız  : "+speed);
        System.out.println("Yaşam suresi  : "+maxLifeTime);
        System.out.println("Çeviklik : "+agility);
        System.out.println("Rütbe : "+rank);
        System.out.println("Silah : "+weapon);

        if(isAvailableForWar){
            System.out.println("savaşa hazır");
        }else{
            System.out.println("asker savaşamaz");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailableForWar() {
        return isAvailableForWar;
    }

    public void setAvailableForWar(boolean availableForWar) {
        isAvailableForWar = availableForWar;
    }

    @Override
    public Soldier clone() {
        Soldier soldier =null;
        try {
            soldier = (Soldier) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Asker kopyalanamadı");
            e.printStackTrace();
        }
        return soldier;
    }
}
