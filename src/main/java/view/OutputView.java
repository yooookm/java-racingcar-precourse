package view;


import java.util.List;
import java.util.stream.Collectors;
import model.Car;

public class OutputView {
    public static void printRaceStatus(List<Car> cars) {
        cars.forEach(System.out::println);
        System.out.println();
    }

    public static void printWinners(List<Car> winners) {
        String winnerNames = winners.stream().map(Car::getCarName).collect(Collectors.joining(", "));
        System.out.println("최종 우승자 : " + winnerNames);
    }
}