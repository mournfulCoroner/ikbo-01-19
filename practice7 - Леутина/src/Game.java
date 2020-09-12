import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private int step = 0;
    private int amountCards = 5;
    private LinkedList<Integer> lst1 = new LinkedList<>() ;
    private LinkedList<Integer> lst2 = new LinkedList<>();

    public Game(){
    }

    public Game(int amountCards) {
        this.amountCards = amountCards;
    }

    public void putCards()
    {
        Scanner sc = new Scanner(System.in);
        try {
            for(int i = 0; i < amountCards; i++) lst1.add(sc.nextInt());
            for(int i = 0; i < amountCards; i++) lst2.add(sc.nextInt());
        }
        catch (Exception o)
        {
            System.out.println("Incorrect data");
            System.exit(0);
        }
    }
    public void match()
    {
        putCards();
        while(!lst1.isEmpty() && !lst2.isEmpty() && step != 106)
        {
            step++;
            if((lst1.getFirst() > lst2.getFirst() && lst1.getFirst()!=9 && lst2.getFirst()!=0) || (lst1.getFirst() == 0 && lst2.getFirst()==9))
            {
                lst2.addLast(lst1.removeFirst());
                lst2.addLast(lst2.removeFirst());
            }
            else
            {
                lst1.addLast(lst1.removeFirst());
                lst1.addLast(lst2.removeFirst());
            }
        }
        if(step != 106)
        {
            if(lst1.isEmpty()) System.out.println("first " + step);
            else System.out.println("second " + step);
        }
        else System.out.println("botva");
    }

    public void clear()
    {
        step = 0;
    }
}
