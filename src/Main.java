public class Main {

    public static void main(String[] args) {
        calcularMedia(4.8, 5.9, 7.6, 9.3);
    }

    private static void calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        double mediaDasNotas = somaDasNotas / 4;


        System.out.printf("A media das notas e %.2f\n", mediaDasNotas, somaDasNotas);
    }
}