public class BasicNestedLoops{
	public static void main(String[]args)throws Exception{
		for (int x = 0;x<6;x++){
			for (int y=0;y<6;y++){
				System.out.print("( "+x+","+y+" )");
				System.out.println("\t");
			}
		}
	}
}