package X;

public class C1L extends Exception {
    public C1L(Throwable th) {
        super("Failed to query underlying media codecs", th);
    }
}
