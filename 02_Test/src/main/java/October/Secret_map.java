package October;

public class Secret_map {
	public static void main(String[] args) {
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		solution(5, arr1, arr2);
	}
	
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        	
	        for(int i=0; i<n; i++) {
	        	answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
	        	
	        	answer[i] = String.format("%"+n+"s", answer[i]);
	        	
	        	answer[i] = answer[i].replaceAll("1", "#");
	        	answer[i] = answer[i].replaceAll("0", " ");
	        	
	        	answer[i] = answer[i];
	        	System.out.println(answer[i]);
	        }
        return answer;
    }
}


