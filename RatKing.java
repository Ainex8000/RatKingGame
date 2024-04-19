// Purpose: the character the player will play as
public class RatKing {
    // RatKing attributes
    public String name;
    public int health;
    public int bloodlust;
    public boolean isAlive() {
        return health > 0;
    }


    // RatKing constructor
    public RatKing(String name, int health, int bloodlust) {
        this.name = name;
        this.health = health;
        this.bloodlust = bloodlust;

    }


}
