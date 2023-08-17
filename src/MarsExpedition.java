import java.util.Scanner;
public class MarsExpedition {
    public MarsExpedition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Systems starting, please wait...");
        System.out.println("All systems running optimally.");
        System.out.println("Ready to go.");

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + ". Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are the team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people will be joining you on the expedition? (Please enter an integer.)");

        int teamSize = input.nextInt();
        input.nextLine();
        if (teamSize > 2){
            System.out.println("Team size is too large, only 2 members can accompany you.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("It is advised to bring a full team with you.");
            teamSize = 2;
        } else if (teamSize == 2){
            System.out.println("Good choices, this is a good team.");
        }

        System.out.println("You may bring one snack with you what would you like?");
        String snack = input.nextLine();
        System.out.println("You chose " + snack + " that is a good choice!");

        System.out.println("What vehicle would you like on you expedition" +
                            "\n 1: Speeder Bikes" +
                            "\n 2: Mars Buggy" +
                            "\n 3: Jet Packs");
        int vehicle = input.nextInt();
        String vehicleChoice;
        if (vehicle == 1) {
            System.out.println("You have chosen Speeder Bikes good choice.");
            vehicleChoice = "Speeder Bikes";
        } else if (vehicle == 2) {
            System.out.println("You have chosen Mars Buggy good choice.");
            vehicleChoice = "Mars Buggy";
        } else if (vehicle == 3) {
            System.out.println("You have chosen Jet Packs good choice.");
            vehicleChoice = "Jet Packs";
        } else {
            System.out.println("You have chosen to walk");
            vehicleChoice = "Walking";
        }

        System.out.println("Exploration choices finalized." +
                            "\n The team will be lead by " + name + " using " + vehicleChoice + " and " + snack + " have been packed for the crew." +
                            "\n Stand by for deployment in..." +
                            "\n 5..." +
                            "\n 4..." +
                            "\n 3..." +
                            "\n 2..." +
                            "\n 1..." +
                            "\n Deploying.");

    }
}
