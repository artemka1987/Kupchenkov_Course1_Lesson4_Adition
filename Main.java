import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[0];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = scanner.next();

        //Вставляем уникальные символы в массив
        for (int i = 0; i < str.length(); i++){
            if (isInclude(array, str.codePointAt(i))) {
                int[] tmpArray = new int[array.length + 1];
                System.arraycopy(array, 0, tmpArray, 0, array.length);
                tmpArray[tmpArray.length - 1] = str.codePointAt(i);
                array = tmpArray;
            }
        }

        //Выводим результат
        System.out.println("Количество уникальных символов в строке \"" + str + "\" = " + array.length);
        System.out.print("Список символов: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(String.valueOf(Character.toChars(array[i])));
        }
        
    }


    // Метод возвращает необходимость вставки уникального символа
    private static boolean isInclude(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if (array[i] == value)return false;
        }
        return true;
    }

}
