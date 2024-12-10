package X;

import android.graphics.Path;

public class D8V implements C28589E9d {
    public float A00;
    public float A01;
    public Path A02 = C108945cZ.A0L();
    public final /* synthetic */ C26304CxN A03;

    public void BCZ(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        C26304CxN.A0T(this, this.A00, this.A01, f, f2, f3, f4, f5, z, z2);
        this.A00 = f4;
        this.A01 = f5;
    }

    public D8V(D8X d8x, C26304CxN cxN) {
        this.A03 = cxN;
        if (d8x != null) {
            d8x.A02(this);
        }
    }

    public void BHy(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A02.cubicTo(f, f2, f3, f4, f5, f6);
        this.A00 = f5;
        this.A01 = f6;
    }

    public void BhX(float f, float f2) {
        this.A02.lineTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    public void Bk6(float f, float f2) {
        this.A02.moveTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    public void CD6(float f, float f2, float f3, float f4) {
        this.A02.quadTo(f, f2, f3, f4);
        this.A00 = f3;
        this.A01 = f4;
    }

    public void close() {
        this.A02.close();
    }
}
