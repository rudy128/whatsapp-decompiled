package X;

/* renamed from: X.2WE  reason: invalid class name */
public abstract class AnonymousClass2WE {
    public static final StackTraceElement A00;

    static {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("_COROUTINE");
        A00 = new StackTraceElement(C17890vO.A0Z("_BOUNDARY", A10, '.'), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Class.forName("X.1dt").getCanonicalName();
        } catch (Throwable th) {
            new AnonymousClass1IU(th);
        }
        try {
            Class.forName("X.2WE").getCanonicalName();
        } catch (Throwable th2) {
            new AnonymousClass1IU(th2);
        }
    }
}
