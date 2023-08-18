import java.util.*;

public class FindingList {
    public FindingList() throws InterruptedException {
        Thread.sleep(500);
        ArrayList<String> rocks = new ArrayList<String>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");
        System.out.println("Information downloaded.");
        System.out.println(rocks);
        System.out.println("Non-rock detected now removing.");
        rocks.remove(3);
        System.out.println("Perfect");

        Thread.sleep(1000);
        HashMap<String, String> fossils = new HashMap<String, String>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded.");

        System.out.println("Which of the fossils would you like to learn more about? (Bird Fossil, Fish Fossil, or Tooth Fossil, spelling and spacing are important.)");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println(fossilChoice + "\nDescription: " + fossils.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println(fossilChoice + "\nDescription: " + fossils.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println(fossilChoice + "\nDescription: " + fossils.get(fossilChoice));
        }

        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<String>();
        supplies.add("Laser gun");
        supplies.add("Shovel");
        supplies.add("Mindflayer parasite remover");

        Iterator<String> itr = supplies.iterator();

        System.out.println("Supplies before expedition");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        supplies.remove("Shovel");

        Iterator<String> afterExpeditionItr = supplies.iterator();

        System.out.println("Supplies after expedition");
        while(afterExpeditionItr.hasNext()){
            System.out.println(afterExpeditionItr.next());
        }
    }
}