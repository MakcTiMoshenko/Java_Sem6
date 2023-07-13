package ru.geekbrains.api.DZ6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.*;
import java.util.LinkedList;
import java.util.Deque;

//import org.json.JSONArray; // почему-то вызывает ошибку(
//import org.json.JSONObject;


public class DZ6 {

    static Scanner scanner = new Scanner(System.in);
    static File logFile = null;
    static FileWriter fileWriter = null;
    static Random random = new Random();
    static ArrayList<ArrayList<String>> catalog = new ArrayList<>();
    


    public static void main(String[] args) throws Exception {

        System.out.println("**********************************");
        System.out.println("Здравствуйте!\nВы открыли Домашнее задание студента GeekBrains\nТимошенко Максима\n Давайте начнем!)");
        System.out.println("**********************************");
        boolean f = true;
        while(f){
            System.out.println("______________________________");
            System.out.println("ЗАДАЧИ СЕМИНАРА №1");
            System.out.println("______________________________");
            System.out.println(" ");
            System.out.println("Выберите номер задачи для проверки:");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("4 - Задача 4");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            System.out.println("ЗАДАЧИ СЕМИНАРА №2");
            System.out.println("______________________________");
            System.out.println(" ");
            System.out.println("Выберите номер задачи для проверки:");
            System.out.println("5 - Задача 1");
            System.out.println("6 - Задача 2");
            System.out.println("7 - Задача 3");
            System.out.println("8 - Задача 4");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            System.out.println("ЗАДАЧИ СЕМИНАРА №3");
            System.out.println("______________________________");
            System.out.println(" ");
            System.out.println("Выберите номер задачи для проверки:");
            System.out.println("9 - Задача 1");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            System.out.println("ЗАДАЧИ СЕМИНАРА №4");
            System.out.println("______________________________");
            System.out.println(" ");
            System.out.println("Выберите номер задачи для проверки:");
            System.out.println("10 - Задача 1");
            System.out.println("11 - Задача 2");
            System.out.println("12 - Задача 3");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            System.out.println("ЗАДАЧИ СЕМИНАРА №5");
            System.out.println("______________________________");
            System.out.println(" ");
            System.out.println("Выберите номер задачи для проверки:");
            System.out.println("13 - Задача 1");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            System.out.println("ЗАДАЧИ СЕМИНАРА №6");
            System.out.println("______________________________");
            System.out.println(" ");
            System.out.println("Выберите номер задачи для проверки:");
            System.out.println("14 - Задача 1");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println(" ");

            switch(no){
                case 1:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Вычислить n-ое треугольного число\n (сумма чисел от 1 до n), n!\n (произведение чисел от 1 до n) ");
                    System.out.println("\n");
                    System.out.print("Введите число n: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ответ: ");
                    Exemple1(n);
                    break;

                case 2:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Вывести все простые числа от 1 до 1000 ");
                    System.out.println("\n");
                    System.out.println("Ответ: ");
                    Exemple2();
                    break;

                case 3:

                    System.out.print("Условие задачи:\n");
                    System.out.print("Реализовать простой калькулятор ");
                    System.out.println("\n");
                    System.out.print("Введите число 1: ");
                    double num1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Введите число 2: ");
                    double num2 = Double.parseDouble(scanner.nextLine());
                    double res = 0;
                    Exemple3(num1,num2,res);
                    break;

                case 4:

                    System.out.print("Условие задачи:\n");
                    System.out.print("Задано уравнение вида q + w = e, q, w, e >= 0. \nНекоторые цифры могут быть заменены знаком вопроса, например, \n2? + ?5 = 69. Требуется восстановить выражение до верного равенства.\n Предложить хотя бы одно решение или сообщить, что его нет.");
                    System.out.println("\n");
                    Exemple4();
                    break;

                case 5:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Дана строка sql-запроса 'select * from students where'.\nСформируйте часть WHERE этого запроса, используя StringBuilder. \nДанные для фильтрации приведены ниже в виде json-строки.\nЕсли значение null, то параметр не должен попадать в запрос.\nПараметры для фильтрации: \n{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}");
                    System.out.println("\n");
                    Map<String, String> params1 = new HashMap<String,String>();
                    params1.put("name","Ivanov");
                    params1.put("country","Russia");
                    params1.put("city","Moscow");
                    params1.put("age",null);
                    System.out.println("Ответ: \n");
                    System.out.println(Exemple5(params1));
                    System.out.println("\n");
                    break;
                
                case 6:
                    logFile = new File("log.txt");
                    fileWriter = new FileWriter(logFile, true);
                    fileWriter.flush();
                    System.out.print("Условие задачи:\n");
                    System.out.print("Реализуйте алгоритм сортировки пузырьком числового массива, \nрезультат после каждой итерации запишите в лог-файл.");
                    System.out.println("\n");
                    System.out.println("Введите массив через пробел: ");
                    String number = scanner.nextLine();
                    String strArr[] = number.split(" ");
                    fileWriter.write("Исходный Массив: " + Arrays.toString(strArr) + "\n");
                    int array[] = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        array[i] = Integer.parseInt(strArr[i]);
                        }
                    //int[] array = {11, 3, 14, 16, 7};
                    Exemple6(array);
                    fileWriter.close();
                    break;

                case 7:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Дана json-строка (можно сохранить в файл и читать из файла)\n[{'фамилия':'Иванов','оценка':'5','предмет':'Математика'},\n{'фамилия':'Петрова','оценка':'4','предмет':'Информатика'},\n{'фамилия':'Краснов','оценка':'5','предмет':'Физика'}].\nНаписать метод(ы), который распарсит json и, используя StringBuilder, \nсоздаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].\nПример вывода:\nСтудент Иванов получил 5 по предмету Математика.\nСтудент Петрова получил 4 по предмету Информатика.\nСтудент Краснов получил 5 по предмету Физика.");
                    System.out.println("\n");
                    Exemple7();
                    break;

                case 8:
                    logFile = new File("log.txt");
                    fileWriter = new FileWriter(logFile, true);
                    fileWriter.flush();
                    System.out.print("Условие задачи:\n");
                    System.out.print("Реализовать простой калькулятор \nК калькулятору из предыдущего ДЗ добавить логирование.");
                    System.out.println("\n");
                    System.out.print("Введите число 1: ");
                    double num3 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Введите число 2: ");
                    double num4 = Double.parseDouble(scanner.nextLine());
                    double res1 = 0;
                    Exemple8(num3,num4,res1);
                    fileWriter.close();
                    break;

                case 9:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Задание\nПусть дан произвольный список целых чисел.\n1) Нужно удалить из него чётные числа\n2) Найти минимальное значение\n3) Найти максимальное значение\n4) Найти среднее значение");
                    System.out.println("\n");
                    Exemple9();
                    break;

                case 10:
                    System.out.print("Условие задачи:\n");
                    System.out.print("1. Пусть дан LinkedList с несколькими элементами. \nРеализуйте метод, который вернет “перевернутый” список.");
                    System.out.println("\n");
                    Exemple10();
                    break;

                case 11:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Реализуйте очередь с помощью LinkedList со следующими методами:\nenqueue() - помещает элемент в конец очереди,\ndequeue() - возвращает первый элемент из очереди и удаляет его,\nfirst() - возвращает первый элемент из очереди, не удаляя.");
                    System.out.println("\n");
                    Exemple11();
                    newMain();
                    break;

                case 12:

                    System.out.print("Условие задачи:\n");
                    System.out.print("В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию. ");
                    System.out.println("\n");
                    System.out.print("Введите число 1: ");
                    double num5 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Введите число 2: ");
                    double num6 = Double.parseDouble(scanner.nextLine());
                    double res2 = 0;
                    Exemple8(num5,num6,res2);
                    System.out.print("Для отмены операции нажмите: 1 \nДля продолжения: 2 ");
                    Scanner v = new Scanner(System.in);
                    int vib = v.nextInt();
                    while(true){
                        if(vib == 1){
                            Exemple8(num5, num6, res2);
                            break;
                        }
                        if(vib == 2){
                            break; 
                        }
                        
                    }
                case 13:
                    System.out.print("Условие задачи:\n");
                    System.out.print("Создать простой телефонный справочник");
                    System.out.println("\n");
                    String[] phones = {
                        "89456238431 Григорьев",
                        "89657438654 Фокин",
                        "89264532134 Шестаков",
                        "89765434657 Хохлов",
                        "89086098765 Шубин",
                        "89076543219 Гущина",
                        "89076543654 Брагина",
                        "89086543928 Афанасьева"
                    };
                        // String[] phones = {
                        //     "Григорьев 89456238431",
                        //     "Фокин 89657438654",
                        //     "Шестаков 89264532134",
                        //     "Хохлов 89765434657",
                        //     "Шубин 89086098765",
                        //     "Гущина 89076543219",
                        //     "Брагина 89076543654",
                        //     "Афанасьева 89086543928"
                        // };
                        Exemple13(phones);
                        break;
                    
                    case 14:
                        System.out.print("Условие задачи:\n");
                        System.out.print("ССоздайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.");
                        System.out.println("\n");
                        Exemple14();
                        break;
                        
                    

                case 0:
                    System.out.println("Завершение работы. \nСпасибо за то что пользовались моим приложением. \nДо новых встреч!!!");
                    f = false;
                    break;
                
                default:
                    System.out.println("Вы указали некорректный номер задачи.\nПовторите попытку ввода.");
                break;

            }
        }

    }

     /*
     * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
     */
    static void Exemple1(int num){

        int sum1 = 0;
        int sum2 = 1;
        for(int i=1; i<num+1; i++){
            sum1 = sum1 + i;
        }
        for(int i=1; i<num+1; i++){
            sum2 = sum2 * i;
        }
        System.out.printf("Сумма чисел n = %d\nПроизведение чисел n = %d\n", sum1,sum2);

    }


    /*
     * Вывести все простые числа от 1 до 1000 
     */
    static void Exemple2(){
        for (int j = 2; j <= 1000; j++) {
            boolean flag = false;

            for (int i = 2; i * i <= j; i++) {
                flag = (j % i == 0);
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                System.out.print(j + " ");
            }
        }
        System.out.print("\n");
    }

     /*
     Реализовать простой калькулятор
     */
    static void Exemple3(double num1,double num2,double res){
        System.out.print("\nВведите производимую операцию (+, -, *, /): ");
        String sim = scanner.nextLine();
        switch(sim) {
            case "+": 
                res = num1 + num2;
                System.out.println("Результат сложения: " + res);
               break;
            case "-": 
                res = num1 - num2;
                System.out.printf("Результат вычетания: %f\n", res);
               break;
            case "*": 
                res = num1 * num2;
                System.out.printf("Результат умножения: %f\n", res);
               break;
            case "/": 
                res = num1 / num2;
                System.out.printf("Результат деления: %f\n", res);
               break;
            default:  System.out.print("Ошибка!!!");
               return;
        }

    }
    //Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
    static void Exemple4(){
        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();
        String[] parts = equation.split("\s*[+=]\s*");
        // System.out.print(Arrays.asList(parts)); // Проверка что выражение разбивает на массив
        int q = -1, w = -1, e = -1;
        for(int i = 0; i<10; i++){
            if(q == -1 && !parts[0].contains("?")){
                q = Integer.parseInt(parts[0]);
            }
            if(w == -1 && !parts[1].contains("?")){
                w = Integer.parseInt(parts[1]);
            }
            if(e == -1 && !parts[2].contains("?")){
                e = Integer.parseInt(parts[2]);
            }
            if(parts[0].charAt(i) == '?'){
                q = i;
            }
            if(parts[1].charAt(i) == '?'){
                w = i;
            }
            if(parts[2].charAt(i) == '?'){
                e = i;
            }
        }
        if(q + w == e && q != -1 && w != -1 && e != -1){
            System.out.printf("%d + %d = %d", q, w, e);

        }
        else {
            System.out.print("Решений нет!(");
        }
    }

    //Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.Если значение null, то параметр не должен попадать в запрос.Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    public static String Exemple5(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }
    
    
    //Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
    public static int Exemple6(int[] inputArray) throws Exception{
        int [] mas = inputArray;
 
        boolean isSorted = false;
        int buf = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    fileWriter.write("Процесс: " + Arrays.toString(mas) + "\n");
                }
            }
        }
        
        System.out.println(Arrays.toString(mas));
        fileWriter.write("Результат: " + Arrays.toString(mas) + "\n");
        return buf;  
    }

    //Дана json-строка (можно сохранить в файл и читать из файла) [{'фамилия':'Иванов','оценка':'5','предмет':'Математика'},{'фамилия':'Петрова','оценка':'4','предмет':'Информатика'},{'фамилия':'Краснов','оценка':'5','предмет':'Физика'}].Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].Пример вывода:Студент Иванов получил 5 по предмету Математика.Студент Петрова получил 4 по предмету Информатика.Студент Краснов получил 5 по предмету Физика.
    public static void Exemple7(){
        System.out.println("Извините, Задача в стадии разработки!\n");
    //     String jsoString = "[{'фамилия':'Иванов','оценка':'5','предмет':'Математика'},{'фамилия':'Петрова','оценка':'4','предмет':'Информатика'},{'фамилия':'Краснов','оценка':'5','предмет':'Физика'}]";
    //     JSONArray jsonArray = new JSONArray(jsoString);
    //     StringBuilder result = new StringBuilder();
    //     for (int i = 0; i<jsonArray.lendth(); i++){
    //         JSONObject jsonObject = jsonArray.getJSONObject(i);
    //         String lastName = jsonOject.getString("фамилия");
    //         String subject = jsonOject.getString("предмет");
    //         String mark = jsonOject.getString("оценка");
    //         result.append(String.format("Студент %s получил %s по предмету %s.%n", lastName, mark, subject));
    //     }
    //     System.out.println(result.toString());
    
    }

    //К калькулятору из предыдущего ДЗ добавить логирование.
    static void Exemple8(double num1,double num2,double res)
    {
        try
        {
            System.out.print("\nВведите производимую операцию (+, -, *, /): ");
            String sim = scanner.nextLine();
            switch(sim) 
            {
                case "+": 
                    res = num1 + num2;
                    System.out.println("Результат сложения: " + res);
                    fileWriter.write(num1 + "+" + num2 + "=" + res + "\n");
                break;
                case "-": 
                    res = num1 - num2;
                    System.out.printf("Результат вычетания: %f\n", res);
                    fileWriter.write(num1 + "-" + num2 + "=" + res + "\n");
                break;
                case "*": 
                    res = num1 * num2;
                    System.out.printf("Результат умножения: %f\n", res);
                    fileWriter.write(num1 + "*" + num2 + "=" + res + "\n");
                break;
                case "/": 
                    res = num1 / num2;
                    System.out.printf("Результат деления: %f\n", res);
                    fileWriter.write(num1 + "/" + num2 + "=" + res + "\n");
                break;
                default:  System.out.print("Ошибка!!!");
                return;
                
            }
        }    
        catch(Exception ex){
            System.out.println("Работа приложения будет завершена.");
        }
    }
           
    //Задание

    // Пусть дан произвольный список целых чисел.

    // 1) Нужно удалить из него чётные числа
    // 2) Найти минимальное значение
    // 3) Найти максимальное значение
    // 4) Найти среднее значение   

    
    static void Exemple9(){
        int size = random.nextInt(10, 21);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++){
            arrayList.add(random.nextInt(1, 100));
        }
        System.out.println("Рандомный массив: " + arrayList);
        //1) Нужно удалить из него чётные числа
        //Вариант 1 с добавлением нечетных чисел в новый массив
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < arrayList.size(); i++) 
            if(arrayList.get(i) %2 != 0)
                list2.add(arrayList.get(i));
        // Вариант 2 с изменением первоначального массива
        // for(int i = 0; i <arrayList.size(); i++) {
        //     if(arrayList.get(i)%2 == 0){
        //         arrayList.remove(i);
        //     }
        // }
        // System.out.println("После удаления четных элементов: " + arrayList);
        System.out.println("После удаления четных элементов: " + list2);
        
        //Найти минимальное значение
        
        int MinValue = 100;
        for(int i = 0; i < arrayList.size(); i++) 
            if(arrayList.get(i) < MinValue){
                MinValue = arrayList.get(i);
            }
            System.out.println("Минимальное значение: " + MinValue);
    
        //Найти максимальное значение
        int MaxValue = 0;
        for(int i = 0; i < arrayList.size(); i++) 
            if(arrayList.get(i) > MaxValue){
                MaxValue = arrayList.get(i);
            }
            System.out.println("Максимальное значение: " + MaxValue);
    

        // Найти среднее значение
        int sum = 0;
        int result = 0;
        for(int i = 0; i < arrayList.size(); i++){
            sum = sum+arrayList.get(i);
            }
            result = sum / arrayList.size();
            System.out.println("Среднеарифметическое значение: " + result);
            // Мое предположение среднего значения
        for(int i = 0; i < arrayList.size(); i++) 
            if((result-5) <arrayList.get(i) && arrayList.get(i)<(result+5)){
                System.out.println("Среднее значение: " + arrayList.get(i));
            }    
    }

    //1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    public static void Exemple10(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Привет");
        list.add("дорогой");
        list.add("GeekBrains");
        list.add("Жду");
        list.add("Скорой");
        list.add("Встречи");
        System.out.println(list);
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList); 
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
    
    public static Deque<Object> Exemple11(){
        Deque<Object> list = new LinkedList<>();
        list.add("Старт");
        list.add("один");
        list.add("word");
        list.add(3);
        list.add("Конец");
        return list;
    }
    public static void printList(Deque<Object> list){
        for(Object el: list){
            System.out.printf(el + " ");
        }
        System.out.println();
    }
    public static void enqueue(Deque<Object> list){
        System.out.println("Введите элемент, который надо добавить: ");
        Scanner sc1 = new Scanner(System.in);
        Object element = sc1.nextLine();
        list.addLast(element);
        sc1.close();
        return;
    }
    public static Object dequeue(Deque<Object> list){
        Object item = list.pollFirst();
        return item;
    }
    public static Object first(Deque<Object> list){
        return list.peekFirst();
    }
    public static void newMain() {
        Deque<Object> que = new LinkedList<>();
        que = Exemple11();
        printList(que);
        System.out.println("Введиет номер операции: \n1 — поместить элемент в конец очереди; \n2 — вернуть первый элемент из очереди и удалить его; \n3 — вернуть первый элемент из очереди, не удаляя; \n4 — завершение работы");
        while(true){
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();
            if (cmd == 1){
                enqueue(que);
                printList(que);
                continue;
            }
            if (cmd == 2) {
                System.out.println("Первый элемент: " + dequeue(que));
                printList(que);
                continue;
            }
            if (cmd == 3){
                System.out.println("Первым элементом был: " + first(que));
                continue;
            }
            if (cmd == 4) break;
            else {
                System.out.println("Для выхода из программы введите 4");
            }
            sc.close();
        }
    }

    // В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.
    // static void Exemple12(double num5,double num6,double res3){
    //     System.out.print("\nВведите производимую операцию (+, -, *, /): ");
    //     String sim = scanner.nextLine();
        
    //     switch(sim) {
    //         case "+": 
    //         while(true){
    //             res3 = num5 + num6;
    //             System.out.println("Результат сложения: " + res3);
    //             System.out.println("Для отмены операции нажмите N");
    //             String vib = scanner.nextLine();
    //             if(vib == "N"){
    //                 continue;
    //             }
    //             else{
    //                 break;
    //             }
    //            //break;
    //         case "-": 
    //             res3 = num5 - num6;
    //             System.out.printf("Результат вычетания: %f\n", res3);
    //            break;
    //         case "*": 
    //             res3 = num5 * num6;
    //             System.out.printf("Результат умножения: %f\n", res3);
    //            break;
    //         case "/": 
    //             res3 = num5 / num6;
    //             System.out.printf("Результат деления: %f\n", res3);
    //            break;
    //         default:  System.out.print("Ошибка!!!");
    //            return;
    //     }

    //Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
    // В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
    // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    // тогда при запросе такой фамилии должны выводиться все телефоны.

    // ***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
    // взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
    static void Exemple13(String[] phones){
        HashMap<String, String> hashMap1 = new HashMap<>();
        

        for (String person : phones) {
            String[] personParts = person.split(" ");
            hashMap1.put(personParts[0], personParts[1]);
        }
        System.out.println("Для поиска по фамилии нажмите 1\nДля добавления контакта нажмите 2");
        Integer p = Integer.parseInt(scanner.nextLine());
        try{
            switch(p){
                case 1:
                    System.out.println("Введите Фамилию: ");
                    String n = scanner.nextLine();
                    for (Map.Entry<String, String> element : hashMap1.entrySet()) {
                        if (element.getValue().equals(n))
                            System.out.println("Номер телефона: " + element.getKey());
                    }
                break;
                case 2:
                    System.out.println("Введите Фамилию: ");
                    String u = scanner.nextLine();
                    System.out.println("Введите Номер телефона: ");
                    String nom = scanner.nextLine();
                    for (Map.Entry<String, String> element : hashMap1.entrySet()) {
                        if (element.getValue().equals(u))
                            System.out.println("Контакт уже существует");
                            // System.out.println("Добавить новый? " );
                            // System.out.println("Для добавления нажмите 3. отмена 4 ");
                            // Integer chose = Integer.parseInt(scanner.nextLine());
                            // switch(chose){
                            //     case 3:
                            //         hashMap1.put(nom,u);
                            //         System.out.println(hashMap1);
                            //         break;
                            //     case 4:
                            //         break;
                            // }
                            
                        else hashMap1.put(nom,u);
                            System.out.println(hashMap1);
                    }
                        
            }
        }
        catch(Exception ex){
            System.out.println("Работа приложения будет завершена.");
        }

        
    }
    //Задание
    // Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
    // Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
    // Создайте метод
    // public boolean equals(Object o)
    // Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
    // Создайте метод
    // public int hashCode()
    // который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
    // Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
    static void Exemple14(){

        Cats cat1 = new Cats();
        cat1.id = 1;
        cat1.age = 5;
        cat1.weight = 6.5;
        cat1.nickName = "Барсик";

        Cats cat2 = new Cats();
        cat2.id = 2;
        cat2.age = 9;
        cat2.weight = 5.9;
        cat2.nickName = "Маркиз";

        Cats cat3 = new Cats();
        cat3.id = 3;
        cat3.age = 7;
        cat3.weight = 4.5;
        cat3.nickName = "Мурка";

        Cats cat4 = new Cats();
        cat4.id = 4;
        cat4.age = 9;
        cat4.weight = 5.9;
        cat4.nickName = "Мурзик";

        Cats cat5 = new Cats();
        cat5.id = 5;
        cat5.age = 2;
        cat5.weight = 4.5;
        cat5.nickName = "Том";

        Cats cat6 = new Cats();
        cat6.id = 6;
        cat6.age = 7;
        cat6.weight = 4.5;
        cat6.nickName = "Масяня";

        Cats cat7 = new Cats();
        cat7.id = 7;
        cat7.age = 8;
        cat7.weight = 3.5;
        cat7.nickName = "Пупок";

        Cats cat8 = new Cats();
        cat8.id = 8;
        cat8.age = 9;
        cat8.weight = 6.0;
        cat8.nickName = "Шухер";

        Cats cat9 = new Cats();
        cat9.id = 9;
        cat9.age = 2;
        cat9.weight = 3.5;
        cat9.nickName = "Белка";

        Cats cat10 = new Cats();
        cat10.id = 10;
        cat10.age = 5;
        cat10.weight = 6.5;
        cat10.nickName = "Черныш";

        Cats cat11 = new Cats();
        cat10.id = 10;
        cat10.age = 5;
        cat10.weight = 6.5;
        cat10.nickName = "Черныш";

        //System.out.println(cat5);
        var cats = new HashSet<Cats>(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10));
        //System.out.println(cats);
        System.out.println(cat1.equals(cat10));
        System.out.println(cats.contains(cat11));
        System.out.println(cats);
    }
}
