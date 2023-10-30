package tacos.data;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

import org.springframework.data.repository.Repository;
import tacos.TacoOrder;
public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
//    TacoOrder save(TacoOrder order);
}
