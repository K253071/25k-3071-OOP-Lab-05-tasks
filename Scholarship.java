class Scholarship {
    public static void main(String[] args) {

        // Marks of 12 students
        int[] marks = {78, 92, 67, 45, 88, 73, 59, 37, 81, 90, 59, 72};

        int sum = 0;

        // Grace marks policy (replace marks below 40 with 40)
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                marks[i] = 40;
            }
        }

        // Calculate total for average
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        double average = sum / marks.length;

        int full = 0, half = 0, none = 0, belowAverage = 0;

        // Check scholarship categories
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > 85) {
                full++;
            } 
            else if (marks[i] >= 70 && marks[i] <= 85) {
                half++;
            } 
            else {
                none++;
            }

            if (marks[i] < average) {
                belowAverage++;
            }
        }

        // Output
        System.out.println("Class Average: " + average);
        System.out.println("Full Scholarship Students: " + full);
        System.out.println("Half Scholarship Students: " + half);
        System.out.println("No Scholarship Students: " + none);
        System.out.println("Students Below Average: " + belowAverage);
    }
}