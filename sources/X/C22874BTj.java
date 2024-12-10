package X;

/* renamed from: X.BTj  reason: case insensitive filesystem */
public final class C22874BTj extends C3J {
    public final Throwable A00;

    public static BX0 A00(String str, String str2) {
        BX0 bx0 = new BX0(str);
        new C22874BTj(new Exception(str2));
        return bx0;
    }

    public C22874BTj(Throwable th) {
        this.A00 = th;
    }

    public C22874BTj() {
        this((Throwable) null);
    }
}
