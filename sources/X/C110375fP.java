package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.components.button.ThumbnailButton;
import java.io.File;

/* renamed from: X.5fP  reason: invalid class name and case insensitive filesystem */
public abstract class C110375fP extends FrameLayout {
    public abstract ThumbnailButton getMediaView();

    public static final Bitmap A00(Bitmap bitmap, AnonymousClass206 r2, AnonymousClass7E7 r3) {
        Bitmap A0B;
        File file;
        String path;
        File file2;
        if (r2 instanceof AnonymousClass21X) {
            C62572rc r0 = ((AnonymousClass21V) r2).A02;
            if (!(r0 == null || (file2 = r0.A0G) == null)) {
                A0B = C1408873l.A01(file2);
            }
            return bitmap;
        } else if (r2 instanceof C438421d) {
            C62572rc r02 = ((AnonymousClass21V) r2).A02;
            if (!(r02 == null || (file = r02.A0G) == null || (path = file.getPath()) == null)) {
                A0B = BitmapFactory.decodeFile(path);
            }
            return bitmap;
        } else {
            if (r2 instanceof AnonymousClass210) {
                A0B = r3.A00.A03.A0B(r2);
            }
            return bitmap;
        }
        if (A0B != null) {
            return A0B;
        }
        return bitmap;
    }

    public final GradientDrawable A02(Bitmap bitmap) {
        AnonymousClass1D6 A00 = AnonymousClass6XX.A00(AnonymousClass3MY.A04(this), bitmap);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int[] A1W = C108945cZ.A1W();
        A1W[0] = AnonymousClass3MZ.A04(A00);
        A1W[1] = C108955ca.A09(A00);
        return new GradientDrawable(orientation, A1W);
    }

    public final void A03() {
        measure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(2131166858), 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(2131166856), 1073741824));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
