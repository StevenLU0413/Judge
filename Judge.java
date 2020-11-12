import java.util.*;

public class Judge{
	
	public static int findJudge(int N, int[][] trust){
		ArrayList<Integer> possible_judge = new ArrayList<Integer>();//Create an ArrayList to keep the possible judge
		
		//use a nested for loop to check which number did not apear in the trust index
		for(int i = 1; i <= N; i++){
			for(int j = 0; j < trust.length; j++){
				if(i == trust[j][0]){
					break;
				}
				else if(j == (trust.length-1)&& i!=trust[j][0]){//check the possible judge at the end of the loop iteration.
					possible_judge.add(i);
				}
			}
		}

		
		int result = -1;
		
		//use a nested for loop to check if the possible judge is trusted by everyone except himself. 
		for(int i = 0; i < possible_judge.size(); i++){
			int count = 0;
		
			for(int j = 0; j < trust.length; j++){
				if(possible_judge.get(i) == trust[j][1]){
					count++;
				}
			}
			if(count == (N-1)){
				result = possible_judge.get(i);
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] trust ={{1, 2}};
		int pplNum = 2;
		
		int[][] trust1 = {{1, 3}, {2, 3}};
		int pplNum1 = 3;
		
		int[][] trust2 = {{1, 3}, {2, 3}, {3, 1}};
		int pplNum2 = 3;
		
		int[][] trust3 = {{1, 2}, {2, 3}};
		int pplNum3 = 3;
		
		int[][] trust4 = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
		int pplNum4 = 4;
		
		
		
		System.out.println(Judge.findJudge(pplNum, trust));
		System.out.println(Judge.findJudge(pplNum1, trust1));
		System.out.println(Judge.findJudge(pplNum2, trust2));
		System.out.println(Judge.findJudge(pplNum3, trust3));
		System.out.println(Judge.findJudge(pplNum4, trust4));
	}
}