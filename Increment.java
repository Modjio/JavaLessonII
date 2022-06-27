// Независимо от изменений значения параметра внутри метода, значение переменной вне метода не меняется

public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Значение x до метода равно: " + x);
        increment(x);
        System.out.println("Значение x после метода равно: " + x);
    }

// Одинаковые имена не имеют значения, параметр является переменной внутри метода с собственной областью памяти
    public static void increment(int x) {
        x++;
        System.out.println("Значение x в методе равно: " + x);
    }
}
