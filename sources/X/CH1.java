package X;

public abstract class CH1 {
    public static final CB2 A00 = new Object();
    public static final CB2 A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CB2, java.lang.Object] */
    static {
        CB2 cb2;
        try {
            cb2 = (CB2) BEB.A0a("com.google.protobuf.ExtensionSchemaFull");
        } catch (Exception unused) {
            cb2 = null;
        }
        A01 = cb2;
    }
}
