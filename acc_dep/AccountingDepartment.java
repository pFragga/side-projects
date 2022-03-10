/**
 * AccountingDepartment
 */
public class AccountingDepartment {

    public static void main(String[] args) {
        
        // Employees
        Employee papadopoulos = new Employee("Nikos", "Papadopoulos", 200);
        Employee frangatzis  = new Employee("Petros", "Frangatzis", 100);

        // ExpenseTypes
        ExpenseType1 diatrofi = new ExpenseType1(100, "Diatrofi", 30, "day");
        ExpenseType1 odoiporika = new ExpenseType1(100, "Odoiporika", 2, "km");
        ExpenseType2 taxi = new ExpenseType2(50, "Transportation with taxi", 80);
        
        // Expenses
        Expense first = new Expense(papadopoulos, diatrofi, 4, "Flight got delayed.");
        Expense second = new Expense(papadopoulos, taxi, 30, "Urgent meeting.");
        Expense third = new Expense(frangatzis, odoiporika, 30, "Felt adventurous.");
        Expense fourth = new Expense(frangatzis, taxi, 15, "Car broke down.");


        Expense[] expenses = {first, second, third, fourth}; // expense list needs to be automated
        int sum1 = 0; int sum2 = 0;
        for (Expense expense : expenses) {
            if (expense.isOfType() == 1) {
                sum1 += expense.compute();
            } else if (expense.isOfType() == 2) {
                sum2 += expense.compute();
            }
        }

        System.out.println(
            "Total compensation for expenses of type 1: " + sum1 +
            "\nTotal Compensation for expenses of type 2: " + sum2
            ); // OK, this works. 
    }
}