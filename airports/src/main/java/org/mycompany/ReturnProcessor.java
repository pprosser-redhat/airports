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
		// TODO Auto-generated method stub
		List<operators.OperatorType> operators = new ArrayList();
		
		@SuppressWarnings("unchecked")
		List<Map> input = (List<Map>) exchange.getMessage().getBody(List.class);
		
		for (Map operator : input) {
			OperatorType op = new OperatorType();
			op.setFightOperator((String) operator.get("flight_operator"));
			op.setFlightOperatorType((String) operator.get("flight_operator_type"));
			op.setUpdateDate(((Long) operator.get("update_date")).toString());
			
			operators.add(op);
		}
		
		List response = new ArrayList();
		response.add(operators);
		exchange.getMessage().setBody(response);
	}
	
	

}
