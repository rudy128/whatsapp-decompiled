package X;

/* renamed from: X.DCy  reason: case insensitive filesystem */
public class C26769DCy implements C28619EAr {
    public static C26769DCy A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.DCy] */
    public static synchronized C26769DCy A00() {
        C26769DCy dCy;
        synchronized (C26769DCy.class) {
            C26769DCy dCy2 = A00;
            dCy = dCy2;
            if (dCy2 == null) {
                ? obj = new Object();
                A00 = obj;
                dCy = obj;
            }
        }
        return dCy;
    }
}
