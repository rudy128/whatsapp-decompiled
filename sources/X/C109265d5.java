package X;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.5d5  reason: invalid class name and case insensitive filesystem */
public class C109265d5 extends SharedElementCallback {
    public final C123426Uk A00;

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        Bitmap A0H;
        C123426Uk r11 = this.A00;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
                    if (!(drawable instanceof BitmapDrawable) || min != 1.0f) {
                        int i = (int) (((float) intrinsicWidth) * min);
                        int i2 = (int) (((float) intrinsicHeight) * min);
                        A0H = C108945cZ.A0H(i, i2);
                        Canvas A0I = C108945cZ.A0I(A0H);
                        Rect bounds = drawable.getBounds();
                        int i3 = bounds.left;
                        int i4 = bounds.top;
                        int i5 = bounds.right;
                        int i6 = bounds.bottom;
                        drawable.setBounds(0, 0, i, i2);
                        drawable.draw(A0I);
                        drawable.setBounds(i3, i4, i5, i6);
                    } else {
                        A0H = ((BitmapDrawable) drawable).getBitmap();
                    }
                    if (A0H != null) {
                        Bundle A0D = C17880vN.A0D();
                        A0D.putParcelable("sharedElement:snapshot:bitmap", A0H);
                        A0D.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            A0D.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                        }
                        return A0D;
                    }
                }
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min2 = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        int i7 = (int) (((float) round) * min2);
        int i8 = (int) (((float) round2) * min2);
        Matrix matrix2 = r11.A00;
        if (matrix2 == null) {
            matrix2 = C108945cZ.A0J();
            r11.A00 = matrix2;
        }
        matrix2.set(matrix);
        r11.A00.postTranslate(-rectF.left, -rectF.top);
        r11.A00.postScale(min2, min2);
        Bitmap A0H2 = C108945cZ.A0H(i7, i8);
        Canvas A0I2 = C108945cZ.A0I(A0H2);
        A0I2.concat(r11.A00);
        view.draw(A0I2);
        return A0H2;
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        ImageView imageView = null;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap != null) {
                imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                    Matrix A0J = C108945cZ.A0J();
                    A0J.setValues(floatArray);
                    imageView.setImageMatrix(A0J);
                }
            }
        } else if (parcelable instanceof Bitmap) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
        return imageView;
    }

    public void onMapSharedElements(List list, Map map) {
        this.A00.A02(list, map);
    }

    public void onSharedElementEnd(List list, List list2, List list3) {
        this.A00.A01(list, list2, list3);
    }

    public void onSharedElementStart(List list, List list2, List list3) {
        this.A00.A00();
    }

    public C109265d5(C123426Uk r1) {
        this.A00 = r1;
    }

    public void onRejectSharedElements(List list) {
    }

    public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        AnonymousClass70Y.A01(onSharedElementsReadyListener);
    }
}
