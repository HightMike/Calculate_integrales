import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Home4 { // метод трапеций
    public static void main(String[] args) throws Exception{
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите нижний предел (строчкой ниже)");
            double a = Integer.parseInt(bufferedReader.readLine()); // нижний предел
            System.out.println("Введите верхний предел");
            double b = Integer.parseInt(bufferedReader.readLine()); // верхний
            System.out.println("Введите кол-во разбиений");
            double n = Integer.parseInt(bufferedReader.readLine()); // кол-во разбиений отрезка интегрирования.

            double h = (b - a) / n; // длина отдельного отрезка.
            double l = 0;
            double x = a;
            double y = 0; // f
            double z = a;
            double sum = 0;
            double sum1 = 0;

            for (int i = 1; i <= n; i++) {
                if (i != 1) {
                    l = (x);
                    y = Math.pow(l, 2) * Math.sin(l) / 10; // функция
                    //y=Math.pow(-0.03*x,3) +0.26*x-0.26;
                    sum = sum + y;
                    x = x + h;
                } else {
                    l = (x + h);
                    y = Math.pow(l, 2) * Math.sin(l) / 10; // функция
                    //y=Math.pow(-0.03*x,3) +0.26*x-0.26;
                    sum = sum + y;
                    x = x + h;
                }
            }
            for (int i = 1; i <= n; i++) {
                l = (z);
                y = Math.pow(l, 2) * Math.sin(l) / 10; // функция
                //y=Math.pow(-0.03*x,3) +0.26*x-0.26;
                sum1 = sum1 + y;
                z = z + h;
            }
            double result = sum1 + sum;

            System.out.println("Результат = " + result * h / 2);
        }
        catch (NumberFormatException e) {
            System.out.println("Попробуйте снова, введите корректные данные, а именно числовые!");
        }
    }
}
