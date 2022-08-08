package Interview1.task2;

import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @param a – массив чисел, длина массива может быть больше 10млн.
 * @return массив чисел, в которых нeту дубликатов. Порядок чисел в оригинальном массиве должен быть сохранён.
 * Из дубликатов нужно оставлять последний элемент, например, для {2,1,4,2,3} правильное решение - {1,4,2,3}, а не {2,1,4,3}

В случае, если во входном массиве есть элемент меньше 0, то нужно выдавать ошибку.
Например, для {2,3,-1,5} обработка должна закончиться ошибкой.
 *
public static double[] task(double[] a) {

}
*/

public class Main {
    public static void main(String[] args) {
        double[] a = new double[10000000];


    }

    public static double[] task(double[] a)  {

        Set<Double> set = new LinkedHashSet<>();
        for(int i =0;i<a.length;i++){
            if(a[i]<0){
                throw new IllegalArgumentException("Negative Elements in array");

            }
            else if(set.contains(a[i])) {
                set.remove(a[i]);
                set.add(a[i]);
            }
            else
                set.add(a[i]);
        }

        a = set.stream().mapToDouble(Double::doubleValue).toArray();
        return a;
    }

}
