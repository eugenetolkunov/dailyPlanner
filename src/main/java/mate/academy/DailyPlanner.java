package mate.academy;

public class DailyPlanner {
    public static void main(String[] args) {
        String[] pl = {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};
        System.out.println(createDailyPlan(pl));
    }
    public static String createDailyPlan(String[] plans) {
        StringBuilder builder = new StringBuilder();
        builder.append("My plans: \n");
        for(int i = 0; i < plans.length; i++) {
            builder.append(i + 1 + ".) ").append(plans[i]).append("; \n");
        }
        return new String(builder);
    }

}
