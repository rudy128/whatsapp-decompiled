package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.5l9  reason: invalid class name and case insensitive filesystem */
public final class C112235l9 extends C38391rD {
    public final AnonymousClass1F9 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1VW A03;
    public final AnonymousClass1M9 A04;
    public final C24921Me A05;
    public final C27191Vc A06;
    public final C18030ve A07;
    public final C133866pd A08;
    public final C111215j4 A09;
    public final C200710s A0A;
    public final C18000vb A0B;

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r12, int i) {
        C113525nE r5 = (C113525nE) r12;
        C18070vi.A0d(r5, 0);
        AnonymousClass7PX r3 = (AnonymousClass7PX) AnonymousClass3MW.A10(this.A08.A02).get(i);
        AnonymousClass1BI r4 = r3.A04;
        C18070vi.A0X(r4);
        boolean A0O = this.A02.A0O(r4);
        int A0B2 = this.A05.A0B(this.A09.A02);
        String str = r3.A05;
        C17960vV.A07(str);
        C18070vi.A0X(str);
        this.A0A.execute(new AnonymousClass7QU(C108945cZ.A0D(r5), r3, r4, r5, this, str, A0B2, i, A0O));
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        boolean z = this.A09.A0B;
        LayoutInflater A0B2 = AnonymousClass3MY.A0B(viewGroup);
        if (z) {
            return new C120606Ek(AnonymousClass3MX.A0B(A0B2, viewGroup, 2131626677, false));
        }
        return new C113525nE(AnonymousClass3MX.A0B(A0B2, viewGroup, 2131626676, false));
    }

    public C112235l9(AnonymousClass1F9 r4, AnonymousClass1KB r5, AnonymousClass11S r6, AnonymousClass1VW r7, AnonymousClass1M9 r8, C24921Me r9, C27191Vc r10, C18000vb r11, C18030ve r12, C133866pd r13, C111215j4 r14, C200710s r15) {
        C18070vi.A0d(r13, 11);
        this.A07 = r12;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A0A = r15;
        this.A05 = r9;
        this.A0B = r11;
        this.A06 = r10;
        this.A00 = r4;
        this.A08 = r13;
        this.A09 = r14;
        AnonymousClass7AS.A00(r4, r13.A02, new C1584880w(this), 12);
    }

    public static final C42751yg A00(AnonymousClass1E7 r4, C112235l9 r5, int i) {
        Integer num;
        String str;
        C24921Me r2 = r5.A05;
        if (!r2.A0j(r4, i) || !r5.A09.A0C) {
            return r2.A0F(r4, i, false, true);
        }
        String A17 = AnonymousClass3MX.A17(r2, r4);
        C18070vi.A0X(A17);
        C42741yf r1 = r4.A0G;
        if (A17.length() > 0 && r4.A0H == null && !r4.A0C() && (r1 == null || (str = r1.A08) == null || str.length() == 0)) {
            if (C18020vd.A05(C18040vf.A02, r5.A07, 8000)) {
                num = AnonymousClass00R.A0Y;
                return new C42751yg(A17, num);
            }
        }
        A17 = r5.A0B.A0G(AnonymousClass17K.A02(r4));
        num = AnonymousClass00R.A0N;
        return new C42751yg(A17, num);
    }

    public int A0Q() {
        return C108975cc.A02(this.A08.A02);
    }
}
