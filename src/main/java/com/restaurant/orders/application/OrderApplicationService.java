package com.restaurant.orders.application;

import com.restaurant.orders.domain.Order;
import com.restaurant.orders.domain.OrderItem;
import com.restaurant.orders.dto.AddItemCommand;
import com.restaurant.orders.dto.InitiateOrderCommand;
import com.restaurant.orders.dto.RemoveItemCommand;
import org.springframework.stereotype.Service;

@Service
public class OrderApplicationService {

    public String initiateOrder(InitiateOrderCommand command) {

        Order order = new Order();

        order.initiateOrder(command.getCustomer());

        return "Pedido iniciado";
    }

    public String addItem(AddItemCommand command) {

        Order order = new Order();

        order.addItem(new OrderItem(command.getName(), command.getQuantity()));

        return "Item adicionado";
    }

    public String removeItem(RemoveItemCommand command) {

        Order order = new Order();

        order.removeItem(command.getName());

        return "Item removido";
    }

    public String confirmOrder() {

        Order order = new Order();

        order.confirmOrder();

        return "Pedido confirmado";
    }

    public String startPreparation() {

        Order order = new Order();

        order.startPreparation();

        return "Iniciando preparação";
    }

    public String finishPreparation() {

        Order order = new Order();

        order.finishPreparation();

        return "Preparação fininalizada";
    }

    public String deliverOrder() {

        Order order = new Order();

        order.deliverOrder();

        return "Pedido entregue";
    }

    public String cancelOrder() {

        Order order = new Order();

        order.cancelOrder();

        return "Pedido cancelado";
    }

}