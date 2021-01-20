
public class FindMiddleLetter {
	public String solution(String s) {
		String answer="";
		int index=0;
		if(s.length()%2==0) {
			index=((s.length()-1)/2);
			answer=Character.toString((s.charAt(index)));
			
		}else {
			index=((s.length()-1)/2);
			answer=s.substring(index,index+2);
		}
		
		return answer;
	}
}
