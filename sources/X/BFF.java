package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class BFF extends Drawable implements Animatable {
    public static final C95 A0F = new Object();
    public int A00;
    public long A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public CSM A08;
    public C28657ECr A09;
    public C25156Ca7 A0A;
    public final Runnable A0B;
    public final C24773CJq A0C;
    public volatile C95 A0D;
    public volatile boolean A0E;

    public void draw(Canvas canvas) {
        C25156Ca7 ca7;
        long max;
        C18070vi.A0d(canvas, 0);
        C28657ECr eCr = this.A09;
        if (eCr != null && (ca7 = this.A0A) != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A0E) {
                max = uptimeMillis - this.A01;
            } else {
                max = (long) Math.max((double) this.A05, 0.0d);
            }
            int A002 = ca7.A00(max);
            if (A002 == -1) {
                A002 = eCr.getFrameCount() - 1;
                this.A0E = false;
            }
            if (eCr.BJT(canvas, this, A002)) {
                this.A02 = A002;
            } else {
                int i = this.A00 + 1;
                this.A00 = i;
                if (C26265CwA.A00.BfN(2)) {
                    C26265CwA.A02(BFF.class, Integer.valueOf(i), "Dropped a frame. Count: %s");
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.A0E) {
                long A022 = ca7.A02(uptimeMillis2 - this.A01);
                if (A022 != -1) {
                    scheduleSelf(this.A0B, this.A01 + this.A04 + A022);
                } else {
                    this.A0E = false;
                }
            }
            this.A05 = max;
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        C28657ECr eCr = this.A09;
        if (eCr != null) {
            eCr.CI7(rect);
        }
    }

    public int getIntrinsicHeight() {
        C28657ECr eCr = this.A09;
        if (eCr != null) {
            return eCr.BTC();
        }
        return super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        C28657ECr eCr = this.A09;
        if (eCr != null) {
            return eCr.BTD();
        }
        return super.getIntrinsicWidth();
    }

    public boolean isRunning() {
        return this.A0E;
    }

    public boolean onLevelChange(int i) {
        if (!this.A0E) {
            long j = (long) i;
            if (this.A05 != j) {
                this.A05 = j;
                invalidateSelf();
                return true;
            }
        }
        return false;
    }

    public void setAlpha(int i) {
        CSM csm = this.A08;
        if (csm == null) {
            csm = new CSM();
            this.A08 = csm;
        }
        csm.A00 = i;
        C28657ECr eCr = this.A09;
        if (eCr != null) {
            eCr.CHp(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        CSM csm = this.A08;
        if (csm == null) {
            csm = new CSM();
            this.A08 = csm;
        }
        csm.A03 = colorFilter;
        csm.A04 = AnonymousClass000.A1W(colorFilter);
        C28657ECr eCr = this.A09;
        if (eCr != null) {
            eCr.CIP(colorFilter);
        }
    }

    public void start() {
        C28657ECr eCr;
        if (!this.A0E && (eCr = this.A09) != null && eCr.getFrameCount() > 1) {
            this.A0E = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A01 = uptimeMillis - this.A07;
            this.A05 = uptimeMillis - this.A06;
            this.A02 = this.A03;
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.A0E) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A07 = uptimeMillis - this.A01;
            this.A06 = uptimeMillis - this.A05;
            this.A03 = this.A02;
            this.A0E = false;
            this.A01 = 0;
            this.A05 = -1;
            this.A02 = -1;
            unscheduleSelf(this.A0B);
        }
    }

    public BFF(C28657ECr eCr) {
        C25156Ca7 ca7;
        this.A09 = eCr;
        this.A04 = 8;
        this.A0D = A0F;
        C24773CJq cJq = new C24773CJq(this);
        this.A0C = cJq;
        this.A0B = C27082DTh.A00(this, 11);
        C28657ECr eCr2 = this.A09;
        if (eCr2 == null) {
            ca7 = null;
        } else {
            ca7 = new C25156Ca7(eCr2);
        }
        this.A0A = ca7;
        if (eCr2 != null) {
            eCr2.CHt(cJq);
        }
    }

    public BFF() {
        this((C28657ECr) null);
    }
}
