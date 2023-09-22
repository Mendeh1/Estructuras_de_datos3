import java.util.LinkedList;

public class TextEditor {
    private LinkedList<String> textHistory;

    public TextEditor() {
        textHistory = new LinkedList<>();
    }

    public void insertText(String text) {
        // Agregar el texto al principio de la lista (al inicio del historial)
        textHistory.addFirst(text);
    }

    public void undo() {
        if (!textHistory.isEmpty()) {
            // Eliminar el texto más reciente del historial (al inicio de la lista)
            String undoneText = textHistory.removeFirst();
            System.out.println("Deshaciendo: " + undoneText);
        } else {
            System.out.println("No hay operaciones para deshacer.");
        }
    }

    public void printText() {
        System.out.println("Texto actual:");
        for (String text : textHistory) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        // Insertar texto en el editor
        textEditor.insertText("C");
        textEditor.insertText("K");
        textEditor.insertText("M");

        // Imprimir el texto actual
        textEditor.printText();

        // Deshacer la última operación
        textEditor.undo();

        // Imprimir el texto después de deshacer
        textEditor.printText();
    }
}
