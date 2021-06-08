import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

public class TheFirstClass {

    public static void main(String[] args) {
        System.out.println("Уиии");

        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.printf("3 numbers %d \n",num*3);
        in.close();

        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
        final LocalDateTime now = LocalDateTime.now();

        System.out.println("Hello, World! The current time is " + dtf.format(now));

        String john = null;
        Optional<String> name2 = Optional.ofNullable(john);
        if (name2.isPresent()) {
            System.out.println(name2 + " ok");
        }

    }
}
