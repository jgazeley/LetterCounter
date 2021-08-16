import javax.swing.JOptionPane;

public class ConsonantCounter
{
  public static void main( String[] args )
  { 
    int i = 0;
    int consonantCount = 0;  
    int vowelCount = 0;
    char ch;
    String s;   
    s = JOptionPane.showInputDialog( "Enter a string:" );

    //start loop
    while ( i < s.length() )
    {
      ch = s.charAt( i );
      if ( ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' )
        if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
             ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
          vowelCount++; 
        else
          consonantCount++;
        
      System.out.println( ch );
      i++;
    }//end loop
      
    System.out.println( "-------------------------------------------" );         
    System.out.println( "Number of vowels in the string: ( " + vowelCount + " )" ); 
    System.out.println( "Number of consonants in the string: ( " + consonantCount + " )" );     
      
  }//end main
  
}//end