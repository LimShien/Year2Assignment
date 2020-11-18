class Flower
{
	//at least 2 attributes
	private String type;
	private String colour;
	private int height;

	//constructor (non blank)
	public Flower(String type, String colour, int height)
	{
		this.type = type;
		this.colour = colour;
		this.height = height;
	}

	//mutator (settter)
	public void setType(String type)
	{
		this.type = type;
	}

	public void setColour(String colour)
	{
		this.colour = colour;
	}

	public void setHeightF(int heightF)
	{
		this.height = height;
	}

	//accessor (getters)
	public String getType()
	{
		return this.type;
	}

	public String getColour()
	{
		return this.colour;
	}

	public int getHeight()
	{
		return this.height;
	}


}