package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.location.Location;

public class BPU extends DA3 implements E47 {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public final C26203CuZ A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final Paint A0C = AnonymousClass3MZ.A0A();
    public final Path A0D = C108945cZ.A0L();
    public final C199339zp A0E = new Object();

    public void A08(Canvas canvas) {
        Location location = this.A07.A0U.A00;
        if (location != null) {
            float A012 = BE8.A01(this.A05, location.getAccuracy(), this.A06);
            Paint paint = this.A0C;
            paint.setColor(-12888163);
            paint.setAlpha((int) ((1.0f - this.A01) * 255.0f));
            C26152CtJ ctJ = this.A08;
            C199339zp r7 = this.A0E;
            ctJ.A07(r7);
            double A013 = C26152CtJ.A01(location.getLongitude());
            double A002 = C26152CtJ.A00(location.getLatitude());
            float[] fArr = this.A0A;
            ctJ.A09(fArr, A013 + ((double) ((int) Math.ceil(r7.A01 - A013))), A002);
            float f = fArr[0];
            float f2 = fArr[1];
            Canvas canvas2 = canvas;
            canvas2.drawCircle(f, f2, A012 * this.A01, paint);
            paint.setColor(-3355444);
            float f3 = this.A0A;
            canvas2.drawCircle(f, f2, f3, paint);
            paint.setColor(-1);
            canvas2.drawCircle(f, f2, this.A0B, paint);
            paint.setColor(-12888163);
            paint.setAlpha((int) (this.A00 * 255.0f));
            canvas2.drawCircle(f, f2, this.A00 * this.A09, paint);
            if (location.hasBearing()) {
                canvas2.save();
                float f4 = ctJ.A00.A0Q.A0A;
                if (f4 < 0.0f) {
                    f4 += 360.0f;
                }
                canvas2.rotate(f4 + location.getBearing(), f, f2);
                float f5 = this.A08;
                float f6 = f5 / 2.0f;
                float f7 = f - f6;
                float f8 = f2 - f3;
                Path path = this.A0D;
                path.reset();
                path.moveTo(f7, f8);
                float f9 = this.A07;
                path.lineTo(f6 + f7, f8 - f9);
                path.lineTo(f5 + f7, f8);
                path.lineTo((f5 * 0.5f) + f7, f8 - (f9 * 0.25f));
                BE8.A0w(canvas2, paint, path, f7, f8);
                canvas2.restore();
            }
        }
    }

    public void BlR(C26203CuZ cuZ) {
        float f;
        float f2 = cuZ.A00;
        this.A01 = f2;
        if (f2 < this.A02) {
            this.A03 = !this.A03;
        }
        if (this.A03) {
            f = 1.0f - ((1.0f - f2) * 0.25f);
        } else {
            f = 1.0f - (0.25f * f2);
        }
        this.A00 = f;
        this.A02 = f2;
        A03();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9zp, java.lang.Object] */
    public BPU(DAE dae) {
        super(dae);
        this.A03 = 3;
        this.A02 = 0.0f;
        float f = this.A0B;
        this.A09 = 8.0f * f;
        float f2 = f * 11.0f;
        this.A0B = f2;
        this.A0A = f2 + 1.5f;
        this.A08 = 12.0f * f;
        this.A07 = 10.0f * f;
        float f3 = f * 24.0f;
        this.A06 = f3;
        this.A05 = f3 * 2.0f;
        C26203CuZ A002 = C26203CuZ.A00(0.0f, 1.0f);
        this.A04 = A002;
        A002.A05 = -1;
        A002.A08(this);
        A002.A07 = 2100;
    }
}
