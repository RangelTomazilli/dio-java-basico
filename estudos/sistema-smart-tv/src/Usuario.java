public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv SmartTv = new SmartTv();

        System.out.println("TV Ligada? " + SmartTv.on);
        System.out.println("Canal atual? " + SmartTv.channel);
        System.out.println("Volume atual? " + SmartTv.volume);

        SmartTv.turnOn();
        System.out.println("TV Ligada? " + SmartTv.on);

        SmartTv.volumeUp();
        SmartTv.volumeUp();
        SmartTv.volumeUp();

        System.out.println("Volume atual? " + SmartTv.volume);

        SmartTv.nextChannel();
        SmartTv.nextChannel();
        SmartTv.nextChannel();
        SmartTv.nextChannel();
        System.out.println("Canal atual? " + SmartTv.channel);
    }
}
