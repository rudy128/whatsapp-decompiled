package X;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.6q1  reason: invalid class name */
public abstract class AnonymousClass6q1 {
    public boolean A00 = false;
    public final Resources A01;
    public final Paint A02;
    public final RectF A03;
    public final Vibrator A04;
    public final View A05;
    public final ViewGroup A06;
    public final Handler A07;
    public final Runnable A08;
    public final Runnable A09;

    public void A01() {
        Handler handler = this.A07;
        handler.removeCallbacks(this.A09);
        handler.post(this.A08);
        this.A00 = false;
    }

    public void A02() {
        Vibrator vibrator;
        Handler handler = this.A07;
        handler.removeCallbacks(this.A08);
        handler.post(this.A09);
        if (!this.A00 && (vibrator = this.A04) != null) {
            try {
                vibrator.vibrate(3);
            } catch (NullPointerException e) {
                Log.e("Vibrator is broken on this device.", e);
            }
        }
        this.A00 = true;
    }

    public AnonymousClass6q1(RectF rectF, Handler handler, Vibrator vibrator, ViewGroup viewGroup) {
        int i;
        this.A07 = handler;
        this.A06 = viewGroup;
        this.A03 = rectF;
        this.A04 = vibrator;
        this.A01 = viewGroup.getResources();
        Paint A062 = AnonymousClass3MW.A06();
        Resources resources = this.A01;
        if (this instanceof AnonymousClass69I) {
            i = 2131102604;
        } else {
            i = 2131102603;
        }
        A062.setColor(resources.getColor(i));
        A062.setStrokeWidth(AnonymousClass3MW.A00(resources, 2131167690));
        AnonymousClass3MW.A1P(A062);
        this.A02 = A062;
        C109895eE r4 = new C109895eE(viewGroup.getContext(), this, 1);
        r4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r4.setVisibility(4);
        this.A05 = r4;
        viewGroup.addView(r4, 0);
        this.A09 = new C146567Pr(r4, 0.0f, 1.0f, 0);
        this.A08 = new C146567Pr(r4, 1.0f, 0.0f, 4);
    }
}
