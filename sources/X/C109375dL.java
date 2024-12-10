package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.5dL  reason: invalid class name and case insensitive filesystem */
public final class C109375dL extends BitmapDrawable {
    public final AnonymousClass21V A00;

    public int getIntrinsicHeight() {
        int i;
        C62572rc r0 = this.A00.A02;
        if (r0 == null || (i = r0.A06) <= 0) {
            return super.getIntrinsicHeight();
        }
        return i;
    }

    public int getIntrinsicWidth() {
        int i;
        C62572rc r0 = this.A00.A02;
        if (r0 == null || (i = r0.A08) <= 0) {
            return super.getIntrinsicWidth();
        }
        return i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109375dL(Resources resources, Bitmap bitmap, AnonymousClass21V r3) {
        super(resources, bitmap);
        C18070vi.A0j(r3, resources);
        this.A00 = r3;
    }
}
