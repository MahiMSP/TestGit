package MKT;

	abstract class Demo {
		abstract void Add();

		void country() {
			System.out.println("india");
		}
	}
	public class Assignment37 extends Demo {
		
		void Add() {
	      System.out.println("add");
		}
		void Sub() {
			System.out.println("sub");
		}
		public static void main(String[] args) {
	      Assignment37 a=new Assignment37();
	      a.Add();
	      a.Sub();
		}

	}
