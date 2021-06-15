/*

 First four digit are 6011. The length is 16 digit


 */


public class Discover {


    public Discover ( String [] discover){
        super();

        discover = this.discover;

    }

    public Discover() {

    }

    private String[] discover;

    public static String[] cardDiscover(String[] discover){
        discover = new String[]{"1234567891234434", "07/11", "Ethiopia Doe", "x"};
        discover = new String[]{"2343434560154534","05/19", "Carry Goslin", "y"};
       discover = new String[]{"2343434545454534","05/19", "Berry Goslin", "y"};
      discover= new String[]{"2343344334434534","05/19", "Abera Sisay", "y"};
       discover= new String[]{"2345789005454534","05/19", "AmerryAmogne", "y"};

        for(int i =0; i<= discover.length; i++){
            System.out.println(i);
        }

        long val = Long.valueOf(String.valueOf(discover));
        if (val >= 13 && val<16  ){
            System.out.println(" Unable to instantiate from known credit type: ");
        }
        return discover;

    }







}
