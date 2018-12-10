package com.ignacio1250.iwasoft.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ignacio1250.iwasoft.model.Recargas;

public interface RecargasRepository extends CrudRepository< Recargas, Integer>{
	@Query("select distinct(r.monto) from Recargas r")
	int[] findTarifas();
	
	@Query("select count(t) from Recargas t where t.monto= ?1")
	int findCountsTarifas(int tarifa);
	
	@Query("select distinct(s.company) from Recargas s where s.monto = ?1")
	String[] getCompany(int tarifa);
	
	@Query("select count(t) from Recargas t where t.company = ?1 and t.monto= ?2 ")
	int getAmountsByCompany(String company, int monto);
}
