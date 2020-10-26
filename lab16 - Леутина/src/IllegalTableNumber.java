public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(){
        super("Столика с таким номером не существует");
    }
}
