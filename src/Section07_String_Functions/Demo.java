package Section07_String_Functions;

public class Demo {
    public static void main(String[] args) {

        String text = "Welcome guys!";

        System.out.println("Original string: " + text);
        System.out.println("Returns the size of the String (n characters): " + text.length());
        System.out.println("Returns the character at position 5: " + text.charAt(5));
        System.out.println("Is the string empty?: " + text.isEmpty());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        String anotherText = "    Example text   ";
        System.out.println("Original string: " + anotherText);
        System.out.println("Removing spaces from a string: " + anotherText.trim());
        System.out.println("Extracting a part of the String: " + anotherText.substring(6, 10));


        String exampleText  = "Java";

        System.out.println("Original text: " + exampleText);
        System.out.println("Replacing letters in the text: " + exampleText.replace('a', 'o'));


        //String Comparison:

        //equals(Object obj): Checks if two strings are equal (case-sensitive).
        System.out.println("Compares whether the strings are equal: " + exampleText.equals("Java"));
        System.out.println("Compares whether the strings are equal: " + exampleText.equals("java"));

        //equalsIgnoreCase(String anotherString): Checks for equality while ignoring case.
        System.out.println("Compares whether the strings are equal, ignoring uppercase and lowercase.: " + exampleText.equalsIgnoreCase("java"));

        //compareTo(String anotherString): Compares two strings lexicographically.
        //Returns 0 if they are equal.
        //Returns a negative value if the current string is shorter.
        //Returns a positive value if the current string is longer.

        System.out.println("Java".compareTo("Java"));

        //String Search::

        System.out.println("Checks if the String contains a sequence of characters: 'va' :  "
                + exampleText.contains("va"));

        System.out.println("Retorna a posição da primeira ocorrencia do caracter 'v' na String Java :  "
                + exampleText.indexOf('v'));

        System.out.println("Returns the position of the first occurrence of the character 'v' in the Java String :  "
                + exampleText.lastIndexOf('a'));
    }
}
