import java.util.Arrays;

public class LimGarden
{
	public static void main(String[] args)
	{
		Flower[] flower = {new Flower("abc","yellow",1), new Flower("mon","blue", 3),new Flower("flo3","red",5)};

		Tree[] tree = {new Tree("tree1", 1, 4),new Tree("tree2", 2, 4),new Tree("tree3", 1, 3)};

		Garden myGarden = new Garden(tree, flower);



		System.out.println(myGarden);


	}


}