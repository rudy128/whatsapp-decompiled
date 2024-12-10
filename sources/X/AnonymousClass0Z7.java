package X;

/* renamed from: X.0Z7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0Z7 implements Runnable {
    public final /* synthetic */ AnonymousClass0ZY A00;

    public final void run() {
        AnonymousClass0ZY r2 = this.A00;
        r2.run();
        synchronized (AnonymousClass0PG.class) {
            AnonymousClass0PG.A01.remove(r2);
        }
    }

    public /* synthetic */ AnonymousClass0Z7(AnonymousClass0ZY r1) {
        this.A00 = r1;
    }
}
