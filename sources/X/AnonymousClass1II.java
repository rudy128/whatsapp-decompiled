package X;

/* renamed from: X.1II  reason: invalid class name */
public abstract class AnonymousClass1II {
    public static final C23781Hp A00;

    static {
        C23781Hp r1;
        boolean z = false;
        try {
            String property = System.getProperty("kotlinx.coroutines.main.delay");
            if (property != null) {
                z = Boolean.parseBoolean(property);
                if (z) {
                    C18600wl r0 = C23871Hy.A00;
                    Object obj = AnonymousClass1IN.A00;
                    if (!(obj instanceof C23781Hp)) {
                        obj = AnonymousClass1IM.A00;
                    }
                    r1 = (C23781Hp) obj;
                    A00 = r1;
                }
            }
        } catch (SecurityException unused) {
        }
        r1 = AnonymousClass1IM.A00;
        A00 = r1;
    }
}
