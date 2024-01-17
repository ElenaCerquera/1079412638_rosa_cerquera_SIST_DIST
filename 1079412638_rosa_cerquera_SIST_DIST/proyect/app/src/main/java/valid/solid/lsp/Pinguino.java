package proyect.app.src.main.java.valid.solid.lsp;

public class Pinguino extends Pajaro {
    @Override
    public void volar() {
        throw new UnsupportedOperationException("Los pingüinos no pueden volar");
    }
}
