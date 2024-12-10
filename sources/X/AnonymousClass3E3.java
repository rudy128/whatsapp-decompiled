package X;

/* renamed from: X.3E3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3E3 implements AnonymousClass1OI {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ AnonymousClass1IT A01;

    public final void dispose() {
        AnonymousClass1IT r0 = this.A01;
        r0.A00.removeCallbacks(this.A00);
    }

    public /* synthetic */ AnonymousClass3E3(Runnable runnable, AnonymousClass1IT r2) {
        this.A01 = r2;
        this.A00 = runnable;
    }
}
