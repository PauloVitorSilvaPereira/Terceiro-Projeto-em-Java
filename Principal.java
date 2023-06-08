import Modelos.ConsultaCep;
import Modelos.Endereco;
import Modelos.GeradorDeEndereco;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        GeradorDeEndereco geradorDeEndereco = new GeradorDeEndereco();
        var leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o cep desejado: ");
        String cepDesejado = leitura.nextLine();
        Endereco endereco = consultaCep.buscaEndereco(cepDesejado);

        System.out.println(endereco);

        geradorDeEndereco.salvaJson(endereco);
    }
}
