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
            String job = in.next();
            boolean hasJob = job.toLowerCase().equals("y") || job.toLowerCase().equals("yes");
            int salary = 0;
            if (hasJob) {
                System.out.println("How much do you make?");
                salary = in.nextInt();
            }

            Participant participant = new Participant(i, sex, hasJob, salary);
            participants[i] = participant;
        }
        int numMen = 0, numWoman = 0, numMenWork = 0, numWomanWork = 0, totalSalMen = 0, totalSalWoman = 0;

        for (Participant part : participants) {
            if (part.getSex() == 'M' || part.getSex() == 'm') {
                numMen++;
                if (part.isHasJob()) {
                    numMenWork++;
                    totalSalMen += part.getSalary();
                }
            } else {
                numWoman++;
                if(part.isHasJob()) {
                    numWomanWork++;
                    totalSalWoman += part.getSalary();
                }
            }
        }

        System.out.println("The percentage of men is: " + percentage(numMen, participants.length));
        System.out.println("The percentage of woman is: " + percentage(numWoman, participants.length));
        System.out.println("The percentage of men who work is : " + percentage(numMenWork, numMen));
        System.out.println("and their avg salary is : " + totalSalMen / numMenWork);
        System.out.println("The percentage of woman who work is : " + percentage(numWomanWork, numWoman));
        System.out.println("and their avg salary is : " + totalSalWoman / numWomanWork);
    }

    public static float percentage(int value, int total) {
        return ((float) value / total) * 100;
    }
}
