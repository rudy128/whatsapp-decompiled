package X;

/* renamed from: X.3AO  reason: invalid class name */
public class AnonymousClass3AO implements C26971Uf {
    public final /* synthetic */ C203911y A00;
    public final /* synthetic */ C136506tv A01;
    public final /* synthetic */ C26981Ug A02;
    public final /* synthetic */ Runnable A03;

    public /* bridge */ /* synthetic */ void BrF(Object obj) {
        C26981Ug r0 = this.A02;
        if (r0 != null) {
            r0.BrF((Object) null);
        }
    }

    public AnonymousClass3AO(C203911y r1, C136506tv r2, C26981Ug r3, Runnable runnable) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = runnable;
    }

    public void BrC(Exception exc) {
        AnonymousClass1O2 r3 = this.A00.A0J;
        C136506tv r2 = this.A01;
        r3.A04(r2.A03, r2.A05.A0v);
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
        C26981Ug r0 = this.A02;
        if (r0 != null) {
            r0.BrC(exc);
        }
    }
}
