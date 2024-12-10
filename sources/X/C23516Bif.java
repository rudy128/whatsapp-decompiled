package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* renamed from: X.Bif  reason: case insensitive filesystem */
public class C23516Bif extends C23517Big {
    public void A0I(Canvas canvas) {
        RectF rectF = this.A00;
        if (rectF.isEmpty()) {
            super.A0I(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(rectF);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        super.A0I(canvas);
        canvas.restore();
    }
}
