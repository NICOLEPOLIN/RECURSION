public class Main {
    public static isSubstring(){
        return isSubstring(s1,s2,0,0);
    }
    //i representing s1 index
    //j representing s2 index
    private static  boolean isSubstring(String s1,String s2,int i,int j){
        if(j==s2.length() )//If the index j has reached the length of s2,
            // it means all characters of s2 have been matched successfully in s1,
            // so it returns true
            return true;
        if(i==s2.length()||i+j==s1.length())//If the index i has reached the length of s2,
            // or the sum of i and j has reached the length of s1,
            // it means we have exhausted the possibilities of finding s2 in s1 without a successful match,
            // so it returns false
            return false;
        if(s1.charAt(i+j)==s2.charAt(j))//If the character at index i+j in s1 matches the character at index j in s2,
            // the function recursively calls itself with an incremented j to check the next character in s2.
            return isSubstring(s1,s2,i,j+1);
        else
            return isSubstring(s1,s2,i+1,0);//If the characters at the current indices don't match,
        // the function recursively calls itself with an incremented i
        // and a reset j (set to 0) to continue searching for a match in s1.
    }
}
st