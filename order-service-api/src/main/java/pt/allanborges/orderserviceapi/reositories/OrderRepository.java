package pt.allanborges.orderserviceapi.reositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.allanborges.orderserviceapi.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}