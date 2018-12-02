package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
	public List<String> letterCombinations(String digits) {
	        List<String> res = null;
	        if(digits=="") return res;
	        Map<Character,String[]> temp = new HashMap<Character,String[]>();
	        temp.put('2',new String[]{"a","b","c"});
	        temp.put('3',new String[]{"d","e","f"});
	        temp.put('4',new String[]{"g","h","i"});
	        temp.put('5',new String[]{"j","k","l"});
	        temp.put('6',new String[]{"m","n","o"});
	        temp.put('7',new String[]{"p","q","r","s"});
	        temp.put('8',new String[]{"t","u","v"});
	        temp.put('9',new String[]{"w","x","y","z"});
	        char[] buf = digits.toCharArray();
	        List<String> buf2 = new ArrayList<String>();
	        for(int j=0;j<buf.length;j++){
	            ArrayList<String> buf3 = new ArrayList<String>();
	            for(int i=0;i<temp.get(buf[j]).length;i++){
	                if(j==0){
	                    buf2.add(temp.get(buf[j])[i]);
	                }else{
	                    for(int k=0;k<buf2.size();k++){
	                        buf3.add(buf2.get(k)+temp.get(buf[j])[i]);
	                        }
	                }
	            }
	            if(j!=0)
	                buf2 = (ArrayList<String>)buf3.clone();
	        }
	        return res=buf2;
	    }
}

