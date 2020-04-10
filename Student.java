class Student {
	String index;
	String firstName;
	String lastName;
	int grades[]= new int [];

	//TODO constructor
	Student(String index,String firstName, String lastName)
	{
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	//TODO seters & getters
	public void setIndex(String index)
	{
		this.index=index;
	}
	public void setFN(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLN(String lastName)
	{
		this.lastName=lastName;
	}
	public String getIndex()
	{
		return index;
	}
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public double getAverage() {
		//TODO
		int sum = 0;
    		for (int i : grades) {
        	sum += i;
    		}
		return (double) sum/ grades.lenght;
	}

	public int ECTSCredits() {
		//TODO
		return grades.lenght * 6;
	}
}
