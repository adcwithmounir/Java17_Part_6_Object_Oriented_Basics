class Subscription {
    String name() { return "Basic"; }

    int price() { return 10; }

    final String describe() {
        return name() + ": $" + price();
    }
}

class PremiumPlan extends Subscription {
    @Override String name() { return "Premium"; }
    @Override int price() { return super.price() + 8; }
}

class FamilyPlan extends PremiumPlan {
    @Override String name() { return "Family"; }
    @Override int price() { return super.price() + 5; }
}

public class SubscriptionPlans {
    public static void main(String[] args) {
        Subscription basic = new Subscription();
        System.out.println(basic.describe());

        Subscription premium = new PremiumPlan();
        System.out.println(premium.describe());

        Subscription family = new FamilyPlan();
        System.out.println(family.describe());
    }
}
