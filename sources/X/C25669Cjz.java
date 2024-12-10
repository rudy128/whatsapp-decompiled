package X;

/* renamed from: X.Cjz  reason: case insensitive filesystem */
public class C25669Cjz {
    public final int A00;
    public final AnonymousClass1IX A01;
    public final String A02;
    public final Throwable A03;

    public Throwable A01() {
        C27252Dae dae = new C27252Dae(this);
        Throwable th = this.A03;
        if (th != null) {
            A00(th, dae);
            return th;
        }
        String str = this.A02;
        if (str != null) {
            C27253Daf daf = new C27253Daf(this, str);
            A00(daf, dae);
            return daf;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Remote error code ");
        C27253Daf daf2 = new C27253Daf(this, C17880vN.A0t(A10, this.A00));
        A00(daf2, dae);
        return daf2;
    }

    public C25669Cjz(AnonymousClass1IX r1, String str, Throwable th, int i) {
        this.A00 = i;
        this.A03 = th;
        this.A02 = str;
        this.A01 = r1;
    }

    public static void A00(Throwable th, Throwable th2) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th.getClass() != th2.getClass()) {
            try {
                th.initCause(th2);
            } catch (IllegalStateException e) {
                AnonymousClass0DT.A00(e, th2);
            }
        }
    }
}
