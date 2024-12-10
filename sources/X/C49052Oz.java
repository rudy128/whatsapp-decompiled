package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.2Oz  reason: invalid class name and case insensitive filesystem */
public final class C49052Oz extends AnonymousClass7NA {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49052Oz(AnonymousClass118 r3) {
        super(r3);
        C18070vi.A0d(r3, 1);
        this.A00 = r3.A00.getResources().getDimensionPixelSize(2131168878);
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r4) {
        C18070vi.A0d(view, 0);
        if (bitmap != null) {
            ((ImageView) view).setImageBitmap(bitmap);
        }
    }

    public int BZK() {
        return this.A00;
    }
}
