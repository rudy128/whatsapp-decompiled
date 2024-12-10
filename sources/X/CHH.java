package X;

public abstract class CHH {
    public static final CBH A00 = new Object();
    public static final CBH A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CBH] */
    static {
        CBH cbh;
        try {
            cbh = (CBH) BEB.A0a("com.google.protobuf.ExtensionSchemaFull");
        } catch (Exception unused) {
            cbh = null;
        }
        A01 = cbh;
    }
}
