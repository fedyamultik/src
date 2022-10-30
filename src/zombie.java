public class zombie extends Enemy
{
    zombie(String name,int health, int power)
    {
        super(name,health,power);
    }
    zombie(String name)
    {
        super(name);
        this.power = 60;
    }
    void dodged()
    {
        System.out.println("zombie dodged!");
    }
}
