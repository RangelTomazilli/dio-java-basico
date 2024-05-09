public class SmartTv {

  boolean on = false;
  int channel = 1;
  int volume = 25;

  public void turnOn() {
    on = true;
    System.out.println("Tv Ligada");
  }

  public void turnOff() {
    on = false;
    System.out.println("Tv Desligada");
  }

  public void nextChannel() {
    channel++;
    System.out.println("Canal mudou");
    System.out.println("Canal atual: " + channel);
  }

  public void previousChannel() {
    channel--;
    System.out.println("Canal mudou");
    System.out.println("Canal atual: " + channel);
  }

  public void volumeUp() {
    volume++;
    System.out.println("Volume Aumentou");
    System.out.println("Volume atual: " + volume);

  }

  public void volumeDown() {
    volume--;
    System.out.println("Volume Diminuiu");
    System.out.println("Volume atual: " + volume);
  }
}