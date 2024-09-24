package pt.allanborges.orderserviceapi.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import models.requests.CreateOrderRequest;
import org.springframework.stereotype.Service;
import pt.allanborges.orderserviceapi.mapper.OrderMapper;
import pt.allanborges.orderserviceapi.reositories.OrderRepository;
import pt.allanborges.orderserviceapi.services.OrderService;

@Log4j2
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;
    private final OrderMapper mapper;


    @Override
    public void save(CreateOrderRequest request) {
        final var entity = repository.save(mapper.fromRequest(request));
        log.info("Order created: {}", entity);
    }

}