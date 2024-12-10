package X;

import java.util.List;

/* renamed from: X.0Pp  reason: invalid class name and case insensitive filesystem */
public final class C04940Pp {
    public AnonymousClass0Q4 A00;
    public C16910tQ A01;
    public boolean A02;
    public C27069DRu A03;
    public C25246Cbl A04;
    public C22821Di A05;
    public final AnonymousClass0Jp A06;
    public final C17330uU A07;
    public final C17330uU A08;
    public final C17330uU A09;
    public final C17330uU A0A;
    public final C17330uU A0B;
    public final C17330uU A0C;
    public final C17330uU A0D;
    public final C17330uU A0E;
    public final C15740r7 A0F;
    public final C16790tE A0G;
    public final C16750sx A0H;
    public final C17330uU A0I;
    public final C25146CZx A0J = new C25146CZx();
    public final C22821Di A0K;
    public final C22821Di A0L;

    public static final AnonymousClass0Q4 A00(AnonymousClass0Q4 r9, C27069DRu dRu, C26251Cvq cvq, E3V e3v, C28644ECa eCa, List list, boolean z) {
        AnonymousClass0Q4 r1 = r9;
        C27069DRu dRu2 = dRu;
        C26251Cvq cvq2 = cvq;
        E3V e3v2 = e3v;
        C28644ECa eCa2 = eCa;
        List list2 = list;
        boolean z2 = z;
        if (!C18070vi.A18(r1.A04(), dRu) || !C18070vi.A18(r1.A06(), cvq2) || r1.A03 != z || !C18070vi.A18(r1.A08(), eCa) || !C18070vi.A18(r1.A02, list) || r1.A07() != e3v) {
            return new AnonymousClass0Q4(dRu2, cvq2, e3v2, eCa2, list2, (AnonymousClass1Y1) null, Integer.MAX_VALUE, 1, 1, z2);
        }
        return r1;
    }

    public static AnonymousClass0NM A02(C04940Pp r0) {
        return (AnonymousClass0NM) r0.A0A.getValue();
    }

    public final float A04() {
        return ((DSH) this.A0I.getValue()).A02();
    }

    public final C16910tQ A05() {
        C16910tQ r2 = this.A01;
        if (r2 == null || !r2.Be8()) {
            return null;
        }
        return r2;
    }

    public final void A0B(float f) {
        this.A0I.setValue(DSH.A00(f));
    }

    public final void A0C(AnonymousClass0PT r8, C16350s7 r9, C27069DRu dRu, C27069DRu dRu2, C26251Cvq cvq, E3V e3v, C28644ECa eCa, C22821Di r15, long j, boolean z) {
        this.A05 = r15;
        this.A0G.CIO(j);
        AnonymousClass0Jp r0 = this.A06;
        r0.A00 = r8;
        r0.A01 = r9;
        this.A03 = dRu;
        AnonymousClass0Q4 A012 = A00(this.A00, dRu2, cvq, e3v, eCa, AnonymousClass1ZU.A09(), z);
        if (this.A00 != A012) {
            this.A02 = true;
        }
        this.A00 = A012;
    }

    public C04940Pp(AnonymousClass0Q4 r4, C15740r7 r5, C16750sx r6) {
        this.A00 = r4;
        this.A0F = r5;
        this.A0H = r6;
        Boolean A0h = AnonymousClass000.A0h();
        this.A08 = AnonymousClass0Q9.A02(A0h);
        this.A0I = AnonymousClass0Q9.A01(DSH.A00(0.0f));
        this.A0A = AnonymousClass0Q9.A01((Object) null);
        this.A07 = AnonymousClass0Q9.A01(AnonymousClass0CN.None);
        this.A0C = AnonymousClass0Q9.A01(A0h);
        this.A0E = AnonymousClass0Q9.A01(A0h);
        this.A0D = AnonymousClass0Q9.A01(A0h);
        this.A0B = AnonymousClass0Q9.A01(A0h);
        this.A02 = true;
        this.A09 = AnonymousClass0Q9.A04(true);
        this.A06 = new AnonymousClass0Jp(r6);
        this.A05 = C11960kx.A00;
        this.A0L = new C10660ih(this);
        this.A0K = new C09760hF(this);
        this.A0G = new AnonymousClass0WR();
    }

    public final C27069DRu A06() {
        return this.A03;
    }

    public final C25146CZx A07() {
        return this.A0J;
    }

    public final C25246Cbl A08() {
        return this.A04;
    }

    public final C22821Di A09() {
        return this.A0K;
    }

    public final C22821Di A0A() {
        return this.A0L;
    }

    public final void A0D(C25246Cbl cbl) {
        this.A04 = cbl;
    }
}
