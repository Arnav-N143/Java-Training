public class logic {
    

    public static void main (String[] args)
    {

        int result = 0; 
        int tea = 5;
        int candy = 10;


        if (tea >= 5 && candy >= 10)
        {
               
                if (tea >= 5 && candy >= tea * tea)
                {

                    result = 2; 
                }
                else {

                    result = 1; 
                
                } 
        }

            System.out.println(result);
    }
}
