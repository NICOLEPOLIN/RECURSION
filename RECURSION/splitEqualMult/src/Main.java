public class Main {
    public static  boolean splitEqualMult(int[]a){
    return splitEqualMult(a,0,1,1);
    }
    private static boolean splitEqualMult(int[]a,int i,int sum1, int sum2){
        if(i==a.length){//if we done looking in the array
            if(sum1==sum2){//if we found the split
                return true;
            else return  false;//if we didnt found

            //recursive call
            if(splitEqualMult(a,i+1,sum1*a[i],sum2))||
                splitEqualMult(a,i+1,sum1,sum2*a[i]);
            return true;


            }
            return false;
        }
    }
}
//its backracking question because we need ti decide to which group
// to add the sum to get the right split to return true.
//the end condition is if we got to the end of the array
// we will keep trying to get the split return true if not we will
// try to add the sum to the second group(kinda like  take a step backwards).