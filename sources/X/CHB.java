package X;

public abstract class CHB {
    public static final E20 A00;
    public static final E20 A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.E20, java.lang.Object] */
    static {
        E20 e20;
        try {
            e20 = (E20) BEB.A0a("com.google.protobuf.NewInstanceSchemaFull");
        } catch (Exception unused) {
            e20 = null;
        }
        A00 = e20;
    }
}
