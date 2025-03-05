import java.io.*;
public class PracticeProblem {
	
	public static void main(String args[]) {
	
	}

	public static String readFile(String filename){
		FileReader inputStream= null;
		String b="";
		try{
			inputStream= new FileReader(filename);
			int c;
			while ((c = inputStream.read()) != -1) {
			b = b+(char)c;
		}
	}
		catch (IOException e) {
			System.out.println(e);
		}
	finally {
			try {
			if (inputStream != null) {
				inputStream.close();
				}
			}
			catch(IOException e) {
				System.out.println(e);
				}
	}
	return b;
}
}
