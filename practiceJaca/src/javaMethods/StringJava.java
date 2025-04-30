package javaMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringJava {
	
	String s1="Ravi";
	
	int i=5;
	String j="6";

	public static void main(String[] args) {
		
	
		
		StringJava str=new StringJava();
		
		StringJava str2=new StringJava();
		
		String name=str.s1.concat(" Verma");
		
		System.out.println(str.s1.concat(" Verma"));
		
		System.out.println(name.toUpperCase());

		System.out.println(name.substring(1,3));
		
		System.out.println(name.toLowerCase());

		System.out.println(Integer.parseInt(str.j));
		
		String newName=str2.s1.concat(" Kanpur");
		
		System.out.println(newName);
		
		boolean comparename=newName.equalsIgnoreCase(name);
		
		System.out.println(comparename);
		
		File f1=new File("C:\\Users\\admin\\eclipse-workspace\\practiceJaca\\src\\javaMethods\\Ravi.txt");
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter f2=new FileWriter(f1);
			f2.write("My name is Ravi verma");
			f2.flush();
			f2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader fr=new FileReader(f1);
			int i;
			try {
				while((i=fr.read()) !=-1) {
					
					System.err.print((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
