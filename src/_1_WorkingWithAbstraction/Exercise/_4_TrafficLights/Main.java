package _1_WorkingWithAbstraction.Exercise._4_TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> colors = Arrays.stream(scanner.nextLine().split(" ")).toList();
        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String color : colors) {
            Color currentColor = Color.valueOf(color);
            TrafficLight currentTrafficLight = new TrafficLight(currentColor);
            trafficLights.add(currentTrafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) { // one rotation
            for (TrafficLight trafficLight : trafficLights){ //each traffic light
                trafficLight.changeColor();
                System.out.print(trafficLight.getCurrentColor() + " ");
            }
            System.out.println();

        }
    }
}
