package HelloWorld;

public class Main
{
    public static void main(String[] args)
    {
		  int counter = 100;
      for (int i = 0; i < counter; i++) {
        try {
          Thread.sleep(5000);
          System.out.println("Hello world: " + i);
      } catch (InterruptedException e) {
          e.printStackTrace();
          // handle the exception...        
          // For example consider calling Thread.currentThread().interrupt(); here.
      }
			  
		  }
	
    }
}