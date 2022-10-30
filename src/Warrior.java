public class Warrior extends Hero
{
    String nameW = "Warrior";
    int healthWarrior = 120;

    Warrior(String name)
    {
        super(name);
    }

    public String getName()
    {
        return nameW;
    }

    public int getHealth()
    {
        return healthWarrior;
    }

    public void setHealthWarrior(int healthWarrior)
    {
        this.healthWarrior = healthWarrior;
    }

    @Override
    void attackEnemy(Enemy Enemy)
    {

    }
}