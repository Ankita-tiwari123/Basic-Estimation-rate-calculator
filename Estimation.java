package amstechconstructionbasic;

public class Estimation {
    public static double setPLotDetails(Plot p){
        double length =p.getLength();
        double breadth = p.getBreadth();
        double plotArea = p.getPlotArea();
        double rate = Operations.getRateOrCost('p', plotArea);
        double greenTax = Operations.getGreenTax(rate);
        double registryCharges = Operations.getRegistryCharges(rate);
        double societyDevelopmentTax = Rate.SocietyDevelopmenttax;
        
        double TotalCostEstimationOfPlot = rate + greenTax + registryCharges + societyDevelopmentTax;
        
        System.out.println("Length of plot : " + length);
        System.out.println("Breadth of plot : " + breadth);
        System.out.println("Area of plot : " + plotArea);
        System.out.println("Rate of plot : " + rate);
        System.out.println("Green Tax of plot : " + greenTax);
        System.out.println("Registry Charges of plot : " + registryCharges);
        System.out.println("Society Developement Tax of plot : " + societyDevelopmentTax);
        System.out.println("Total Cost of plot : " + TotalCostEstimationOfPlot);
        
        
        return 0;
        
    }
    
    public static double setOfficeDetails(Office o){
        double length =o.getLength();
        double breadth = o.getBreadth();
        double OfficeArea = o.getOfficeArea();
        double rate = Operations.getRateOrCost('o', OfficeArea);
        double greenTax = Operations.getGreenTax(rate);
        double registryCharges = Operations.getRegistryCharges(rate);
        double societyDevelopmentTax = Rate.SocietyDevelopmenttax;
        
        double TotalCostEstimationOfOffice = rate + greenTax + registryCharges + societyDevelopmentTax;
        
        System.out.println("Length of Office : " + length);
        System.out.println("Breadth of Office : " + breadth);
        System.out.println("Area of Office : " + OfficeArea);
        System.out.println("Rate of Office : " + rate);
        System.out.println("Green Tax of Office : " + greenTax);
        System.out.println("Registry Charges of Office : " + registryCharges);
        System.out.println("Society Developement Tax of Office : " + societyDevelopmentTax);
        System.out.println("Total Cost of Office : " + TotalCostEstimationOfOffice);
        
        
        return 0;
        
    }
    
    public static double setFlatDetails(Flat f){
        double FlatArea = f.getArea();
        double rate = Operations.getRateOrCost('o', FlatArea);
        double greenTax = Operations.getGreenTax(rate);
        double registryCharges = Operations.getRegistryCharges(rate);
        double societyDevelopmentTax = Rate.SocietyDevelopmenttax;
        
        double TotalCostEstimationOfFlat = rate + greenTax + registryCharges + societyDevelopmentTax;
        
        System.out.println("Area of Office : " + FlatArea);
        System.out.println("Rate of Office : " + rate);
        System.out.println("Green Tax of Office : " + greenTax);
        System.out.println("Registry Charges of Office : " + registryCharges);
        System.out.println("Society Developement Tax of Office : " + societyDevelopmentTax);
        System.out.println("Total Cost of Office : " + TotalCostEstimationOfFlat);
        
        
        return 0;
        
    }
    
}
