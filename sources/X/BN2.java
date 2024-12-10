package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class BN2 extends C26642D7p {
    public C26049CrJ A00;
    public C26049CrJ A01;
    public final Paint A02 = new Paint(3);
    public final Rect A03 = AnonymousClass3MW.A07();
    public final Rect A04 = AnonymousClass3MW.A07();
    public final C55152fI A05;

    public BN2(C38631rd r3, C40941vX r4) {
        super(r3, r4);
        C55152fI r0;
        String str = r4.A0K;
        C39801tf r02 = r3.A0G;
        if (r02 == null) {
            r0 = null;
        } else {
            r0 = (C55152fI) r02.A0A.get(str);
        }
        this.A05 = r0;
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        super.BBs(ckt, obj);
        if (obj == EBL.A01) {
            if (ckt == null) {
                this.A00 = null;
            } else {
                this.A00 = new C22732BMv(ckt, (Object) null);
            }
        } else if (obj != EBL.A00) {
        } else {
            if (ckt == null) {
                this.A01 = null;
            } else {
                this.A01 = new C22732BMv(ckt, (Object) null);
            }
        }
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        super.BNg(matrix, rectF, z);
        C55152fI r1 = this.A05;
        if (r1 != null) {
            float A002 = C40171uH.A00();
            rectF.set(0.0f, 0.0f, ((float) r1.A02) * A002, ((float) r1.A01) * A002);
            this.A0A.mapRect(rectF);
        }
    }
}
