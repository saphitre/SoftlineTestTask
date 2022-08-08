package Interview1.task1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        OrderService.OrderData order = new OrderService.OrderData(OrderService.Type.DELIVERY, "EUR", 2000L);
        OrderService.OrderData  order1 = new OrderService.OrderData(OrderService.Type.DELIVERY, "USD", 15L);
        OrderService.OrderData  order2 = new OrderService.OrderData(OrderService.Type.DELIVERY, "RUB", 200L);
        OrderService.OrderData  order3 = new OrderService.OrderData(OrderService.Type.PICKUP, "RUB", 1250L);
        OrderService.OrderData  order4 = new OrderService.OrderData(OrderService.Type.DELIVERY, "USD", 35L);
        OrderService.OrderData  order5 = new OrderService.OrderData(OrderService.Type.PICKUP, "USD", 55L);
        OrderService.OrderData  order6 = new OrderService.OrderData(OrderService.Type.DELIVERY, "RUB", 100L);

        List<OrderService.OrderData> orderData = new ArrayList<>();
        orderData.add(order);
        orderData.add(order1);
        orderData.add(order2);
        orderData.add(order3);
        orderData.add(order4);
        orderData.add(order5);
        orderData.add(order6);

        System.out.println(getMaxMinusMinDeliveryMapByCurrency(orderData));
    }

     static Map<String, Double> getMaxMinusMinDeliveryMapByCurrency(List< OrderService.OrderData > orderData) {
        Map<String, Double> map=new LinkedHashMap<>();
        map= orderData.stream()
                .filter(r->r.getType().equals(OrderService.Type.DELIVERY))
                .collect(Collectors.groupingBy(r->r.getCurrency(),Collectors.averagingLong(r->r.getAmount())));
        return map;
    }
}
