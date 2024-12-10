package X;

import android.os.Handler;
import android.view.Window;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DBV implements E7W {
    public static final long A09;
    public double A00;
    public double A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public final COZ A06;
    public final Handler A07;
    public final E7X A08;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(30);
        A09 = timeUnit.toMillis(30);
    }

    public /* synthetic */ void A00(int i) {
        double min = Math.min(this.A01, 10000.0d);
        double min2 = Math.min(this.A00, 10000.0d);
        long min3 = Math.min(TimeUnit.NANOSECONDS.toMillis(this.A03 - this.A04), A09);
        if (min3 < 0) {
            min3 = 0;
        }
        COZ coz = this.A06;
        C27036DQh dQh = coz.A00;
        if (dQh.A01) {
            Map map = dQh.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, new Object());
            }
            C24966CRq cRq = (C24966CRq) map.get(valueOf);
            cRq.A02++;
            cRq.A00 += min2;
            cRq.A01 += min;
            cRq.A03 += min3;
        }
        if (dQh.A00 && !Double.isNaN(min2) && min3 > 0) {
            AnonymousClass19T r9 = dQh.A03;
            r9.markerAnnotate(689639794, "timeSpent", min3);
            double d = (double) min3;
            r9.markerAnnotate(689639794, "smallFrames", (min * 60000.0d) / d);
            r9.markerAnnotate(689639794, "largeFrames", (min2 * 60000.0d) / d);
            r9.markerAnnotate(689639794, "scrollSurface", i);
        }
        coz.A01.markerEnd(689639794, 2);
        this.A05 = 0;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
    }

    public void BJv(Window window) {
        this.A05 = 0;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A04 = System.nanoTime();
        this.A08.BJv(window);
    }

    public DBV(COZ coz, AnonymousClass00H r5) {
        this.A06 = coz;
        Handler A0D = C17890vO.A0D();
        this.A07 = A0D;
        this.A08 = new DBW(A0D, new D5J(this), r5);
    }

    public void BIc(int i) {
        this.A03 = System.nanoTime();
        this.A08.BIb();
        this.A07.post(new AnonymousClass7RP(this, i, 4));
    }
}
