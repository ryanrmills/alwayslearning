public class chicken {
    public static void main(String[] args){
        int numOfChickens = 3;
        double weightOfChickens = 5.5;
        boolean tractorPresent = false; 

        System.out.println("Chicken:");
        System.out.println(numOfChickens);
        System.out.println("Bacon (kg):");
        System.out.println(weightOfChickens);
        System.out.println("Tractor:");
        if (!tractorPresent) {
            System.out.println("None!");
        }
    }
}