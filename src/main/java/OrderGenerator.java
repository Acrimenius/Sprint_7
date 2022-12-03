import java.util.List;

public class OrderGenerator {
    public static Order getNewOrder(List<String> color){
        return new Order(
                "Pavel",
                "Ivanov",
                "Moscow",
                4,
                "+7 888 888 88 88",
                5,
                "2020-12-12",
                "Samokat na prokat",
                color);
    }
}
