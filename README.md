# SoftlineTestTask
## Задание 1
Напишите реализацию метода:
@param a – массив чисел, длина массива может быть больше 10млн.
@return массив чисел, в которых нeту дубликатов. Порядок чисел в оригинальном массиве должен быть сохранён.
Из дубликатов нужно оставлять последний элемент, например, для {2,1,4,2,3} правильное решение - {1,4,2,3}, а не {2,1,4,3}\
В случае, если во входном массиве есть элемент меньше 0, то нужно выдавать ошибку.
Например, для {2,3,-1,5} обработка должна закончиться ошибкой.

public static double[] task(double[] a) {   

}

## Задание 2
Посчитайте для каждой валюты разницу между самым большим и самым маленьким заказом типа DELIVERY. Верните результат вычисления для каждой валюты. Валюты в результате должны находиться в порядке возрастания этой разницы. 
Возвращает map вида [валюта (в порядке возрастания разницы) – разница между самым большим и маленьким заказом типа DELIVERY для валюты].
Если по какой-то валюте только один заказ, то он является и самым большим и самым маленьким и разница равна 0. \
#### Исходные данные - класс OrderService
#### Пример входных данных:
 * Order(DELIVERY, "EUR", 2000),
 * Order (DELIVERY, "USD", 15),
 * Order (DELIVERY, "RUB", 200),
 * Order (PICKUP, "RUB", 1250),
 * Order (DELIVERY, "USD", 35),
 * Order (PICKUP, "USD", 55),
 * Order (DELIVERY, "RUB", 100) \
#### Ожидаемый результат:
["EUR" -> 0.0, "USD" -> 20.0, "RUB" -> 100.0]
\
\
Map<String, Double> getMaxMinusMinDeliveryMapByCurrency(List<OrderData> orderDataList) {
		

}

