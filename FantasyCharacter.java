public abstract class FantasyCharacter implements Fighter {
    protected String name;
    protected int dexterity;
    protected int healthPoints;
    protected int gold;
    protected int power;
    protected int xp;

    public FantasyCharacter(String name, int dexterity, int healthPoints, int gold, int power, int xp) {
        this.name = name;
        this.dexterity = dexterity;
        this.healthPoints = healthPoints;
        this.gold = gold;
        this.power = power;
        this.xp = xp;
    }

    public void crit(){

    }

    @Override
    public int attack() {
        if (dexterity * 5 > getRandomValue()) return power;
        else return  0;
    }

    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

        //getters & setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public int getHealth() {
        return healthPoints;
    }
    public void setHealth(int health) {
        this.healthPoints = health;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, healthPoints);
    }
}
