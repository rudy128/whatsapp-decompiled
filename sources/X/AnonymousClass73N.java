package X;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: X.73N  reason: invalid class name */
public final class AnonymousClass73N {
    public int A00;
    public int A01 = -1;
    public C121626Kw A02;
    public Long A03;
    public String A04;
    public WeakReference A05;
    public WeakReference A06;
    public boolean A07 = true;
    public boolean A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final C18100vl A0C = AnonymousClass7S4.A02(this, 6);
    public final C18100vl A0D = AnonymousClass7S2.A01(6);
    public final C18100vl A0E = AnonymousClass7S4.A02(this, 5);
    public final AnonymousClass00H A0F;

    public AnonymousClass73N(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0p(r4, r5, r6);
        this.A0F = r3;
        this.A0B = r4;
        this.A0A = r5;
        this.A09 = r6;
    }

    public static final void A00(AnonymousClass73N r2) {
        if (r2.A08) {
            ((Handler) r2.A0D.getValue()).removeCallbacks((Runnable) r2.A0E.getValue());
        }
        ((Handler) r2.A0D.getValue()).removeCallbacks((Runnable) r2.A0C.getValue());
    }

    public static final void A01(AnonymousClass73N r6) {
        long j;
        int i;
        if (r6.A08) {
            ((Handler) r6.A0D.getValue()).postDelayed((Runnable) r6.A0E.getValue(), 33);
        }
        Long l = r6.A03;
        if (l != null) {
            long longValue = l.longValue();
            long j2 = ((long) r6.A00) + longValue;
            C121626Kw r0 = r6.A02;
            if (r0 != null) {
                j = (long) r0.A01.getDuration();
            } else {
                j = 0;
            }
            long min = Math.min(j2, j);
            C121626Kw r02 = r6.A02;
            if (r02 != null) {
                i = r02.A01.getCurrentPosition();
            } else {
                i = 0;
            }
            long min2 = Math.min(min - ((long) i), longValue);
            C121626Kw r03 = r6.A02;
            if (r03 != null) {
                r03.A01.getCurrentPosition();
            }
            ((Handler) r6.A0D.getValue()).postDelayed((Runnable) r6.A0C.getValue(), min2);
        }
    }

    public static void A02(AnonymousClass73N r1, int i) {
        A03(r1, new C146757Qm(r1, i));
    }

    public static final void A03(AnonymousClass73N r1, Runnable runnable) {
        AnonymousClass3MX.A0x(r1.A0F).CGS(runnable, "music_player_serial_executor");
    }
}
