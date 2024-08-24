
public class AllSymbol
{
  public static void main(String[] args){
       System.out.print('\f'); 
       for (char c = 'a'; c<='z'; c++){
          System.out.printf("ASCII(%d) = %c\n", (int) c, c); 
        }
       System.out.println(); 
       for (char c = 'A'; c<='Z'; c++){
          System.out.printf("ASCII(%d) = %c\n", (int) c, c); 
        }
       System.out.println(); 
       for (char c = '0'; c<='9'; c++){
          System.out.printf("ASCII(%d) = %c\n", (int) c, c); 
        }
       System.out.println(); 
       for (char c = '\u2E80'; c<='\u9FFF'; c++){
          System.out.printf("ASCII(%d) = %c\n", (int) c, c); 
        }
    }
}
