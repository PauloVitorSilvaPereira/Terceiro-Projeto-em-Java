package Modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeEndereco {

    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter enderecoFinal = new FileWriter("Endereço.json");
        enderecoFinal.write(gson.toJson(endereco));
        enderecoFinal.close();
    }
}