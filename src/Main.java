public class Main {
    public static void main(String[] args) {
//        int number = 10;
////         TASK 1

        int[] arr = {45, 78, -15, 12, 34, 6, 91, 7, -2, -45};
//        int max = 0;
//        int min = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (max <= arr[i]){
//                max = arr[i];
//            }
//            else if (min >= arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//
////        TASK 2
//        int[] num = new int[10];
//        int[] num2 = new int[10];
//        int index1 = 0;
//        int index2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 2 != 0){
//                num[index1] = arr[i];
//                index1++;
//            }
//            else {
//                num2[index2] = arr[i];
//                index2++;
//            }
//        }
//        System.out.println("Нечетные числа: ");
//        for (int i = 0 ; i < num.length; i++) {
//            if(num[i] == 0){
//                continue;
//            }
//            System.out.println(num[i]);
//        }
//        System.out.println("Четные числа: ");
//        for (int i = 0 ; i < num2.length; i++) {
//            if(num2[i] == 0){
//                continue;
//            }
//            System.out.println(num2[i]);
//        }

////       TASK 3

//        int max = 0;
//        int min = 100;
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            int temp = arr[i];
//            while (temp % 10 != 0){
//                count++;
//                temp = temp/10;
//            }
//            if(count > max){
//                max = count;
//            } else if(count < min){
//                min = count;
//            }
//        }
//        System.out.println("Самое длинное число: ");
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            int count = 0;
//            if (temp < 0){
//                temp = -temp;
//            }
//            while (temp > 0){
//                temp = temp/10;
//                count++;
//            }
//            if (count == max){
//                System.out.println(arr[i]);
//            }
//        }
//        System.out.println("Самое короткое число: ");
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            int count = 0;
//            if (temp < 0){
//                temp = -temp;
//            }
//            while (temp > 0){
//                temp = temp/10;
//                count++;
//            }
//            if (count == min){
//                System.out.println(arr[i]);
//            }
//        }

        /// TASK 4

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            if(temp<arr[i]){
                System.out.println(arr[i]);
                temp = arr[i];
            }

        }

//
//        int[] array = new int[10];
//
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 2;
//        array[3] = 2;
//        array[4] = 2;
//
//        for(int element : array) {
//            element = element + 5;
//            System.out.println(element);
//        }

//        int[] array = {4,7,3,2,1,9,8,6,5};
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - i - 1; j++) {
//                if (array[j] > array[j + 1]){
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        int target = 7;
//
//        int start = 0;
//        int end = array.length - 1;
//
//        while (start <= end){
//            int mid = (start + end) / 2;
//            if (array[mid] == target){
//                System.out.println("Element found at index " + mid);
//                break;
//            } else if (array[mid] < target) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }


//        while (start <= end){
//            int mid = start +(end - start) / 2;
//            if (array[mid] == target){
//                System.out.println("Found at index " + mid);
//                break;
//            } else if (array[mid] < target) {
//                start = mid + 1;
//            }
//            else {
//                end = mid - 1;
//                System.out.println(mid);
//                break;
//            }
//        }

//        for (int i : array) {
//            System.out.print(i);
//        }

//        int i = array[1];

//        for (int i = 0, j = 1; i < array.length; i++, j = j + 5){
//            array[i] = j;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " ");
//        }
    }
}