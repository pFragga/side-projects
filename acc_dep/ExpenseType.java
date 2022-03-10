/**
 * ExpenseType
 */
public class ExpenseType {

    int id, maxMonthlyCompensation; // kwdikos, megisth mhniaia apozhmiwsi
    String description; // perigrafh

    public ExpenseType(int max, String desc) {

        this.maxMonthlyCompensation = max;
        this.description = desc;
    }

    public int getID() {
        return this.id;
    }

    public int computeValue(int quantity) {
        return 0;
    }
}