package X;

/* renamed from: X.0MY  reason: invalid class name */
public class AnonymousClass0MY {
    public static Class A01;
    public final Object A00;

    static {
        try {
            A01 = Class.forName("android.app.LoadedApk");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AnonymousClass0MY(Object obj) {
        this.A00 = obj;
    }
}
