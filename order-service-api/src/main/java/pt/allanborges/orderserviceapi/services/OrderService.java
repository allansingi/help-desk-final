package pt.allanborges.orderserviceapi.services;

import models.requests.CreateOrderRequest;
import models.requests.UpdateOrderRequest;
import models.responses.OrderResponse;
import org.springframework.data.domain.Page;
import pt.allanborges.orderserviceapi.entities.Order;

import java.util.List;

public interface OrderService {

    Order findById(final Long id);

    void save(CreateOrderRequest request);

    OrderResponse update(Long id, UpdateOrderRequest request);

    void deleteById(final Long id);

    List<Order> findAll();

    Page<Order> findAllPaginated(Integer page, Integer linesPerPage, String direction, String orderBy);
}