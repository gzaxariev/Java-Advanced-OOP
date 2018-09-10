package telephony;

public class Smartphone implements Callable, Browsable {
    public Smartphone() {
    }

    @Override
    public String brows(String webSites) {

        if (webSites.matches(".*\\d+.*")){
            throw new IllegalArgumentException("Invalid URL!");
        }
        return  String.format("Browsing: %s!", webSites);

    }

    @Override
    public String call(String phoneNumbers) {
        if (!phoneNumbers.matches("\\d+")){
            throw new IllegalArgumentException("Invalid number!");
        }
        return String.format("Calling... %s", phoneNumbers);

    }
}
