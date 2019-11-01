import java.io.*;
import java.util.*;
class Medic{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String[] date=br.readLine().split(":");
            int year=Integer.parseInt(date[0]),month=Integer.parseInt(date[1]),day=Integer.parseInt(date[2]);
            pw.println(check(day,month,year));
            pw.flush();
        }
    }
    public static int check(int day,int month,int year){
        int noOfDaysInThisMonth,res;
        if(day%2==0)
            res=(-1*(day/2))+1;
        else
            res=-1*(day/2);
        do{
            noOfDaysInThisMonth=calcDays(month,year);
            if(day%2==0)
                res+=(noOfDaysInThisMonth)/2;
            else{
                if(noOfDaysInThisMonth%2==0)
                    res+=(noOfDaysInThisMonth)/2;
                else
                    res+=(noOfDaysInThisMonth)/2+1;
            }
            if(month==12){
                month=1;
                year++;
            }
            else
                month++;
        }while(noOfDaysInThisMonth%2==0);
        return res;
    }
    public static int calcDays(int month,int year){
        if(month==2){
            if(year%400==0)
                return 29;
            if(year%100==0)
                return 28;
            if(year%4==0)
                return 29;
            return 28;
        }
        if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)){
            return 31;
        }
        return 30;
    }
}