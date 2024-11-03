package ozdemir0ozdemir.library.api;

public final class DigitalLibrary implements Library {
    @Override
    public void introduceYourself() {
        System.out.println(ANSI_CYAN + "DigitalLibrary:" + ANSI_RESET + " I'm not a building. I'm just an abstraction and an illusion of books...");
    }
}
