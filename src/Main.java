import java.util.HashMap;
import java.util.Map;

public class Main {

    static String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {
        Map<Character, Integer> litters = new HashMap<>();
        lorem = lorem.toLowerCase().replaceAll("[ ,.]", "");
        for (int i = 0; i < lorem.length(); i++) { //идем по строке
            if (!litters.containsKey(lorem.charAt(i))) { //если char(i) нет в мап
                litters.put(lorem.charAt(i), 1); //добавляем char(i) в мап со значением 1
            }else { //иначе переопределяем значение (+1)
                litters.put(lorem.charAt(i), litters.get(lorem.charAt(i)) + 1);
            }
        }
        int max = -1;
        char keyMax = 0;
        int min = Integer.MAX_VALUE;
        char keyMin = 0;
        for(Map.Entry<Character, Integer> kv : litters.entrySet()){ //идем по мап
            System.out.println(kv.getKey() + " = " + kv.getValue());
            if(kv.getValue() > max){
                max = kv.getValue();
                keyMax = kv.getKey();
            }
            if(kv.getValue() < min){
                min = kv.getValue();
                keyMin = kv.getKey();
            }
        }
        System.out.println("максимальное количество повторений у буквы : " + keyMax +" - "+ max);
        System.out.println("минимальное количество повторений у буквы : " + keyMin +" - "+ min);
    }
}
