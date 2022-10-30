public abstract class Enemy implements Mortal
{
    int health;
    int power;
    String name;
    Enemy(String name)
    {
        this.name = name;
        health = 100;
        power = 20;
    }
    Enemy(String name, int health, int power)
    {
        this.health = health;
        this.power = power;
    }

    int GetHealth()
    {
        return health;
    }
    void SetHealth(int health)
    {
        this.health = health;
    }
    boolean takeDamage(int damage)
    {
        if (Math.random() > 0.1)
        {
            health -= damage;
        }
        else
        {
            dodged();
        }
        if(!isAlive())
        {
            System.out.println("enemy is dead");
        }
        return isAlive();
    }
    abstract void dodged();
    public boolean isAlive()
    {
        if(health > 0) {
            return true;
        }
        else
        {
            return false;
        }
    }
}

