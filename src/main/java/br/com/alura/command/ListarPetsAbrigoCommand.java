package br.com.alura.command;

import br.com.alura.client.HttpCfgClient;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ListarPetsAbrigoCommand implements Command {

  @Override
  public void execute() {
    try {
      HttpCfgClient client = new HttpCfgClient();
      PetService petService = new PetService(client);

      petService.listarPetsAbrigo();

    } catch (IOException | InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }
}
