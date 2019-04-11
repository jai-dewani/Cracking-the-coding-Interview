import java.util.Scanner;

class String_Rotation{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String one: ");
		String s1 = s.next();
		System.out.print("Enter String two: ");
		String s2 = s.next();
		int start = 0;
		boolean flag = false;
		int len = s2.length();
		while(start<len && s2.charAt(start)!=s1.charAt(0)){
			start++;
			flag = true;
		}
		if(s1.length()!=len){
			flag = false;
		}
		if(flag){
			for(int i=0;i<len;i++){
				if(s1.charAt(i)!=s2.charAt((start+i)%len)){
					flag=false;
					break;
				}
			}
		}
		if(flag){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}