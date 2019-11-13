import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeizeTheFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("#");
        int water = Integer.parseInt(scanner.nextLine());
        List<String> fire = new ArrayList<>();
        int fireCount = 0;
        double effort = 0;
        List<String> cells = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            fire.add(input[i]);
        }

        for (int i = 0; i < fire.size(); i++) {
            String[] temp = fire.get(i).split(" = ");
            for (int j = 0; j < temp.length -1; j++) {
                if (temp[0].equals("High")) {
                    if (Integer.parseInt(temp[1]) >= 81 && Integer.parseInt(temp[1]) <= 125) {
                        if (Integer.parseInt(temp[1]) <= water) {
                            water -= Integer.parseInt(temp[1]);
                            fireCount += Integer.parseInt(temp[1]);
                            effort += Integer.parseInt(temp[1]) * 0.25;
                            cells.add(temp[1]);
                        }
                    }
                } else if (temp[0].equals("Medium")) {
                    if (Integer.parseInt(temp[1]) >= 51 && Integer.parseInt(temp[1]) <= 80) {
                        if (Integer.parseInt(temp[1]) <= water) {
                            water -= Integer.parseInt(temp[1]);
                            fireCount += Integer.parseInt(temp[1]);
                            effort += Integer.parseInt(temp[1]) * 0.25;
                            cells.add(temp[1]);
                        }
                    }
                } else if (temp[0].equals("Low")) {
                    if (Integer.parseInt(temp[1]) >= 1 && Integer.parseInt(temp[1]) <= 50) {
                        if (Integer.parseInt(temp[1]) <= water) {
                            water -= Integer.parseInt(temp[1]);
                            fireCount += Integer.parseInt(temp[1]);
                            effort += Integer.parseInt(temp[1]) * 0.25;
                            cells.add(temp[1]);
                        }
                    }
                }

            }
        }
        System.out.println("Cells: ");
        for (String cell : cells) {
            System.out.printf(" - %s%n",cell);
        }
        System.out.printf("Effort: %.2f%n", effort);
        System.out.printf("Total Fire: %d", fireCount);
    }
}
