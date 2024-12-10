package X;

import android.graphics.PointF;

/* renamed from: X.29J  reason: invalid class name */
public class AnonymousClass29J extends AnonymousClass29P {
    public int A0C(C40511up r11, float f) {
        Object obj;
        Float f2;
        Number number;
        Object obj2 = r11.A0E;
        if (obj2 == null || (obj = r11.A07) == null) {
            throw AnonymousClass000.A0n("Missing values for keyframe.");
        }
        C25723Ckt ckt = this.A03;
        float f3 = f;
        if (ckt != null && (f2 = r11.A06) != null && (number = (Number) ckt.A01(obj2, obj, r11.A0A, f2.floatValue(), f3, A04(), this.A02)) != null) {
            return number.intValue();
        }
        PointF pointF = C40761vE.A00;
        return C40881vR.A02(Math.max(0.0f, Math.min(1.0f, f)), AnonymousClass000.A0M(obj2), AnonymousClass000.A0M(r11.A07));
    }

    public /* bridge */ /* synthetic */ Object A06(C40511up r2, float f) {
        return Integer.valueOf(A0C(r2, f));
    }
}
