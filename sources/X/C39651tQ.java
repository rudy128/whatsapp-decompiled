package X;

import android.content.Context;
import android.view.Window;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1tQ  reason: invalid class name and case insensitive filesystem */
public class C39651tQ implements C39641tP {
    public Integer A00;
    public boolean A01 = false;
    public boolean A02 = true;
    public final AnonymousClass19T A03;
    public final Map A04 = new HashMap();
    public final C39671tS A05;
    public final AnonymousClass18K A06;

    public void C4b(Window window, int i, boolean z, boolean z2) {
        this.A01 = z2;
        this.A02 = z;
        if (z2 || z) {
            C39671tS r1 = this.A05;
            if (!r1.A03) {
                r1.A03 = true;
                C39691tU r3 = r1.A05;
                if (!r3.A03) {
                    r3.A00 = -1;
                }
                r3.A03 = true;
                r3.A05.postFrameCallback(r3.A04);
            }
            this.A00 = Integer.valueOf(i);
        }
    }

    public void C4c() {
        C39671tS r9 = this.A05;
        if (r9.A03) {
            r9.A03 = false;
            C39691tU r0 = r9.A05;
            r0.A03 = false;
            r0.A05.removeFrameCallback(r0.A04);
            double min = Math.min(r9.A01, 3600.0d);
            double min2 = Math.min(r9.A00, 1000.0d);
            long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(r9.A02, C39671tS.A07));
            C39661tR r11 = r9.A06;
            C39651tQ r8 = r11.A00;
            Integer num = r8.A00;
            if (num != null) {
                if (r8.A02) {
                    Map map = r8.A04;
                    if (!map.containsKey(num)) {
                        map.put(r8.A00, new Object());
                    }
                    C55052f8 r10 = (C55052f8) map.get(r8.A00);
                    r10.A02++;
                    r10.A00 += min2;
                    r10.A01 += min;
                    r10.A03 += millis;
                }
                if (r8.A01 && !Double.isNaN(min2) && millis > 0) {
                    AnonymousClass19T r12 = r8.A03;
                    r12.markerAnnotate(689639794, "timeSpent", millis);
                    double d = (double) millis;
                    r12.markerAnnotate(689639794, "smallFrames", (min * 60000.0d) / d);
                    r12.markerAnnotate(689639794, "largeFrames", (min2 * 60000.0d) / d);
                    Integer num2 = r8.A00;
                    if (num2 != null) {
                        r12.markerAnnotate(689639794, "scrollSurface", num2.intValue());
                    }
                    r12.markerEnd(689639794, 2);
                }
            }
            r11.A01.markerEnd(689639794, 2);
            r9.A01 = 0.0d;
            r9.A00 = 0.0d;
            r9.A02 = 0;
        }
        this.A00 = null;
    }

    public void report() {
        if (this.A02) {
            Map map = this.A04;
            for (Map.Entry entry : map.entrySet()) {
                C46642Fi r8 = new C46642Fi();
                C55052f8 r10 = (C55052f8) entry.getValue();
                r8.A03 = Long.valueOf(r10.A03);
                r8.A02 = (Integer) entry.getKey();
                long j = r10.A03;
                if (j > 0) {
                    double d = (double) j;
                    r8.A00 = Double.valueOf((r10.A01 * 60000.0d) / d);
                    r8.A01 = Double.valueOf((r10.A00 * 60000.0d) / d);
                }
                this.A06.CC7(r8);
            }
            map.clear();
        }
    }

    public C39651tQ(Context context, C214215x r4, AnonymousClass18K r5, AnonymousClass19T r6) {
        this.A03 = r6;
        this.A06 = r5;
        this.A05 = new C39671tS(context, r4, new C39661tR(this, r6));
    }
}
