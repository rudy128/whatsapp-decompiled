package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

public class BHQ extends View {
    public final Drawable A00;

    public void setIsSwirlAnimating(boolean z) {
        Drawable drawable = this.A00;
        if (drawable instanceof BF8) {
            ((BF8) drawable).A01(z);
        }
    }

    public BHQ(Context context, C08 c08, E6Q e6q, float[] fArr, float f, int i, boolean z) {
        super(context);
        boolean BeR = e6q.BeR();
        if (z) {
            this.A00 = new BEy(i, fArr);
            setLayerType(2, (Paint) null);
            setAlpha(f);
        } else {
            BF8 bf8 = new BF8(context, fArr, i, BeR);
            this.A00 = bf8;
            if (c08.equals(C08.ANIMATED)) {
                bf8.A01(true);
            }
        }
        setBackground(this.A00);
    }

    public void A00(int i, int i2) {
        setMeasuredDimension(i, i2);
    }
}
