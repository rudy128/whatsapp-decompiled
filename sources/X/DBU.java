package X;

import android.content.Context;
import android.view.Choreographer;
import android.view.Window;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DBU implements E7W {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public boolean A03 = false;
    public final double A04;
    public final E7X A05;
    public final COZ A06;

    public void BIc(int i) {
        if (this.A03) {
            this.A03 = false;
            this.A05.BIb();
            COZ coz = this.A06;
            double min = Math.min(this.A01, 3600.0d);
            double min2 = Math.min(this.A00, 1000.0d);
            long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(this.A02, A07));
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
                cRq.A03 += millis;
            }
            if (dQh.A00 && !Double.isNaN(min2) && millis > 0) {
                AnonymousClass19T r9 = dQh.A03;
                r9.markerAnnotate(689639794, "timeSpent", millis);
                double d = (double) millis;
                r9.markerAnnotate(689639794, "smallFrames", (min * 60000.0d) / d);
                r9.markerAnnotate(689639794, "largeFrames", (min2 * 60000.0d) / d);
                r9.markerAnnotate(689639794, "scrollSurface", i);
            }
            coz.A01.markerEnd(689639794, 2);
            this.A01 = 0.0d;
            this.A00 = 0.0d;
            this.A02 = 0;
        }
    }

    public void BJv(Window window) {
        if (!this.A03) {
            this.A03 = true;
            this.A05.BJv(window);
        }
    }

    public DBU(Context context, C214215x r6, COZ coz) {
        this.A06 = coz;
        this.A05 = new DBX(Choreographer.getInstance(), new CJk(this));
        this.A04 = (double) r6.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
    }
}
