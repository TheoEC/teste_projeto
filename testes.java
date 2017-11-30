import java.util.Date;
import java.text.SimpleDateFormat;

/*
y ano
M mes
D dia
H hora do dia(0/24)
h Hora da manha ou da tarde(0/12)
m minuto
s segundo
S milisegundo
 */

public abstract class testes {
	public static void main(String[] args) {
		
		Date momento = new Date();
		SimpleDateFormat hora = new SimpleDateFormat("m");
		System.out.println(momento);
		String o_que_eu_quero = hora.format(momento);
		System.out.println(o_que_eu_quero);
	}

}
