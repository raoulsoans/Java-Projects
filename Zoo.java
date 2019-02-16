
public class Zoo { //start of Zoo class
	
	private String officialName;
	private String officialLocation;
	private String officialSize;
	private double annualCost;
	private double numAnnualVisitors;
	private double ticketPricePerPerson;
	private double annualProfit;
	private double annualIncome;
	
	public Zoo(){ //default constructor
		officialName = "NoName";
		officialLocation = "NoLocation";
		officialSize = "noSize";
		annualCost = 0;
		numAnnualVisitors = 0;
		ticketPricePerPerson = 0;
		annualProfit = 0;
		annualIncome = 0;
	}
	
	public Zoo(String name, String location, String size, double  ticketPrice, double annualVisitors, double yearlyCost){
		
		setName(name);
		setLocation(location);
		setSize(size);
		setAnnualCost(yearlyCost);
		setAnnualVisitors(annualVisitors);
		setTicketPrice(ticketPrice);
		computeAnnualIncome();
		computeAnnualProfit();
		
		
		
	}
	
	public void setName(String zooName){ //mutator for the name of the zoo
		officialName = zooName;
		
	} 
	public String getName(){ //accessor for name of zoo
		return officialName;
	}
	
	
	public void setLocation(String zooLocation){ //mutator for the location of the zoo
		officialLocation = zooLocation;
		
	}
	public String getLocation(){ //accessor for the location of the zoo
		return officialLocation;
	}
	
	
	public void setSize(String zooSize){ //mutator for the size of the zoo
		officialSize = zooSize;
		
	}
	public String getSize(){ //accessor for the size of the zoo
		return officialSize;
		
	}
	
	
	public void setAnnualCost(double yearlyCost){ //mutator for the cost of the zoo
		annualCost = yearlyCost;
	}
	public double getAnnualCost(){ //accessor for the cost of the zoo (for testing only, not for use)
		return annualCost;
	}
	
	
	public void setTicketPrice(double ticketPrice){ //mutator for the ticket price per person
		ticketPricePerPerson = ticketPrice;
		
	}
	public double getTicketPrice(){ //accessor for the ticket price per person
		return ticketPricePerPerson;
	}
	
	
	public void setAnnualVisitors(double annualVisitors){ //mutator for the annual visitors
		numAnnualVisitors = annualVisitors;
		
	}
	public double getAnnualVisitors(){ //accessor for the annual visitors
		return numAnnualVisitors;
	}
	
	
	public void computeAnnualIncome(){ //mutator for annual income, sets it equal to the # of annual visitor multiplied by the ticket price per person
		annualIncome = numAnnualVisitors * ticketPricePerPerson;
		
	}
	public double getAnnualIncome(){ //accessor for annual income
		return annualIncome;
	}
	
	
	public void computeAnnualProfit(){ //mutator for profit, setting it equal to annual income minus annual cost
		annualProfit = annualIncome-annualCost;
		
	}
	public double getAnnualProfit(){ //accessor for annual profit
		return annualProfit;
	}

}
