public class   AMPO_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] Score = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        
        int sum = 0; 

        for (int i = 0; i < 25; i++) {
            System.out.print("Input Score" + ": ");
            int score = sc.nextInt();
            
            sum += score; 
            
            
            for (int x = 0; x < Score.length; x++) {
                for (int y = 0; y < Score[x].length; y++) {
                    if (Score[x][y] == score) {
                        System.out.println("Score at position (" + x + "," + y + ") is " + score);
                    }
                }
            }
        }
        
        System.out.println("Sum of all scores: " + sum); 
        
        double average = (double) sum / 25; 
        System.out.println("Average of all scores: " + average); 
    }
}
