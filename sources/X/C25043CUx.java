package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.CUx  reason: case insensitive filesystem */
public abstract class C25043CUx {
    public final /* synthetic */ C26304CxN A00;

    public C25043CUx(C26304CxN cxN) {
        this.A00 = cxN;
    }

    public void A00(String str) {
        float f;
        C25614Ciu ciu;
        C22762BNz bNz;
        String str2 = str;
        if (this instanceof BO0) {
            BO0 bo0 = (BO0) this;
            bo0.A00 += bo0.A01.A02.A00.measureText(str);
        } else if (this instanceof BO3) {
            BO3 bo3 = (BO3) this;
            C26304CxN cxN = bo3.A03;
            if (C26304CxN.A0p(cxN)) {
                Rect A07 = AnonymousClass3MW.A07();
                cxN.A02.A00.getTextBounds(str, 0, str.length(), A07);
                RectF rectF = new RectF(A07);
                rectF.offset(bo3.A00, bo3.A01);
                bo3.A02.union(rectF);
            }
            bo3.A00 += cxN.A02.A00.measureText(str);
        } else if (this instanceof BO2) {
            BO2 bo2 = (BO2) this;
            C26304CxN cxN2 = bo2.A03;
            if (C26304CxN.A0p(cxN2)) {
                Path A0L = C108945cZ.A0L();
                cxN2.A02.A00.getTextPath(str2, 0, str.length(), bo2.A00, bo2.A01, A0L);
                bo2.A02.addPath(A0L);
            }
            bo2.A00 += cxN2.A02.A00.measureText(str);
        } else {
            BO1 bo1 = (BO1) this;
            if (bo1 instanceof C22762BNz) {
                C22762BNz bNz2 = (C22762BNz) bo1;
                C26304CxN cxN3 = bNz2.A01;
                if (C26304CxN.A0p(cxN3)) {
                    C25614Ciu ciu2 = cxN3.A02;
                    if (ciu2.A05) {
                        cxN3.A00.drawTextOnPath(str2, bNz2.A00, bNz2.A00, bNz2.A01, ciu2.A00);
                    }
                    C25614Ciu ciu3 = cxN3.A02;
                    if (ciu3.A06) {
                        cxN3.A00.drawTextOnPath(str2, bNz2.A00, bNz2.A00, bNz2.A01, ciu3.A01);
                    }
                }
                f = bNz2.A00;
                ciu = cxN3.A02;
                bNz = bNz2;
            } else {
                C26304CxN cxN4 = bo1.A02;
                if (C26304CxN.A0p(cxN4)) {
                    C25614Ciu ciu4 = cxN4.A02;
                    if (ciu4.A05) {
                        cxN4.A00.drawText(str, bo1.A00, bo1.A01, ciu4.A00);
                    }
                    C25614Ciu ciu5 = cxN4.A02;
                    if (ciu5.A06) {
                        cxN4.A00.drawText(str, bo1.A00, bo1.A01, ciu5.A01);
                    }
                }
                f = bo1.A00;
                ciu = cxN4.A02;
                bNz = bo1;
            }
            bNz.A00 = f + ciu.A00.measureText(str);
        }
    }
}
