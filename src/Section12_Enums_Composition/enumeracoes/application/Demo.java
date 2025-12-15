package Section12_Enums_Composition.enumeracoes.application;

import Section12_Enums_Composition.enumeracoes.entities.Order;
import Section12_Enums_Composition.enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus order1 = OrderStatus.DELIVERED;

        OrderStatus order2 = OrderStatus.valueOf("DELIVERED"); //De String para ENUM

    }
}
