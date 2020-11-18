class Garden
{

	//attribute of a GARDEN -> the garden contains tree(s) and flower(s)
	private Tree[] tree;
	private Flower[] flower;

	//constructor
	public Garden(Tree[] tree, Flower[] flower)
	{
		this.tree = tree;
		this.flower = flower;
	}

	//mutators  -> to set the tree, need to pass a new Tree[] as parameter
	public void setTree(Tree[] tree)
	{
		this.tree = tree;
	}

	public void setFlower(Flower[] flower)
	{
		this.flower = flower;
	}

	//accessor
	public Tree[] getTree()
	{
		return this.tree;
	}

	public Flower[] getFlower()
	{
		return this.flower;
	}


	//overriding method that return the Flower and Tree objects details
	public String toString()
	{
		String x = "";

		String y = "";

		for(Flower f: this.flower)
		{
			x += ("Type: " + f.getType() + "\t" + "Height: " +f.getHeight() +"\t" +" Colour: " + f.getColour() +"\n") ;
		}

		for(Tree t: this.tree)
		{
			y += ("Type: " + t.getType() + "\t" + "Height: " +t.getHeight() +"\t" +" Age: " + t.getAge() +"\n");
		}

		return "Flowers: " + "\n" + x + "Tree: " +"\n" + y;

	}


}