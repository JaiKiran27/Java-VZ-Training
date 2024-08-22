package Jpre;

import java.util.*;

public class IsomorphicStrings {

	public static void main(String[] args) {
		public static boolean
		isIsomorphic(String s, String t){
			if (s.length()!=t.length()) {
				return false;
			}
			Map<Character, Character>
			mapS = new HashMap<>();
			Map<Character, Character>
			mapT = new HashMap<>();
			
			for(int i=0;i<s.length();i++) {
				char c1 = s.charAt(i);
				char c2 = t.charAt(i);
				
				if(mapS.containsKey(c1)) {
					if(mapS.get(c1)!=c2) {
						return false;
					}
				}
				
			}else { 
				mapS.put(c1,c2);
			}
		}{
			return true;

	}
	{
		public static void main(String[] args)
		{
			String s ="egg";
			String t = "add";
			System.out.println("Are the string isomorphic? "+ isIsomorphic (s,t));
			
			s="foo";
			t="bar";
			System.out.println("Are the string isomorphic? "+ isIsomorphic (s,t));
			
			s="paper";
			t="title";
			System.out.println("Are the string isomorphic? "+ isIsomorphic (s,t));
		}
	}
}
}
