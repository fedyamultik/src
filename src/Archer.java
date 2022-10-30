public class Archer extends Hero
{
    Archer(String name)
    {
        super(name);
        power = 20;
        type = "Archer";
    }
    void attackEnemy(Enemy Enemy)
    {
        if(!isAlive())
        {
            System.out.println("Archer" + this.name + "is dead :(");
            return;
        }

        System.out.println("Archer "+ this.name +" attack enemy " + Enemy.name + " !");

        if(Enemy.takeDamage(power))
        {
            System.out.println("enemy " + Enemy.name + " have " + Enemy.health + " HP");
            System.out.println("Enemy attack archer" + this.name + "!");
            this.takeDamage(Enemy.power);
            System.out.println("archer " + this.name + " have " + this.health + " HP");
        }
        else
        {
            System.out.println("enemy " + Enemy.name + " have " + Enemy.health + " HP");
        }
        if(!isAlive())
        {
            System.out.println("Archer " + this.name + " is dead :C");
        }
    }
}
