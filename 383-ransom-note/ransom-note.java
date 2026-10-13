import java.util.HashMap;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>can = new HashMap<>();
        for(char c:magazine.toCharArray()){
            can.put(c,can.getOrDefault(c,0)+1);
        }

        for(char c:ransomNote.toCharArray()){
            if(can.getOrDefault(c,0)>0){
                can.put(c,can.get(c)-1);
            }
            else{
                return false;
            }
        }
        return true;

        
    }
}