package Class;

public class Box1 {
double width;
double height ;
double depth;
double volume()
{
	return width*height*depth;
}
}
class BoxDemo4 {
	public static void main(String args[])
	{
		Box1 mybox1 = new Box1();
		Box1 mybox2 = new Box1();
		double vol;
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		mybox2.width = 3;
		mybox1.height = 6;
		mybox1.depth = 9;
		vol = mybox1.volume();
		System.out.println("Volume is" +vol);
		vol = mybox2.volume();
		System.out.println("Volume is"+vol);
		
	}
}