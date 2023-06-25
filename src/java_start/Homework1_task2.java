public class Homework1_task2 {
    /*
    Вывести все простые числа от 1 до 1000
     */
    public static void main(String[] args) {
        int[] arr1 = arr(1, 1000);
        int count = 0;
        for (int i = 0; i < arr1.length-1; i++) {
            if (is_simple(arr1[i])){
              System.out.println(arr1[i]);
              count += 1;
            }
        }
        System.out.printf("Всего простых чисел: %s", count);
    }
    static boolean is_simple(int num){
//        проверяем является ли число простым
      int count =0;
        for (int i = 1; i < num+1; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        if (count == 2){
            return true;
        }else {
            return false;
        }
    }
    static int[] arr (int a, int b) {
//        формируем массив из чисел от 1 до 1000
        a = 1;
        b = 1000;
        int arr[] = new int[b];
        for (int i = 0; i < b - 1; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
