import java.util.*;
class handcricket
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int pscore=0;
        int cscore=0;
        boolean b=false;
        System.out.println("PLAYER IS BATTING FIRST");
        while (b==false)
        {
            System.out.println("Enter a number between 0 and 10");
            int player=sc.nextInt();
            double g=Math.random()*10;
            int comp=(int)g;
            System.out.println("Comp number= " + comp);
            if(player==comp)
            {
                System.out.println("You are out");
                b=true;
                break;
            }
            else
            {
                pscore+=player;
                System.out.println("Your score = "+ pscore);
            }
        }
        System.out.println("Your score= " + pscore + "runs");
        System.out.println("--------------------------------");
        boolean bowl=false;
        while (bowl==false)
        {
            System.out.println("Enter a number between 0 and 10");
            int player=sc.nextInt();
            double g=Math.random()*10;
            int comp=(int)g;
            System.out.println("Comp number= " + comp);
            if(player==comp)
            {
                System.out.println("You have got the computer out");
                System.out.println("You have won :)");
                System.out.println("Your score= " + pscore+ "\n Computer score = " + cscore);
                bowl=true;
                break;
            }
            else
            {
                cscore+=comp;
                System.out.println("Comp score= "+ cscore);
                if(cscore>pscore)
                {
                    System.out.println("Computer wins");
                    break;

                }
            }
        }
        int ssp=0;
        int ssc=0;
        if(cscore==pscore)
        {
            System.out.println("Tie \n SUPER OVER");
            System.out.println("-You have 6 balls to play \n -There are unlimited amount of wickets \n - whickever team has more rus at the end of the over wins");
            for(int i=0; i<6; i++)
            {
                System.out.println("Enter a number between 1 and 10");
                int p=sc.nextInt();
                double g=Math.random()*10;
                int c=(int)g;
                System.out.println("Comp number= " + c);

                while(true)
                {
                    if(p==c)
                    {
                        continue;
                    }
                    else
                    {
                        ssp+=p;
                        System.out.println("Your score = "+ pscore);
                    }
                }
            }
            for(int i=0; i<6; i++)
            {
                System.out.println("Enter a number between 1 and 10");
                int p=sc.nextInt();
                double g=Math.random()*10;
                int c=(int)g;
                System.out.println("Comp number= " + c);

                while(true)
                {
                    if(p==c)
                    {
                        continue;
                    }
                    else
                    {
                        ssc+=c;
                        System.out.println("Comp score= "+ cscore);
                        if(ssc>ssp)
                        {
                            System.out.println("Computer wins");
                            System.out.println("Your score= " + pscore+ "\n Computer score = " +  cscore);
                            System.exit(0);

                        }
                    }
                }
            }
            System.out.println("You won");
            System.out.println("Your score= " + pscore+ "\n Computer score = " +  cscore);
        }
    }
}

