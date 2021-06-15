
/*
p1...design a method,
a credit card number might be an account number
credit card number can not exceed 19 digit.





* */


import java.util.Arrays;
import java.util.Scanner;

public class CreditCard {

private Discover discover;

//    private static Object discover;
//    private  static  Object master;
//    private static Object visa;
//    private  static Object amexcc;



    public static void main(String[] args){
        CreditCard creditCard = new CreditCard();


        Discover discover1 = new Discover();
        
        
        
        MasterCC master1 = new MasterCC();
        AmExCC amexcc1 = new AmExCC();
        VisaCC visa1 = new VisaCC();


        String master="";
        cardMaster(master);
        cardAmexcc(amexcc1);
        cardDiscover(discover1);
         visaCC(visa1);
    }



    private static void visaCC(VisaCC visa) {
        
    }

    private static void cardDiscover(Discover discover) {
    }

    private static void cardAmexcc(AmExCC amexcc) {
    }

    private static void cardMaster(String master) {

    }




}
