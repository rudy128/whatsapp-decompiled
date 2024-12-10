package X;

/* renamed from: X.DNo  reason: case insensitive filesystem */
public final class C26966DNo implements E6I {
    public final E6I A00;

    public boolean CP3(DFL dfl) {
        C18070vi.A0d(dfl, 0);
        ThreadLocal threadLocal = C24724CHl.A02;
        Object obj = threadLocal.get();
        threadLocal.set(0);
        try {
            return this.A00.CP3(dfl);
        } finally {
            threadLocal.set(obj);
        }
    }

    public C26966DNo(E6I e6i) {
        this.A00 = e6i;
    }
}
