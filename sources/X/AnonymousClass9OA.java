package X;

/* renamed from: X.9OA  reason: invalid class name */
public abstract class AnonymousClass9OA {
    public static void A00(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
