import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        System.out.println("How many participants?");
        Scanner in = new Scanner(System.in);
        int numPart = in.nextInt();
        Participant[] participants = new Participant[numPart];

        for (int i = 0; i < numPart; i++) {
            System.out.println("please enter the sex");
            char sex = in.next().charAt(0);
            System.out.println("do you have a job?");
            boolean hasJob = in.nextBoolean();
            int salary = 0;
            if (hasJob) {
                System.out.println("How much do you make?");
                salary = in.nextInt();
            }

            participants[i] = new Participant(i, sex, hasJob, salary);
        }
    }
}
