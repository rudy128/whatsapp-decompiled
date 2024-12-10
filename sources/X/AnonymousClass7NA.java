package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7NA  reason: invalid class name */
public class AnonymousClass7NA implements AnonymousClass3M2 {
    public final int A00;

    public AnonymousClass7NA(AnonymousClass118 r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = AnonymousClass3MW.A05(r3).getDimensionPixelSize(2131168877);
    }

    public /* synthetic */ void BuW() {
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r4) {
        C18070vi.A0d(view, 0);
        if (bitmap != null) {
            ((ImageView) view).setImageBitmap(bitmap);
        } else {
            CN4(view);
        }
    }

    public void CN4(View view) {
        ImageView imageView;
        Drawable A002;
        Bitmap A003;
        C18070vi.A0d(view, 0);
        if ((view instanceof ImageView) && (imageView = (ImageView) view) != null && (A002 = C24261Jm.A00(imageView.getContext(), 2131232200)) != null && (A003 = C124246Xp.A00(A002)) != null) {
            imageView.setImageBitmap(A003);
        }
    }

    public int BZK() {
        return this.A00;
    }
}
