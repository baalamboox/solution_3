//Se crea una clase (class) publica (public), llamada "Solution".
public class Solution {
	//Se crea un metodo estatico (static) que devolvera un valor entero (int), llamado "solution" que tendra como argumentos tres valores de tipo entero (int), llamados "x", "y" y "d".
	public static int solution(int x, int y, int d) {
		//Se declara una variable de tipo entero (int), la cual se inicializara en "0", aquí se almacenaran los saltos.
		int minimoDeSaltos = 0;
		//Mediante una estructura de iteracion (while), que tendra como condicion a evaluar "x <= y" esta se repetira siempre y cuando lo que contega "x" se menor o igual a lo que contenga "y".
		while(x <= y) {
			//A la variable "x" se va actualizando, esto quiere decir que se asigna lo mismo que tiene "x" mas lo que contega "d".
			x = x + d;
			//A la variable "minimoDeSaltos" aumente en una unidad.
			minimoDeSaltos++;
		}
		//Retorna el valor que contenga la varibale llamada "minimoDeSaltos"
		return minimoDeSaltos;
	}
	//Se crea el metodo principal.
	public static void main(String[] args) {
		//Se declara tres variables de tipo enteras (int), cada una se inicializara a ciertos valores.
		int x = 10, y = 85, d = 35;
		//Con la siguiente instrucion se manda a imprimir en pantalla los minimos de saltos, mandando a llamar al metodo "solution" y pasandoles sus parametros "x", "y" y "d".
		System.out.println("Minimo de saltos: " + solution(x, y, d));
	}
}
/*
	public -> Ademas de ser una palabra reservada (keyword), es un modificador de acceso, esto quiere decir que la clase, metodo o field que lo contenga se va poder acceder dentro y fuera de la clase o desde otra entidad programatica.
	class -> Tambien es una palabra reservada (keyword), define un espacio de trabajo donde estaran metodos y variables (locales y fields).
	static -> Es un modificador de ambito, tambien es una palabra reservda (keyword) y sirve para hacer uso de quien lo contenga (fields y metodos) si necesidad de crar un objeto de la clase y sin hacer referencia a ningun otro.
	int -> Representa que es un valor primitivo de tipo entero, se trabaja en la memoria llamda "stack".
	= -> Es conocido como operador de asignacion, sirve para asignar lo que contenga a su lado derecho.
	; -> Se utiliza para identificar hasta a donde termina cada intrucion, conocido como fin de instruccion.
	while -> Es una estructura de iteracion, va a permir ejecutar repetidamente un bloque de codigo que contenga simpre y cuando la condicion entre sus parensis sea verdadera.
	<= -> Operador relacional, sirve para comprar entre dos valores numericos, si uno es menor o igual que otro.
	+ -> Operador aritmetico, tiene dos funciones, sirve tanto para realizar la operacion de suma o tambien es usado para realizar concatenaciones.
	++ -> Operador incremental, esto sirve para ir incrementando en una unidad una variable numerica, es lo mismo que tener: (x = x + 1).
	void -> Se utiliza para referirse que un metodo no devolvera ningun valor despues de concluir.
	main -> Es una palabra reservada (keyword) y denota que es el metodo principal, donde empezara la ejecución de todo el programa.
	String[] -> Denota un arreglo (array) de tipo String, al tratarse de un objeto se trabaja en la memoria "heap" y solo se almacena en la memoria "stack" la ruta en hexdecimal de la direccion de memoria heap donde se encuentre ese objeto.
	{ -> Identifica donde empieza cada bloque de codigo ya sea de una clase o un metodo (apertura de implemetacion).
	} -> Identifica donde finaliza cada bloque de codigo.
	, -> Separa una grupacion del mismo tipo.
	() -> Ya sea que se usen para denotar que es un metodo y dentro de ellas van su paramentros o para agrupar (agrupacion) operaciones aritmenticas para darle jerarquia de quien se empezara a resolver primero.
	"" -> Se usan para cadenas de texto.
	println -> Es un metodo para imprimir en pantalla, este metodo le pertenece a la field "out" que a su ves esta contiene un metodo de la clase "printStrem" y que a la vez la varible "out" pertenece a la clase "System".
	System -> Es una clase donde contiene diferentes fields y metodos que van a permitir interactuar con el sistema.

*/