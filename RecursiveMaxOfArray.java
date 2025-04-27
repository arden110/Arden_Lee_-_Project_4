public class RecursiveMaxOfArray
{

    
    /**
     * Compute the maximum of a range of values in an array recursively.
     *
     * @param data   An array of integers.
     * @param from  The low index for searching for the maximum.
     * @param to    The high index for searching for the maximum.
     * 
     * preconditions: from LTE Zero to, from LTE 0, to LT length, length GT 0
     *                
     * @return     The maximum value in the array.
     */
    
    public  int max(int data[], int from, int to)
    {
        int result = 0;

        // ADD YOUR CODE HERE
        if (data == null) {
            throw new BadArgumentsForMaxException("null array");
        }

        if (from < 0 || to < 0 || from > to || to >= data.length) {
            throw new BadArgumentsForMaxException("bad input");
        }

        if (from == to){
            result = data[from];
        } else {
            int mid = (from + to) / 2;
            int firstHalf = max(data, from, mid);
            int secondHalf = max(data, mid+1, to);
            result =  Math.max(firstHalf, secondHalf);
        }
//vvvvvvvvv ADDED CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv        

        return result;
    }
    
    
}
