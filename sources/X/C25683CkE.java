package X;

import android.graphics.PointF;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.CkE  reason: case insensitive filesystem */
public class C25683CkE {
    public static final PointF A07 = new PointF(0.0f, 0.0f);
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 1.0f;
    public C25733Cl3 A04;
    public C25733Cl3 A05;
    public final NavigableMap A06 = new TreeMap();

    public void A00(PointF pointF, PointF pointF2) {
        C25733Cl3 cl3 = this.A05;
        if (cl3 == null) {
            PointF pointF3 = A07;
            float f = pointF3.x;
            float[] fArr = {f, f, pointF2.x, pointF.x};
            float f2 = pointF3.y;
            this.A05 = new C25733Cl3(fArr, new float[]{f2, f2, pointF2.y, pointF.y});
            return;
        }
        float[] fArr2 = cl3.A01;
        float[] fArr3 = {fArr2[3], fArr2[2], pointF2.x, pointF.x};
        float[] fArr4 = cl3.A02;
        C25733Cl3 cl32 = new C25733Cl3(fArr3, new float[]{fArr4[3], fArr4[2], pointF2.y, pointF.y});
        this.A05 = cl32;
        this.A06.put(Float.valueOf(this.A02), cl32);
        this.A02 += this.A05.A00();
    }
}
