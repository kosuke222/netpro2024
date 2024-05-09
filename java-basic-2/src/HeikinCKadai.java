import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HeikinCKadai {
	public static void main(String[] args){

        Random random = new Random();
        Kamoku math[] = new Kamoku[100];
        int sum = 0;
        int passingScore = 80;

        for (int i = 0; i < math.length; i++) {
            int score = random.nextInt(101);
            math[i] = new Kamoku(score);
            sum += math[i].getScore();
        }

        int ave =  sum / math.length;

        ArrayList<Integer> passingScores = new ArrayList<>();
        for (Kamoku k : math) {
            if (k.getScore() >= passingScore) {
                passingScores.add(k.getScore());
            }
        }
        Integer[] sortedPassingScores = passingScores.toArray(new Integer[0]);
        Arrays.sort(sortedPassingScores);
        System.out.println("*平均点は" + ave+"*");
        System.out.println(" ");
        System.out.println("*以下合格者の点数です。*");
        System.out.println(" ");
        for (int score : sortedPassingScores) {
            System.out.println("*"+score+"*");
            System.out.println(" ");
        }
        
    }
}
