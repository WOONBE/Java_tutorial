//Business Logic
package com.in28minutes.learnspringframework.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.sample.enterprise.flow.data.DataService;

@Component
public class BusinessService {
	@Autowired
	public DataService dataService;

	public long carculateSum() {
		List<Integer> data = dataService.retrieveData();
		return data.stream().reduce(Integer::sum).get();
	}
}