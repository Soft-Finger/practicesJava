public class Main {
    public static void main(String[] args) {
        String[] tab = {"mange", "orange", "goyave", "cerise", "papaye"};

        /*caracteres(tab);
        System.out.println(fact(5));
        afficher();*/
        System.out.println(getMessage("ep"));
        ;
    }

    public static void caracteres(String[] tab) {
        for(String fruit: tab) {
            if(fruit.equals("orange")) {
                System.out.print("1 - ");
            } else {
                for (int i = 0; i < fruit.length(); i++ ) {
                   System.out.print(fruit.charAt(i) + " - ");
                }
            }
        }
        System.out.println();
    }

    public static long fact(int n) {
        if(n < 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void afficher() {
        System.out.println("n,IMPORTE QUOI");
    }

    public static String getMessage(String language) {
        if (language.equals("ep")) {
            return "Hola Mundo";
        } else if (language.equals("fr")) {
            return "Bonjour le monde";
        } else {
            return "Hello world";
        }
    }
}
