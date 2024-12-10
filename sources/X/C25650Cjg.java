package X;

/* renamed from: X.Cjg  reason: case insensitive filesystem */
public final class C25650Cjg {
    public Throwable A00;
    public Throwable A01;

    public final CVE A01(EAT eat) {
        return new CVE(new BVu(this, eat, 3));
    }

    public static final void A00(C25650Cjg cjg, Throwable th) {
        Throwable th2 = cjg.A01;
        if (th2 == null) {
            th2 = th;
        }
        cjg.A01 = th2;
        if (cjg.A00 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(" Exception2: ");
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            th = new Throwable(AnonymousClass000.A0y(message, A10), new Throwable("exception1", cjg.A00));
        }
        cjg.A00 = th;
    }
}
