package X;

/* renamed from: X.7MR  reason: invalid class name */
public class AnonymousClass7MR implements AnonymousClass88A {
    public final int A00;
    public final Object A01;

    public AnonymousClass7MR(Runnable runnable, int i) {
        this.A00 = i;
        this.A01 = runnable;
    }

    public final void C6n(C123206Tn r3) {
        Runnable runnable = (Runnable) this.A01;
        if (r3 instanceof AnonymousClass6H8) {
            runnable.run();
        }
    }
}
