public abstract class Hero {
    String name;
    String type;
    int power;
    int health;
    Hero(String name)
    {
        this.name = name;
        health = 100;
    }
    void takeDamage(int damage)
    {
        if (Math.random() > 0.6)
        {
            health -= damage;
        }
        else
        {
            dodged();
        }
    }
    void dodged()
    {
        System.out.println(type + " " + name + " dodge");
    }
    public boolean isAlive()
    {
        if(health > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    abstract void attackEnemy(Enemy Enemy);
}
