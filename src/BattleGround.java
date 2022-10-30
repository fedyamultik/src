import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Warrior firstWarrior = new Warrior("Warrior");
        Mage firstMage = new Mage("Mage");
        Archer firstArcher = new Archer("Archer");

        zombie firstZombie = new zombie("Zombie");
        skeleton firstSkeleton = new skeleton("Skeleton");


        System.out.println("you have these heroes: " + firstWarrior.name + ", " + firstMage.name + ", " + firstArcher.name);
        System.out.println("and enemies: " + firstZombie.name + ", " + firstSkeleton.name);
        short h = 0, e = 0;
        boolean f = false;
        int a = 0;
        System.out.println("Choose difficulty of game: ");
        System.out.println("1 - Medium");
        System.out.println("2 - Hard");
        a = in.nextShort();
        if (a == 1)
        {
            while (firstWarrior.isAlive() == true || firstMage.isAlive() == true &&
                    firstZombie.isAlive() == true || firstSkeleton.isAlive() == true)
            {
                f = false;
                System.out.println("Choose hero to attack:");
                System.out.println("1 - " + firstWarrior.name + "\n2 - " + firstMage.name);
                h = in.nextShort();
                switch (h)
                {
                    case 1:
                        if (firstWarrior.isAlive() == false)
                        {
                            System.out.println("This hero is dead :C");
                            f = true;
                        }
                        break;
                    case 2:
                        if (firstMage.isAlive() == false)
                        {
                            System.out.println("This hero is dead :C");
                            f = true;
                        }
                        break;
                    default:
                        System.out.println("Null hero");
                        f = true;
                }
                if (f)
                {
                    continue;
                }
                System.out.println("Choose enemy to attack:");
                System.out.println("1 - " + firstZombie.name + "\n2 - " + firstSkeleton.name);
                e = in.nextShort();
                switch (e)
                {
                    case 1:
                        if (firstZombie.isAlive() == false)
                        {
                            System.out.println("This enemy is dead");
                            f = true;
                        }
                        break;
                    case 2:
                        if (firstSkeleton.isAlive() == false)
                        {
                            System.out.println("This enemy is dead");
                            f = true;
                        }
                        break;
                    default:
                        System.out.println("Null enemy");
                        f = true;
                }
                if (f)
                {
                    continue;
                }
                switch (h)
                {
                    case 1:
                        switch (e)
                        {
                            case 1:
                                firstWarrior.attackEnemy(firstZombie);
                                break;
                            case 2:
                                firstWarrior.attackEnemy(firstSkeleton);
                                break;
                        }
                        break;
                    case 2:
                        switch (e)
                        {
                            case 1:
                                firstMage.attackEnemy(firstZombie);
                                break;
                            case 2:
                                firstMage.attackEnemy(firstSkeleton);
                                break;
                        }
                        break;
                }
            }
        }
        if (a == 2)
        {
            while (firstMage.isAlive() == true || firstWarrior.isAlive() == true || firstArcher.isAlive() == true &&
                    firstZombie.isAlive() == true || firstSkeleton.isAlive() == true)
            {
                f = false;
                System.out.println("Choose hero to attack:");
                System.out.println("1 - " + firstWarrior.name + "\n2 - " + firstMage.name + "\n3 - " + firstArcher.name);
                h = in.nextShort();
                switch (h)
                {
                    case 1:
                        if (firstWarrior.isAlive() == false)
                        {
                            System.out.println("This hero is dead :C");
                            f = true;
                        }
                        break;
                    case 2:
                        if (firstMage.isAlive() == false)
                        {
                            System.out.println("This hero is dead :C");
                            f = true;
                        }
                        break;
                    case 3:
                        if (firstArcher.isAlive() == false)
                        {
                            System.out.println("This hero is dead :C");
                            f = true;
                        }
                        break;
                    default:
                        System.out.println("Null hero");
                        f = true;
                }
                if (f)
                {
                    continue;
                }
                System.out.println("Choose enemy to attack:");
                System.out.println("1 - " + firstZombie.name + "\n2 - " + firstSkeleton.name);
                e = in.nextShort();
                switch (e)
                {
                    case 1:
                        if (firstZombie.isAlive() == false)
                        {
                            System.out.println("This enemy is dead");
                            f = true;
                        }
                        break;
                    case 2:
                        if (firstSkeleton.isAlive() == false)
                        {
                            System.out.println("This enemy is dead");
                            f = true;
                        }
                        break;
                    default:
                        System.out.println("Null enemy");
                        f = true;
                }
                if (f)
                {
                    continue;
                }
                switch (h)
                {
                    case 1:
                        switch (e)
                        {
                            case 1:
                                firstWarrior.attackEnemy(firstZombie);
                                break;
                            case 2:
                                firstWarrior.attackEnemy(firstSkeleton);
                                break;
                        }
                        break;
                    case 2:
                        switch (e)
                        {
                            case 1:
                                firstMage.attackEnemy(firstZombie);
                                break;
                            case 2:
                                firstMage.attackEnemy(firstSkeleton);
                                break;
                        }
                        break;
                    case 3:
                        switch (e)
                        {
                            case 1:
                                firstArcher.attackEnemy(firstZombie);
                                break;
                            case 2:
                                firstArcher.attackEnemy(firstSkeleton);
                                break;
                        }
                        break;
                }
            }
        }
    }
}
