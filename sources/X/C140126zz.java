package X;

import android.net.TrafficStats;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6zz  reason: invalid class name and case insensitive filesystem */
public abstract class C140126zz {
    public long A00 = -1;
    public WeakReference A01;
    public final AnonymousClass181 A02;
    public final AnonymousClass11P A03;
    public final C18000vb A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;
    public final AnonymousClass736 A07;
    public final C19960A0r A08;
    public final AnonymousClass11W A09;
    public final AnonymousClass10I A0A;
    public final C22631Cp A0B;
    public final Random A0C = new Random();

    public int A03() {
        if (this instanceof AnonymousClass66T) {
            return 1;
        }
        return 0;
    }

    public final C133816pX A04() {
        C133816pX r5;
        WeakReference weakReference = this.A01;
        if (weakReference == null || (r5 = (C133816pX) weakReference.get()) == null || AnonymousClass11P.A01(this.A03) - this.A00 >= TimeUnit.HOURS.toMillis(4) || r5.A01) {
            return null;
        }
        return r5;
    }

    public C140126zz(AnonymousClass181 r3, AnonymousClass11P r4, C18000vb r5, C22631Cp r6, C18030ve r7, AnonymousClass18K r8, AnonymousClass736 r9, C19960A0r a0r, AnonymousClass11W r11, AnonymousClass10I r12) {
        this.A03 = r4;
        this.A05 = r7;
        this.A0B = r6;
        this.A07 = r9;
        this.A09 = r11;
        this.A0A = r12;
        this.A02 = r3;
        this.A06 = r8;
        this.A04 = r5;
        this.A08 = a0r;
    }

    public static void A02(AnonymousClass11P r1, C1185363v r2, C140126zz r3, long j) {
        AnonymousClass11P.A01(r1);
        r2.A05 = Long.valueOf(AnonymousClass11P.A01(r1) - j);
        r3.A06.CC7(r2);
        TrafficStats.clearThreadStatsTag();
    }

    public final C133816pX A05() {
        C17960vV.A02();
        C133816pX A042 = A04();
        if (A042 == null) {
            if (this instanceof AnonymousClass66T) {
                A042 = new AnonymousClass66V((AnonymousClass66T) this);
            } else {
                A042 = new AnonymousClass66V((AnonymousClass66S) this);
            }
            this.A01 = AnonymousClass3MW.A0z(A042);
            this.A00 = AnonymousClass11P.A01(this.A03);
        }
        return A042;
    }
}
