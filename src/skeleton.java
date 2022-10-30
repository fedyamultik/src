public class skeleton extends Enemy
{
    skeleton(String name ,int health, int power)
    {
        super(name,health,power);
    }
    skeleton(String name)
    {
        super(name);
        this.power = 40;
    }
    void dodged()
    {
        System.out.println("skeleton dodged!");
    }
}