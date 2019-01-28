import java.io.BufferedReader; // импортирую классы чтобы работать с потоками ввода/вывода
import java.io.InputStreamReader;

public class Home { // метод прямоугольников
    public static void main(String[] args) throws Exception{ // классы InputStreamReader и BufferedReader требует проверки исключения IOException, его можно обработать либо в блоке try - catch, либо как я тут сделал выбросить в методе и  уже другой программист который будет использовать этот метод будет обрабатывать это исключение.

        try { // тут обработка исключения NumberFormatException, на тот случай если пользователь заместо чисел будет вводить строковой тип

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // Класс BufferedReader нужен просто для скорости, работа идет с буффером благодаря чему скорость работы повышается. BufferedReader в своей реализации принимает Reader, класс который следит за тем откуда будет поступать информация, в данном случае это System.in - консоль
            System.out.println("Введите нижний предел строчкой ниже"); // вывод строки.

            double a = Integer.parseInt(bufferedReader.readLine()); // нижний предел. bufferedReader.readLine() - вызываю у переменной bufferedReader метод readLine(), который отвечает за чтение строки ( в нашем случае с консоли), после эту строку преобразаю в числовой тип как Integer.parseInt. тип double завел чтобы была поддержка чисел с плавающей запятой.
            System.out.println("Введите верхний предел");
            double b = Integer.parseInt(bufferedReader.readLine()); // верхний
            System.out.println("Введите кол-во разбиений");
            double n = Integer.parseInt(bufferedReader.readLine()); // кол-во разбиений отрезка интегрирования.

            double h = (b-a)/n; // длина отдельного отрезка. формула из метода прямоугольников
            double l=0;
            double x=a; // нижний предел
            double y = 0; // f

            double sum =0;// сюда добавляется значени после каждой итерации из цикла ниже

            for (int i=1; i<=n; i++) { // цикл от i до n (кол-во разбиений)
                l=(x+h/2);
                y = Math.pow(l,2)*Math.sin(l)/10; // значение функции в точке l
                sum = sum +y; // добавляем значение в точке l в сумирующую переменную.
                x=x+h; // переходим к следующей итерации.
            }



            System.out.println("Результат = " + sum*h);
        }
        catch (NumberFormatException e) {
            System.out.println("Попробуйте снова, введите корректные данные, а именно числовые!");
        }

    }
}
