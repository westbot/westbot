import java.text.SimpleDateFormat;
import java.util.Calendar;


public class App {
    public static void main(String[] args) {
        String now = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Calendar.getInstance().getTime());
        User vasya = new User.Builder().withName("Вася").withSurname("Баранкин").withEmail("barankin@gmail.com").withLastVisited(now).build();
        User zina = new User.Builder().withName("Зина").withSurname("Булавкина").withEmail("b.zina@mail.ru").withPhone("+7(965)555-1234")
                        .withNumberOfOrders(3).withBiggestCheck(200.0).withTotalOfAllPurchases(341.25)
                        .withLastVisited(now).build();

        System.out.println(vasya.toString());
        System.out.println();
        System.out.println(zina.toString());
    }
}
