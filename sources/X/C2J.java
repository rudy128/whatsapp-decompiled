package X;

public final class C2J extends Exception {
    public final D48 format;

    public C2J(D48 d48, String str) {
        super(str);
        this.format = d48;
    }

    public C2J(D48 d48, Throwable th) {
        super(th);
        this.format = d48;
    }
}
