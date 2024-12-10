package X;

public abstract class CH4 {
    public static final CB4 A00;
    public static final CB4 A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.CB4, java.lang.Object] */
    static {
        CB4 cb4;
        try {
            cb4 = (CB4) BEB.A0a("com.google.protobuf.NewInstanceSchemaFull");
        } catch (Exception unused) {
            cb4 = null;
        }
        A00 = cb4;
    }
}
