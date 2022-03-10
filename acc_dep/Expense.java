/**
 * Expense
 */
public class Expense {

    Employee employee;
    ExpenseType expenseType;
    int expenseSize;
    String reason;
    
    public Expense(Employee employee, ExpenseType eType, int size, String reason) {

        this.employee = employee;
        this.expenseType = eType;
        this.expenseSize = size;
        this.reason = reason;
    }

    // public int computeExpenseValue() {

    //     if (expenseType.getID() == 1) { // for ExpenseType1
    //         return expenseSize * expenseType.getData(); // posothta X timh
    //     } else if (expenseType.getID() == 2) { // for ExpenseType1
    //         return expenseSize * expenseType.getData() / 100; // a3ia X pososto (tois ekato)
    //     } else {
    //         return 0;
    //     }
    // }

    public int isOfType() {
        return expenseType.getID();
    }

    public int compute() {
        return expenseType.computeValue(expenseSize);
    }
}