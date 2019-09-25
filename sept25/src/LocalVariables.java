public class LocalVariables {
    public static void main (String[] args) {

        double myFirstOne = 5.0;

        {//block 1
            double var1 = 0.0;
            double var2;
            {//block 1.1
             //variables in block 1.1 cannot be used outside of it without re-declaring
                var2 = 4.0;
                double var3 = 8.0;

                var1 = 34;
            }
            {//block 1.2
                double var4 = 5;
            }

            System.out.println(var2);

        }
    }
}
