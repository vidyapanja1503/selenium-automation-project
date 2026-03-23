public class MessageCheck {

    public static void main(String[] args) {

        String message = "Login Successful";

        if(message.contains("Login1")){
            System.out.println("login test passed");
        }
        else {
            System.out.println("login test fail");
        }

    }

}