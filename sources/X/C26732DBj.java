package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DBj  reason: case insensitive filesystem */
public class C26732DBj implements C28657ECr {
    public long A00;
    public C28657ECr A01;
    public C26733DBk A02;
    public boolean A03 = false;
    public ColorFilter A04;
    public Rect A05;
    public final E7V A06;
    public final Runnable A07 = C27082DTh.A00(this, 10);
    public final ScheduledExecutorService A08;

    public static synchronized void A00(C26732DBj dBj) {
        synchronized (dBj) {
            if (!dBj.A03) {
                dBj.A03 = true;
                dBj.A08.schedule(dBj.A07, 1000, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean BJT(Canvas canvas, Drawable drawable, int i) {
        this.A00 = this.A06.now();
        boolean z = false;
        if (this.A01.BJT(canvas, drawable, i)) {
            z = true;
        }
        A00(this);
        return z;
    }

    public int BS1(int i) {
        C28657ECr eCr = this.A01;
        C18070vi.A0b(eCr);
        return eCr.BS1(i);
    }

    public int BTC() {
        C28657ECr eCr = this.A01;
        C18070vi.A0b(eCr);
        return eCr.BTC();
    }

    public int BTD() {
        C28657ECr eCr = this.A01;
        C18070vi.A0b(eCr);
        return eCr.BTD();
    }

    public int BUH() {
        C28657ECr eCr = this.A01;
        C18070vi.A0b(eCr);
        return eCr.BUH();
    }

    public void CHp(int i) {
        this.A01.CHp(i);
    }

    public void CHt(C24773CJq cJq) {
        this.A01.CHt(cJq);
    }

    public void CI7(Rect rect) {
        this.A01.CI7(rect);
        this.A05 = rect;
    }

    public void CIP(ColorFilter colorFilter) {
        this.A01.CIP(colorFilter);
        this.A04 = colorFilter;
    }

    public int getFrameCount() {
        C28657ECr eCr = this.A01;
        C18070vi.A0b(eCr);
        return eCr.getFrameCount();
    }

    public int getLoopCount() {
        C28657ECr eCr = this.A01;
        C18070vi.A0b(eCr);
        return eCr.getLoopCount();
    }

    public C26732DBj(E7V e7v, C28657ECr eCr, C26733DBk dBk, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = eCr;
        this.A02 = dBk;
        this.A06 = e7v;
        this.A08 = scheduledExecutorService;
    }
}
