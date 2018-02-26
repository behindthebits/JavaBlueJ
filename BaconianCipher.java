
public class BaconianCipher{
    public static String decode(String msg){
        java.util.HashMap<String, Character> map=new java.util.HashMap();
        map.put("aaaaa",'A'); 
        map.put("aaaab",'B');
        map.put("aaaba",'C');
        map.put("aaabb",'D');
        map.put("aabaa",'E');
        map.put("aabab",'F');
        map.put("aabba",'G');
        map.put("aabbb",'H');
        map.put("abaaa",'I');  //same
        map.put("abaaa",'J');  //same
        map.put("abaab",'K');
        map.put("ababa",'L');
        map.put("ababb",'M');
        map.put("abbaa",'N');
        map.put("abbab",'O');
        map.put("abbba",'P');
        map.put("abbbb",'Q');
        map.put("baaaa",'R');
        map.put("baaab",'S');
        map.put("baaba",'T');
        map.put("baabb",'U');  //same
        map.put("baabb",'V');  //same
        map.put("babaa",'W');
        map.put("babab",'X');
        map.put("babba",'Y');
        map.put("babbb",'Z');
        java.lang.StringBuilder result= new java.lang.StringBuilder();
        String subResult;
        String temp;
        for(int index=0;index<msg.length();index++){
            if(msg.charAt(index)=='a' || msg.charAt(index)=='b'){
               subResult=msg.substring(index,index+5);
               result.append(map.get(subResult.toString()));
               index+=4;
            }
            else
               result.append(msg.charAt(index));
            }   
        return result.toString();
    }
    
    public static String encode(String msg){
        msg=msg.toUpperCase();
        java.util.HashMap<Character, String> map=new java.util.HashMap();
        map.put('A',"aaaaa"); 
        map.put('B',"aaaab");
        map.put('C',"aaaba");
        map.put('D',"aaabb");
        map.put('E',"aabaa");
        map.put('F',"aabab");
        map.put('G',"aabba");
        map.put('H',"aabbb");
        map.put('I',"abaaa");  //same
        map.put('J',"abaaa");  //same
        map.put('K',"abaab");
        map.put('L',"ababa");
        map.put('M',"ababb");
        map.put('N',"abbaa");
        map.put('O',"abbab");
        map.put('P',"abbba");
        map.put('Q',"abbbb");
        map.put('R',"baaaa");
        map.put('S',"baaab");
        map.put('T',"baaba");
        map.put('U',"baabb");  //same
        map.put('V',"baabb");  //same
        map.put('W',"babaa");
        map.put('X',"babab");
        map.put('Y',"babba");
        map.put('Z',"babbb");
        java.lang.StringBuilder result= new java.lang.StringBuilder();
        String temp;
        for(int index=0;index<msg.length();index++){
            temp=map.get(msg.charAt(index));
            result.append((temp!=null)?temp:msg.charAt(index));
        }
        return result.toString();
        
    }
}
