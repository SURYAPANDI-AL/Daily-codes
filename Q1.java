public class Q1 {
	public static void main ( String [] args ) {
		int n=6,x=3,count=0,count3=0;
		boolean [] visit = new boolean[n];
		for(int i=0;i<n;i++) {
				if(!visit[i]) {
					count3++;
				}
				if(count3==3) {
					System.out.print(i+1);
					visit[i]=true;
					count3=0;
					count++;
				}
				if(count==(n-(x-1)))
					break;
				if(i==n-1)
					i=-1;
		}
	}
}
