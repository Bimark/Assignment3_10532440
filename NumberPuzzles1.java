public class NumberPuzzles1{
	public static void main(String[]args) throws Exception{
		for (int x = 0;x<=10000;x++){
			for (int y=0;y<=10000;y++){
				if (x+y==60 && x-y ==14){
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}
}