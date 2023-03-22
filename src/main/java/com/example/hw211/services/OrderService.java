package com.example.hw211.services;

import com.example.hw211.entities.Order;

import java.util.List;

public interface OrderService {

    List<Order> add(List<Integer> ids);

    List<Order> getAll();
}
