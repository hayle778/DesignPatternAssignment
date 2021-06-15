
/*

First digit is a 3 and second digit is 4 or 7. Legth is 15 digits


 */


public class AmExCC extends CreditCard{

    private static  String [] amexcc;


    public AmExCC ( String [] amexcc){
        super();

        amexcc= this.amexcc;
    }

    public AmExCC() {

    }

    public static String[] cardAmexcc(String[] amexcc){
        amexcc = new String[]{"1234567891234434", "07/11", "Ethiopia Doe", "x"};
        amexcc  = new String[]{"2343434560154534","05/19", "Carry Goslin", "y"};
        amexcc = new String[]{"2343434545454534","05/19", "Berry Goslin", "y"};
        amexcc = new String[]{"2343344334434534","05/19", "Abera Sisay", "y"};
        amexcc = new String[]{"2345789005454534","05/19", "AmerryAmogne", "y"};

        for(int i =0; i<= amexcc.length; i++){
            System.out.println(i);
        }

        long val = Long.valueOf(String.valueOf(amexcc ));
        if (val >= 13 && val<16  ){
            System.out.println(" Unable to instantiate from known credit type: ");
        }
        return amexcc ;

    }


}
