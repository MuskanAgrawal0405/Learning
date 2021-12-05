package com.dsc.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dsc.bean.DoubleValuedDS;

@Repository
public interface DatabasePersistance extends JpaRepository<DoubleValuedDS, Integer>{
//	public void add();
	
}
