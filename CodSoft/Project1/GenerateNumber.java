import java.util.Random;
public class GenerateNumber {
    // Random generate method normal level
    public int Generate() {
        Random num = new Random();
        int number = num.nextInt(100);
        return number;
    }
}