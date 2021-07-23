input - reading
output - writing

//Writing file Example
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Example{

    public static void main(String[] args) throws IOException {

        File file = new File("src/file.txt");	//create one if there is no such file name, or replace everything
//	FileWriter writer = new FileWriter(file, true); // keep writing from current file - https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/FileWriter.html

        FileWriter writer = new FileWriter(file);

        writer.write("Hello World!");

        writer.close();
    }
}


//FileReader.java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {	//might throw an IO exception, error for input or output
	    File file = new File("Desktop/text.txt");	//put in the file path as a string
	    Scanner scan = new Scanner(file);		//scanning the file line by line
	    
	    String fileContent = "";	//store the content here when export to a new file
	    while(scan.hasNextLine()){
		    fileContent = fileContent.concat(scan.nextLine() + "\n");	//save to a new copy, adding to each line
// 		    System.out.println(scan.nextLine());	//print it out as long as there is a next line 
	    }
	    
	    FileWriter writer = new FileWriter("Desktop/newfile.txt");	//put in the path of the new file as a string
	    writer.write(fileContent);	//export everything from the fileContent to this new file
	    writer.close(); 	//do not forget to close the file
    }
}


