package Serialization;

import java.io.Serializable;
import java.util.LinkedHashMap;

public class CDataContainer implements Serializable {

	private static final long serialVersionUID = -1175326579064976512L;
	
	//public String strFirstName;
	//public String strLastName;
	
	public LinkedHashMap<String,Object> Fields = null;
	
	public CDataContainer() {
		
		Fields = new LinkedHashMap<String,Object>();
		
	}
	
}
