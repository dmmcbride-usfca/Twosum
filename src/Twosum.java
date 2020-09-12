import java.util.Arrays;
import java.util.HashMap;

public class Twosum
{
    private int [] arr;
    private int targ;
    public int [] sums = new int[2];

    // Construct0r
    public Twosum(int[] arr, int targ)
    {
        this.arr = arr;
        this.targ = targ;
        this.findSum(arr,targ);
    }

    public void findSum(int [] arr, int targ)
    {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        // loops thru integers for start
        for (int i=0; i<arr.length; i++)
        {
            //finds diff between starting
            Integer diff = (Integer) (targ - arr[i]);
            // looks for diff in hash
            if (hash.containsKey(diff))
            {
                //if diff found; idxs added to sums
                this.sums = new int[]{hash.get(diff) + 1, i + 1};
            }
            else {
                //if diff not found, sums set to -1
                this.sums = new int[]{-1,-1};
            }
            //adds start to hash map
            hash.put(arr[i], i);
        }
    }

    //toString overwrite to print sum indices
    @Override
    public String toString()
    {
        return " " + Arrays.toString(sums);
    }

    public static void main(String [] args)
    {
        int arr[] = new int[]{4, 5, 3, 2, 1};
        Twosum newSum = new Twosum(arr, 3);
        System.out.println(newSum);
    }
}
