package X;

import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.os.LocaleList;

public class BEt extends Paint {
    public void setTextLocales(LocaleList localeList) {
    }

    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = C40761vE.A00;
            setColor((BE8.A07(255, i, 0) << 24) | (color & 16777215));
            return;
        }
        PointF pointF2 = C40761vE.A00;
        super.setAlpha(BE8.A07(255, i, 0));
    }
}
