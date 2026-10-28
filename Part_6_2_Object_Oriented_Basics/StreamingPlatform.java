public class StreamingPlatform {
        public static void main(String[] args) {
            PremiumSub familyPlan = new PremiumSub(4);
            familyPlan.printPlan();
            System.out.println("Upgrade cost: $" + familyPlan.upgradeCost());
        }
}