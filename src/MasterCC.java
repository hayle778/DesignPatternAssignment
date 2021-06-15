/*
 the first digit is 5 to 2. the second digit is range 1 to 5. Only valid length



 */


import java.util.ArrayList;
import java.util.List;

public class MasterCC extends CreditCard{

private String[] master;


    public MasterCC(String[] master) {
        super();
    }

    public MasterCC () {

    }


//private static  List<String> masterCard(List<String> master){
//    master = new ArrayList< String>();
//
//    master.add("3255454656346635");
//    master.add("09/22");
//    master.add("Aserat Sentayehu");
//   System.out.println(master);
//
//  return master;
//
//}


    public static String[] cardMaster(String[] master){
        master = new String[]{"1230000001234434", "07/11", "Abera Doe", "x"};
        master = new String[]{"2349884560154534","05/19", "Amera Bekele", "y"};
        master = new String[]{"2343434545454534","05/19", "Belay Goslin", "y"};
       master = new String[]{"234331090034534","05/19", "Semegnew Sisay", "y"};
       master = new String[]{"2345789000004534","05/19", "Ayele Amogne", "y"};
        for(int i =0; i<= master.length; i++){
            System.out.println(i);
        }

        long val = Long.valueOf(String.valueOf(master));
        if (val >= 13 && val<16  ){
            System.out.println(" Unable to instantiate from known credit type: ");

        }
        return master;

    }




}
