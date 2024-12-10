package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.5h4  reason: invalid class name and case insensitive filesystem */
public abstract class C110775h4 extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public static void A00(PhotoView photoView) {
        photoView.A0A = new Matrix();
        photoView.A0B = new Matrix();
        photoView.A0N = false;
        photoView.A0O = true;
        photoView.A02 = Float.MAX_VALUE;
        photoView.A0C = new Paint();
        photoView.A0E = new Rect();
        photoView.A09 = 0;
        photoView.A08 = 0.8f;
        photoView.A0G = new RectF();
        photoView.A0F = new RectF();
        photoView.A0H = new RectF();
        photoView.A0D = new PointF();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C110775h4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
