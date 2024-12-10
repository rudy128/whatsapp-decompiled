package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.29O  reason: invalid class name */
public class AnonymousClass29O extends AnonymousClass29P {
    public final PointF A00 = new PointF();

    /* renamed from: A0C */
    public PointF A07(C40511up r12, float f, float f2, float f3) {
        Object obj;
        Object obj2 = r12.A0E;
        if (obj2 == null || (obj = r12.A07) == null) {
            throw AnonymousClass000.A0n("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        C25723Ckt ckt = this.A03;
        if (ckt != null) {
            PointF pointF3 = (PointF) ckt.A01(pointF, pointF2, r12.A0A, r12.A06.floatValue(), f, A04(), this.A02);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.A00;
        pointF4.set(C17880vN.A00(pointF2.x, pointF.x, f2), C17880vN.A00(pointF2.y, pointF.y, f3));
        return pointF4;
    }

    public AnonymousClass29O(List list) {
        super(list);
    }

    public /* bridge */ /* synthetic */ Object A06(C40511up r2, float f) {
        return A07(r2, f, f, f);
    }
}
