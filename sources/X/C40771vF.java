package X;

import android.graphics.PointF;

/* renamed from: X.1vF  reason: invalid class name and case insensitive filesystem */
public class C40771vF {
    public final PointF A00;
    public final PointF A01;
    public final PointF A02;

    public String toString() {
        PointF pointF = this.A02;
        PointF pointF2 = this.A00;
        PointF pointF3 = this.A01;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", new Object[]{Float.valueOf(pointF.x), Float.valueOf(pointF.y), Float.valueOf(pointF2.x), Float.valueOf(pointF2.y), Float.valueOf(pointF3.x), Float.valueOf(pointF3.y)});
    }

    public C40771vF(PointF pointF, PointF pointF2, PointF pointF3) {
        this.A00 = pointF;
        this.A01 = pointF2;
        this.A02 = pointF3;
    }

    public C40771vF() {
        this.A00 = new PointF();
        this.A01 = new PointF();
        this.A02 = new PointF();
    }
}
