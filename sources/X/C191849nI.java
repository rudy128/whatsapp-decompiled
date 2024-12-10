package X;

import com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$prepare$1;

/* renamed from: X.9nI  reason: invalid class name and case insensitive filesystem */
public final class C191849nI {
    public long A00;
    public AnonymousClass1OB A01;
    public byte[] A02;
    public final int A03 = AnonymousClass1JU.A01.A03(0, 1000);
    public final C22701Cw A04;
    public final AnonymousClass11P A05;
    public final C26031Qo A06;
    public final C22671Ct A07;
    public final AnonymousClass19D A08;
    public final C18600wl A09;
    public final AnonymousClass1OX A0A;

    public final synchronized void A00() {
        AnonymousClass19D r5 = this.A08;
        C18040vf r3 = C18040vf.A02;
        boolean A052 = C18020vd.A05(r3, r5, 6430);
        boolean A1U = AnonymousClass000.A1U(this.A03, C18020vd.A00(r3, r5, 7217));
        if (A052 && A1U) {
            AnonymousClass1OB r0 = this.A01;
            if (r0 == null || (!r0.Be2() && (AnonymousClass11P.A01(this.A05) - this.A00 >= AnonymousClass8BR.A05(r5, 6431) || this.A02 == null))) {
                AnonymousClass1OX r32 = this.A0A;
                this.A01 = C30451dy.A02(AnonymousClass00R.A00, this.A09, new KeyAttestationLifetimeManager$prepare$1(this, (C30391dr) null), r32);
            }
        }
    }

    public C191849nI(C22701Cw r4, AnonymousClass11P r5, C26031Qo r6, C22671Ct r7, AnonymousClass19D r8, C18600wl r9) {
        C18070vi.A0w(r7, r8, r4, r6, r5);
        C18070vi.A0d(r9, 6);
        this.A07 = r7;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A09 = r9;
        this.A0A = AnonymousClass1OW.A02(r9);
    }
}
