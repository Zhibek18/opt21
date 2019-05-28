package opt21.kakimzhanova.except.entity;
import java.io.*;
import opt21.kakimzhanova.except.exception.InfiniteException;
public class Reader{
	private final static int N = 3;
	public double[] readNumbers(String dataFileName) throws IOException, NumberFormatException, InfiniteException{
		BufferedReader br = null;
		double[] doubleNumbers = new double[N];
		
		br = new BufferedReader(new FileReader("opt21" + File.separator
				+ "kakimzhanova" + File.separator + "except"
				+ File.separator + "data" + File.separator + dataFileName));
		String tmp = "";
		int k = 0;
		while ((tmp = br.readLine()) != null){
			String[] s = tmp.split("\\s");
			for (String res : s){
				if (Double.isInfinite(doubleNumbers[k++] = Double.parseDouble(res))){
					throw new InfiniteException("input file contains too big numbers");
				}
			}
		}
		return doubleNumbers;
	}
}