import java.util.*;

public class Data {

    private Map<Integer, String> modelMap;
    private Map<Integer, String> colorMap;
    private Map<Integer, String> osMap;
    private Map<Integer, Object> hddMap;
    private Map<Integer, Object> ramMap;
    int getChoice;
    List<Notebook> notebooksList;

    Data() {
        this.modelMap = new HashMap<>(Map.of(1, "MacBook Pro", 2, "MacBook Air", 3, "Asus", 4, "Acer",
                5, "HP", 6, "Lenovo", 7, "Вернуться назад"));
        this.ramMap = new HashMap<>(Map.of(1, 4, 2, 8, 3, 16, 4, 32,
                5, "Вернуться назад"));
        this.hddMap = new HashMap<>(Map.of(1, 256, 2, 512, 3, 1024, 4, 2048,
                5, "Вернуться назад"));
        this.osMap = new HashMap<>(Map.of(1, "Win 10", 2, "Win 11", 3, "Win 7",
                4, "Linux", 5, "MacOS", 6, "Вернуться назад"));
        this.colorMap = new HashMap<>(Map.of(1, "black", 2, "gray", 3, "white",
                4, "red", 5, "Вернуться назад"));
        this.notebooksList = getNotebooksList();
    }

    public static List<Notebook> getNotebooksList() {
        Notebook nb01 = new Notebook("MacBook Pro", "gray", "macOS", 1024, 32);
        Notebook nb02 = new Notebook("MacBook Air", "gray", "macOS", 512, 16);
        Notebook nb03 = new Notebook("Asus", "black", "Linux", 256, 4);
        Notebook nb04 = new Notebook("MacBook Pro", "gray", "MacOS", 1024, 16);
        Notebook nb05 = new Notebook("Acer", "red", "Win 10", 2048, 32);
        Notebook nb06 = new Notebook("HP", "black", "Linux", 1024, 8);
        Notebook nb07 = new Notebook("Lenovo", "black", "Win 11", 1024, 16);
        Notebook nb08 = new Notebook("Asus", "red", "Win 11", 512, 8);
        Notebook nb09 = new Notebook("MacBook Pro", "gray", "MacOS", 2024, 32);
        Notebook nb10 = new Notebook("HP", "white", "Win 11", 512, 16);

        List<Notebook> notebooksLst = new ArrayList<>(Arrays.asList(nb01, nb02, nb03, nb04, nb05,
                nb06, nb07, nb08, nb09, nb10));
        return notebooksLst;
    }

    public void getRamChoice() {
        System.out.println("Выберите минимальный объем ОЗУ:");
        for (Map.Entry<Integer, Object> entry : ramMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        getChoice = Main.scanner.nextInt();
        if (getChoice == 5) {
            Main.menu();
        } else {
            for (Notebook notebook : this.notebooksList) {
                if (notebook.ram >= (int) ramMap.get(getChoice)) {
                    Main.printNotebook(notebook);
                }
            }
        }
    }

    public void getHddChoice() {
        System.out.println("Выберите минимальный объем HDD:");
        for (Map.Entry<Integer, Object> entry : hddMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        getChoice = Main.scanner.nextInt();
        if (getChoice == 5) {
            Main.menu();
        } else {
            for (Notebook notebook : this.notebooksList) {
                if (notebook.hdd >= (int) hddMap.get(getChoice)) {
                    Main.printNotebook(notebook);
                }
            }
        }
    }

    public void getOsChoice() {
        System.out.println("Выберите операционную систему:");
        for (Map.Entry<Integer, String> entry : osMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        getChoice = Main.scanner.nextInt();
        if (getChoice == 6) {
            Main.menu();
        } else {
            for (Notebook notebook : this.notebooksList) {
                if (notebook.os.contains(osMap.get(getChoice))) {
                    Main.printNotebook(notebook);
                }
            }
        }
    }

    public void getColorChoice() {
        System.out.println("Выберите цвет:");
        for (Map.Entry<Integer, String> entry : colorMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        getChoice = Main.scanner.nextInt();
        if (getChoice == 5) {
            Main.menu();
        } else {
            for (Notebook notebook : this.notebooksList) {
                if (notebook.color.contains(colorMap.get(getChoice))) {
                    Main.printNotebook(notebook);
                }
            }
        }
    }

    public void getModelChoice() {
        System.out.println("Выберите производителя:");
        for (Map.Entry<Integer, String> entry : modelMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        getChoice = Main.scanner.nextInt();
        if (getChoice == 7) {
            Main.menu();
        } else {
            for (Notebook notebook : this.notebooksList) {
                if (notebook.model.contains(modelMap.get(getChoice))) {
                    Main.printNotebook(notebook);
                }
            }
        }
    }
}