
package paquete03;

public class EstudianteDistancia extends Estudiante {

    int numeroAsignaturas;
    double costoAsignatura;
    
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }
@Override
    public void calcularMatricula(){
        matricula = numeroCreditos * costoCredito;
    }
        
}
