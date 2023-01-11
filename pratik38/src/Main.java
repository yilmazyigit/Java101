import java.beans.FeatureDescriptor;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali", 10, 120, 100, 30);
        Fighter f2 = new Fighter("Berk", 20, 85, 85, 40);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}