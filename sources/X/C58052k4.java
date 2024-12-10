package X;

/* renamed from: X.2k4  reason: invalid class name and case insensitive filesystem */
public final class C58052k4 {
    public final AnonymousClass11P A00;
    public final AnonymousClass1WF A01;
    public final C132056m6 A02;
    public final C62262r7 A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final C33231iU A06;
    public final AnonymousClass00H A07;

    public final void A00(AnonymousClass206 r10, int i, int i2, int i3) {
        C18070vi.A0d(r10, 0);
        if (i == 1 && i2 < 0) {
            C17960vV.A0F(false, AnonymousClass001.A1I("PinInChatUserActionHandler/pinOrUnpinInChatMessage Pinning must expire ", AnonymousClass000.A10(), i2));
        }
        AnonymousClass205 r1 = r10.A0v;
        A51 a51 = new A51(r10.A0I(), r1);
        long j = r10.A0x;
        AnonymousClass1BI r7 = r1.A00;
        C17960vV.A07(r7);
        C18070vi.A0X(r7);
        AnonymousClass11P r2 = this.A00;
        long A012 = AnonymousClass11P.A01(r2);
        long A013 = AnonymousClass11P.A01(r2);
        AnonymousClass22C r6 = new AnonymousClass22C(C17880vN.A0Z(r7, ((C52472ay) this.A07.get()).A00), A012);
        r6.A00 = i;
        r6.A01 = A013;
        r6.A05 = a51;
        r6.A02 = j;
        r6.A19(i2);
        r6.A00 = i3;
        this.A06.A01(r6);
    }

    public C58052k4(AnonymousClass11P r1, AnonymousClass1WF r2, C33231iU r3, C132056m6 r4, C62262r7 r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r1, r6, r7, r8, r2);
        C18070vi.A0l(r5, r3);
        this.A00 = r1;
        this.A04 = r6;
        this.A07 = r7;
        this.A05 = r8;
        this.A01 = r2;
        this.A03 = r5;
        this.A06 = r3;
        this.A02 = r4;
    }
}
