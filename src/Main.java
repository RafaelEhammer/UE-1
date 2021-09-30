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

/*
    Ein Thread wird immer zuerst komplett durchlaufen, bevor der andere komplett durchläuft.
    Es gibt jedoch keinen bestimmten algorythmus hinter dem und es ist einfach nur zufällig.
    Wenn man es mit 200000 probiert erscheint hin und wieder zwischendurch der andere Thread. 
 */
