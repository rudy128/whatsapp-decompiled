package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.9Ay  reason: invalid class name and case insensitive filesystem */
public final class C177879Ay extends A34 {
    public final String A00;
    public final WeakReference A01;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public C177879Ay(ImageView imageView, String str) {
        C18070vi.A0j(str, imageView);
        this.A00 = str;
        this.A01 = AnonymousClass3MW.A0z(imageView);
    }
}
