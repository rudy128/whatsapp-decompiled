package X;

/* renamed from: X.A3j  reason: case insensitive filesystem */
public abstract class C20017A3j {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static final Object A00(C18090vk r2, int i) {
        ThreadLocal threadLocal = A00;
        threadLocal.set(Integer.valueOf(i));
        try {
            return r2.invoke();
        } finally {
            threadLocal.remove();
        }
    }

    public static final void A01(C18090vk r2, int i) {
        ThreadLocal threadLocal = A00;
        threadLocal.set(Integer.valueOf(i));
        try {
            r2.invoke();
        } finally {
            threadLocal.remove();
        }
    }
}
