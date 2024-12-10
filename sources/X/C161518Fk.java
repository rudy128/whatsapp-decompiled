package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8Fk  reason: invalid class name and case insensitive filesystem */
public final class C161518Fk extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1DT A04;
    public final C19880zA A05;
    public final AnonymousClass11S A06;
    public final C185479ce A07;
    public final C188669hn A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass118 A0A;
    public final C18000vb A0B;
    public final UserJid A0C;
    public final AnonymousClass1W6 A0D;
    public final AnonymousClass10I A0E;
    public final String A0F;
    public final String A0G;
    public final AnonymousClass1DT A0H;
    public final AnonymousClass1DT A0I;

    public C161518Fk(C19880zA r3, AnonymousClass11S r4, C185479ce r5, C188669hn r6, AnonymousClass11P r7, AnonymousClass118 r8, C18000vb r9, UserJid userJid, AnonymousClass205 r11, AnonymousClass1W6 r12, AnonymousClass10I r13, String str, String str2) {
        C18070vi.A0w(r11, str, str2, userJid, r7);
        C18070vi.A0l(r4, r8);
        C72473Md.A1K(r9, r12);
        C18070vi.A0r(r5, r13, r3);
        this.A0G = str;
        this.A0F = str2;
        this.A0C = userJid;
        this.A09 = r7;
        this.A06 = r4;
        this.A0A = r8;
        this.A08 = r6;
        this.A0B = r9;
        this.A0D = r12;
        this.A07 = r5;
        this.A0E = r13;
        this.A05 = r3;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A0I = A0L;
        this.A02 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A04 = A0L2;
        this.A03 = A0L2;
        AnonymousClass1DT A0L3 = AnonymousClass3MW.A0L();
        this.A0H = A0L3;
        this.A01 = A0L3;
        r6.A00 = A0L;
        r6.A01 = A0L3;
        this.A00 = C22791Df.A01(A0L, C22295B1y.A00);
        AnonymousClass206 A0s = C108945cZ.A0s(r11, this.A0D);
        if (A0s != null && A0s.A0I() != null && !A0s.A0v.A02) {
            C19880zA r1 = this.A05;
            if (r1.A07()) {
                r1.A03();
                throw AnonymousClass000.A0s("logCartViewed");
            }
        }
    }
}
