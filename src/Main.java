public class Main {
    public static void main(String[] args) {
        WiFi wifiComputer = new WiFiAdapter(new OldComputer());
        wifiComputer.connectToWiFi();
    }
}