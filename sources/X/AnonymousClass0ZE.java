package X;

/* renamed from: X.0ZE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZE implements Runnable {
    public final /* synthetic */ AnonymousClass015 A00;
    public final /* synthetic */ Runnable A01;

    public final void run() {
        AnonymousClass015 r1 = this.A00;
        try {
            this.A01.run();
        } finally {
            r1.A00();
        }
    }

    public /* synthetic */ AnonymousClass0ZE(AnonymousClass015 r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }
}
