package X;

/* renamed from: X.DBx  reason: case insensitive filesystem */
public final class C26744DBx implements C28576E8j {
    public static C28576E8j A00;
    public static final C26744DBx A01 = new Object();

    public synchronized C26202CuY BPN() {
        return A00().BPN();
    }

    public synchronized C25510Ch8 BSn() {
        return A00().BSn();
    }

    public synchronized C25383Cej BXQ() {
        return A00().BXQ();
    }

    public static final synchronized C28576E8j A00() {
        C28576E8j e8j;
        synchronized (C26744DBx.class) {
            e8j = A00;
            if (e8j == null) {
                throw AnonymousClass8BR.A0w("Fresco context provider must be set");
            }
        }
        return e8j;
    }

    public static final synchronized void A01(C28576E8j e8j) {
        synchronized (C26744DBx.class) {
            if (A00 != null) {
                EAY eay = C26265CwA.A00;
                if (eay.BfN(6)) {
                    eay.BJn("FrescoVitoProvider", "Fresco Vito already initialized! Vito must be initialized only once.");
                }
            }
            A00 = e8j;
        }
    }
}
