import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Home { // метод прямоугольников
    public static void main(String[] args) throws Exception{

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите нижний предел строчкой ниже");
            double a = Integer.parseInt(bufferedReader.readLine()); // нижний предел
            System.out.println("Введите верхний предел");
            double b = Integer.parseInt(bufferedReader.readLine()); // верхний
            System.out.println("Введите кол-во разбиений");
            double n = Integer.parseInt(bufferedReader.readLine()); // кол-во разбиений отрезка интегрирования.

            double h = (b-a)/n; // длина отдельного отрезка.
            double l=0;
            double x=a;
            double y = 0; // f

            double sum =0;//

            for (int i=1; i<=n; i++) {
                l=(x+h/2);
                y = Math.pow(l,2)*Math.sin(l)/10; // функция
                sum = sum +y;
                x=x+h;
            }



            System.out.println("Результат = " + sum*h);
        }
        catch (NumberFormatException e) {
            System.out.println("Попробуйте снова, введите корректные данные, а именно числовые!");
        }

    }
}
