package tw;

import javax.print.attribute.standard.OutputDeviceAssigned;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;
    static String str="1234";
    public static void main(String[] args) throws Exception {
        String result = "";
    	for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();   
            result=output(input,str);
            System.out.println(result);
        }     
        	
//            System.out.println(input);
        }
    
    public static String output(String input,String str) {
    	if(input.equals(str)) {
    		return "right";
    	}
    	else {
    		int A=0;
    		int B=0;
    		char [] stringInput = input.toCharArray();
    		char [] stringStr = str.toCharArray();
    		for(int i=0;i<4;i++) {
    			for(int j=0;j<4;j++) {
    				if(stringInput[i]==stringStr[j] && i==j) {
    					A=A+1;
    				}else if(stringInput[i]==stringStr[j] && i!=j) {
    					B=B+1;
    				}
    			}
    		}
    		return A+"A"+B+"B";
    	}
    }
}
    



    

