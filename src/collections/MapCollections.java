package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(10,"siddu");
		map.put(20, "vinay");
		map.put(30, "sai");
		
		map.put(10,"siddu");
		map.put(20, "vinay");
		map.put(30, "sai");
		
		System.out.println(map);
		System.out.println();
		Set<Integer>keys=map.keySet();
		for(Integer k:keys)
		{
			System.out.println();
		}
		System.out.println();
		Collection<String> values=map.values();
		for(String V:values)
		{
			System.out.println(V);
		}
	//	System.out.println();
		
		for(Integer K:keys)
		{
			System.out.println(K +">>>>>" +map.get(keys));
		}
		System.out.println(map);
		System.out.println();
		
		System.out.println(map.containsKey(10));
		System.out.println(map.containsKey(20));
		System.out.println(map.containsKey(30));
		
		System.out.println();
		
	//	System.out.println(map.containsValue("siddu"));
		// System.out.println(map.containsValue("vinay"));
	//	System.out.println(map.containsValue("sai"));
		
	//	System.out.println();
	//	System.out.println(map);
		
		map.replace(30,"venu");
		System.out.println(map);
	//	System.out.println(map);
  //		System.out.println(map.size());
		 
		for(Map.Entry<Integer,String> entry: map.entrySet())
		{
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
		

	}

}
