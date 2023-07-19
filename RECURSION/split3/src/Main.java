public class Main {
    public static split3(int[]arr){
        return split3(arr,0,0,0,int i);
    }
    private static int split3(int []arr,gr1,gr2,gr3,i){
        if(arr.length==i)
            return (gr1 ==gr2 && gr2=gr3);
        return (split3(arr,gr1+arr[i],gr2,gr3,i+1))||
                split3(arr,gr1,gr2+arr[i],gr3,i+1)||
                split3(arr,gr1,gr2,gr3+arr[i],i+1));

    }
}