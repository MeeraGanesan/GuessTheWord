import java.util.*;
class HiddenWord
{ 
  String word;  

  
  HiddenWord(String S)
  {
      word = S;
  }
  public String getHint(String GW)
  {
      String result = "";

      int i=0;
      while(i<GW.length())
      
      {
        boolean found=false;
        char ch1=GW.charAt(i);
        char ch2=word.charAt(i);
        if (ch1==ch2)
        {
            result=result+ch1;
            found=true;
        }
        else 
        {
            int j=0;
           while (j<word.length())
          {
            ch2=word.charAt(j);
            if (ch1==ch2)
            {
                result=result+"+";
                found=true;
                break;
            }
            j++;
          }
        }
        i++;
        if (found==false)
        {
           result=result+"*";
        }
    }
    return result;
        
}
public static void main()
{
      HiddenWord puzzle=new HiddenWord("HARPS");
      Scanner SC=new Scanner(System.in);
      while (true)
      {
          System.out.println("Enter the guessword");
          String GW=SC.next();
          String RW=puzzle.getHint(GW);
          if (RW.equals("HARPS"))
          {
              System.out.println("Word is found. Congratulations!");
          
              break;
            }
            else
            {
                System.out.println(RW);
            }
        }
}
}
    