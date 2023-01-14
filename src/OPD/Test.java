package OPD;

public class Test {
    public void calculate(float checkPoint, float budget,
                          float currentExpenses, float plannedTerm,
                          float readyNow) {
        float labor = 100;
        float estimatedEndpoint = (checkPoint * labor)/readyNow;
        float termShift = estimatedEndpoint - plannedTerm;
        float estimatedBudget =
                (estimatedEndpoint * currentExpenses)/checkPoint;
        float expensesShift = estimatedBudget - budget;
        System.out.println("Задержка сроков: " + termShift + " мес.");
        System.out.println("Перерасход бюджета: " + expensesShift + " у.е.");
    }
}
