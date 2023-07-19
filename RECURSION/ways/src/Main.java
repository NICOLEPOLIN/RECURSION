public class Main {
    public static int ways(int k,int n){
        if(n==0 &&k==0)//GOOD RETURN-IF WE GOT TO DEST IN THE RIGHT COUNT STEPS
            return 1;
        if(n>k ||k>0)//BAD RETURN
            return 0;
        return ways(k-1,n-1)+ways(k-1,n+1);
    }
}