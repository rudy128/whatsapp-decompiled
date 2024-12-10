package X;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

public class CZD {
    public C26044Cr8 A00;
    public WeakReference A01 = BE8.A0m();
    public boolean A02 = true;
    public float A03;
    public final TextPaint A04 = new TextPaint(1);
    public final C6I A05 = new C23513Bic(this, 1);

    public float A00(String str) {
        float measureText;
        if (!this.A02) {
            return this.A03;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.A04.measureText(str, 0, str.length());
        }
        this.A03 = measureText;
        this.A02 = false;
        return measureText;
    }

    public void A01(Context context, C26044Cr8 cr8) {
        if (this.A00 != cr8) {
            this.A00 = cr8;
            if (cr8 != null) {
                TextPaint textPaint = this.A04;
                C6I c6i = this.A05;
                cr8.A05(context, textPaint, c6i);
                C29331c2 r0 = (C29331c2) this.A01.get();
                if (r0 != null) {
                    textPaint.drawableState = r0.getState();
                }
                cr8.A04(context, textPaint, c6i);
                this.A02 = true;
            }
            C29331c2 r1 = (C29331c2) this.A01.get();
            if (r1 != null) {
                r1.C8W();
                r1.onStateChange(r1.getState());
            }
        }
    }

    public CZD(C29331c2 r3) {
        this.A01 = AnonymousClass3MW.A0z(r3);
    }
}
