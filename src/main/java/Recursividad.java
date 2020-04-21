//el metodo recibe el numero por parametro en este caso 1 y hace la valoracion en el if, imprime el numero 
    //y se ejecuta nuevamente con el numero 1 en este caso se suma 1 por lo tanto ya es el numero 2 
        //entonces entra al metodo de nuevo desde el principio y hace la valoracion con el if, asi hasta llegar a 10
public class Recursividad {

    public void metodoRecursivo(int numero) {
        if (numero <= 10) {
            System.out.println(numero);
            metodoRecursivo(numero + 1);
        }
    }
}
