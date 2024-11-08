package hh;

import java.util.ArrayList;
import java.util.stream.Collectors;

class SignificantTemperatureDrop {

    public String findDrops(String input) {

        String[] mas = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < mas.length; i++) {
            int prev = Integer.parseInt(mas[i - 1]);
            int curr = Integer.parseInt(mas[i]);
            if (prev - curr > 2) {
                list.add(i);
            }
        }
        return list.isEmpty() ? "Нет значений" : list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {

        System.out.println(new SignificantTemperatureDrop().findDrops("0 5 2 -5 -1"));
        System.out.println(new SignificantTemperatureDrop().findDrops("1 4 2"));

    }
}
