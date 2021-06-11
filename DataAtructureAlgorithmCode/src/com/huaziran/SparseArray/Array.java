package com.huaziran.SparseArray;

public class Array {

    public static void main(String[] args)
    {

        int Array[][] = new int[11][11];
        Array[1][2] = 1;
        Array[2][3] = 2;

        for (int i = 0;i<11 ;i++ )
        {
            for (int j = 0;j<11 ; j++ )
            {
                System.out.print(" " +Array[i][j]);
            }
            System.out.println();

        }

        int sum = 0;

        for (int i = 0;i<11 ;i++ )
        {
            for (int j = 0;j<11 ; j++ )
            {
                if (Array[i][j] != 0)
                {
                    sum++;

                }
            }


        }
        System.out.println("---------------------------------");
        System.out.println("个数："+sum);

        //Sparse array
        int count = 0;
        int Sparray[][] = new int[sum + 1][3];
        Sparray[0][0] = 11;
        Sparray[0][1] = 11;
        Sparray[0][2] = sum;
        for (int i = 0;i<11 ;i++ )
        {
            for (int j = 0;j<11 ; j++ )
            {
                if (Array[i][j] != 0)
                {
                    count ++;
                    Sparray[count][0] = i;
                    Sparray[count][1] = j;
                    Sparray[count][2] = Array[i][j];

                }
            }

        }

        System.out.println("---------------------------------");
        //输出稀疏数组
        for (int i = 0;i<Sparray.length ;i++ )
        {

            System.out.printf("%d\t%d\t%d\t\n",Sparray[i][0],Sparray[i][1],Sparray[i][2]);

        }
        System.out.println();

    }
}
