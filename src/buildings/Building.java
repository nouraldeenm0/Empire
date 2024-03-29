package buildings;

public abstract class Building {

    private int cost;
    private int level;
    private int upgradeCost;
    private boolean coolDown;

    public Building(int cost, int upgradeCost) {
	this.cost = cost;
	this.upgradeCost = upgradeCost;
	this.level = 1;
	coolDown = true;
    }

    public int getCost() {
	return cost;
    }

    public int getLevel() {
	return level;
    }

    public void setLevel(int level) {
	this.level = level;
    }

    public int getUpgradeCost() {
	return upgradeCost;
    }

    public void setUpgradeCost(int upgradeCost) {
	this.upgradeCost = upgradeCost;
    }

    public boolean isCoolDown() {
	return coolDown;
    }

    public void setCoolDown(boolean inCooldown) {
	this.coolDown = inCooldown;
    }

}
