package date1006.collection.set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for (int i = 0; i < 50; i++){
            int num = randomNumberGenerator.generate(10);
            System.out.println(num);
        }
    }
}
