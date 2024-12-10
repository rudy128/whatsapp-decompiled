package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.7E5  reason: invalid class name */
public final class AnonymousClass7E5 implements C42971z2 {
    public static final AnonymousClass7E5 A00 = new Object();

    public /* synthetic */ void CBg() {
    }

    public /* synthetic */ void CIg(AnonymousClass1BI r1) {
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        C18070vi.A0d(imageView, 0);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            CN5(imageView);
        }
    }

    public void CN5(ImageView imageView) {
        C18070vi.A0d(imageView, 0);
        imageView.setImageResource(2131231047);
    }
}
