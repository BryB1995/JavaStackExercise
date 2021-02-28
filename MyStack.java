import java.util.*;

public class MyStack<T>
{
    ArrayList<T> list = new ArrayList<T>();
    
    
    public T peek()
    {
        int l = list.size();
        return list.get(l+1);
        
       }
    public T pop()
    {
        int l = list.size();
        T tmp = list.get(l+1);
        list.remove(l+1);
        return tmp;
        
       }
    public void push(T data)
    {
        list.add(data);
        
       }
    public boolean isEmpty()
    {
        boolean b;
          int l = list.size();
          if(l == 0)
          {
            b = true;  
           }
           else
           {b = false;}
           return b;
               
       }
    public int size()
    {
        int l = list.size();
        return l;
       }


}
