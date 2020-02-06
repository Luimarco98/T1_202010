package model.logic;

import java.io.File;
import java.io.InputStreamReader;

public class Comparendo {

	public Comparendo() {
		
	}
	public void cargar()throws FileNotFoundException
	{
		long inicio =System.currentTimeMillis();
	    long inicio2=System.nanoTime();
		String dir="./data/comparendos_dei-2018.geojson";
		File archivo=new File(dir);
		JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(archivo)));
		JsonObject gsonObj0=JsonParser.parseReader(reader).getAsJsonObject();
		
		JsonArray comparendos=gsonObj0.get("features").getAsJsonArray();
		int i=0;
		while(i<comparendos.size())
		{
			JsonElement obj=comparendos.get(i);
			JsonObject gsonObj=- obj.getAsJsonObject();
			
			JsonObject gsonObjpropiedades=gsonObj.get("properties").getAsJsonObect();
			int objid=gsonObjpropiedades.get("OBJECTID").getAsInt();
		}
		
	}
}
