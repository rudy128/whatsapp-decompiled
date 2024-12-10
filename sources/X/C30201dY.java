package X;

import com.whatsapp.contact.ContactPermissionsApplicationStateObserver$onAppForegrounded$1;

/* renamed from: X.1dY  reason: invalid class name and case insensitive filesystem */
public final class C30201dY implements C24411Kf {
    public final C26811To A00;
    public final C30191dX A01;
    public final C26301Rp A02;
    public final C18600wl A03;
    public final AnonymousClass1OX A04;

    public C30201dY(C26811To r2, C30191dX r3, C26301Rp r4, C18600wl r5, AnonymousClass1OX r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
    }

    public /* synthetic */ void onAppBackgrounded() {
    }

    public void BlT() {
        AnonymousClass1OX r3 = this.A04;
        C30451dy.A02(AnonymousClass00R.A00, this.A03, new ContactPermissionsApplicationStateObserver$onAppForegrounded$1(this, (C30391dr) null), r3);
    }
}
