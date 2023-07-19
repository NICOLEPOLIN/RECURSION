public class Main(){
    public static void findword (char[][]arr,String word){
        int[][] output=new int[arr.length][arr.length];
        findword(arr,word,output,0,0,false);
    }
    public static int findword(char[][]arr,String word,int[][] output,int i ,int j, boolean done){
        if(done=true)
            return 1;
        if(j>=arr.length)
            return 0;
        if(i>= arr.length)
            return 1;
        if(findword(arr,word,output,i,j,0)){
            done=true;
            printarr(output);
            return 1;
        }
        if(findword(arr,word,output,i,j+1,false)==1)
            return;
        return findword(arr,word,output,i+1,0,false){

        }
        private static boolean findword(char[][]arr,String word,int[][]output,int i ,int j ,int stringIndex)
        {
            if(stringIndex==word.length())
                return true;
            if(i==arr.length||j==arr.length||i<0||j<0)
                return false;
            if(arr[i][j]==word.charAt(stringIndex)){
                output[i][j]=stringIndex+1;
                boolean goLeft,goRight,goUp,goDown;
                goLeft=findword(arr,word,output,i,j-1,stringIndex+1);
                goRight=findword(arr,word,output,i,j+1,stringIndex+1);
                goUp=findword(arr,word,output,i-1,j,stringIndex+1);
                goDown=findword(arr,word,output,i+1,j,stringIndex+1);
                if(goDown||goLeft||goRight||goUp)
                    return true;
            }else{
                output[i][j]=0;
                return false;

            }
        }
        return false;
    }
}