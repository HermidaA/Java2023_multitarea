package tareas;

public class Lanzador {

	public static void main(String[] args) {
		//Creamos las dos tareas
				TareaAscendente ta=new TareaAscendente();
				TareaDescendente td=new TareaDescendente();
		Thread t1=new Thread(ta);
		Thread t2=new Thread(td);
		t1.start();
		t2.start();
			
			
		}
		

	}







