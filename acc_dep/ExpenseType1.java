/**
 * ExpenseType1
 */
public class ExpenseType1 extends ExpenseType {

    
    int compensationPerUnit;
    String unitOfMeasurement;
    
    public ExpenseType1(int max, String desc, int comp, String uOm) {
        
        super(max, desc);
        this.compensationPerUnit = comp;
        this.unitOfMeasurement = uOm;
        this.id = 1;
    }

    @Override
    public int computeValue(int quantity) {
        return quantity * compensationPerUnit;
    }
}