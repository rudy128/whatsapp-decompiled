package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* renamed from: X.Ciu  reason: case insensitive filesystem */
public class C25614Ciu {
    public Paint A00;
    public Paint A01;
    public C25668Cjy A02;
    public C25668Cjy A03;
    public DS2 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final /* synthetic */ C26304CxN A08;

    public C25614Ciu(C25614Ciu ciu, C26304CxN cxN) {
        this.A08 = cxN;
        this.A05 = ciu.A05;
        this.A06 = ciu.A06;
        this.A00 = new Paint(ciu.A00);
        this.A01 = new Paint(ciu.A01);
        C25668Cjy cjy = ciu.A03;
        if (cjy != null) {
            this.A03 = new C25668Cjy(cjy);
        }
        C25668Cjy cjy2 = ciu.A02;
        if (cjy2 != null) {
            this.A02 = new C25668Cjy(cjy2);
        }
        this.A07 = ciu.A07;
        try {
            this.A04 = (DS2) ciu.A04.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.A04 = DS2.A00();
        }
    }

    public C25614Ciu(C26304CxN cxN) {
        this.A08 = cxN;
        Paint A062 = AnonymousClass3MW.A06();
        this.A00 = A062;
        A062.setFlags(385);
        C108945cZ.A1L(this.A00);
        Paint paint = this.A00;
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint A063 = AnonymousClass3MW.A06();
        this.A01 = A063;
        A063.setFlags(385);
        AnonymousClass3MW.A1P(this.A01);
        this.A01.setTypeface(typeface);
        this.A04 = DS2.A00();
    }
}
