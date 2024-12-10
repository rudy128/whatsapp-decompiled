package X;

import android.graphics.PointF;

/* renamed from: X.29K  reason: invalid class name */
public class AnonymousClass29K extends AnonymousClass29P {
    public int A0C(C40511up r10, float f) {
        Object obj;
        Number number;
        float f2 = f;
        Object obj2 = r10.A0E;
        if (obj2 == null || (obj = r10.A07) == null) {
            throw AnonymousClass000.A0n("Missing values for keyframe.");
        }
        C25723Ckt ckt = this.A03;
        if (ckt != null && (number = (Number) ckt.A01(obj2, obj, r10.A0A, r10.A06.floatValue(), f2, A04(), this.A02)) != null) {
            return number.intValue();
        }
        int i = r10.A03;
        if (i == 784923401) {
            i = AnonymousClass000.A0M(obj2);
            r10.A03 = i;
        }
        int i2 = r10.A02;
        if (i2 == 784923401) {
            i2 = AnonymousClass000.A0M(r10.A07);
            r10.A02 = i2;
        }
        PointF pointF = C40761vE.A00;
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    public /* bridge */ /* synthetic */ Object A06(C40511up r2, float f) {
        return Integer.valueOf(A0C(r2, f));
    }
}
