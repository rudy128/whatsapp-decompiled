package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

public final class Bia extends BFE {
    public static final C24422C2w A05 = new BLG();
    public float A00;
    public C6Z A01;
    public boolean A02 = false;
    public final C26613D6h A03;
    public final C25990Cq5 A04;

    public int getIntrinsicHeight() {
        C24468C5i c5i = this.A01.A00;
        return c5i.A07 + (c5i.A06 * 2);
    }

    public int getIntrinsicWidth() {
        C24468C5i c5i = this.A01.A00;
        return c5i.A07 + (c5i.A06 * 2);
    }

    public void jumpToCurrentState() {
        this.A03.A00();
        this.A00 = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    public boolean onLevelChange(int i) {
        boolean z = this.A02;
        C26613D6h d6h = this.A03;
        if (z) {
            d6h.A00();
            this.A00 = ((float) i) / 10000.0f;
            invalidateSelf();
            return true;
        }
        d6h.A00 = this.A00 * 10000.0f;
        d6h.A08 = true;
        float f = (float) i;
        if (d6h.A06) {
            d6h.A03 = f;
            return true;
        }
        C25990Cq5 cq5 = d6h.A05;
        if (cq5 == null) {
            cq5 = new C25990Cq5(f);
            d6h.A05 = cq5;
        }
        double d = (double) f;
        cq5.A02 = d;
        double d2 = (double) ((float) d);
        if (d2 > 3.4028234663852886E38d) {
            throw BE6.A0v("Final position of the spring cannot be greater than the max value.");
        } else if (d2 >= -3.4028234663852886E38d) {
            double abs = Math.abs((double) (1.0f * 0.75f));
            cq5.A06 = abs;
            cq5.A07 = abs * 62.5d;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            } else if (d6h.A06) {
                return true;
            } else {
                d6h.A06 = true;
                if (!d6h.A08) {
                    d6h.A00 = ((Bia) d6h.A0A).A00 * 10000.0f;
                }
                float f2 = d6h.A00;
                if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
                    throw AnonymousClass000.A0k("Starting value need to be in between min value and max value");
                }
                ThreadLocal threadLocal = C25586CiQ.A05;
                if (threadLocal.get() == null) {
                    threadLocal.set(new C25586CiQ());
                }
                C25586CiQ ciQ = (C25586CiQ) threadLocal.get();
                ArrayList arrayList = ciQ.A04;
                if (arrayList.size() == 0) {
                    C24900COt cOt = ciQ.A00;
                    if (cOt == null) {
                        cOt = new C24900COt(ciQ.A03);
                        ciQ.A00 = cOt;
                    }
                    cOt.A01.postFrameCallback(cOt.A00);
                }
                C108985cd.A1I(d6h, arrayList);
                return true;
            }
        } else {
            throw BE6.A0v("Final position of the spring cannot be less than the min value.");
        }
    }

    public Bia(Context context, C24468C5i c5i, C6Z c6z) {
        super(context, c5i);
        this.A01 = c6z;
        c6z.A01 = this;
        C25990Cq5 cq5 = new C25990Cq5();
        this.A04 = cq5;
        cq5.A01 = 1.0d;
        cq5.A08 = false;
        cq5.A05 = Math.sqrt(50.0d);
        cq5.A08 = false;
        C26613D6h d6h = new C26613D6h(A05, this);
        this.A03 = d6h;
        d6h.A05 = cq5;
        if (this.A00 != 1.0f) {
            this.A00 = 1.0f;
            invalidateSelf();
        }
    }

    public boolean A02(boolean z, boolean z2, boolean z3) {
        boolean A022 = super.A02(z, z2, z3);
        float f = Settings.Global.getFloat(this.A07.getContentResolver(), "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.A02 = true;
            return A022;
        }
        this.A02 = false;
        C25990Cq5 cq5 = this.A04;
        float f2 = 50.0f / f;
        if (f2 > 0.0f) {
            cq5.A05 = Math.sqrt((double) f2);
            cq5.A08 = false;
            return A022;
        }
        throw AnonymousClass000.A0k("Spring stiffness constant must be positive.");
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
                Paint paint = this.A08;
                c6z.A00(canvas, paint);
                c6z.A01(canvas2, paint, 0.0f, this.A00, BEA.A04(BE6.A0I(c5i.A08), this.A01));
                canvas.restore();
            }
        }
    }
}
