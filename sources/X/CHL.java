package X;

public abstract class CHL {
    public static final E2A A00;
    public static final E2A A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.E2A, java.lang.Object] */
    static {
        E2A e2a;
        try {
            e2a = (E2A) BEB.A0a("com.google.protobuf.NewInstanceSchemaFull");
        } catch (Exception unused) {
            e2a = null;
        }
        A00 = e2a;
    }
}
