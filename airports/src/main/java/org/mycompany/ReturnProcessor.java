package org.mycompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import operators.OperatorType;

@Component
public class ReturnProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		
		// Create JAXB list of operator types
		
		List<operators.OperatorType> operators = new ArrayList();
		
		
		// Unmarshalling the response to JSON creates a list of map objects
		// Need to iterate over the map, and create an operate type
		@SuppressWarnings("unchecked")
		List<Map> input = (List<Map>) exchange.getMessage().getBody(List.class);
		
		for (Map operator : input) {
			OperatorType op = new OperatorType();
			op.setFightOperator((String) operator.get("flight_operator"));
			op.setFlightOperatorType((String) operator.get("flight_operator_type"));
			op.setUpdateDate(((Long) operator.get("update_date")).toString());
			
			// SOAP service expecting a list (governed by the unbounded sequence in the schema) therefore
			// adding the operatortype to the operators list created above
			
			operators.add(op);
		}
		
		// The root level of the schema has a sequence (governing the need for a list), therefore the 
		// arraylist of operator types needs to be added to the root level sequence array list
		
		List response = new ArrayList();
		response.add(operators);
		exchange.getMessage().setBody(response);
	}
	
	

}
