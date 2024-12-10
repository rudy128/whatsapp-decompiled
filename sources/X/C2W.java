package X;

public class C2W extends Exception {
    public Throwable _underlyingException;

    public C2W(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }

    public static C2W A00(String str) {
        return new C2W(str, (Throwable) null);
    }

    public Throwable getCause() {
        return this._underlyingException;
    }

    public static C2W A01(String str, Throwable th) {
        return new C2W(str, th);
    }
}
