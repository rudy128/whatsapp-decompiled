package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.BLb  reason: case insensitive filesystem */
public final class C22699BLb extends AnonymousClass1J2 {
    public C25274CcM A00;
    public CV6 A01;
    public C26027Cql A02;
    public CT5 A03;
    public C23421Fz A04;
    public boolean A05 = true;
    public final C24811CLe A06;
    public final C24813CLg A07;
    public final C65312wC A08;
    public final C24997CSx A09;
    public final CT3 A0A;
    public final CT4 A0B;
    public final C24883COb A0C;
    public final C18600wl A0D;
    public final AnonymousClass1OX A0E;
    public final C23421Fz A0F;
    public final AnonymousClass1G4 A0G;
    public final C25724Cku A0H;

    public C22699BLb(C25724Cku cku, C24811CLe cLe, C24813CLg cLg, C65312wC r8, C24997CSx cSx, CT3 ct3, CT4 ct4, C24883COb cOb, C18600wl r13, C18600wl r14) {
        AnonymousClass8BX.A1J(r13, r14, cku, 1);
        C18070vi.A0l(ct4, ct3);
        this.A0D = r14;
        this.A0H = cku;
        this.A0C = cOb;
        this.A06 = cLe;
        this.A0B = ct4;
        this.A0A = ct3;
        this.A07 = cLg;
        this.A08 = r8;
        this.A09 = cSx;
        AnonymousClass1OY A022 = AnonymousClass1OW.A02(new AnonymousClass1OE((AnonymousClass1OB) null).plus(r13));
        this.A0E = A022;
        Boolean A0h = AnonymousClass000.A0h();
        AnonymousClass1G7 r1 = new AnonymousClass1G7(A0h);
        this.A0G = r1;
        this.A0F = AnonymousClass4Z7.A01(A0h, A022, r1, AnonymousClass4ZC.A00);
    }

    public void A0S() {
        AnonymousClass1OW.A04((CancellationException) null, this.A0E);
        this.A0H.A01();
        C25274CcM ccM = this.A00;
        if (ccM != null) {
            ccM.A06();
        }
        CT5 ct5 = this.A03;
        if (ct5 != null) {
            AnonymousClass1H7 r1 = ct5.A03.A00;
            ((C26027Cql) r1.A01()).A02();
            r1.A02();
        }
        CT4 ct4 = this.A0B;
        C55472fp r2 = ct4.A01;
        AnonymousClass3LX r12 = ct4.A00;
        C18070vi.A0d(r12, 0);
        r2.A03.remove(r12);
        AnonymousClass1OW.A04((CancellationException) null, ct4.A02);
    }
}
