import java.util.Scanner;
import java.util.ArrayList;

public class HackNC{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		process(s);

	}
	
	public static String presDesc = "The Constitution assigns the president two roles: chief executive of the federal\n"
			+ "government and Commander in Chief of the armed forces. As Commander in Chief, the president has\n"
			+ "the authority to send troops into combat, and is the only one who can decide whether to use nuclear weapons.\n"
			+ "As chief executive, he enforces laws, treaties, and court rulings; develops federal policies; prepares the national budget;\n"
			+ "and appoints federal officials. He also approves or vetoes acts of Congress and grants pardons.";
	
	public static String hrcExp = "Hillary Clinton has served as secretary of state, U.S. senator\n"
			+ "from New York, first lady of the United States, first lady of Arkansas, a\n"
			+ "practicing lawyer and law professor, and is an activist.";
	
	public static String hrcDescp = "	Immigration: We need comprehensive immigration reform with a path to full and equal\n"
			+ "	citizenship. If Congress won't act, I'll defend President Obama’s executive actions\n"
			+ "	—and I'll go even further to keep families together. I'll end family detention, close\n"
			+ "	private immigrant detention centers, and help more eligible people become naturalized.\n\n" +

			"	National Security: The president’s most important job is to keep us safe. That means maintaining a cutting-edge\n"
			+ " 	military and standing up to our rivals. I’ll also work with our allies to defeat ISIS, dismantle\n"
			+ " 	global terror networks, and harden defenses at home by launching an intelligence surge and keeping guns\n"
			+ " 	out of the hands of suspected terrorists.";
	
	public static String djtExp = "Donald Trump is a billionaire real estate mogul that has experience in reality  "
			+ "television. \n His background is mainly involved with bussiness and development. \n "
			+ "He has no prior experience directly in politics.";
	
	public static String djtDescp = "Immigration: We should establish new immigration controls to boost wages and to \n"
			+ "ensure that open jobs are offered to Americans. He hopes to protect the econnomic well-being of the lawful \n"
			+ "immigrants already living in the United States by curbing uncontrolled foreign worker admissions.\n\n"
						
			+ "National Security:  “I just wanna say that we're gonna come out with some plans in a very short time.\n"
			+ " We're gonna be building up our military, we're gonna make our military so big and so strong and \n"
			+ " great and it will be so powerful that I don't think we're ever going to have to use it.\n"
			+ " Nobody's gonna mess with us, that I can tell you, and we're going to have a president who's respected \n"
			+ "by Putin, who's respected by Iran, y'know?";
	
	public static String jsExp = "Jill Ellen Stein (born May 14, 1950) is an American physician,\n"
			+ " activist and politician. She is the Green Party's nominee for \n"
			+ "President of the United States in the 2016 election.";
	
	public static String jsDescp = "Immigration: She supports immigrant's rights and wants to halt deporation\n"
			+ " and detentions of law abiding undocumented immigrants. She also wants to demilitarize the border \n"
			+ "crossings throughout North America.\n\n"			
		
			+ "National Security: She beleives the threat of Islamic terrorism was created by the CIA\n"
			+ "and Saudi's and can be stopped by stopping the arming and funding of it.";
	
	public static String gjExp = "Gary Earl Johnson (born January 1, 1953) is an American businessman, \n"
			+ "author, politician, and the Libertarian Party nominee for President of the United States \n"
			+ "in the 2016 election. He served as the 29th Governor of New Mexico from 1995 to 2003\n"
			+ " as a member of the Republican Party.";
	
	public static String gjDescp = "Immigration: He supports comprehensive immigration reform and plans to make it\n"
			+ "as easy as possible for individuals without criminal records who want to come to the United State to \n"
			+ "work to get work visas.\n\n"
			
			+ "National Security: He plans to move quickly and decisively to cut off the funding on which violent\n"
			+ "extremists armies depend. He will repair relationships with our allies. And he will only send\n"
			+ "our soldiers to war when clearly authorized by Congress";
	
	public static String senDesc = "The citizens of each state elect two Senators to serve 6 years terms.\n"
			+ " The Senate as a whole has many duties and responsibilities. Some of these include writing\n"
			+ " and passing laws, approving many presidential appointments, and ratifying treaties\n"
			+ " with other countries.";
	
	public static String rbExp = "Richard Mauze Burr is a Republican member of the United States Senate\n"
			+ " from North Carolina. He was first elected to the Senate in 2004.Burr is seeking re-election\n"
			+ " to his seat in 2016. Burr previously was a member of the U.S. House of Representatives\n"
			+ " from North Carolina's 5th Congressional District from 1995 to 2005.";
	
	public static String rbDescp = "Immigration:I believe our first priority must be to ensure the integrity\n"
			+ " and security of our borders. Once we have done so, we need to make sure we have a legal\n"
			+ " immigration process that is understandable and consistent, because that is the only way\n"
			+ " we can ensure that the legal process for coming to America is followed.\n\n"
			
			+ "National SecurityRecent terror attacks against America and our allies are a sobering\n"
			+ " reminder of the global threats we face. As the Chairman of the Senate Intelligence Committee,\n"
			+ " I remain committed to defeating terrorism and ensuring that our troops, law enforcement,\n"
			+ " and intelligence professionals have the tools and support they need to keep America safe.";
	
	public static String drExp = "Deborah Koff Ross (born June 20, 1963) is an American lawyer and politician.\n"
			+ " A Democrat, Ross was a member of the North Carolina General Assembly, representing the state's \n"
			+ "thirty-eighth and then thirty-fourth House district, including Wake County, North Carolina.\n"
			+ " An attorney from Raleigh, North Carolina, Ross served five full terms and one partial term\n"
			+ " in the North Carolina House of Representatives.";
	
	public static String drDescp = "Immigration: She plans to offer eventual citizenship to \n"
			+ "unlawful immigrants.\n\n"
			
			+ "National Security: She believes that our national security is the strongest when \n"
			+ "we use all the tools at our disposal: a modern military, the most sophisticated and \n"
			+ "capable negotiators, and an intelligent community that will stay one step ahead \n"
			+ "of our enemies.";
	
	public static String shExp = "Sean Haugh is a 2016 Libertarian candidate seeking election \n"
			+ " to the U.S. Senate from North Carolina.";
	
	public static String shDescp = "Immigration: He supports a pathway to citizenship for illegal\n"
			+ "immigrants. He also supports free movement across borders instead of curbs on immigration.\n\n"
			
			+ "National Security: He opposes expanding the military and wants to repeal the Patriot act. \n"
			+ "He also wishes to stop drone warfare.";
	
	public static Position president = new Position("President", presDesc);
	public static Position senate = new Position("Senate", senDesc);
	
	
	
	public static void process(Scanner s){

		ArrayList<Integer> storeID = new ArrayList<Integer>();

		Candidate hClinton = new Candidate("Hillary", "Clinton", president, "Democrat", 69, hrcExp, hrcDescp);
		Candidate dTrump = new Candidate("Donald", "Trump", president, "Republican", 70, djtExp, djtDescp);
		Candidate jStein= new Candidate("Jill", "Stein", president, "Green", 66, jsExp, jsDescp);
		Candidate gJohnson= new Candidate("Gary", "Johnson", president, "Libertarian", 63, gjExp, gjDescp);
		
		Candidate rBurr = new Candidate("Richard", "Burr", senate, "Republican", 60, rbExp, rbDescp);
		Candidate dRoss = new Candidate("Deborah", "Ross", senate, "Democrat", 53, drExp, drDescp);
		Candidate sHaugh = new Candidate("Sean", "Haugh", senate, "Libertarian", 56, shExp, shDescp);
		
		Candidate[] presArray = {hClinton, dTrump, gJohnson, jStein};
		Candidate[] senArray = {dRoss, rBurr, sHaugh};

		int a = 0;
		
		int type = 0;
		int cand = 0;
		int presVote;
		int senVote;
		int userID;
		
		while (a < 10000)
		{
			presVote = -1;
			senVote = -1;
			userID = 0;

			while (userID == 0)
			{
				System.out.println("Enter a valid user ID: ");
				userID = s.nextInt();
				for (int i = 0; i < storeID.size(); i++)
				{
					if (userID == storeID.get(i))
					{
						System.out.println("User ID is already taken!");
						userID = 0;
						break;
					}
					if (i == storeID.size() - 1)
					{
						if (userID != storeID.get(storeID.size() - 1))
						{
							storeID.add(userID);
						}
					}
				}
			}
			if (userID < 0)
			{
				System.out.println("Admin entered code, results will print!\n\n");
				break;
			}
			
			while(type != 6 && cand != 6){
				System.out.println("Select a type of Candidate to view by entering the number of that category.");
				System.out.println("1. President\n" + "2. Senator");
				
				type = s.nextInt();
				
				if(type == 1){
					presVote = getPresInfo(presArray, s, presVote);
					
				}
				else if (type == 2){
					
				}
				
				
			}



			if (presVote > -1) //if the user voted for a president, add one to vote after user types quit.
			{
				presArray[presVote].vote();
			}
			if (senVote > -1) //if the user voted for a senator, add one to vote after user types quit.
			{
				senArray[senVote].vote();
			}
			a++;
		}

		System.out.println("Presidential candidate results: ");
		getResult(presArray);
		System.out.println("Senator candidate results: ");
		getResult(senArray);
	}


	public static void getResult(Candidate[] array) //takes the position array and prints out their name and number of votes.
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i].getFullName() + " has " + array[i].getVoteCount() + " votes");
		}
	}
	public static int getPresInfo(Candidate[] a, Scanner s, int presVote){
		
		int cand;
		int ansVote;
		int voteSelection = presVote;
		
		System.out.println("Which candidate would you like to learn about?");
		for (int i = 0; i < a.length; i++){
			System.out.println(i+1 + ") " + a[i].getFirstName());
		}
		
		cand = s.nextInt();
		
		System.out.println(a[cand-1].getInfo());
		
		System.out.println("\nWould you like to vote for this candidate? \n\n1. Yes\n2. No, go back to list of candidates");
		ansVote = s.nextInt();
		
		if(ansVote == 1){
			voteSelection = cand-1;
		}
		return voteSelection;
		
		
	}
	
}