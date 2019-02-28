package operators;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService 
public interface OperatorsService {

@WebMethod (action="http://localhost:8080/cxf/airports/operatorQuery")
	List<OperatorType> operatorQuery();
}
