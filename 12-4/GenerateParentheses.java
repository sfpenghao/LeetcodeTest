package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backTrack(res,"",0,0,n);
        return res;
    }
    
    public void backTrack(List<String> res,String str,int open,int close,int max){
        if(str.length()==max*2){
            res.add(str);
            return;
        }
        
        if(max>open)
            backTrack(res,str+"(",open+1,close,max);
        if(open>close)
            backTrack(res,str+")",open,close+1,max);
    }
}
