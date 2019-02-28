package operators;

import java.util.ArrayList;
import java.util.List;


public class Operators {
	
	private List <OperatorType> operator;
	
	public List getOperator() {
		
		if (operator == null) {
			operator = new ArrayList<OperatorType>();
        }
		
		return operator;
	}
	
	public void setOperator (OperatorType o) {
		
		if (operator == null) {
			operator = new ArrayList<OperatorType>();
        }
		
		operator.add(o);
		
	}

}
