package leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
	        if(strs.length==0) return "";
	        String result = "";
	        for(int j=0;j<strs[0].length();j++){
	            if(searchString(strs,strs[0].charAt(j),j)){
	                result += strs[0].charAt(j);
	            }else{
	                break;
	            }
	        }
	        return result;
	    }
	    
	    public boolean searchString(String[] strs,char src,int index){
	        for(int i=0;i<strs.length;i++){
	            if(index>=strs[i].length()||strs[i].charAt(index)!=src)
	                return false;
	        }
	        return true;
	    }
}

