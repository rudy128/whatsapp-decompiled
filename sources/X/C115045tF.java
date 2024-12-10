package X;

import android.graphics.Paint;
import android.view.View;
import com.whatsapp.WaImageView;

/* renamed from: X.5tF  reason: invalid class name and case insensitive filesystem */
public abstract class C115045tF extends WaImageView {
    public boolean A00;

    public void A05() {
        if (!this.A00) {
            this.A00 = true;
            C72483Me.A0x(this);
        }
    }

    public static void A03(Paint paint, View view, boolean z) {
        paint.setColor(C19740yt.A00(view.getContext(), AnonymousClass1YL.A00(view.getContext(), 2130971113, 2131102439)));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(z);
        paint.setDither(z);
    }

    public static boolean A04(Paint paint, float f) {
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setDither(true);
        return true;
    }
}
