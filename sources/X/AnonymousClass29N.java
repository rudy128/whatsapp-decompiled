package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.29N  reason: invalid class name */
public class AnonymousClass29N extends AnonymousClass29P {
    public C40591ux A00;
    public final PathMeasure A01 = new PathMeasure();
    public final PointF A02 = new PointF();
    public final float[] A03 = new float[2];

    public /* bridge */ /* synthetic */ Object A06(C40511up r12, float f) {
        Object A012;
        float f2 = f;
        C40591ux r2 = (C40591ux) r12;
        Path path = r2.A00;
        if (path == null) {
            return r12.A0E;
        }
        C25723Ckt ckt = this.A03;
        if (ckt != null && (A012 = ckt.A01(r2.A0E, r2.A07, r2.A0A, r2.A06.floatValue(), A04(), f2, this.A02)) != null) {
            return A012;
        }
        if (this.A00 != r2) {
            this.A01.setPath(path, false);
            this.A00 = r2;
        }
        PathMeasure pathMeasure = this.A01;
        float[] fArr = this.A03;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), fArr, (float[]) null);
        PointF pointF = this.A02;
        pointF.set(fArr[0], fArr[1]);
        return pointF;
    }

    public AnonymousClass29N(List list) {
        super(list);
    }
}
