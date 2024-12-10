package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1N7  reason: invalid class name */
public class AnonymousClass1N7 {
    public final C18030ve A00;
    public final AnonymousClass1N6 A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final int[] A05 = {0, 1, 2, 3};
    public final AnonymousClass11P A06;
    public final Map A07;

    public static synchronized C63622tQ A00(AnonymousClass1N7 r3, int i, long j) {
        synchronized (r3) {
            if (j <= 0) {
                return null;
            }
            C63622tQ r0 = (C63622tQ) r3.A02(i).get(Long.valueOf(j));
            return r0;
        }
    }

    public synchronized void A03(long j) {
        C63622tQ A012 = A01(j);
        if (A012 != null) {
            A02(A012.A02).remove(Long.valueOf(A012.A03));
            this.A01.notifyAllObservers(new C20723AWd(A012, 19));
        }
    }

    public synchronized void A04(C63622tQ r5) {
        Map A022 = A02(r5.A02);
        Long valueOf = Long.valueOf(r5.A03);
        if (A022.containsKey(valueOf)) {
            StringBuilder sb = new StringBuilder();
            sb.append("LoggableStanzaCache/skipped caching loggable stanza:");
            sb.append(r5);
            Log.w(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LoggableStanzaCache/putLoggableStanza ");
            sb2.append(r5);
            Log.i(sb2.toString());
            A022.put(valueOf, r5);
            this.A01.notifyAllObservers(new C20723AWd(r5, 20));
        }
    }

    public C63622tQ A01(long j) {
        if (j > 0) {
            int[] iArr = this.A05;
            int i = 0;
            do {
                C63622tQ A002 = A00(this, iArr[i], j);
                if (A002 != null) {
                    return A002;
                }
                i++;
            } while (i < 4);
        }
        return null;
    }

    public Map A02(int i) {
        if (i == 0) {
            return this.A07;
        }
        if (i == 1) {
            return this.A04;
        }
        if (i == 2) {
            return this.A03;
        }
        if (i == 3) {
            return this.A02;
        }
        throw new RuntimeException("LoggableStanzaCache/getStanzaMap not expected stanza type");
    }

    public AnonymousClass1N7(AnonymousClass11P r2, C18030ve r3, AnonymousClass1N6 r4) {
        this.A06 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A07 = new HashMap();
        this.A04 = new HashMap();
        this.A03 = new HashMap();
        this.A02 = new HashMap();
    }
}
