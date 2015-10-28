/**
 * Created by Administrator on 10/28/2015.
 */
public class Main {

    public static void main(String args[])
    {
        Chicken bill = new Chicken("Bill", Chicken.Gender.MALE);

        bill.feed(50);
        bill.takeParachite();
        bill.toss();
        bill.cook();

    }
}
