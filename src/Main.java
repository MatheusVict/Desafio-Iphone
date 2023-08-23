import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    // AparelhoTelefonico
    // Se não atender iniciar correio de voz e só tenta 3 vezes
    for (int i = 0; i < 3; i++) {
      iphone.ligar("123456789");
      if (isAnswered()) {
        iphone.atender();
        break;
      } else {
        iphone.iniciarCorreioVoz();
      }
    }

    // NavegadorInternet
    iphone.exibirPagina("www.google.com");
    iphone.adicionarNovaAba("www.google.com");
    iphone.atualizarPagina();

    // ReprodutorMusical
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Musica 1");
  }

  private static boolean isAnswered() {
    int i;
    boolean random = false;
    for (i = 0; i < 3; i++) {
      Random r = new Random();
      random = r.nextInt(3) == 1;
    }
    return random;
  }

}
