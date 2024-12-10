package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.7AE  reason: invalid class name */
public final class AnonymousClass7AE implements C218317o {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1TG A01;
    public final C24661Le A02;
    public final Runnable A03 = new AnonymousClass7RH((Object) this, 0);
    public final AnonymousClass10I A04;

    public final void A00() {
        this.A00.A0I(this.A03);
        this.A04.CGF(new C98844ro((Object) this, 49));
    }

    @OnLifecycleEvent(C27581Wq.ON_DESTROY)
    public final void onDestroy() {
        this.A00.A0I(this.A03);
    }

    public AnonymousClass7AE(AnonymousClass1F9 r3, AnonymousClass1KB r4, AnonymousClass1TG r5, C24661Le r6, AnonymousClass10I r7) {
        C18070vi.A0p(r4, r7, r6);
        C18070vi.A0d(r5, 5);
        this.A00 = r4;
        this.A04 = r7;
        this.A02 = r6;
        this.A01 = r5;
        r3.getLifecycle().A05(this);
    }

    @OnLifecycleEvent(C27581Wq.ON_START)
    public final void onStart() {
        A00();
    }
}
