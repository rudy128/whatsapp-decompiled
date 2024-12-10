package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.6Lm  reason: invalid class name and case insensitive filesystem */
public final class C121786Lm extends A34 {
    public final Matrix A00;
    public final Rect A01;
    public final Rect A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        C17960vV.A07(bitmapArr);
        C17960vV.A0C(C17890vO.A1R(bitmapArr.length));
        Bitmap bitmap = bitmapArr[0];
        try {
            Rect rect = this.A02;
            Bitmap A0H = C108945cZ.A0H(rect.width(), rect.height());
            Canvas A0I = C108945cZ.A0I(A0H);
            A0I.drawColor(-16777216);
            A0I.setMatrix(this.A00);
            A0I.drawBitmap(bitmap, C108995ce.A0I(bitmap), this.A01, (Paint) null);
            FilterUtils.A02(75, A0H);
            return A0H;
        } catch (OutOfMemoryError e) {
            Log.e("BlurBitmapAsyncTask/doInBackground creating output bitmap", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass85J r3 = (AnonymousClass85J) this.A03.get();
        if (r3 != null && bitmap != null) {
            ShapePickerView shapePickerView = (ShapePickerView) r3;
            shapePickerView.A01 = bitmap;
            ValueAnimator valueAnimator = shapePickerView.A00;
            if (valueAnimator == null) {
                int[] A1W = C108945cZ.A1W();
                // fill-array-data instruction
                A1W[0] = 0;
                A1W[1] = 255;
                ValueAnimator ofInt = ValueAnimator.ofInt(A1W);
                shapePickerView.A00 = ofInt;
                C108955ca.A19(ofInt);
                shapePickerView.A00.setDuration(300);
                C1411074h.A00(shapePickerView.A00, shapePickerView, 16);
            } else {
                valueAnimator.cancel();
            }
            shapePickerView.A00.start();
        }
    }

    public C121786Lm(Matrix matrix, Rect rect, Rect rect2, AnonymousClass85J r5) {
        this.A02 = rect;
        this.A01 = rect2;
        this.A00 = matrix;
        this.A03 = AnonymousClass3MW.A0z(r5);
    }
}
