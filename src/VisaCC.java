/*

first digit is a 4. Length is either 13 or 16 digits


 */

public class VisaCC extends CreditCard{

    private  String[] visa;




    public VisaCC ( String [] visa){
       super();
        visa = this.visa;
    }

    public VisaCC() {

    }

    public static String[] visaCC(String[] visa){
        visa= new String[]{"1230000001234434", "07/11", "Abera Kebere", "x"};
        visa= new String[]{"2349845777777734","05/19", "Gebeyaw Bekele", "y"};
        visa= new String[]{"2343123334454534","05/19", "Walelegne Goslin", "y"};
        visa = new String[]{"234000000004534","05/19", "Kemerie Sisay", "y"};
        visa= new String[]{"2341119000004534","05/19", "Enbiyale Amogne", "y"};


        for(int i =0; i<= visa.length; i++){
            System.out.println(i);
        }



        long val = Long.valueOf(String.valueOf(visa));
        if (val >= 13 && val<16  ){
            System.out.println(" Unable to instantiate from known credit type: ");

        }
      return visa;

    }


}
