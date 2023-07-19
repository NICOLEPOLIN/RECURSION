public class Main {
    public static int printAllSum(int[]a,int sum){
        return printAllSum(a,sum,0,"");
    }
    private static void printAllSum(int[]a,int sum,int i,String s){
        if(i==a.length){
            if(sum==0)//it first checks if the current index i is equal to the length of the array a.
                // If it is, it means we have considered all elements of the array in the subset.
                // In this case, it checks if the sum is equal to 0.
                // If it is, it means the subset's sum matches the target sum,
                // so it prints the string s
                system.out.println(s);
        }
        else{//If the current index i is not equal to the array length,
            // it means there are more elements to consider for the subset.
            // In this case, it makes two recursive calls:
            printAllSum(a,sum-a[i],i+1,s+"1");
            //This call includes the current element a[i] in the subset
            // and subtracts it from the target sum.
            // It proceeds to the next index i + 1
            // and appends "1" to the string s to indicate that the element is included in the subset.
            printAllSum(a,sum,i+1,s+"0");
            //This call excludes the current element a[i] from the subset.
            // It proceeds to the next index i + 1
            // and appends "0" to the string s to indicate that the element is not included in the subset.

        }
    }
}
//the method get  an array with positive numbers a,
// and number sum;and prints all the binary strings that represents the sum in array a.
//if there is no such string ,wiil not print anything