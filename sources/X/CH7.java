package X;

public abstract class CH7 {
    public static final CB7 A00 = new Object();
    public static final CB7 A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CB7] */
    static {
        CB7 cb7;
        try {
            cb7 = (CB7) BEB.A0a("com.google.protobuf.ExtensionSchemaFull");
        } catch (Exception unused) {
            cb7 = null;
        }
        A01 = cb7;
    }
}
