import java.util.Scanner;

public class testa_classes {
	public static void main(String[] args) {
		/*
		 * Horarios horarios = new Horarios(); Scanner inpt = new Scanner(System.in);
		 * Professor joaum = new Professor(); joaum.setNumero_de_matricula(10);
		 * Professor ze = new Professor(); ze.setNumero_de_matricula(20);
		 * 
		 * for(int i = 0; i < 5; i++) { int dia = inpt.nextInt(); int aula =
		 * inpt.nextInt(); horarios.setAula(joaum, dia, aula); }
		 * 
		 * for(int i = 0; i < 5; i++) { int dia = inpt.nextInt(); int aula =
		 * inpt.nextInt(); horarios.setAula(ze, dia, aula); }
		 * 
		 * for(int i = 0; i < 5; i++) { System.out.println("pegue os horarios:"); int
		 * dia = inpt.nextInt(); horarios.getHorario(dia); }
		 */

		// --- teste clas outro relogio com a classe Horarios

		Horarios horarios = new Horarios();

		Sistema_interno sistema = new Sistema_interno();
		Professor tiozinho = new Professor(); // instancia o professor
		tiozinho.setSenha(8975); // adere uma senha ao objeto
		horarios.setAula(tiozinho, 2, 4);
		sistema.setHorarios(horarios);
		sistema.permissao(8975);
	}
}
