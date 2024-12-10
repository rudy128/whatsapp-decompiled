package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.7Ma  reason: invalid class name and case insensitive filesystem */
public class C145637Ma implements C1607989y {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C121136Hw A01;
    public final /* synthetic */ String A02;

    public C145637Ma(ImageView imageView, C121136Hw r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = imageView;
    }

    public void Bwo(Bitmap bitmap) {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void Bwy() {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageResource(2131232945);
        }
    }

    public void Bx3(Bitmap bitmap) {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
