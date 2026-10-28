public class PremiumSub extends Subscription {
    protected int price = 18;
    private int screens; 

    PremiumSub(int screens) { this.screens = screens; }
    void printPlan() {
        System.out.println("Premium plan with " + this.screens + " screens");
        System.out.println("Premium price: $" + this.price);
        System.out.println("Base price: $" + super.price);
    }
    int upgradeCost() { return price - super.price; }
}