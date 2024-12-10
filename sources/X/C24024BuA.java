package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.BuA  reason: case insensitive filesystem */
public class C24024BuA extends AnonymousClass70B {
    public int A00 = 0;
    public float A01;
    public final long A02;
    public final List A03 = AnonymousClass000.A13();
    public final float A04;
    public final long A05;
    public final C25683CkE A06;
    public final C25595Cia A07;
    public final float[] A08 = new float[4];

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24024BuA(android.graphics.Bitmap r10, android.graphics.Paint r11, android.graphics.PointF r12, android.graphics.PointF r13, float r14, float r15, int r16, long r17) {
        /*
            r9 = this;
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r16
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r9.A03 = r0
            r0 = 4
            float[] r0 = new float[r0]
            r9.A08 = r0
            r0 = 0
            r9.A00 = r0
            r0 = r17
            r9.A02 = r0
            X.Cia r2 = new X.Cia
            r2.<init>(r12, r0)
            r9.A07 = r2
            X.CX3 r2 = r2.A01
            X.CkE r2 = r2.A03
            r9.A06 = r2
            r9.A04 = r15
            r9.A05 = r0
            float r2 = r9.A01(r8)
            r9.A01 = r2
            r9.A06(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24024BuA.<init>(android.graphics.Bitmap, android.graphics.Paint, android.graphics.PointF, android.graphics.PointF, float, float, int, long):void");
    }

    public void A04(Canvas canvas) {
        A02(canvas, 0);
    }

    private float A01(int i) {
        float f = (this.A03 * 0.03f) - 0.125f;
        if (f < 0.125f) {
            f = 0.125f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        return (f * this.A04) / ((float) i);
    }

    private void A02(Canvas canvas, int i) {
        float A002;
        C25683CkE ckE = this.A06;
        float f = this.A01;
        ckE.A03 = f;
        int floor = ((int) Math.floor((double) (ckE.A02 / f))) + 1;
        while (true) {
            this.A00 = i;
            if (i < floor) {
                float[] fArr = this.A08;
                float f2 = ((float) i) * ckE.A03;
                if (f2 < ckE.A01 || f2 > ckE.A00) {
                    Map.Entry floorEntry = ckE.A06.floorEntry(Float.valueOf(f2));
                    if (floorEntry == null) {
                        ckE.A04 = null;
                        ckE.A01 = 1.0f;
                        A002 = 0.0f;
                    } else {
                        ckE.A04 = (C25733Cl3) floorEntry.getValue();
                        float A042 = AnonymousClass000.A04(floorEntry.getKey());
                        ckE.A01 = A042;
                        A002 = A042 + ckE.A04.A00();
                    }
                    ckE.A00 = A002;
                }
                C25733Cl3 cl3 = ckE.A04;
                float f3 = 1.0f;
                if (cl3 != null) {
                    float A003 = cl3.A00();
                    if (A003 != 0.0f) {
                        f3 = (f2 - ckE.A01) / A003;
                    }
                } else {
                    cl3 = ckE.A05;
                }
                cl3.A01(fArr, f3);
                PointF pointF = new PointF(fArr[2], fArr[3]);
                float f4 = this.A03;
                float f5 = pointF.x;
                float f6 = pointF.y;
                double sqrt = Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
                float f7 = CGI.A00;
                float f8 = 0.0f;
                float sqrt2 = (((float) Math.sqrt(sqrt)) - 0.0f) / ((0.4f * f4) - 0.0f);
                if (sqrt2 >= 0.0f) {
                    f8 = sqrt2;
                    if (sqrt2 > 1.0f) {
                        f8 = 1.0f;
                    }
                }
                int i2 = (int) (f4 * (1.0f - (f7 * ((f8 * f8) * (3.0f - (f8 * 2.0f))))));
                float f9 = fArr[0];
                float f10 = fArr[1];
                Paint paint = this.A01;
                paint.setStrokeWidth((float) i2);
                canvas.drawPoint(f9, f10, paint);
                i = this.A00 + 1;
            } else {
                return;
            }
        }
    }

    public void A05(PointF pointF, long j) {
        long max = Math.max(j, this.A05 + 1);
        this.A02.add(pointF);
        BE7.A1S(this.A03, max - this.A02);
        C25595Cia cia = this.A07;
        BEu bEu = cia.A02;
        bEu.set(pointF);
        while (((double) cia.A00) + 3.0d < ((double) max)) {
            C25595Cia.A00(cia);
        }
        BEu bEu2 = cia.A03;
        float A002 = (float) BE9.A00(bEu2.x - bEu.x, bEu2.y - bEu.y);
        float f = A002;
        PointF pointF2 = new PointF(0.0f, 0.0f);
        while (f > 0.0f && A002 > 0.0f) {
            pointF2.set(bEu2);
            C25595Cia.A00(cia);
            A002 = (float) BE9.A00(bEu2.x - pointF2.x, bEu2.y - pointF2.y);
            f -= A002;
        }
        CX3 cx3 = cia.A01;
        long j2 = cx3.A02;
        BEu bEu3 = cx3.A00;
        if (bEu3 != cx3.A01) {
            cx3.A00(bEu3, j2);
            cx3.A01 = cx3.A00;
        }
        Canvas canvas = this.A00;
        if (canvas != null) {
            A02(canvas, this.A00);
        }
    }

    public void A06(PointF pointF, long j) {
        if (this.A05 <= j) {
            this.A02.add(pointF);
            BE7.A1S(this.A03, j - this.A02);
            C25595Cia cia = this.A07;
            cia.A02.set(pointF);
            while (((double) cia.A00) + 3.0d < ((double) j)) {
                C25595Cia.A00(cia);
            }
            Canvas canvas = this.A00;
            if (canvas != null) {
                A02(canvas, this.A00);
            }
        }
    }

    public void A03(Bitmap bitmap, PointF pointF, int i) {
        super.A03(bitmap, pointF, i);
        this.A01 = A01(i);
    }

    public void A07(JSONObject jSONObject) {
        super.A07(jSONObject);
        JSONArray A1A = AnonymousClass8BR.A1A();
        for (Object put : this.A03) {
            A1A.put(put);
        }
        jSONObject.put("times", A1A);
    }
}
