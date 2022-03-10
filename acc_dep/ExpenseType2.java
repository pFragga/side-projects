/**
 * ExpenseType2
 */
public class ExpenseType2 extends ExpenseType {

    int compensationPercentage;

    public ExpenseType2(int max, String desc, int percentage) {

        super(max, desc);
        this.compensationPercentage = percentage; 
        this.id = 2;
    }

    @Override
    public int computeValue(int quantity) {
        return quantity * compensationPercentage / 100;
    }
}