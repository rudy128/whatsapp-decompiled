package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.7MZ  reason: invalid class name */
public final class AnonymousClass7MZ implements C1607989y {
    public final String A00;
    public final WeakReference A01;

    public void Bwo(Bitmap bitmap) {
        C18070vi.A0d(bitmap, 0);
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && C108965cb.A1V(imageView, this.A00)) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void Bwy() {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && C108965cb.A1V(imageView, this.A00)) {
            imageView.setImageResource(2131232945);
        }
    }

    public void Bx3(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && C108965cb.A1V(imageView, this.A00)) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public AnonymousClass7MZ(ImageView imageView, String str) {
        this.A00 = str;
        this.A01 = AnonymousClass3MW.A0z(imageView);
        imageView.setTag(str);
    }
}
