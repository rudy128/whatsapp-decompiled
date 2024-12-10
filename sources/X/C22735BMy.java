package X;

import android.graphics.PointF;

/* renamed from: X.BMy  reason: case insensitive filesystem */
public class C22735BMy extends AnonymousClass29P {
    public float A0C() {
        return A0D(this.A06.BPw(), A03());
    }

    public float A0D(C40511up r12, float f) {
        Object obj;
        Number number;
        Object obj2 = r12.A0E;
        if (obj2 == null || (obj = r12.A07) == null) {
            throw AnonymousClass000.A0n("Missing values for keyframe.");
        }
        C25723Ckt ckt = this.A03;
        float f2 = f;
        if (ckt != null && (number = (Number) ckt.A01(obj2, obj, r12.A0A, r12.A06.floatValue(), f2, A04(), this.A02)) != null) {
            return number.floatValue();
        }
        float f3 = r12.A01;
        if (f3 == -3987645.8f) {
            f3 = AnonymousClass000.A04(obj2);
            r12.A01 = f3;
        }
        float f4 = r12.A00;
        if (f4 == -3987645.8f) {
            f4 = AnonymousClass000.A04(r12.A07);
            r12.A00 = f4;
        }
        PointF pointF = C40761vE.A00;
        return C17880vN.A00(f4, f3, f);
    }

    public /* bridge */ /* synthetic */ Object A06(C40511up r2, float f) {
        return Float.valueOf(A0D(r2, f));
    }
}
