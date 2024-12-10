package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.6LU  reason: invalid class name */
public final class AnonymousClass6LU extends A34 {
    public final String A00;
    public final WeakReference A01;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        byte[] decode = Base64.decode(this.A00, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        C18070vi.A0X(decodeByteArray);
        return decodeByteArray;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageBitmap(bitmap);
    }

    public AnonymousClass6LU(ImageView imageView, String str) {
        this.A00 = str;
        this.A01 = AnonymousClass3MW.A0z(imageView);
    }
}
