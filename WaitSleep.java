
public class WaitSleep {
	   private static Object obj = new Object();   
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);    
        System.out.println( Thread.currentThread().getName() +" I am sleep() method");   
        
        synchronized (obj)    
        {   
            obj.wait(2000);   
            System.out.println(obj + " I am wait() method");   
        }   

	}

}
