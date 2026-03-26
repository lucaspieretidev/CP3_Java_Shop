package com.restaurant.orders.exposure;

import com.restaurant.orders.application.OrderApplicationService;
import com.restaurant.orders.dto.AddItemCommand;
import com.restaurant.orders.dto.InitiateOrderCommand;
import com.restaurant.orders.dto.RemoveItemCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderApplicationService service;

    public OrderController(OrderApplicationService service) {
        this.service = service;
    }

    @PostMapping("/initiation")
    public ResponseEntity<String> initiate(@RequestBody InitiateOrderCommand command) {

        return ResponseEntity.ok(service.initiateOrder(command));
    }

    @PostMapping("/items/addition")
    public ResponseEntity<String> addItem(@RequestBody AddItemCommand command) {

        return ResponseEntity.ok(service.addItem(command));
    }

    @PostMapping("/items/removal")
    public ResponseEntity<String> removeItem(@RequestBody RemoveItemCommand command) {

        return ResponseEntity.ok(service.removeItem(command));
    }

    @PostMapping("/confirmation")
    public ResponseEntity<String> confirm() {

        return ResponseEntity.ok(service.confirmOrder());
    }

    @PostMapping("/preparation/start")
    public ResponseEntity<String> startPreparation() {

        return ResponseEntity.ok(service.startPreparation());
    }

    @PostMapping("/preparation/finish")
    public ResponseEntity<String> finishPreparation() {

        return ResponseEntity.ok(service.finishPreparation());
    }

    @PostMapping("/delivery")
    public ResponseEntity<String> deliver() {

        return ResponseEntity.ok(service.deliverOrder());
    }

    @PostMapping("/cancellation")
    public ResponseEntity<String> cancel() {

        return ResponseEntity.ok(service.cancelOrder());
    }
}