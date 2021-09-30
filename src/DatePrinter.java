import java.util.Date;
public class DatePrinter implements Runnable
{
    Date date = new Date();

    @Override
    public void run()
    {
        for (int i = 0; i <= 20000 ; i++)
        {
            System.out.println(date);
        }
    }
}
