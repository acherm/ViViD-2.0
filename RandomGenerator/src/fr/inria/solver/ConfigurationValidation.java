package fr.inria.solver;

import fr.inria.domain.Configuration;
import fr.inria.reader.MOTIVConfigurationReader;
import fr.inria.reader.VMReader;

public class ConfigurationValidation {
	
	
	public static void main(String[] args) throws Exception{
		String modelPath=args[0];
		String configurationPath=args[1];
		
		VMReader model = new VMReader();
		model.parseFile(modelPath);
		Configuration c = MOTIVConfigurationReader.parseConfiguration(configurationPath);	
		String validConf = (model.reasoner.isValidConf(c))?"0":"1";
		System.out.println(configurationPath.substring(configurationPath.lastIndexOf('/')+1)+";"+ validConf );
	}
}
