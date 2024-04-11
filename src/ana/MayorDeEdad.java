package ana;

public class MayorDeEdad {
    public static boolean esMayorDeEdad(Integer edad) throws Exception{
        if (edad < 0){
            throw new Exception("La edad no puede ser negativa");
        }
        if(edad >= 18){
            System.out.println("Es mayor de edad");
            return true;
        }else{
            System.out.println("No es mayor de edad");
            return false;
        }
    }
}
