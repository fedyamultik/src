public class Mage extends Hero
{
    Mage(String name)
    {
        super(name);
        power = 40;
        type = "Mage";
    }
    void attackEnemy(Enemy Enemy)
    {
        if(!isAlive())
        {
            System.out.println("Mage" + this.name + "is dead :(");
            return;
        }

        System.out.println("Mage "+ this.name +" attack enemy "+ Enemy.name + " !");

        if(Enemy.takeDamage(power))
        {
            System.out.println("enemy " + Enemy.name + " have " + Enemy.health + " HP");
            System.out.println("enemy attck mage " + this.name + "!");
            this.takeDamage(Enemy.power);
            System.out.println("mage " + this.name + " have " + this.health + " HP");
        }
        else
        {
            System.out.println("enemy " + Enemy.name + " have " + Enemy.health + " HP");
        }
        if(!isAlive())
        {
            System.out.println("Mage " + this.name + " is dead :C");
        }
    }
}
