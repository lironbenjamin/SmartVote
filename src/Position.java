
public class Position {

	private String positionName;
	private String positionInfo;
	
	public Position(String name, String info){
		
		this.positionName = name;
		this.positionInfo = info;	
	}
	
	public String getPosition(){
		
		String posInfo;
		
		posInfo = "Position Name: " + positionName + "\n" + 
					"Position Description: " + positionInfo;
		
		return posInfo;
	}
	
	public String getPosName(){
		return positionName;
	}
}
