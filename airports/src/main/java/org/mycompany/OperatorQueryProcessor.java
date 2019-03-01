package org.mycompany;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import operators.OperatorQuery;

@Component
public class OperatorQueryProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		OperatorQuery oq = new OperatorQuery();
		@SuppressWarnings("rawtypes")
		List oqplist = exchange.getMessage().getBody(List.class);

		if (oqplist.get(0) != null)
			oq.setOperator(oqplist.get(0).toString());
		if (oqplist.get(1) != null)
			oq.setOperatorType(oqplist.get(1).toString());

		exchange.getMessage().setBody(oq);

	}

}
