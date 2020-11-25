public class MultiplicationTable {
    public static void main(String[] args)
    {
        System.out.println("Multiplication Table");
        System.out.println("   \t1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("-----------------------------------------------------------" + 
        "-----------------------------------");

        for (int i=1; i<10; i++)
        {
            for (int c=0; c<10; c++) //If 1++ is 2, what is c++?
            {
                if (c == 0)
                {
                    System.out.print(i + " |");
                }
                else
                {
                    System.out.print("" + i * c);
                }

                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
