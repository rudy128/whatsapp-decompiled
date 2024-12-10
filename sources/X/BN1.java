package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;

public class BN1 extends C26642D7p {
    public final C26636D7j A00;
    public final BN4 A01;

    public BN1(C39801tf r5, C38631rd r6, BN4 bn4, C40941vX r8) {
        super(r6, r8);
        this.A01 = bn4;
        C26636D7j d7j = new C26636D7j(r5, r6, new C40931vW("__container", r8.A0N, false), this);
        this.A00 = d7j;
        d7j.CIY(Collections.emptyList(), Collections.emptyList());
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        super.BNg(matrix, rectF, z);
        this.A00.BNg(this.A0A, rectF, z);
    }
}
