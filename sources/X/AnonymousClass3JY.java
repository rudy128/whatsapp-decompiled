package X;

/* renamed from: X.3JY  reason: invalid class name */
public final class AnonymousClass3JY extends C30591eC {
    public final Runnable A00;

    public void run() {
        this.A00.run();
    }

    public AnonymousClass3JY(Runnable runnable, AnonymousClass1I4 r2, long j) {
        this.A00 = j;
        this.A01 = r2;
        this.A00 = runnable;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Task[");
        Runnable runnable = this.A00;
        C17900vP.A0a(runnable, A10);
        A10.append('@');
        A10.append(Integer.toHexString(System.identityHashCode(runnable)));
        A10.append(", ");
        A10.append(this.A00);
        A10.append(", ");
        return C17900vP.A09(this.A01, A10);
    }
}
