package com.septaroutes.demo.Bus;

import com.septaroutes.demo.models.Bus;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus,Long>{


public List<Bus> findByName(String name);

public List<Bus> findAll(String name);
//
//	@Query("select b from Bus b where b.vehicleId like %?1%")

public List<Bus> findByVehicleId(String vehicleId);
//
//	//Methods
}
