package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.CeT  reason: case insensitive filesystem */
public abstract class C25368CeT {
    public static final boolean A00;

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 28) {
            z = false;
        }
        A00 = z;
    }

    public static ImageView A00(View view, View view2, ViewGroup viewGroup) {
        boolean isAttachedToWindow;
        ViewGroup viewGroup2;
        int i;
        Matrix A0J = C108945cZ.A0J();
        A0J.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C24493C6l c6l = C25446Cfx.A02;
        View view3 = view;
        c6l.A02(A0J, view);
        ViewGroup viewGroup3 = viewGroup;
        c6l.A03(A0J, viewGroup3);
        RectF A04 = C108965cb.A04(C108945cZ.A03(view), C108945cZ.A04(view));
        A0J.mapRect(A04);
        int round = Math.round(A04.left);
        int round2 = Math.round(A04.top);
        int round3 = Math.round(A04.right);
        int round4 = Math.round(A04.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean z = !view.isAttachedToWindow();
        if (viewGroup3 == null) {
            isAttachedToWindow = false;
        } else {
            isAttachedToWindow = viewGroup3.isAttachedToWindow();
        }
        Bitmap bitmap = null;
        if (z) {
            if (isAttachedToWindow) {
                viewGroup2 = (ViewGroup) view.getParent();
                i = viewGroup2.indexOfChild(view);
                viewGroup3.getOverlay().add(view);
            }
            AnonymousClass3MY.A1C(imageView, round4 - round2, 1073741824, View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        viewGroup2 = null;
        i = 0;
        int round5 = Math.round(A04.width());
        int round6 = Math.round(A04.height());
        if (round5 > 0 && round6 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
            int A042 = BE6.A04((float) round5, min);
            int A043 = BE6.A04((float) round6, min);
            A0J.postTranslate(-A04.left, -A04.top);
            A0J.postScale(min, min);
            if (A00) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(A042, A043);
                beginRecording.concat(A0J);
                view3.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(A042, A043, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(A0J);
                view3.draw(canvas);
            }
        }
        if (z) {
            viewGroup3.getOverlay().remove(view3);
            viewGroup2.addView(view3, i);
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        AnonymousClass3MY.A1C(imageView, round4 - round2, 1073741824, View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }
}
