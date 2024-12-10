package X;

import android.graphics.RectF;

/* renamed from: X.Big  reason: case insensitive filesystem */
public abstract class C23517Big extends C27801Xq {
    public final RectF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23517Big(C28011Ym r2) {
        super(r2 == null ? new C28011Ym() : r2);
        this.A00 = AnonymousClass3MW.A08();
    }

    public void A0K(float f, float f2, float f3, float f4) {
        RectF rectF = this.A00;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
