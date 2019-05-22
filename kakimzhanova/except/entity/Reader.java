package opt21.kakimzhanova.except.entity;
import java.io.*;
public class Reader{
	public static void main(String[] args){
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("opt21" + File.separator + "kakimzhanova"+File.separator+"except"+File.separator+"data"+File.separator+"res.txt"));
			String tmp = "";
			while ((tmp = br.readLine()) != null){
				String[] s = tmp.split("\\s");
				for (String res : s){
					System.out.println(res);
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if (br != null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}