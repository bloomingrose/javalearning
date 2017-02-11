package JavaPractice;


class Table{
	
	synchronized void printtTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			}catch(Exception e){
				System.out.print(e);
			}
		}
		
	}
}


class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t=t;
	}
	public void run(){
		t.printtTable(5);
	}
}

class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t=t;
	}
	public void run(){
		t.printtTable(50);
	}
}
public class TestSynchronization {
	
	public static void main(String args[]){
		
		Table t1=new Table();
		
		MyThread1 mt1=new MyThread1(t1);
		MyThread2 mt2=new MyThread2(t1);
		
		mt1.start();
		mt2.start();
	}

}
