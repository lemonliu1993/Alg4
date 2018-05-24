package C1;
/**
*@author created by liuyumeng
*@date 2018年5月24日 --- 上午7:56:49
*/
public class Strings {

	/*
	 * 判断字符串是否是一条回文
	 */
	public static boolean isPalidrome(String s){
		int N = s.length();
		for(int i=0;i<N/2;i++)
			if(s.charAt(i)!=s.charAt(N-1-i))
				return false;
		return true;
	}
	
	public boolean isSorted(String[] a){
		for(int i=1;i<a.length;i++){
			if(a[i-1].compareTo(a[i])>0)
				return false;
		}
		return true;
	}
	
}


