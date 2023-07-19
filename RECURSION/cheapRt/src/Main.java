public class Main {
    public static int cheapRt(int []stations,int step1,int step2,int limit){
    return cheapRt(stations,step1,step2,limit,0,"");//definition of the recursive call
    }
    private static int cheapRt(int[]stations,int step1,int step2,int limit,int i,itn sum,String str){
     if(i==stations.length-1 &&limit>=0 ){
         sum+=stations[i];//sum the prices of stations
         str+=stations[i]+"";
         system.out.println(str+"="+sum);
         return sum;}
     if(i>=stations.length ||limit<0)
         return Integer.MAX_VALUE;
     int curp=stations[i];
     int opt1=cheapRt(stations,step1,step2,limit,i+step1,sum+curp,str+curp+"");
     int opt2=cheapRt(stations,step1,step2,limit-1,i+step2,sum+curp,str+curp+"");
     return Math.min(opt1,opt2);
     }



}