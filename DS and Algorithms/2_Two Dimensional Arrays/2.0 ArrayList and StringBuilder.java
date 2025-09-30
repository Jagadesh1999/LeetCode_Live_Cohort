// Upper Case to Lower Case : (char)('a' + (ch - 'A'))
// Lower Case to Upper Case : (char)('A' + (ch - 'a'))

import java.util.*;
class Main {
    public static String toggleCase(String str){
        // Efficient method to manipulate strings
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){ // uppercase char
                sb.append((char)('a' + (ch - 'A'))); // Mathematical operation on character returns integer
            } else if(ch >= 'a' && ch <='z'){ // lowercase char
                sb.append((char)('A' + (ch - 'a')));
            } else { // not english char
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        // ArrayList<Integer> al = new ArrayList<>();

        // al.add(55);
        // al.add(1);
        // al.add(2);
        // al.add(3);
        // // al.add(2,98); - Adds new element
        

        // al.set(3,100); - Replaces new element
        // System.out.println(al);

        // al.remove(index);
        // System.out.println(al.get(index));

        // Key Takeaway: ArrayList is good for accessing and replacing elements (via index), but relatively slow for inserting or deleting in the middle dut to O(n) TC
        
        // StringBuilder sb = new StringBuilder();
        // sb.append("abcd");
        // sb.setCharAt(1,'Z');
        
        // System.out.println(sb);

        String str = "AbcdEFGHiJk2";
        System.out.println(toggleCase(str));
    }
}
