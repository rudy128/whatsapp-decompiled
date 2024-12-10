package X;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;

public final class BiZ extends BFE {
    public C25692CkN A00;
    public C6Z A01;

    public int getIntrinsicHeight() {
        C24468C5i c5i = this.A01.A00;
        return c5i.A07 + (c5i.A06 * 2);
    }

    public int getIntrinsicWidth() {
        C24468C5i c5i = this.A01.A00;
        return c5i.A07 + (c5i.A06 * 2);
    }

    public boolean A02(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator;
        boolean A02 = super.A02(z, z2, z3);
        if (!isRunning() && (objectAnimator = this.A00.A03) != null) {
            objectAnimator.cancel();
        }
        float f = Settings.Global.getFloat(this.A07.getContentResolver(), "animator_duration_scale", 1.0f);
        if (z && (z3 || (Build.VERSION.SDK_INT <= 22 && f > 0.0f))) {
            this.A00.A00();
        }
        return A02;
    }

    public void draw(Canvas canvas) {
        float f;
        Rect A07 = AnonymousClass3MW.A07();
        if (!getBounds().isEmpty() && isVisible()) {
            Canvas canvas2 = canvas;
            if (canvas.getClipBounds(A07)) {
                canvas.save();
                C6Z c6z = this.A01;
                Rect bounds = getBounds();
                C24468C5i c5i = this.A09;
                if (c5i.A01 == 0 && c5i.A00 == 0) {
                    f = 1.0f;
                } else {
                    f = this.A00;
                }
                c6z.A02(canvas, bounds, f);
                C6Z c6z2 = this.A01;
                Paint paint = this.A08;
                c6z2.A00(canvas, paint);
                char c = 0;
                while (true) {
                    C25692CkN ckN = this.A00;
                    int[] iArr = ckN.A0A;
                    if (c < 1) {
                        C6Z c6z3 = this.A01;
                        float[] fArr = ckN.A09;
                        c6z3.A01(canvas2, paint, fArr[0], fArr[1], iArr[c]);
                        c = 1;
                    } else {
                        canvas.restore();
                        return;
                    }
                }
            }
        }
    }
}
