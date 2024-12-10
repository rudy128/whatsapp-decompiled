package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

public class CXA {
    public final Paint A00;
    public final Path A01 = C108945cZ.A0L();
    public final CMW A02 = CMW.A00();
    public final CMW A03 = CMW.A00();
    public final CMW A04 = CMW.A00();
    public final CMW A05 = CMW.A00();
    public final CMW A06 = CMW.A00();

    public void A00() {
        Path path = this.A01;
        path.reset();
        CMW cmw = this.A06;
        path.moveTo(cmw.A00, cmw.A01);
        CMW cmw2 = this.A02;
        float f = cmw2.A00;
        float f2 = cmw2.A01;
        CMW cmw3 = this.A03;
        float f3 = cmw3.A00;
        float f4 = cmw3.A01;
        CMW cmw4 = this.A04;
        path.cubicTo(f, f2, f3, f4, cmw4.A00, cmw4.A01);
        CMW cmw5 = this.A05;
        path.lineTo(cmw5.A00, cmw5.A01);
        path.close();
    }

    public CXA(int i, int i2) {
        Paint A062 = AnonymousClass3MW.A06();
        this.A00 = A062;
        BEA.A12(A062);
        A062.setColor(i);
        A062.setMaskFilter(new BlurMaskFilter((float) i2, BlurMaskFilter.Blur.NORMAL));
    }
}
