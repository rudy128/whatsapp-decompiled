package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class BFA extends Drawable implements Animatable {
    public C28657ECr A00;
    public final CSM A01;
    public final CTU A02;
    public final C27082DTh A03;

    public void draw(Canvas canvas) {
        long max;
        C18070vi.A0d(canvas, 0);
        CTU ctu = this.A02;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (ctu.A06) {
            max = uptimeMillis - ctu.A05;
        } else {
            max = Math.max(ctu.A03, 0);
        }
        C25156Ca7 ca7 = ctu.A07;
        int A002 = ca7.A00(max);
        ctu.A03 = max;
        if (A002 == -1) {
            A002 = this.A00.getFrameCount() - 1;
            ctu.A06 = false;
        } else if (A002 == 0 && ctu.A01 != -1) {
            SystemClock.uptimeMillis();
        }
        if (this.A00.BJT(canvas, this, A002)) {
            ctu.A01 = A002;
        } else {
            ctu.A00++;
        }
        if (ctu.A06) {
            long A022 = ca7.A02(SystemClock.uptimeMillis() - ctu.A05);
            if (A022 != -1) {
                long j = A022 + 8;
                if (j != -1) {
                    scheduleSelf(this.A03, j);
                    return;
                }
            } else {
                ctu.A06 = false;
            }
        }
        ctu.A06 = false;
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        this.A00.CI7(rect);
    }

    public int getIntrinsicHeight() {
        return this.A00.BTC();
    }

    public int getIntrinsicWidth() {
        return this.A00.BTD();
    }

    public boolean isRunning() {
        return this.A02.A06;
    }

    public void setAlpha(int i) {
        this.A01.A00 = i;
        this.A00.CHp(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        CSM csm = this.A01;
        csm.A03 = colorFilter;
        csm.A04 = AnonymousClass000.A1W(colorFilter);
        this.A00.CIP(colorFilter);
    }

    public void start() {
        if (this.A00.getFrameCount() > 0) {
            CTU ctu = this.A02;
            if (!ctu.A06) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ctu.A05 = uptimeMillis - ctu.A04;
                ctu.A03 = uptimeMillis - ctu.A02;
                ctu.A01 = -1;
                ctu.A06 = true;
            }
            invalidateSelf();
        }
    }

    public void stop() {
        CTU ctu = this.A02;
        if (ctu.A06) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ctu.A04 = uptimeMillis - ctu.A05;
            ctu.A02 = uptimeMillis - ctu.A03;
            ctu.A05 = 0;
            ctu.A03 = -1;
            ctu.A01 = -1;
            ctu.A06 = false;
        }
        unscheduleSelf(this.A03);
    }

    public BFA(C28657ECr eCr) {
        this.A00 = eCr;
        this.A02 = new CTU(new C25156Ca7(eCr));
        CSM csm = new CSM();
        int i = csm.A00;
        if (i != -1) {
            setAlpha(i);
        }
        if (csm.A04) {
            setColorFilter(csm.A03);
        }
        int i2 = csm.A01;
        boolean z = true;
        if (i2 != -1) {
            setDither(AnonymousClass000.A1O(i2));
        }
        int i3 = csm.A02;
        if (i3 != -1) {
            setFilterBitmap(i3 == 0 ? false : z);
        }
        this.A01 = csm;
        this.A03 = C27082DTh.A00(this, 12);
    }
}
