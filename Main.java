import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        System.out.println("Выберите параметр:");
        System.out.println("1 - Производитель\n2 - Цвет\n3 - Операционная система\n4 - Размер HDD\n5 - Размер ОЗУ");
        int input = Main.scanner.nextInt();
        choice(input);
    }

    static void choice (int num){
        Data choiceParam = new Data();
        switch (num){
            case 1:
                choiceParam.getModelChoice();
                return;
            case 2:
                choiceParam.getColorChoice();
                return;
            case 3:
                choiceParam.getOsChoice();
                return;
            case 4:
                choiceParam.getHddChoice();
                return;
            case 5:
                choiceParam.getRamChoice();
                return;
            default:
                System.out.println("Вы ввели не корректные данные, попробуйте еще раз");
                menu();
        }
    }

    static void printNotebook(Notebook notebook){
        System.out.println("Производитель: "+notebook.model);
        System.out.println("Цвет: "+notebook.color);
        System.out.println("Объем ОЗУ: "+notebook.ram);
        System.out.println("Объем жесткого диска: "+notebook.hdd);
        System.out.println("Операционная система "+notebook.os);
        System.out.println();
    }
    public static Scanner scanner = new Scanner(System.in);
}