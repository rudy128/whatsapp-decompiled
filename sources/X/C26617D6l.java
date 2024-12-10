package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.D6l  reason: case insensitive filesystem */
public final class C26617D6l implements C218317o, C201511a {
    public AnonymousClass02n A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02 = C201811d.A00(65540);
    public final AnonymousClass00H A03;

    @OnLifecycleEvent(C27581Wq.ON_DESTROY)
    public final void onDestroy() {
        AnonymousClass02n r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        this.A00 = null;
    }

    public C26617D6l(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A03 = r2;
        this.A01 = r3;
    }
}
