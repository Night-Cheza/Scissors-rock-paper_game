import java.util.Scanner;
public class ScissorsRockPaper {
    public static void main (String [] args) {
        int a = (int)(Math.random() * (2-0) + 0);
        
        //System.out.println(a);
        System.out.println("scissor (0), rock (1), paper (2):");
        
        Scanner in = new Scanner (System.in);
        int b = in.nextInt();
        
        switch (a) {
            case 0:
                switch (b) {
                    case 0: System.out.println("The computer is scissor. You are scissor too. It is a draw");
                        break;
                    case 1: System.out.println("The computer is scissor. You are rock. You won");
                        break;
                    case 2: System.out.println("The computer is scissor. You are paper. Computer won");
                        break;
                    default: System.out.println("Invalid input");
                }
                break;
            case 1:
                switch (b) {
                    case 0: System.out.println("The computer is rock. You are scissor. Computer won");
                        break;
                    case 1: System.out.println("The computer is rock. You are rock. It is a draw");
                        break;
                    case 2: System.out.println("The computer is rock. You are paper. You won");
                        break;
                    default: System.out.println("Invalid input");
                }
                break;
            case 2:
                switch (b) {
                    case 0: System.out.println("The computer is paper. You are scissor. You won");
                        break;
                    case 1: System.out.println("The computer is paper. You are rock. Computer won");
                        break;
                    case 2: System.out.println("The computer is paper. You are paper. It is a draw");
                        break;
                    default: System.out.println("Invalid input");
                }
                break;
            }
    }
}
