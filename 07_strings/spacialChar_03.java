public class spacialChar_03 {
    public static void main(String[] args) {
        // The sequence \"  inserts a double quote in a string
        String me = "This is me \"Ishan\". ";
        System.err.println(me);
        // The sequence \'  inserts a single quote in a string
        String myThings = "The car is Ishan\'s .";
        System.out.print(myThings + "\n");
        // The sequence \\  inserts a single backslash in a string
        String backSlash = "This is a backslash \\";
        System.out.print(backSlash + "\n");
    }
}

/*

\n	New Line
\r	Carriage Return
\t	Tab
\b	Backspace
\f	Form Feed

 */