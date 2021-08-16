import javax.swing.JOptionPane;

public class VowelCounter
{
  public static void main( String[] args )
  {
    int vowelCount = 0;
    char ch;    
    String s;    
    s = JOptionPane.showInputDialog( "Enter a string:" );

    //start loop
    for ( int i = 0; i < s.length(); i++ )
    {
      ch = s.charAt( i );
      if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
           ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
         vowelCount++;
         
       System.out.println( ch );
    }//end loop  
    
    System.out.println( "-------------------------------------------" );   
    System.out.println( "Number of vowels in the string: ( " + vowelCount + " )" ); 
      
  }//end main
  
}//end