package X;

import com.whatsapp.notification.BadgeNotificationApplicationStateObserver$onAppForegrounded$1;

/* renamed from: X.1df  reason: invalid class name and case insensitive filesystem */
public final class C30271df implements C24411Kf {
    public AnonymousClass00H A00;
    public final C30261de A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final C18600wl A07;
    public final AnonymousClass1OX A08;

    public C30271df(C30261de r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, C18600wl r9, AnonymousClass1OX r10) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r8, 7);
        C18070vi.A0d(r9, 8);
        C18070vi.A0d(r10, 9);
        this.A06 = r3;
        this.A00 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r7;
        this.A02 = r8;
        this.A07 = r9;
        this.A08 = r10;
    }

    public void BlT() {
        if (C18020vd.A05(C18040vf.A02, this.A01.A00, 8841)) {
            AnonymousClass1OX r3 = this.A08;
            C30451dy.A02(AnonymousClass00R.A00, this.A07, new BadgeNotificationApplicationStateObserver$onAppForegrounded$1(this, (C30391dr) null), r3);
        }
    }

    public void onAppBackgrounded() {
        C55402fi r2 = (C55402fi) this.A02.get();
        if (r2.A03.A01()) {
            r2.A01.A0E(true);
            r2.A02.A05();
        }
    }
}
