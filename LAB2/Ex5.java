public class Ex5 {
    private int value;
    public Ex5() {
        this.value = 1;
    }
    public int roll() {
        this.value = (int) (Math.random() * 6) + 1;
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Ex5 dice = new Ex5();
        int n = 60000; 
        int[] faceCounts = new int[7];
        for (int i = 0; i < n; i++) {
            int result = dice.roll();
            faceCounts[result]++;
        }
        System.out.println("=== DICE ROLL EXPERIMENTAL PROBABILITY (n = " + n + ") ===");
        for (int face = 1; face <= 6; face++) {
            double probability = (double) faceCounts[face] / n;
            System.out.printf("Face %d: Count = %6d | Experimental Probability = %.4f (%.2f%%)%n",
                    face, faceCounts[face], probability, probability * 100);
        }
    }
}