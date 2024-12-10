package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.1oy  reason: invalid class name and case insensitive filesystem */
public class C37101oy {
    public Bitmap A00(Resources resources, Drawable drawable, ImageView imageView) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        imageView.setBackground((Drawable) null);
        imageView.setPadding(112, 112, 112, 112);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(640, 1073741824), View.MeasureSpec.makeMeasureSpec(640, 1073741824));
        imageView.layout(0, 0, imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
        imageView.setImageDrawable(drawable);
        try {
            bitmap2 = Bitmap.createBitmap(640, 640, Bitmap.Config.ARGB_8888);
            bitmap = bitmap2;
        } catch (OutOfMemoryError unused) {
            bitmap2 = null;
            bitmap = null;
        }
        if (bitmap2 == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmap2);
        imageView.setLayerType(1, (Paint) null);
        imageView.draw(canvas);
        try {
            bitmap3 = Bitmap.createBitmap(640, 640, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused2) {
            bitmap3 = null;
        }
        if (bitmap3 == null) {
            return null;
        }
        Canvas canvas2 = new Canvas(bitmap3);
        Paint paint = new Paint();
        paint.setMaskFilter(new BlurMaskFilter(49.28f, BlurMaskFilter.Blur.NORMAL));
        int[] iArr = new int[2];
        try {
            bitmap4 = bitmap.extractAlpha(paint, iArr);
        } catch (OutOfMemoryError unused3) {
            bitmap4 = null;
        }
        if (bitmap4 == null) {
            return null;
        }
        Paint paint2 = new Paint();
        paint2.setColor(resources.getColor(2131101144));
        canvas2.drawBitmap(bitmap4, (float) iArr[0], ((float) iArr[1]) + 32.0f, paint2);
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
        bitmap.recycle();
        bitmap4.recycle();
        return bitmap3;
    }
}
