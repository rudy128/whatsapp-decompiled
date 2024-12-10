package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.30H  reason: invalid class name */
public final class AnonymousClass30H implements C72113Kr, AnonymousClass3MK {
    public final AnonymousClass11S A00;
    public final C18030ve A01;
    public final int A02;
    public final C26811To A03;
    public final C25161Nd A04;
    public final AnonymousClass1MW A05;
    public final AnonymousClass126 A06;
    public final AnonymousClass1Nb A07;
    public final C58012k0 A08;

    public /* synthetic */ void BvN(AnonymousClass1E9 r1) {
    }

    public /* synthetic */ void BvO(Set set) {
    }

    public void Bxd(AnonymousClass1EC r4) {
        C18070vi.A0d(r4, 0);
        if (!this.A00.A0N()) {
            if (C18020vd.A05(C18040vf.A02, this.A01, 11641)) {
                A00(r4, true);
            }
        }
    }

    public /* synthetic */ void Bxe(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxf(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxg(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxh(AnonymousClass1EC r1) {
    }

    private final void A00(AnonymousClass1BI r6, boolean z) {
        AnonymousClass1EC r4;
        if ((r6 instanceof AnonymousClass1EC) && (r4 = (AnonymousClass1EC) r6) != null && this.A08.A00(r4, this.A06.A0O.A0O(r4), z)) {
            AnonymousClass1Nb r3 = this.A07;
            if (r3.A0a(r4).A0A == AnonymousClass201.DEFAULT_ALL_MESSAGES && this.A05.A09(r4) >= this.A02) {
                C26811To r2 = this.A03;
                AnonymousClass201 r0 = AnonymousClass201.DEFAULT_RELEVANT_MESSAGES;
                Set A042 = r2.A04(r4, r0);
                C18070vi.A0X(A042);
                if (r3.A10(r6, r0)) {
                    r2.A0R(A042);
                } else {
                    r2.A0Q(A042);
                }
            }
        }
    }

    public void Bqf() {
        if (!this.A00.A0N()) {
            if (C18020vd.A05(C18040vf.A02, this.A01, 11641)) {
                Iterator it = this.A04.A06().iterator();
                while (it.hasNext()) {
                    AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                    C18070vi.A0b(A0Q);
                    A00(A0Q, false);
                }
            }
        }
    }

    public AnonymousClass30H(AnonymousClass11S r3, C26811To r4, C25161Nd r5, AnonymousClass1MW r6, C18030ve r7, AnonymousClass126 r8, AnonymousClass1Nb r9, C58012k0 r10) {
        C18070vi.A0w(r7, r3, r4, r9, r6);
        C18070vi.A0q(r10, r5, r8);
        this.A01 = r7;
        this.A00 = r3;
        this.A03 = r4;
        this.A07 = r9;
        this.A05 = r6;
        this.A08 = r10;
        this.A04 = r5;
        this.A06 = r8;
        this.A02 = C18020vd.A00(C18040vf.A02, r7, 11891);
    }
}
