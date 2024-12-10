package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* renamed from: X.9k8  reason: invalid class name and case insensitive filesystem */
public final class C189959k8 {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ B6T A01;

    public C189959k8(ImageView imageView, B6T b6t) {
        this.A01 = b6t;
        this.A00 = imageView;
    }

    public void A00(Bitmap bitmap) {
        Number number = (Number) this.A01.get();
        if (number != null) {
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            C18070vi.A0X(createBitmap);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
            this.A00.setImageBitmap(createBitmap);
            return;
        }
        this.A00.setImageBitmap(bitmap);
    }
}
