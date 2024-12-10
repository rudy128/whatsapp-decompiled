package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

public class BN3 extends C26642D7p {
    public C26049CrJ A00;
    public C26049CrJ A01;
    public final Paint A02;
    public final Path A03;
    public final C40941vX A04;
    public final float[] A05;
    public final RectF A06 = AnonymousClass3MW.A08();

    public BN3(C38631rd r3, C40941vX r4) {
        super(r3, r4);
        Paint paint = new Paint();
        this.A02 = paint;
        this.A05 = new float[8];
        this.A03 = C108945cZ.A0L();
        this.A04 = r4;
        paint.setAlpha(0);
        C108945cZ.A1L(paint);
        paint.setColor(r4.A04);
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        super.BBs(ckt, obj);
        if (obj == EBL.A01) {
            if (ckt == null) {
                this.A01 = null;
            } else {
                this.A01 = new C22732BMv(ckt, (Object) null);
            }
        } else if (obj != EBL.A0Z) {
        } else {
            if (ckt == null) {
                this.A00 = null;
                this.A02.setColor(this.A04.A04);
                return;
            }
            this.A00 = new C22732BMv(ckt, (Object) null);
        }
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        super.BNg(matrix, rectF, z);
        RectF rectF2 = this.A06;
        C40941vX r2 = this.A04;
        BE7.A13(rectF2, (float) r2.A06, r2.A05);
        this.A0A.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
