class Table{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(1000);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(1);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(2);  
}  
}  
public class Synchronization {

	public static void main(String[] args) {
		Table t=new Table();
        MyThread1 T1=new MyThread1(t);
        MyThread2 T2=new MyThread2(t);
        T1.start();
        T2.start();
	}

}
