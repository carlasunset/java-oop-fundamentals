package Section12_Enums_Composition.composicao.exercicio_resolvido2.entities;

public class Comment {
    private String text;

    public Comment(){

    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
