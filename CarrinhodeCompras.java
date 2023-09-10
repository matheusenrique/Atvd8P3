import java.util.Scanner;

public class CarrinhodeCompras {
    private int tam;
        private String[] carro;

        public void remover(String[] carro){
            Scanner in = new Scanner(System.in);
            int i;
            for (i = 0; i <= carro.length-1; i++){
                System.out.println(i+1 + " " + carro[i]);
            }

            System.out.println("Qual o indice do produto a ser removido?");
            int del = in.nextInt();
            del -= 1;
            carro[del] = null;
        }

        public void adicionar(String[] carro){
            Scanner in = new Scanner(System.in);
            int i;
            for (i = 0; i <= carro.length-1; i++){
                if (carro[i] == null){
                    System.out.println("Nome do produto: ");
                    carro[i] = in.nextLine();
                }
            }
        }

        public void exibir(String[] carro){
            int i;
            for (i = 0; i <= carro.length-1; i++){
                System.out.println(i + " " + carro[i]);
            }
}
}