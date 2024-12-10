package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.7MY  reason: invalid class name */
public final class AnonymousClass7MY implements C1607989y {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ String A01;

    public void Bwo(Bitmap bitmap) {
        C18070vi.A0d(bitmap, 0);
        String str = this.A01;
        ImageView imageView = this.A00;
        if (C108965cb.A1V(imageView, str)) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public AnonymousClass7MY(ImageView imageView, String str) {
        this.A01 = str;
        this.A00 = imageView;
    }

    public void Bwy() {
        String str = this.A01;
        ImageView imageView = this.A00;
        if (C108965cb.A1V(imageView, str)) {
            imageView.setImageDrawable((Drawable) null);
        }
    }

    public void Bx3(Bitmap bitmap) {
        String str = this.A01;
        ImageView imageView = this.A00;
        if (C108965cb.A1V(imageView, str)) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
