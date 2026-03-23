public class CaseExample {

    public static void main(String[] args) {

        String expected = "LOGIN";
        String actual = "login";

        if(expected.equalsIgnoreCase(actual))
        {
            System.out.println("Login message matched");
        }
else {
            System.out.println("faild");
        }
    }

}