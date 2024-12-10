package X;

public abstract class CC3 {
    /* JADX INFO: finally extract failed */
    public static DFL A00(E9O e9o, E87 e87, DFL dfl) {
        DWZ dwz = new DWZ(e9o, e87, dfl, 1);
        ThreadLocal threadLocal = C24724CHl.A02;
        Object obj = threadLocal.get();
        threadLocal.set(2);
        try {
            Object invoke = dwz.invoke();
            threadLocal.set(obj);
            return (DFL) invoke;
        } catch (Throwable th) {
            threadLocal.set(obj);
            throw th;
        }
    }
}
