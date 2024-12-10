package X;

import android.graphics.Bitmap;

/* renamed from: X.CgX  reason: case insensitive filesystem */
public class C25478CgX {
    public final Bitmap A00;

    public static C25478CgX A00(Bitmap bitmap) {
        return new C25478CgX(bitmap.copy(bitmap.getConfig(), false));
    }

    public C25478CgX(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
