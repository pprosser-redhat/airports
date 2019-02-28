package operators;

import org.apache.camel.Converter;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class OperatorsTypeConverter {

	/**
	 * A TypeConverter to be used with Camel's convertBodyTo()
	 */
	/*
	 * @Converter public static org.apache.camel.converter.stream.InputStreamCache
	 * toInputStream(operators.Airports airports) {
	 * 
	 * org.apache.camel.converter.stream.InputStreamCache isc = new
	 * InputStreamCache(airports);
	 * 
	 * airports. operators.ObjectFactory of = new operators.ObjectFactory();
	 * operators.Airports ap = of.createAirports(); ObjectOutputStream oos = new
	 * ObjectOutputStream(); //ObjectInputStream ois = new ObjectInputStream();
	 * 
	 * 
	 * return new BufferedInputStream(); }
	 */

	@Converter
	public static java.util.List<List<operators.OperatorType>> toAirports(List<Map> input) {
		
		System.out.println(">>>>>>>>>>>>>>>>In TypeConverter " + input.toString());
		
		
		
//of.createAirportlist(airports);
		// ArrayList al = toAirports(input);
		/*
		 * JsonToJaxbTest.Album album = new JsonToJaxbTest.Album();
		 * 
		 * album.setArtist((String) input.get("artist")); album.setTitle((String)
		 * input.get("title")); album.setRating((String) input.get("rating"));
		 * album.setAccolades((String) input.get("accolades"));
		 */
		//OperatorQueryResponse airport = new OperatorQueryResponse();
		java.util.List<List<operators.OperatorType>> response = new ArrayList();
		
		List<operators.OperatorType> operatorsList = new ArrayList();
		
		// for X in.... input List
		// create new OperatorType
		// map -> target
		
		OperatorType op = new OperatorType();
		op.setFightOperator("Dave");
		op.setFlightOperatorType("Nothing");
		op.setUpdateDate("Now");
		operatorsList.add(op);
		
		response.add(operatorsList);		
		return response;
	}

}
