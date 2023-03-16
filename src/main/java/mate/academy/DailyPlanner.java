package mate.academy;

public class DailyPlanner {
    public static void main(String[] args) {
        String[] pl = {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};
        System.out.println(createDailyPlan(pl));
    }
    public static String createDailyPlan(String[] plans) {
        StringBuilder builder = new StringBuilder();
        if (plans.length <= 0) {
            return "My plans:";
        }
        builder.append("My plans: \n");
        for(int i = 0; i < plans.length; i++) {
            builder.append(i + 1).append( ".) ").append(plans[i]).append(";");
            if (i < (plans.length - 1))
                builder.append("\n");
        }
        return new String(builder);
    }

}
