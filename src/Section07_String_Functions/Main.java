package Section07_String_Functions;

public class Main {
    public static void main(String[] args) {

        String texto = "Bem vindos!";

        System.out.println("String Original: " + texto);
        System.out.println("Retorna o tamanho da String n de caracteres: " + texto.length());
        System.out.println("Retorna o caracter na posição 5: " + texto.charAt(5));
        System.out.println("A string está vazia?: " + texto.isEmpty());
        System.out.println("Uppercase: " + texto.toUpperCase());
        System.out.println("Lowercase: " + texto.toLowerCase());

        String outroTexto = "    Exemplo texto   ";
        System.out.println("String Original: " + outroTexto);
        System.out.println("Removendo espaços da String: " + outroTexto.trim());
        System.out.println("Extraindo uma parte da String: " + outroTexto.substring(6, 10));


        String exemploTexto  = "Java";

        System.out.println("Texto Original: " + exemploTexto);
        System.out.println("Substituindo letras no texto: " + exemploTexto.replace('a', 'o'));


        //Comparação de Strings:

        //equals(Object obj): Verifica se duas strings são iguais (considera maiúsculas e minúsculas).
        System.out.println("Compara se as Strings são iguais: " + exemploTexto.equals("Java"));
        System.out.println("Compara se as Strings são iguais: " + exemploTexto.equals("java"));

        //equalsIgnoreCase(String anotherString): Verifica igualdade ignorando maiúsculas e minúsculas.
        System.out.println("Compara se as Strings são iguais, ignorando maiuscula ou minuscula: " + exemploTexto.equalsIgnoreCase("java"));

        //compareTo(String anotherString): Compara duas strings lexicograficamente.
        //Retorna 0 se forem iguais.
        //Retorna um valor negativo se a string atual for menor.
        //Retorna um valor positivo se a string atual for maior.

        System.out.println("Java".compareTo("Java"));

        //Busca em Strings:

        System.out.println("Busca se a String contem uma sequencia de caracteres:va :  "
                + exemploTexto.contains("va"));

        System.out.println("Retorna a posição da primeira ocorrencia do caracter 'v' na String Java :  "
                + exemploTexto.indexOf('v'));

        System.out.println("Retorna a ultima ocorrencia do caracter 'a' na String Java :  "
                + exemploTexto.lastIndexOf('a'));
    }
}
