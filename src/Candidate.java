
public class Candidate {

	private String firstName;
	private String lastName;
	private Position position;
	private String party;
	private int age;
	private String experience;
	private String description;
	private int voteCount;



	public Candidate(String fName, String lName, Position p, String party, int age, String exp, String descp){

		this.firstName = fName;
		this.lastName = lName;
		this.party = party;
		this.age = age;
		this.position = p;
		this.experience = exp;
		this.description = descp;
	}
	
	public String getInfo(){
		String info;
		
		info = "NAME: " + firstName + " " + lastName + "\n" +
				"RUNNING FOR: " + position.getPosName() + "\n" +
				"PARTY: " + party + "\n" + 
				"AGE: " + age + "\n" +
				"PREVIOUS EXPERIENCE: " + experience + "\n" +
				lastName + "'s" + " POSITION ON ISSUES: " + "\n" + description;
		
		return info;
	}
	//Returns Candidate's First Name
	public String getFirstName(){
		
		return firstName;
	}
	
	//Returns Candidate's Last Name
	public String getLastName(){
		return lastName;
	}
	
	//Returns Candidate's Full Name
	public String getFullName(){
		return firstName + " " + lastName;
	}
	
	//Returns the Position object for the Candidate
	public Position getPosition(){
		return this.position;
	}
	
	//Adds to the vote count for the Candidate. Is called after the vote for the Candidate is finalized
	public void vote(){
		voteCount++;
	}
	
	//Returns the number of vote the Candidate currently has
	public int getVoteCount(){
		return voteCount;
	}
	
	


	

}