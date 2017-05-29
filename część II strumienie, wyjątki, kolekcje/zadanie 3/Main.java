/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package Zad1;

import java.io.FileReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws Exception {
    String fname = System.getProperty("user.home") + "/tab.txt";
    FileReader fis = null;

    try {
	    fis = new FileReader(fname);
	    StreamTokenizer st = new StreamTokenizer(fis);
	    List<Integer> lista = new ArrayList<>();
	    int token;
	    
	    while((token = st.nextToken()) != StreamTokenizer.TT_EOF){
	    	if(token==StreamTokenizer.TT_NUMBER){
	    		if(st.nval % 1 == 0){
	    			token = (int) st.nval;
	    			lista.add(token);
	    		}else{
	    			throw new Exception();
	    		}
	    	}else if(token==StreamTokenizer.TT_WORD){
	    		throw new Exception();
	    	}
	     }				
		
		int array[] = new int[lista.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = lista.get(i);
			System.out.print(array[i] + " ");
		}
		System.out.println();

		
		int maxValue = array[0];
		for (int i = 0; i < array.length; i++) {
			if(maxValue < array[i]){
				maxValue = array[i];
			}
		}
		System.out.println(maxValue);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]==maxValue){
				System.out.print(i + " ");
			}
		}		
	}catch (Exception e) {
		System.out.println("***");

	}finally{
		if (fis != null){
			fis.close();
		}
	}
  } 
}
