class Tree
{
	//3 attributes of Tree
	private String type;
	private int height;
	private int age;

	//constructor with 3 parameters
	public Tree(String type, int height, int age)
	{
		this.type = type;
		this.height = height;
		this.age = age;
	}

	//mutators (setter)
	public void setType(String type)
	{
		this.type = type;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	//accessor (getter)
	public String getType()
	{
		return this.type;
	}

	public int getHeight()
	{
		return this.height;
	}

	public int getAge()
	{
		return this.age;
	}




}