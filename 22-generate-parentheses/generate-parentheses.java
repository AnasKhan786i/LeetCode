class Solution {
    
    public void generate(int n, int l, int r, String s, List<String> ans) {
        // 🛑 BASE CASE
        if(r == n) { 
            ans.add(s);
            return;
        }
        
        // 🔀 CHOICE 1: Kya main '(' laga sakta hoon?
        if(l < n) {
            generate(n, l + 1, r, s + "(", ans);
        }
        
        // 🔀 CHOICE 2: Kya main ')' laga sakta hoon?
        if(r < l) {
            generate(n, l, r + 1, s + ")", ans);
        }
    } // ⚠️ YAHAN PAR TUMHARA BRACKET MISSING THA! Ise band karna zaroori hai.

    // Ab naya function aaram se shuru ho sakta hai
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        return ans;
    }
}