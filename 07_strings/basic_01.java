public class basic_01 {
    public static void main(String[] args){
        String str = "This is a string";
        int length = str.length();
        int idx = str.indexOf("string");
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        String sub = str.substring(0, 5);
        String rep = str.replace("is", "was");
        String con = str.concat(" concatenation perform is done ");
        String spl = str.split(" ")[0];
        System.out.println(str);
        System.out.println("This is the length:" + " " + length);
        System.out.println("This is the index:" + " " + idx);
        System.out.println("Uppercase:" + " " + upper);
        System.out.println("Lowercas:e" + " " + lower);
        System.out.println("This is the substring:" + " " + sub);
        System.out.println("Replacing with was:" + " " + rep);
        System.out.println("Concatenation:" + " " + con);
        System.out.println("This is the spliting:" + " " + spl);
    }
}