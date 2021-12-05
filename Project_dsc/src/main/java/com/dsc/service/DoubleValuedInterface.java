//package com.dsc.service;
//import java.util.Optional;
//
//import org.springframework.stereotype.Service;
//
//import com.dsc.bean.DoubleValuedDS;
//
//@Service
//public interface DoubleValuedInterface {
//	public Optional<DoubleValuedDS> findInDatabase(String key);
//}


package com.dsc.service;



import com.dsc.bean.DoubleValuedDS;

public interface DoubleValuedInterface {
	
	public DoubleValuedDS findInDatabase(Integer key);
	public boolean addInDatabase(DoubleValuedDS ds);
}