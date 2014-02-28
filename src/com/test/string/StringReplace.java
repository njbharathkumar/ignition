package com.test.string;

public class StringReplace {

	public static void main(String[] args) {
		String t = "Hello world, carl";
		System.out.println("test1: "+replace1(t,'l',"*#"));
		
		System.out.println("test2: "+replace2(t,'l',"*#"));
		
		System.out.println("test3: "+replace(t,'l','*'));
		
		System.out.println("test4: "+reverseString1(t));
		
		System.out.println("test5: "+reverseString2(t));
	}
		
	//iteration
	public static String replace1(String instr, char oldch, String newstr) {
		String buf = "";
		char ich;
		for (int i = 0; i < instr.length(); i++) {
			ich = instr.charAt(i);
			if (ich == oldch) 
				buf += newstr;
			else
				buf += ich;
		}
		return buf;	
	}
	
	//recursion
	public static String replace2(String instr, char oldch, String newstr) {
		String buf = "";
		char ich;
		for (int i = 0; i < instr.length(); i++) {
			ich = instr.charAt(i);
			if (ich == oldch) {
				buf += newstr;
				if (i+1 < instr.length())
					buf += replace2(instr.substring(i+1), oldch, newstr);
				break;
			} else {
				buf += ich;
			}
		}
		return buf;		
	}
	
	public void replace(String instr, String oldstr, String newstr) {
		
	}

	public static String replace(String instr, char oldch, char newch) {
		char[] buf = instr.toCharArray();
		char ich;
		for (int i = 0; i < instr.length(); i++) {
			ich = instr.charAt(i);					
			buf[i] = ich== oldch ? newch : ich;
		}
		return new String(buf);
	}
	
	//recursion
    public static String reverseString1(String str){
    	if ((null == str) || (str.length()  <= 1)) {
            return str;
        }
    	return reverseString1(str.substring(1)) + str.charAt(0);
    }
     
    //iteration
    public static String reverseString2(String str){
    	if ((null == str) || (str.length()  <= 1)) {
            return str;
        }
    	char[] buf = str.toCharArray();
    	char temp;
    	int j = buf.length - 1;
    	for (int i = 0; i < buf.length/2; i++, j--) {
    		temp = buf[i];
    		buf[i] = buf[j];
    		buf[j] = temp;
    	}
    	return new String(buf);
    }
    
}
