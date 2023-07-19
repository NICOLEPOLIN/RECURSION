public class Main {
    public static int countpairs(int n){
        return countpairs(n,"",0,0);
    }
    private static int countpairs(int n,String s,int left,int right){
        if(s.length()==n*2){
            System.out.println(s);
            return 1;
        }
        if(left==right)
            return countpairs(n,s+"(",left+1,right);
        if(left==n)
            return countpairs(n,s+")",left,right+1);
        return countpairs(n,s+"(",left+1,right)+countpairs(n,s+")",left,right+1);
    }//end
}//end main

//algo:we will check of many lieft and right there are
// in every call'and will check if the length of the string is at least 2n.if yes
//we will prpint and return 1 . if we still didnt found to build the string  we will check if we need to add to her  a).
//we will call recursivly  to add once to left and then once to right ans then sum the number of string that will get