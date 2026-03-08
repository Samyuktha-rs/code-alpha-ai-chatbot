import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class ChatBot {

    public static String getResponse(String input) {

        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi") || input.contains("hey")) {
            return "Hello! How can I assist you today?";
        }

        else if (input.contains("how are you")) {
            return "I am doing great! Thanks for asking.";
        }

        else if (input.contains("your name")) {
            return "My name is Java AI ChatBot.";
        }

        else if (input.contains("time")) {
            return "Current time is: " + LocalTime.now();
        }

        else if (input.contains("date")) {
            return "Today's date is: " + LocalDate.now();
        }

        else if (input.contains("java")) {
            return "Java is a popular object-oriented programming language.";
        }

        else if (input.contains("python")) {
            return "Python is widely used for AI, data science and automation.";
        }

        else if (input.contains("programming")) {
            return "Programming is the process of writing instructions for computers.";
        }

        else if (input.contains("help")) {
            return "You can ask me about programming, date, time or general questions.";
        }

        else if (input.contains("bye") || input.contains("exit")) {
            return "Goodbye! Have a great day!";
        }

        else {
            return "That's interesting! Tell me more about it.";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("AI ChatBot: Hello! I am your assistant.");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            String userInput = sc.nextLine();

            String response = getResponse(userInput);

            System.out.println("Bot: " + response);

            if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("exit")) {
                break;
            }
        }

        sc.close();
    }
}