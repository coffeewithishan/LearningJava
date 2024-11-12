/*switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
} */

public class switchCh_05{
  public static void main(String[] args) {
      int day = 5;
      switch(day){
        case 1:
        System.out.println("Mon");
        break;
        case 2:
        System.out.println("Tue");
        break;
        case 3:
        System.out.println("Wed");
        break;
        case 4:
        System.out.println("Th");
        break;
        case 5:
        System.out.println("Fri");
        break;
        case 6:
        System.out.println("Sat");
        break;
        default:
        System.out.println("Sun");
        break;
      }

      // switch using java12 methods
      String weekDay = "Sun";
      switch (weekDay){
      case "mon" -> System.out.println(1);
      case "Tue" -> System.out.println(2);
      case "Wed" -> System.out.println(3);
      case "Th" -> System.out.println(4);
      case "Fri" -> System.out.println(5);
      case "Sat" -> System.out.println(6);
      case "Sun" -> System.out.println(7);
      default -> System.out.println("Give the value properly");
      }
  }
}