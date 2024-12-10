package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7NB  reason: invalid class name */
public final class AnonymousClass7NB implements AnonymousClass3M2 {
    public final ImageView A00;
    public final C32021gV A01;

    public /* synthetic */ void BuW() {
    }

    public int BZK() {
        return this.A01.A0A(this.A00.getContext());
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r5) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            this.A00.setVisibility(8);
            return;
        }
        ImageView imageView = this.A00;
        imageView.setVisibility(0);
        imageView.setImageBitmap(bitmap);
    }

    public void CN4(View view) {
        C108955ca.A1L(this.A00, -7829368);
    }

    public AnonymousClass7NB(ImageView imageView, C32021gV r2) {
        this.A00 = imageView;
        this.A01 = r2;
    }
}
