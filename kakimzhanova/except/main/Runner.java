package opt21.kakimzhanova.except.main;
import java.io.*;
import opt21.kakimzhanova.except.entity.Reader;
import opt21.kakimzhanova.except.exception.InfiniteException;

public class Runner{
    public static void main(String[] args){
        Reader reader = new Reader();
        try{
	       	double[] doubleNumbers = reader.readNumbers("res.txt");
	       	for (double d : doubleNumbers){
	       		System.out.println(d);
       		}
       	}catch(IOException | NumberFormatException | InfiniteException e){
			e.printStackTrace();
		}
        
    }
}