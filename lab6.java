
public class lab6<T>
{
public boolean bracketTester(String s)
{
    MyStack stack = new MyStack();
 String d;
 
 int count = 0;
 int strLength = s.length();
 boolean res = true;
 while(count < strLength)
 {
     String tmpChar = s.substring(count, count);
     if(tmpChar.equals("("))
     {
         stack.push(tmpChar);
  
        }
     
      if(tmpChar.equals("["))
     {stack.push(tmpChar);}
     
      if(tmpChar.equals("{"))
     {stack.push(tmpChar);}
     
          if(tmpChar.equals(")"))
     {
        d = "" + stack.pop();
        if(!d.equals("("))
        {res = false;}
                      
        }
          if(tmpChar.equals("]"))
     {
                d = "" + stack.pop();
        if(!d.equals("["))
        {res = false;}
        }
     
              if(tmpChar.equals("}"))
     {
              d = "" + stack.pop();
        if(!d.equals("{"))
        {res = false;}  
        }
     count++;
    }
    if(res != false)
    {
 if(stack.isEmpty() == true)
 {
     res = true;
 
}
else
{
    res = false;
}
}
return res;
}
}
