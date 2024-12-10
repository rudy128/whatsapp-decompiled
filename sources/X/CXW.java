package X;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public final class CXW {
    public Double A00;
    public Double A01;
    public Long A02;
    public final long A03 = SystemClock.elapsedRealtime();
    public final AnonymousClass195 A04;
    public final AnonymousClass18K A05;
    public final C23848Br5 A06;
    public final C24027BuE A07;
    public final C131006kM A08;
    public final AnonymousClass11P A09;

    public CXW(AnonymousClass195 r8, AnonymousClass11P r9, AnonymousClass18K r10, C24027BuE buE, C131006kM r12, String str) {
        CM2 cm2;
        C18070vi.A0d(r9, 1);
        C18070vi.A0p(r10, r8, r12);
        this.A09 = r9;
        this.A05 = r10;
        this.A04 = r8;
        this.A08 = r12;
        this.A07 = buE;
        C23848Br5 br5 = new C23848Br5();
        this.A06 = br5;
        br5.A0H = str;
        C441822l r6 = buE.A00;
        AnonymousClass7LG r0 = (AnonymousClass7LG) r6.A00.A02;
        int i = null;
        if (r0 != null) {
            cm2 = r0.A04;
        } else {
            cm2 = null;
        }
        if (C18070vi.A18(cm2, C24120Bvm.A00)) {
            i = AnonymousClass3MY.A0f();
        } else if (C18070vi.A18(cm2, C24119Bvl.A00)) {
            i = 1;
        } else {
            C17900vP.A0X(cm2, "TranscriptionLogger/init unexpected status ", AnonymousClass000.A10());
        }
        br5.A07 = i;
        br5.A02 = Boolean.valueOf(r6.A0v.A02);
        br5.A0C = Long.valueOf(TimeUnit.SECONDS.toMillis((long) r6.A0D));
        br5.A01 = C108945cZ.A1A(r8.A00);
    }

    public final void A00(Integer num, boolean z) {
        C132166mJ r2;
        int i;
        Long l;
        Long l2;
        C131006kM r5 = this.A08;
        if (z) {
            r2 = r5.A09;
        } else {
            r2 = r5.A08;
        }
        r2.A00(1);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A03;
        r5.A06.A00(elapsedRealtime);
        C23848Br5 br5 = this.A06;
        if (z) {
            i = 1;
        } else {
            i = 13;
            if (br5.A0D != null) {
                i = 12;
            }
        }
        br5.A08 = Integer.valueOf(i);
        Long l3 = null;
        if (num != null) {
            l = C17880vN.A0n(num.intValue());
        } else {
            l = null;
        }
        br5.A0D = l;
        br5.A0F = Long.valueOf(elapsedRealtime);
        Double d = this.A01;
        if (d != null) {
            l2 = Long.valueOf((long) d.doubleValue());
        } else {
            l2 = null;
        }
        br5.A0A = l2;
        Double d2 = this.A00;
        if (d2 != null) {
            l3 = Long.valueOf((long) d2.doubleValue());
        }
        br5.A09 = l3;
    }
}
