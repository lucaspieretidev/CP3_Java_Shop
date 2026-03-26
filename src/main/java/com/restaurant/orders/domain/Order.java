package com.restaurant.orders.domain;

import com.restaurant.orders.enums.OrderStatus;


public class Order {

    private String customer;
    private OrderStatus status;

    public void initiateOrder(String customer) {
        this.customer = customer;
        this.status = OrderStatus.INITIATED;
        System.out.println("Pedido feito pelo consumidor: " + customer);
    }

    public void addItem(OrderItem item) {
        System.out.println("Item adicionado: " + item.getName() + " x" + item.getQuantity());
    }

    public void removeItem(String itemName) {
        System.out.println("Item removido: " + itemName);
    }

    public void confirmOrder() {
        this.status = OrderStatus.CONFIRMED;
        System.out.println("Pedido confirmado.");
    }

    public void startPreparation() {
        this.status = OrderStatus.IN_PREPARATION;
        System.out.println("Iniciando preparação.");
    }

    public void finishPreparation() {
        this.status = OrderStatus.READY;
        System.out.println("Pedido concluído. Iniciando preparação");
    }

    public void deliverOrder() {
        this.status = OrderStatus.DELIVERED;
        System.out.println("Pedido entregue.");
    }

    public void cancelOrder() {
        this.status = OrderStatus.CANCELLED;
        System.out.println("Pedido Cancelado.");
    }
}