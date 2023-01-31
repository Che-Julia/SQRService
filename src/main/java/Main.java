import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
       int count = service.getSquareCount(400,500);

        System.out.println("Количество квадратов = " + count);
    }
}