import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testing{

    public Testing(){
        method();
    }
    public static void main (String[] ar){
       new Testing();
    }

    public void method(){
        System.out.println("Hi");

//        byte[] SALT = { 9, 36, 78, Byte.parseByte("127"), Byte.parseByte("\0233"), 17, 3 };
//
//        for (byte b:SALT){
//            System.out.println(" b is "+b);
//        }

          String s =  "2011-04-03 15:04:02";

          DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         try{
            sop("stirng is "+s+" parse value is "+df.parse(s)+" millisec "+df.parse(s).getTime());
         }catch(ParseException pe){
            sop("Exception "+pe);
         }


    }

    private void sop(Object obj){
        System.out.println(obj);
    }

}