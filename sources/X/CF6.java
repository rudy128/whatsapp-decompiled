package X;

public abstract class CF6 {
    public static final Class A00;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        A00 = cls;
    }
}
