package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.ViewGroup;

/* renamed from: X.69H  reason: invalid class name */
public class AnonymousClass69H extends AnonymousClass6q1 {
    public final int A00;
    public final Path A01;

    public AnonymousClass69H(RectF rectF, Handler handler, Vibrator vibrator, ViewGroup viewGroup, int i) {
        super(rectF, handler, vibrator, viewGroup);
        float f;
        float centerY;
        float f2;
        float centerY2;
        this.A00 = i;
        RectF rectF2 = this.A03;
        if (i != 1) {
            f = rectF2.centerX();
            centerY = rectF2.top;
            f2 = rectF2.centerX();
            centerY2 = rectF2.bottom;
        } else {
            f = rectF2.left;
            centerY = rectF2.centerY();
            f2 = rectF2.right;
            centerY2 = rectF2.centerY();
        }
        Path A0L = C108945cZ.A0L();
        A0L.rewind();
        A0L.moveTo(f, centerY);
        A0L.lineTo(f2, centerY2);
        this.A01 = A0L;
    }
}
