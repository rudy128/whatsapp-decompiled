package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5jP  reason: invalid class name and case insensitive filesystem */
public final class C111265jP extends AnonymousClass1J2 implements C25231Nk {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DS A03;
    public final C19880zA A04;
    public final AnonymousClass1M9 A05;
    public final AnonymousClass1DT A06;
    public final AnonymousClass1DT A07;
    public final AnonymousClass1DT A08;
    public final AnonymousClass1DT A09;
    public final AnonymousClass1CJ A0A;

    public /* synthetic */ void BqF(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqG(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqH(AnonymousClass1BI r1, boolean z) {
    }

    public /* synthetic */ void BqI(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqJ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqK(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqN(int i) {
    }

    private final List A03() {
        Collection A0H = this.A0A.A0H();
        if (A0H == null) {
            return C18460wS.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : A0H) {
            if (next instanceof C46162Dk) {
                A13.add(next);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next2 : A13) {
            if (((C46162Dk) next2).A0Q()) {
                A132.add(next2);
            }
        }
        return A132;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        if ((!A0T().isEmpty()) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U() {
        /*
            r4 = this;
            X.1DT r1 = r4.A08
            java.util.List r0 = r4.A0T()
            r1.A0F(r0)
            X.1DT r1 = r4.A09
            java.util.List r0 = r4.A00()
            r1.A0F(r0)
            X.1DT r3 = r4.A06
            java.util.List r0 = r4.A00()
            int r2 = r0.size()
            X.0zA r1 = r4.A04
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002e
            r1.A03()
            java.lang.String r0 = "getLimit"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x002e:
            r0 = 1
            if (r2 < r0) goto L_0x0032
            r0 = 0
        L_0x0032:
            X.AnonymousClass3MY.A1L(r3, r0)
            X.1DT r2 = r4.A07
            java.util.List r0 = r4.A00()
            int r1 = r0.size()
            r0 = 1
            if (r1 >= r0) goto L_0x0053
            java.util.List r0 = r4.A0T()
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0053
        L_0x004f:
            X.AnonymousClass3MY.A1L(r2, r1)
            return
        L_0x0053:
            r1 = 0
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111265jP.A0U():void");
    }

    public C111265jP(C19880zA r2, AnonymousClass1M9 r3, AnonymousClass1CJ r4) {
        C18070vi.A0o(r4, r3, r2);
        this.A0A = r4;
        this.A05 = r3;
        this.A04 = r2;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A08 = A0S;
        this.A02 = A0S;
        AnonymousClass1DT A0S2 = C108945cZ.A0S();
        this.A09 = A0S2;
        this.A03 = A0S2;
        AnonymousClass1DT A0S3 = C108945cZ.A0S();
        this.A06 = A0S3;
        this.A00 = A0S3;
        AnonymousClass1DT A0S4 = C108945cZ.A0S();
        this.A07 = A0S4;
        this.A01 = A0S4;
    }

    private final List A00() {
        List A032 = A03();
        ArrayList<C46162Dk> A13 = AnonymousClass000.A13();
        for (Object next : A032) {
            C46162Dk r2 = (C46162Dk) next;
            if (r2.A05 == AnonymousClass9IW.VERIFIED && r2.A0M == AnonymousClass9IZ.META_VERIFIED_SUBSCRIPTION) {
                A13.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A13);
        for (C46162Dk r8 : A13) {
            C46162Dk A002 = C46162Dk.A00((C29691ci) null, (C179509Ig) null, r8, -1, 0);
            AnonymousClass1E7 A0H = this.A05.A0H(r8.A08());
            AnonymousClass1E7 A052 = A0H.A05();
            if (A052 != null) {
                A0H = A052;
            }
            A0D.add(new AnonymousClass6B5(A002, A0H, (String) null, false));
        }
        return A0D;
    }

    public final List A0T() {
        List A032 = A03();
        ArrayList<C46162Dk> A13 = AnonymousClass000.A13();
        for (Object next : A032) {
            AnonymousClass3MZ.A1V(next, A13, AnonymousClass000.A1Z(((C46162Dk) next).A05, AnonymousClass9IW.VERIFIED) ? 1 : 0);
        }
        ArrayList A0D = C29351c6.A0D(A13);
        for (C46162Dk r8 : A13) {
            C46162Dk A002 = C46162Dk.A00((C29691ci) null, (C179509Ig) null, r8, -1, 0);
            AnonymousClass1E7 A0H = this.A05.A0H(r8.A08());
            AnonymousClass1E7 A052 = A0H.A05();
            if (A052 != null) {
                A0H = A052;
            }
            A0D.add(new AnonymousClass6B5(A002, A0H, (String) null, false));
        }
        return A0D;
    }

    public void BqO() {
        A0U();
    }
}
