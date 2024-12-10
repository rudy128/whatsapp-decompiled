package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: X.BRh  reason: case insensitive filesystem */
public class C22829BRh extends C3F {
    public final int A00;
    public final int A01;
    public final Drawable A02;

    public C22829BRh(Drawable drawable) {
        int intrinsicWidth;
        this.A02 = drawable;
        boolean z = drawable instanceof NinePatchDrawable;
        int i = -1;
        if (z) {
            intrinsicWidth = -1;
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        this.A01 = intrinsicWidth;
        this.A00 = !z ? drawable.getIntrinsicHeight() : i;
    }
}
