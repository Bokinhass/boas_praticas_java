package br.com.alura.command;

import br.com.alura.client.HttpCfgClient;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class ListarAbrigoCommand implements Command {

  @Override
  public void execute() {
    try {
      HttpCfgClient client = new HttpCfgClient();
      AbrigoService abrigoService = new AbrigoService(client);

      abrigoService.listarAbrigo();

    } catch (IOException | InterruptedException e) {
      System.out.println(e.getMessage());
    }

  }
}
