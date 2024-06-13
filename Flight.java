import java.util.Random;

public class Flight {
    private int numOfSeats;
    private String V_T_I [];
    private Random R ;

    public Flight(int numOfSeats, String[] v_T_I, Random r) {
        this.numOfSeats = numOfSeats;
        this.V_T_I = v_T_I;
        this.R = new Random();
    }
    public String Book_Ticket()
    {
    try {

        numOfSeats--;
        return V_T_I[R.nextInt(numOfSeats)];

    }
    catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Invalid Id");
    }
    catch (Exception e)
    {
        System.out.println(e.getMessage());
    }
     return null;

    }

    public void Ticket(String TicketId) throws invalidTicketException
    {
        boolean found=false;
        try {
            for (int i=0;i<V_T_I.length;i++){
                if(V_T_I[i].equals(TicketId))
                {
                    found=true;
                    numOfSeats++;
                }
                else
                {
                    throw new invalidTicketException(TicketId,"Error");
                }

            }
        }
        catch (invalidTicketException e)
        {
            System.out.println(e.getMessage());
        }


    }





}
class invalidTicketException extends Exception
{
    invalidTicketException(String i , String msg)
    {
        super(msg);
    }
}