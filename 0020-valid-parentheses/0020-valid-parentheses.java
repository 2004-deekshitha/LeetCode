class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch=new Stack<Character>();
         char[] chararray=s.toCharArray();

        for(int i=0;i<chararray.length;i++)
        {
         if(chararray[i]=='('||chararray[i]=='['|| chararray[i]=='{')
         {
             ch.push(chararray[i]);
         }  
         else
         {
             if(ch.isEmpty())
             {
                 return false;
             }
             char top=ch.pop();
             if((chararray[i]==')' && top!='(') || (chararray[i]=='}' && top!='{')|| (chararray[i]==']' && top!='[' ))
             {
             return false;
             }
         }
        }
     return ch.isEmpty();
     
    }
}