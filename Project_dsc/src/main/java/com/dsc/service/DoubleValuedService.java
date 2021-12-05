//package com.dsc.service;
//import java.util.Optional;
//
//import com.dsc.bean.DoubleValuedDS;
//import com.dsc.persistance.DatabasePersistance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//@Qualifier
//public class DoubleValuedService implements DoubleValuedInterface {
//@Autowired
//private DatabasePersistance dao;
//public Optional<DoubleValuedDS> findInDatabase(String key){
//	return dao.findById(key);
//}
//}

package com.dsc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsc.bean.DoubleValuedDS;
import com.dsc.persistance.DatabasePersistance;

@Service
public class DoubleValuedService implements DoubleValuedInterface {

	@Autowired
	private DatabasePersistance persistance;
	@Override
	public DoubleValuedDS findInDatabase(Integer key) {
		DoubleValuedDS ds= persistance.findById(key).get();
		return ds;
	}
	@Override
	public boolean addInDatabase(DoubleValuedDS ds) {
		try{
			persistance.save(ds);
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}