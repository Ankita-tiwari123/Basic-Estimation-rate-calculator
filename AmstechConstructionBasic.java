package amstechconstructionbasic;

public class AmstechConstructionBasic {

    public static void main(String[] args) {
        char character = 'f';
        
        if(character == 'p'){
            Plot p = new Plot(12.5,40);
            Estimation.setPLotDetails(p);
        }
        else if(character == 'o'){
            Office o = new Office(10,50);
            Estimation.setOfficeDetails(o);
        }
        else if(character == 'f'){
            Flat f = new Flat(500);
            Estimation.setFlatDetails(f);
        }
    }
    
}
