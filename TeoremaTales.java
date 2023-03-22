import java.util.Random;
import java.lang.Iterable;
public class TeoremaTales {
    public static void main(String[] args) {
        String figura =
        "                                       \n"+
        "              #        #               \n"+
        "___________A_#__________#_M____________\n"+
        "            #            #             \n"+
        "           #              #            \n"+
        " _______B_#________________#_N________ \n"+
        "         #                  #          \n"+
        "        #                    #         \n"+
        "       #                      #        \n"+
        "  __C_#________________________#_P___  \n"+
        "     #                          #      \n"+
        "    #                            #     \n";

        Random random = new Random();
        int numeroAleatorio = random.nextInt();
        System.out.println("Numero Aleatorio e " + numeroAleatorio);

        String stringNumero = Integer.toString(numeroAleatorio);
        System.out.println(stringNumero);

    }
}