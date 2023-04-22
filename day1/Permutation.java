package day1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
	static List<String> resultList = new ArrayList<>();
	public static void main (String [] args) {
		String s="absg";
		StringBuilder sb = new StringBuilder();
		boolean visited[] = new boolean[s.length()];
		Permutation.findPermutation(s,visited,sb);
		Collections.sort(resultList);
		System.out.println(resultList.toString());
	}
	private static void findPermutation(String s,boolean[] visited,StringBuilder sb) {
		if(sb.length()==s.length()) {
			resultList.add(sb.toString());
			return;
		}
		for(int i=0;i<s.length();i++) {
			if(! visited[i] ) {
				visited[i]=true;
				sb.append(s.charAt(i));
				findPermutation(s, visited, sb);
				sb.deleteCharAt(sb.length()-1);
				visited[i]=false;
			}
		}
	}
}
