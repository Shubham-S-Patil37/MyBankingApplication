package ExtraResources;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ArriveDate {

    public static Date date = new Date();
    public static LocalDate localDate;

    public static String getTodaysDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        return sdf.format(date);
    }
    public static int getDay(){
        localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getDayOfMonth();
    }
    
    public static LocalDate getArriveDate(int noOFmonth){
        localDate = LocalDate.now().plusMonths(noOFmonth);
        return localDate;
    }
    
    public static int getArriveMonth(LocalDate localDate){
        return localDate.getMonthValue();
    }

    public static int getArriveYear(LocalDate localDate){
        return localDate.getYear();
    }

    public static String getArrivemonthAndYear(LocalDate localDate){
        if(String.valueOf(getArriveMonth(localDate)).length() == 2)
            return String.valueOf(getArriveMonth(localDate))+"/"+String.valueOf(getArriveYear(localDate)).substring(2);
        else if(String.valueOf(getArriveMonth(localDate)).length() == 1)
            return  "0"+String.valueOf(getArriveMonth(localDate))+"/"+String.valueOf(getArriveYear(localDate)).substring(2);
        else
            return null;
    }

    public static void main(String args[]){
        int i = 5;
//        System.out.println(""+getArriveMonth(getArriveDate(i)));
//        System.out.println(""+getArriveYear(getArriveDate(i)));
//        System.out.println(""+getArriveDate(i));
        System.out.println(""+getArrivemonthAndYear(getArriveDate(i)));
    }
}
