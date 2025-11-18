package amstechconstructionbasic;

public class Operations {
    public static double getRateOrCost(char type,double area ){
        if(type == 'p'){
            return area*Rate.plotRatePerSquareFeet;
        }else if(type=='f'){
            return area * Rate.flatRatePerSquareFeet;
        }
        else if(type =='o'){
            return area * Rate.officeRatePerSquareFeet;
        }
        return -1;
        
    }
    public static double getRegistryCharges(double rate){
        return Rate.RegistryCharges *rate;
    }
    public static double getGreenTax(double rate){
        return Rate.GreenTaxCharges*rate;
    }
    
}
