package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CvC  reason: case insensitive filesystem */
public final class C26222CvC {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final C26595D5j A04;
    public final List A05;
    public final List A06;
    public final boolean A07;

    public final void A08(C16960tV r13, AnonymousClass0NG r14, C02000Cg r15, C25827Cme cme, long j) {
        C16960tV r6 = r13;
        r13.CGe();
        List list = this.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EA0 ea0 = BE6.A0S(list, i).A06;
            ea0.CB4(r6, r14, r15, cme, j);
            r13.CPp(0.0f, ea0.BSR());
        }
        r13.CFz();
    }

    public /* synthetic */ C26222CvC(C26595D5j d5j, int i, long j, boolean z) {
        boolean z2;
        AnonymousClass0NU r0;
        float BSR;
        int i2;
        C26595D5j d5j2 = d5j;
        this.A04 = d5j2;
        this.A03 = i;
        if (Constraints.A03(j) == 0 && Constraints.A02(j) == 0) {
            ArrayList A13 = AnonymousClass000.A13();
            List list = d5j2.A01;
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            while (true) {
                if (i3 >= size) {
                    z2 = false;
                    break;
                }
                C25182CaY caY = (C25182CaY) list.get(i3);
                E8O e8o = caY.A02;
                int A012 = Constraints.A01(j);
                boolean A072 = Constraints.A07(j);
                int A002 = Constraints.A00(j);
                if (A072 && (A002 = A002 - ((int) ((float) Math.ceil((double) f)))) < 0) {
                    A002 = 0;
                }
                long A032 = C26229CvL.A03(0, A012, 0, A002);
                C18070vi.A0z(e8o, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
                C26594D5i d5i = new C26594D5i((C26596D5k) e8o, this.A03 - i4, A032, z);
                BSR = f + d5i.BSR();
                C26043Cr7 cr7 = d5i.A01;
                i2 = i4 + cr7.A04;
                A13.add(new C25227CbO(d5i, f, BSR, caY.A01, caY.A00, i4, i2));
                if (cr7.A0A || (i2 == this.A03 && i3 != AnonymousClass1ZU.A04(this.A04.A01))) {
                    z2 = true;
                    i4 = i2;
                    f = BSR;
                } else {
                    i3++;
                    i4 = i2;
                    f = BSR;
                }
            }
            z2 = true;
            i4 = i2;
            f = BSR;
            this.A00 = f;
            this.A02 = i4;
            this.A07 = z2;
            this.A05 = A13;
            this.A01 = (float) Constraints.A01(j);
            ArrayList A0g = C108975cc.A0g(A13);
            int size2 = A13.size();
            for (int i5 = 0; i5 < size2; i5++) {
                C25227CbO cbO = (C25227CbO) A13.get(i5);
                List list2 = ((C26594D5i) cbO.A06).A04;
                ArrayList A14 = AnonymousClass000.A14(list2);
                int size3 = list2.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    AnonymousClass0NU r15 = (AnonymousClass0NU) list2.get(i6);
                    if (r15 != null) {
                        long A0p = AnonymousClass001.A0p(0.0f, cbO.A01);
                        long j2 = AnonymousClass0QY.A03;
                        r0 = r15.A02(A0p);
                    } else {
                        r0 = null;
                    }
                    A14.add(r0);
                }
                C29401cD.A0J(A14, A0g);
            }
            if (A0g.size() < this.A04.A02.size()) {
                int size4 = this.A04.A02.size() - A0g.size();
                ArrayList A0z = C17880vN.A0z(size4);
                for (int i7 = 0; i7 < size4; i7++) {
                    A0z.add((Object) null);
                }
                A0g = C29431cG.A0k(A0z, A0g);
            }
            this.A06 = A0g;
            return;
        }
        throw AnonymousClass000.A0k("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public static final void A02(C26222CvC cvC, int i) {
        if (i < 0 || i >= cvC.A04.A00.A00.length()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("offset(");
            A10.append(i);
            A10.append(") is out of bounds [0, ");
            throw AnonymousClass000.A0k(AnonymousClass001.A1L(A10, cvC.A04.A00.length()));
        }
    }

    public static final void A03(C26222CvC cvC, int i) {
        if (i < 0 || i > cvC.A04.A00.A00.length()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("offset(");
            A10.append(i);
            A10.append(") is out of bounds [0, ");
            A10.append(cvC.A04.A00.length());
            A10.append(']');
            throw AnonymousClass000.A0j(A10);
        }
    }

    public static final void A04(C26222CvC cvC, int i) {
        if (i < 0 || i >= cvC.A02) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("lineIndex(");
            A10.append(i);
            A10.append(") is out of bounds [0, ");
            throw AnonymousClass000.A0k(AnonymousClass001.A1L(A10, cvC.A02));
        }
    }

    public final float A05() {
        return this.A00;
    }

    public final float A06() {
        return this.A01;
    }

    public final C26595D5j A07() {
        return this.A04;
    }

    public final boolean A09() {
        return this.A07;
    }
}
