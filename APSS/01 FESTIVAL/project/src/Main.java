import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int numOfsubStr;
	static int[] numOfChar;
	static boolean[] trueOfChar;
	static char[] targetChars;
    static String[] subStr;
    static int numOfResult = 0;
    static boolean result;
    static int numOfFalse;
    
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
    	FileInputStream in = null;
    	FileOutputStream out = null;
        in = new FileInputStream("src/apss_01_Set0.in");
        out = new FileOutputStream("src/apss_01_Set0.out");
        InputStreamReader isr = new InputStreamReader(in);
        OutputStreamWriter osr = new OutputStreamWriter(out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osr);
        
        int cases = Integer.parseInt(br.readLine());
        int total = cases;
        String str;
        numOfChar = new int[26];
        
        
        while(cases-- > 0) {
        	numOfResult = 0;
        	str = br.readLine();
        	numOfsubStr = str.length();
        	targetChars = new char[numOfsubStr];
        	str.getChars(0, str.length(), targetChars, 0);
        	
            System.out.println("case" + "" + " : " + (total-cases));
            System.out.println("numOfsubStr" + "" + " : " +numOfsubStr);
            
        	for(int i = 0; i<numOfsubStr; i++) {
        		for(int n = 0; n < 26; n++) numOfChar[n] = 0;
        		numOfFalse = 0;
        		for(int j = i; j<numOfsubStr; j++) {
        			addNumOfResult(i,j);
        		}        		
        	}
        	
            System.out.println("---------------------------------");
            bw.write(String.valueOf(numOfResult));
            bw.newLine();
        }
        bw.close();
    }

	private static void addNumOfResult(int i, int j) {
        int x = (int)targetChars[j] - 97;
    	numOfChar[x] =  numOfChar[x] + 1;
    	if (numOfChar[x] % 2 == 1) {
    		numOfFalse++;
    	} else {
    		numOfFalse--;
    	}
    	if(numOfFalse==0) numOfResult++; 
	}
}















//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class Main {
//	
//	static int numOfsubStr;
//	static int[] numOfChar;
//	static char[] targetChars;
//    static String[] subStr;
//    static int numOfResult = 0;
//    
//	@SuppressWarnings("resource")
//	public static void main(String[] args) throws IOException {
//    	FileInputStream in = null;
//    	FileOutputStream out = null;
//        in = new FileInputStream("src/problem_3_Set2.in");
//        out = new FileOutputStream("src/problem_3_Set3.out");
//        InputStreamReader isr = new InputStreamReader(in);
//        OutputStreamWriter osr = new OutputStreamWriter(out);
//        BufferedReader br = new BufferedReader(isr);
//        BufferedWriter bw = new BufferedWriter(osr);
//        
//        int cases = Integer.parseInt(br.readLine());
//        String str;
//        numOfChar = new int[26];
//        
//        
//        while(cases-- > 0) {
//        	str = br.readLine();
//        	numOfsubStr = (str.length() * (str.length() + 1)) / 2;
//        	subStr = new String[numOfsubStr];
//        	for(int i = 0, x=0; i<str.length(); i++) {
//        		for(int j = i; j<str.length(); j++, x++) {
//        			subStr[x] = str.substring(i,j+1);
//        		}
//        	}
//        	
//
//            bw.write(String.valueOf(getNumOfResult()));
//            bw.newLine();
//        }
//        bw.close();
//    }
//
//	private static int getNumOfResult() {
//		boolean result = true;
//        
//		// TODO Auto-generated method stub
//    	while(numOfsubStr-- > 0){
//        	targetChars = new char[subStr[numOfsubStr].length()];
//        	subStr[numOfsubStr].getChars(0, subStr[numOfsubStr].length(), targetChars, 0);
//        	
//        	for(int i = 0; i < numOfChar.length; i++) numOfChar[i] = 0;
//        	result = true;
//        	
//        	for(int i = 0; i < targetChars.length; i++) {
//        		switch (targetChars[i]){
//        			case 'a': numOfChar[0] = numOfChar[0] + 1; break;
//        			case 'b': numOfChar[1] = numOfChar[1] + 1; break;
//        			case 'c': numOfChar[2] = numOfChar[2] + 1; break;
//        			case 'd': numOfChar[3] = numOfChar[3] + 1; break;
//        			case 'e': numOfChar[4] = numOfChar[4] + 1; break;
//        			case 'f': numOfChar[5] = numOfChar[5] + 1; break;
//        			case 'g': numOfChar[6] = numOfChar[6] + 1; break;
//        			case 'h': numOfChar[7] = numOfChar[7] + 1; break;
//        			case 'i': numOfChar[8] = numOfChar[8] + 1; break;
//        			case 'j': numOfChar[9] = numOfChar[9] + 1; break;
//        			case 'k': numOfChar[10] = numOfChar[10] + 1; break;
//        			case 'l': numOfChar[11] = numOfChar[11] + 1; break;
//        			case 'm': numOfChar[12] = numOfChar[12] + 1; break;
//        			case 'n': numOfChar[13] = numOfChar[13] + 1; break;
//        			case 'o': numOfChar[14] = numOfChar[14] + 1; break;
//        			case 'p': numOfChar[15] = numOfChar[15] + 1; break;
//        			case 'q': numOfChar[16] = numOfChar[16] + 1; break;
//        			case 'r': numOfChar[17] = numOfChar[17] + 1; break;
//        			case 's': numOfChar[18] = numOfChar[18] + 1; break;
//        			case 't': numOfChar[19] = numOfChar[19] + 1; break;
//        			case 'u': numOfChar[20] = numOfChar[20] + 1; break;
//        			case 'v': numOfChar[21] = numOfChar[21] + 1; break;
//        			case 'w': numOfChar[22] = numOfChar[22] + 1; break;
//        			case 'x': numOfChar[23] = numOfChar[23] + 1; break;
//        			case 'y': numOfChar[24] = numOfChar[24] + 1; break;
//        			case 'z': numOfChar[25] = numOfChar[25] + 1; break;
//        		}
//        	}
//        	for(int i = 0; i < 26; i++) {
//        		if(numOfChar[i]%2 == 1) result = false;
//        	}
//        	if (result) numOfResult++;
//    	}
//    	return numOfResult;
//	}
//}