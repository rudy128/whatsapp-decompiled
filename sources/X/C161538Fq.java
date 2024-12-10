package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8Fq  reason: invalid class name and case insensitive filesystem */
public final class C161538Fq extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final C192829p3 A02;
    public final C41731wy A03;
    public final C175268yR A04;
    public final C167948i2 A05;
    public final UserJid A06;

    public C161538Fq(C192829p3 r3, C175268yR r4, UserJid userJid) {
        C18070vi.A0d(r3, 2);
        this.A06 = userJid;
        this.A02 = r3;
        this.A04 = r4;
        this.A00 = r3.A03;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A03 = A0o;
        this.A01 = A0o;
        C167948i2 r0 = new C167948i2(this, 6);
        this.A05 = r0;
        r4.registerObserver(r0);
    }

    public void A0S() {
        this.A04.unregisterObserver(this.A05);
    }
}
