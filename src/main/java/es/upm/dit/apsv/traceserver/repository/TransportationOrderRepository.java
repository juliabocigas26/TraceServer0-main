package es.upm.dit.apsv.traceserver.repository;

import org.springframework.data.repository.CrudRepository;
import es.upm.dit.apsv.traceserver.model.TransportationOrder;

public interface TransportationOrderRepository extends CrudRepository<TransportationOrder, String> {

    TransportationOrder findByTruckAndSt(String truck, int st);

}