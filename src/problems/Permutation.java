package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        char[] values = {'a', 'b', 'c', 'd'};
        int n = values.length;
        int r = 2;
        int i[] = new int[r];
        int rc = 0;
        for(int j=0; j<Math.pow(n,r); j++)
        {

            rc=0;
            while(rc<r)
            {
                System.out.print(values[i[rc]] + " ");
                rc++;
            }
            System.out.println();
            rc = 0;
            while(rc<r)
            {
                if(i[rc]<n-1)
                {
                    i[rc]++;
                    break;
                }
                else
                {
                    i[rc]=0;
                }
                rc++;
            }
        }

    }
}
