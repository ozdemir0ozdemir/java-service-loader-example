package ozdemir0ozdemir.library.api;

public final class NoOpLibrary implements Library {

    @Override
    public void introduceYourself() {
        System.err.println(ANSI_CYAN + "NoOpLibrary:" + ANSI_RESET + " Hi, I'm not really an implementation. Please use a proper library provider");
    }
}
