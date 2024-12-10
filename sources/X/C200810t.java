package X;

/* renamed from: X.10t  reason: invalid class name and case insensitive filesystem */
public abstract class C200810t {
    public static final String A00(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        if (runnable instanceof C200910u) {
            return ((C200910u) runnable).A00;
        }
        String name = runnable.getClass().getName();
        C18070vi.A0b(name);
        return name;
    }
}
