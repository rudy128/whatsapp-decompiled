package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;

public class BN4 extends C26642D7p {
    public float A00;
    public boolean A01 = true;
    public C26049CrJ A02;
    public final Paint A03 = AnonymousClass3MW.A06();
    public final RectF A04 = AnonymousClass3MW.A08();
    public final List A05 = AnonymousClass000.A13();
    public final RectF A06 = AnonymousClass3MW.A08();

    public void A0A(float f) {
        this.A00 = f;
        super.A0A(f);
        C26049CrJ crJ = this.A02;
        if (crJ != null) {
            C39801tf r0 = this.A0J.A0G;
            C39801tf r02 = this.A0L.A09;
            f = ((C26049CrJ.A01(crJ) * r02.A01) - r02.A02) / ((r0.A00 - r0.A02) + 0.01f);
        }
        if (this.A02 == null) {
            C40941vX r03 = this.A0L;
            float f2 = r03.A02;
            C39801tf r04 = r03.A09;
            f -= f2 / (r04.A00 - r04.A02);
        }
        C40941vX r1 = this.A0L;
        float f3 = r1.A03;
        if (f3 != 0.0f && !"__container".equals(r1.A0J)) {
            f /= f3;
        }
        List list = this.A05;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C26642D7p) list.get(size)).A0A(f);
            } else {
                return;
            }
        }
    }

    public BN4(C39801tf r11, C38631rd r12, C40941vX r13, List list) {
        super(r12, r13);
        C26642D7p d7p;
        C26642D7p d7p2;
        String str;
        C40561uu r0 = r13.A0A;
        if (r0 != null) {
            C26049CrJ BHA = r0.BHA();
            this.A02 = BHA;
            A0C(BHA);
            this.A02.A0A(this);
        } else {
            this.A02 = null;
        }
        C001100p r3 = new C001100p(r11.A07.size());
        int A022 = AnonymousClass3MX.A02(list, 1);
        C26642D7p d7p3 = null;
        while (true) {
            if (A022 >= 0) {
                C40941vX r9 = (C40941vX) list.get(A022);
                int intValue = r9.A0H.intValue();
                switch (intValue) {
                    case 0:
                        d7p2 = new BN4(r11, r12, r9, AnonymousClass8BS.A0t(r9.A0K, r11.A0B));
                        break;
                    case 1:
                        d7p2 = new BN3(r12, r9);
                        break;
                    case 2:
                        d7p2 = new BN2(r12, r9);
                        break;
                    case 3:
                        d7p2 = new C26642D7p(r12, r9);
                        break;
                    case 4:
                        d7p2 = new BN1(r11, r12, this, r9);
                        break;
                    case 5:
                        d7p2 = new BN5(r12, r9);
                        break;
                    default:
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Unknown layer type ");
                        switch (intValue) {
                            case 1:
                                str = "SOLID";
                                break;
                            case 2:
                                str = "IMAGE";
                                break;
                            case 3:
                                str = "NULL";
                                break;
                            case 4:
                                str = "SHAPE";
                                break;
                            case 5:
                                str = "TEXT";
                                break;
                            case 6:
                                str = "UNKNOWN";
                                break;
                            default:
                                str = "PRE_COMP";
                                break;
                        }
                        C196379ux.A00(AnonymousClass000.A0y(str, A10));
                        continue;
                }
                r3.A0A(d7p2.A0L.A07, d7p2);
                if (d7p3 != null) {
                    d7p3.A04 = d7p2;
                    d7p3 = null;
                } else {
                    this.A05.add(0, d7p2);
                    int intValue2 = r9.A0I.intValue();
                    if (intValue2 == 1 || intValue2 == 2) {
                        d7p3 = d7p2;
                    }
                }
                A022--;
            } else {
                for (int i = 0; i < r3.A00(); i++) {
                    C26642D7p d7p4 = (C26642D7p) r3.A05(r3.A02(i));
                    if (!(d7p4 == null || (d7p = (C26642D7p) r3.A05(d7p4.A0L.A08)) == null)) {
                        d7p4.A05 = d7p;
                    }
                }
                return;
            }
        }
    }

    public void A0E(boolean z) {
        super.A0E(z);
        for (C26642D7p A0E : this.A05) {
            A0E.A0E(z);
        }
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        super.BBs(ckt, obj);
        if (obj != EBL.A0R) {
            return;
        }
        if (ckt == null) {
            C26049CrJ crJ = this.A02;
            if (crJ != null) {
                crJ.A0B((C25723Ckt) null);
                return;
            }
            return;
        }
        C22732BMv bMv = new C22732BMv(ckt, (Object) null);
        this.A02 = bMv;
        bMv.A0A(this);
        A0C(this.A02);
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        super.BNg(matrix, rectF, z);
        List list = this.A05;
        for (int size = list.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.A06;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((C26642D7p) list.get(size)).BNg(this.A0A, rectF2, true);
            rectF.union(rectF2);
        }
    }
}
