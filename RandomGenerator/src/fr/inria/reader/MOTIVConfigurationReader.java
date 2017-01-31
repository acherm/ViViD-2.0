package fr.inria.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import fr.inria.domain.Configuration;

public class MOTIVConfigurationReader {

	public static Configuration parseConfiguration(String filePath){
		Configuration res = new Configuration();
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
		    for(String line; (line = br.readLine()) != null; ) {
		    	
		    	if(!line.startsWith("--")&&!line.startsWith("sequence.comment")&&line.length()>1){
		    		String assignation = line.trim().replace(" ", "");
		    		String key = assignation.substring(0, assignation.indexOf("="));
		    		String value = assignation.substring(assignation.indexOf("=")+1,assignation.length());
		    		
		    		if(value.contains(".")){
		    			double pValue = Double.parseDouble(value);
		    			res.add(key, pValue);
		    		}else{
		    			int pValue = Integer.parseInt(value);
		    			res.add(key, pValue);
		    		}
		    		
		    		
		    	}
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
		
	}
}
