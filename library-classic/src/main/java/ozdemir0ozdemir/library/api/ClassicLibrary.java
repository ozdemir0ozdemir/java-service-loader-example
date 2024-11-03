package ozdemir0ozdemir.library.api;

public final class ClassicLibrary implements Library {
    @Override
    public void introduceYourself() {
        System.out.println(ANSI_CYAN + "ClassicLibrary:" + ANSI_RESET + " Hi, I'm a classic library and i have guests...");
    }
}
