package X;

/* renamed from: X.0DT  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass0DT {
    public static /* synthetic */ void A00(Throwable th, Throwable th2) {
        Class<Throwable> cls = Throwable.class;
        try {
            cls.getDeclaredMethod("addSuppressed", new Class[]{cls}).invoke(th, new Object[]{th2});
        } catch (Exception unused) {
        }
    }
}
