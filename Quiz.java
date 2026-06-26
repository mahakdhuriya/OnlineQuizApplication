import java.util.Scanner;

public class Quiz {

    Question[] questions = {

        new Question(
                "Who developed Java?",
                "Microsoft",
                "Sun Microsystems",
                "Google",
                "IBM",
                'B'),

        new Question(
                "Which keyword is used for inheritance?",
                "this",
                "extends",
                "implements",
                "super",
                'B'),

        new Question(
                "Java is a ______ language.",
                "Machine",
                "Object-Oriented",
                "Assembly",
                "Procedural",
                'B'),

        new Question(
                "Which symbol ends a Java statement?",
                ":",
                ",",
                ";",
                ".",
                'C'),

        new Question(
                "Which company developed Windows?",
                "Apple",
                "Microsoft",
                "Google",
                "Oracle",
                'B')
    };

    public void startQuiz() {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        for (Question q : questions) {

            System.out.println("\n" + q.question);

            System.out.println("A. " + q.optionA);
            System.out.println("B. " + q.optionB);
            System.out.println("C. " + q.optionC);
            System.out.println("D. " + q.optionD);

            System.out.print("Enter Answer: ");

            char ans = Character.toUpperCase(sc.next().charAt(0));

            if (ans == q.answer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer : " + q.answer);
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Score : " + score + "/" + questions.length);

        double percentage = (score * 100.0) / questions.length;

        System.out.println("Percentage : " + percentage + "%");

        sc.close();
    }
}