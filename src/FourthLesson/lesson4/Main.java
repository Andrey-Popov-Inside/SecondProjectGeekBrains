package FourthLesson.lesson4;

public class Main {

    public static void main(String[] args) {
        doPhoneBook();
        System.out.println("******************************");
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Chuk","89675649109");
        phoneBook.addElementPhoneBook("Chuk","89676449110");
        phoneBook.addElementPhoneBook("Chuk","89675449111");

        phoneBook.addElementPhoneBook("Gek","888888");
        phoneBook.addElementPhoneBook("Gek","888888");
        phoneBook.addElementPhoneBook("Gek","888888   ");
        phoneBook.addElementPhoneBook("Gek","888  88 8 ");
        phoneBook.addElementPhoneBook("Gek","8  8  8 888     ");

        System.out.println("Chuk: " + phoneBook.getPhonesByName("Chuk"));
        System.out.println("Gek: " + phoneBook.getPhonesByName("Gek"));
        System.out.println("Bolik: " + phoneBook.getPhonesByName("Bolik"));
        System.out.println("Lelik: " + phoneBook.getPhonesByName("Lelik"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "Mama";
        strings[1] = "Papa";
        strings[2] = "Puma";
        strings[3] = "Irbis";
        strings[4] = "Mama";
        strings[5] = "Papa";
        strings[6] = "Kot";
        strings[7] = "Sobaka";
        strings[8] = "Dochka";
        strings[9] = "Sobaka";
        return strings;
    }

}