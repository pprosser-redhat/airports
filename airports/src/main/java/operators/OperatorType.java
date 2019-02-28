package operators;

public class OperatorType {
	private String fightOperator;
	private String flightOperatorType;
	private String updateDate;
	public String getFightOperator() {
		return fightOperator;
	}
	public void setFightOperator(String fightOperator) {
		this.fightOperator = fightOperator;
	}
	public String getFlightOperatorType() {
		return flightOperatorType;
	}
	public void setFlightOperatorType(String flightOperatorType) {
		this.flightOperatorType = flightOperatorType;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "OperatorType [fightOperator=" + fightOperator + ", flightOperatorType=" + flightOperatorType
				+ ", updateDate=" + updateDate + "]";
	}
	

	
}
