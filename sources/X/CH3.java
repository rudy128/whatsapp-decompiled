package X;

public abstract class CH3 {
    public static final CB3 A00;
    public static final CB3 A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.CB3, java.lang.Object] */
    static {
        CB3 cb3;
        try {
            cb3 = (CB3) BEB.A0a("com.google.protobuf.MapFieldSchemaFull");
        } catch (Exception unused) {
            cb3 = null;
        }
        A00 = cb3;
    }
}
