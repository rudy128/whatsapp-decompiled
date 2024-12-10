package X;

import java.util.ArrayList;

/* renamed from: X.48s  reason: invalid class name */
public final class AnonymousClass48s extends A34 {
    public C195609tc A00;
    public String A01;
    public String A02;
    public final AnonymousClass11S A03;
    public final C26911Ty A04;
    public final A1E A05;
    public final C184019aH A06;
    public final C24921Me A07;
    public final AnonymousClass1E7 A08;
    public final C18030ve A09;
    public final AnonymousClass1UL A0A;
    public final C22821Di A0B;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C194369rc r7 = (C194369rc) obj;
        ArrayList A0s = C72463Mc.A0s(r7);
        String str = this.A01;
        if (str != null) {
            A0s.add(new AnonymousClass401(str));
        }
        String str2 = this.A02;
        if (str2 != null) {
            A0s.add(new AnonymousClass400(str2));
        }
        if (r7.A00 != 0) {
            A0s.add(new C81883zz(r7));
        }
        AnonymousClass1E7 r1 = this.A08;
        if (r1.A0C()) {
            this.A04.A0D(new C92844i0(this.A09, AnonymousClass3MW.A0z(this.A0B), A0s), AnonymousClass3MZ.A0x(r1));
        }
        C195609tc r12 = this.A00;
        if (r12 != null) {
            A0s.add(new C81873zy(r12));
        }
        this.A0B.invoke(A0s);
    }

    public AnonymousClass48s(AnonymousClass11S r1, C26911Ty r2, A1E a1e, C184019aH r4, C24921Me r5, AnonymousClass1E7 r6, C18030ve r7, AnonymousClass1UL r8, C22821Di r9) {
        C18070vi.A0w(r1, r5, r8, r7, r2);
        C18070vi.A0l(a1e, r4);
        this.A03 = r1;
        this.A07 = r5;
        this.A0A = r8;
        this.A09 = r7;
        this.A04 = r2;
        this.A05 = a1e;
        this.A06 = r4;
        this.A08 = r6;
        this.A0B = r9;
    }
}
