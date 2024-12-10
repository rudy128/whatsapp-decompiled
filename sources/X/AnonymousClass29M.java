package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.29M  reason: invalid class name */
public class AnonymousClass29M extends AnonymousClass29P {
    public final C40651v3 A00 = new C40651v3();

    public /* bridge */ /* synthetic */ Object A06(C40511up r12, float f) {
        Object obj;
        Object A01;
        Object obj2 = r12.A0E;
        if (obj2 == null || (obj = r12.A07) == null) {
            throw AnonymousClass000.A0n("Missing values for keyframe.");
        }
        C40651v3 r4 = (C40651v3) obj2;
        C40651v3 r5 = (C40651v3) obj;
        C25723Ckt ckt = this.A03;
        float f2 = f;
        if (ckt != null && (A01 = ckt.A01(r4, r5, r12.A0A, r12.A06.floatValue(), f2, A04(), this.A02)) != null) {
            return A01;
        }
        C40651v3 r3 = this.A00;
        float f3 = r4.A00;
        float f4 = r5.A00;
        PointF pointF = C40761vE.A00;
        float A002 = C17880vN.A00(f4, f3, f);
        float A003 = C17880vN.A00(r5.A01, r4.A01, f);
        r3.A00 = A002;
        r3.A01 = A003;
        return r3;
    }

    public AnonymousClass29M(List list) {
        super(list);
    }
}
