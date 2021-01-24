public class SumBetweenTwoDecimals2 {
	public long solution(int a, int b){
		return sumAtoB(Math.min(a, b),Math.max(a, b));
	}
	public long sumAtoB(long a, long b) {
		return (b-a+1)*(a+b)/2;
	}
	//long을 쓰는 이유는?
}
