public class Modulo {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        int[] numbersdurchdrei = new int[100];
        int[] numbersdurchfünf = new int[100];

        //Befüllung des Arrays mit den Zahlen 1-100
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;
        }

        //Ab hier ist das Array mit den Zahlen 1-100 befüllt

        //Nun Prüfung des Arrayinhalts, ob die entsprechende Stelle im Array durch 3 oder 5 teilbar ist.
        for (int i = 0; i < numbers.length; i++) {

            numbersdurchdrei[i] = numbers[i] % 3;
            numbersdurchfünf[i] = numbers[i] % 5;

            boolean durchdrei = (numbersdurchdrei[i] == 0);
            boolean durchfünf = (numbersdurchfünf[i] == 0);

            //Ausgabe nur, wenn durchdrei true und durchfünf false
            if (durchdrei && !durchfünf) {
                System.out.println(numbers[i] + " zig");
            }
            //Ausgabe nur, wenn durchfünf true und durchdrei false
            if (durchfünf && !durchdrei) {
                System.out.println(numbers[i] + " zag");
            }
            //Ausgabe nur, wenn durchdrei true und durchfünf true
            if (durchdrei && durchfünf) {
                System.out.println(numbers[i] + " zigzag");
            }
            //Ausgabe nur, wenn durchdrei false und durchfünf false
            if (!durchdrei && !durchfünf) {
                System.out.println(numbers[i]);
            }


        }


    }
}
