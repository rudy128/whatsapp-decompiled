package X;

import android.graphics.PointF;

/* renamed from: X.Ckt  reason: case insensitive filesystem */
public class C25723Ckt {
    public C26049CrJ A00;
    public Object A01;
    public final CT7 A02;

    public Object A00(CT7 ct7) {
        Object obj;
        if (this instanceof BN6) {
            BN6 bn6 = (BN6) this;
            int i = bn6.A00;
            Object obj2 = bn6.A02;
            if (i == 0) {
                return ((E3l) obj2).BbB();
            }
            Number number = (Number) ((C25723Ckt) obj2).A00(ct7);
            if (number == null) {
                return null;
            }
            return Float.valueOf(number.floatValue() * 2.55f);
        } else if (!(this instanceof BN7)) {
            return this.A01;
        } else {
            BN7 bn7 = (BN7) this;
            CT7 ct72 = bn7.A02;
            float f = ct7.A04;
            float f2 = ct7.A00;
            String str = ((CXZ) ct7.A06).A0B;
            String str2 = ((CXZ) ct7.A05).A0B;
            float f3 = ct7.A02;
            float f4 = ct7.A01;
            float f5 = ct7.A03;
            ct72.A04 = f;
            ct72.A00 = f2;
            ct72.A06 = str;
            ct72.A05 = str2;
            ct72.A02 = f3;
            ct72.A01 = f4;
            ct72.A03 = f5;
            String str3 = (String) bn7.A03.A00(ct72);
            if (ct7.A01 == 1.0f) {
                obj = ct7.A05;
            } else {
                obj = ct7.A06;
            }
            CXZ cxz = (CXZ) obj;
            CXZ cxz2 = bn7.A01;
            String str4 = cxz.A0A;
            float f6 = cxz.A02;
            Integer num = cxz.A09;
            int i2 = cxz.A06;
            float f7 = cxz.A01;
            float f8 = cxz.A00;
            int i3 = cxz.A04;
            int i4 = cxz.A05;
            float f9 = cxz.A03;
            boolean z = cxz.A0C;
            PointF pointF = cxz.A07;
            PointF pointF2 = cxz.A08;
            cxz2.A0B = str3;
            cxz2.A0A = str4;
            cxz2.A02 = f6;
            cxz2.A09 = num;
            cxz2.A06 = i2;
            cxz2.A01 = f7;
            cxz2.A00 = f8;
            cxz2.A04 = i3;
            cxz2.A05 = i4;
            cxz2.A03 = f9;
            cxz2.A0C = z;
            cxz2.A07 = pointF;
            cxz2.A08 = pointF2;
            return cxz2;
        }
    }

    public final Object A01(Object obj, Object obj2, float f, float f2, float f3, float f4, float f5) {
        CT7 ct7 = this.A02;
        ct7.A04 = f;
        ct7.A00 = f2;
        ct7.A06 = obj;
        ct7.A05 = obj2;
        ct7.A02 = f3;
        ct7.A01 = f4;
        ct7.A03 = f5;
        return A00(ct7);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CT7] */
    public C25723Ckt(Object obj) {
        this.A02 = new Object();
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CT7] */
    public C25723Ckt() {
        this.A02 = new Object();
        this.A01 = null;
    }
}
