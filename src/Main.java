public class Main
{
    public static void main(String[] args)
    {
        DatePrinter DP = new DatePrinter();
        Thread th1 = new Thread(DP);

        CountPrinter CP = new CountPrinter();
        Thread th2 = new Thread(CP);

        th1.start();
        th2.start();
    }

}
