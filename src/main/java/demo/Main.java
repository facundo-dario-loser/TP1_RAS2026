package demo;
public class Main {
    public boolean esMayorDeEdad(int edad) {
        // BUG: Pusiste > en lugar de >= por distracción.
        // Si alguien tiene 18 justo, va a dar false (error).
        if (edad > 18) {
            return true;
        }
        return false;
    }
}
