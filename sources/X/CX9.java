package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

public final class CX9 {
    public final Paint A00;
    public final Path A01 = C108945cZ.A0L();
    public final CMV A02 = CMV.A00();
    public final CMV A03 = CMV.A00();
    public final CMV A04 = CMV.A00();
    public final CMV A05 = CMV.A00();
    public final CMV A06 = CMV.A00();

    public final void A00() {
        Path path = this.A01;
        path.reset();
        CMV cmv = this.A06;
        path.moveTo(cmv.A00, cmv.A01);
        CMV cmv2 = this.A02;
        float f = cmv2.A00;
        float f2 = cmv2.A01;
        CMV cmv3 = this.A03;
        float f3 = cmv3.A00;
        float f4 = cmv3.A01;
        CMV cmv4 = this.A04;
        path.cubicTo(f, f2, f3, f4, cmv4.A00, cmv4.A01);
        CMV cmv5 = this.A05;
        path.lineTo(cmv5.A00, cmv5.A01);
        path.close();
    }

    public CX9(int i, int i2) {
        Paint A062 = AnonymousClass3MW.A06();
        this.A00 = A062;
        BEA.A12(A062);
        A062.setColor(i);
        A062.setMaskFilter(new BlurMaskFilter((float) i2, BlurMaskFilter.Blur.NORMAL));
    }
}
