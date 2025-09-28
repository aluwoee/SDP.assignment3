public class WiFiAdapter implements WiFi {
    private OldComputer computer;

    public WiFiAdapter(OldComputer computer) {
        this.computer = computer;
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Computer connected to the Internet via Wi-Fi");
        computer.connectWithEthernet();
    }
}