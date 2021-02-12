package longestCommonPrefix;
/*
若字符串数组为空则无公共前缀
初始化最长前缀为第一个字符串
令后续字符串依次与第一个字符串寻找前缀
若前缀为0则无公共前缀
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String ans = strs[0];
        for(int i =1;i<strs.length;i++) {
            int j=0;
            for(;j<ans.length() && j < strs[i].length();j++) {
                if(ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if(ans.equals(""))
                return ans;
        }
        return ans;
    }
    //主方法
    public static void main(String arg[]){
        String[] strs={"flower","flow","flight"};
        Solution ex=new Solution();
        String result=ex.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
