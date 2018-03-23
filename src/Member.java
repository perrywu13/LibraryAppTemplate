public class Member {
    String name;
    int birthYear;
    Address address;
    int year = 2018;

    /**
     * getAge() : int
     * Instance method to calculate the member's age.
     * @return
     *          returns the member's age as an int.
     */

    public static int getAge(){
        int age = year - birthYear;
        return age;
    }


    /**
     * readBook(Book) : void
     * Will "read" a book give to the member.
     * "Reading" consists of printing out any appropriate message
     * containing the title of the book.
     *
     * @param one
     *          The book to read.
     */

    public static void read(Book one){
       System.out.println("The book I am reading is" + one.title);

    }


}
