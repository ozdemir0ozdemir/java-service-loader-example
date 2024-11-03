package ozdemir0ozdemir.client;

import ozdemir0ozdemir.library.api.DigitalLibrary;
import ozdemir0ozdemir.library.api.Library;
import ozdemir0ozdemir.library.api.LibraryLoader;

// Library Test Client
public class App {
    public static void main(String[] args) {

        System.out.println("Client Started");

        Library classic = LibraryLoader.getProvider("ClassicLibrary");
        DigitalLibrary digital = LibraryLoader.getProvider(DigitalLibrary.class);
        Library unknown = LibraryLoader.getProvider("Unknown");

        classic.introduceYourself();
        digital.introduceYourself();
        unknown.introduceYourself();

    }
}
