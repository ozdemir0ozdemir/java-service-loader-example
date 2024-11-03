package ozdemir0ozdemir.library.api;

import java.util.ServiceLoader;

// FIXME: What if client provides an unofficial Provider ?
// sealed interface causes cyclic dependency
public final class LibraryLoader {

    private static final ServiceLoader<Library> serviceLoader = ServiceLoader.load(Library.class);
    private static final NoOpLibrary noOpLibrary = new NoOpLibrary();

    public static Library getProvider(String providerName) {
        for (Library library : serviceLoader) {
            if (library.getClass().getSimpleName().equals(providerName)) {
                return library;
            }
        }
        System.err.println("No providers found with name: " + providerName + ", NoOpLibrary returned.");
        return LibraryLoader.noOpLibrary;
    }


    @SuppressWarnings("unchecked")
    public static <T extends Library> T getProvider(Class<T> providerClass) {
        for (Library library : serviceLoader) {
            if (library.getClass().equals(providerClass)) {
                return (T) library;
            }
        }
        System.err.println("No providers found with class name: " + providerClass.getSimpleName() + ", NoOpLibrary returned.");
        return (T) LibraryLoader.noOpLibrary;
    }

}
