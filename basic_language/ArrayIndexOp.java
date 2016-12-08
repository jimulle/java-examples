class ArrayIndexOp {
    public static void main(String[] args) {
        int[] grades = { 89, 90, 68, 73, 79 };
        System.out.println("89: " + grades[0]);
        System.out.println("90: " + grades[1]);
        grades[1] = 91;
        System.out.println("91: " + grades[1]);
        int idx = 4;
        System.out.println("79: " + grades[idx]);
        System.out.println(grades['C' - 'A']);
    }
}