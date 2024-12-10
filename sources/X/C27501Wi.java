package X;

import android.os.SystemClock;

/* renamed from: X.1Wi  reason: invalid class name and case insensitive filesystem */
public final class C27501Wi {
    public int A00;
    public long A01 = -1;
    public Runnable A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public long A06;
    public Long A07;
    public String A08;
    public final C200710s A09;
    public final AnonymousClass10I A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass18K A0D;
    public final C27491Wh A0E;
    public final C25431Oe A0F;
    public volatile long A0G;

    public C27501Wi(AnonymousClass11P r3, AnonymousClass18K r4, C27491Wh r5, C25431Oe r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r5, 5);
        C18070vi.A0d(r8, 6);
        this.A0C = r3;
        this.A0A = r7;
        this.A0D = r4;
        this.A0F = r6;
        this.A0E = r5;
        this.A0B = r8;
        this.A09 = new C200710s(r7, false);
    }

    public static final synchronized void A00(C27501Wi r5, int i) {
        synchronized (r5) {
            int i2 = r5.A00;
            if (i2 <= i) {
                while (true) {
                    r5.A0G = (1 << i2) | r5.A0G;
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    public static final void A01(C27501Wi r4, long j) {
        r4.A04 = true;
        r4.A02 = r4.A0A.CGv(new AnonymousClass7RC(r4, 19), 64000);
        r4.A01 = j;
        r4.A0G = 0;
        C27491Wh r3 = r4.A0E;
        r4.A05 = r3.A00();
        AnonymousClass11P r2 = r4.A0C;
        r4.A06 = r3.A01(AnonymousClass11P.A01(r2));
        r4.A08 = r4.A0F.A03();
        r4.A07 = Long.valueOf(AnonymousClass11P.A01(r2));
    }

    public final synchronized void A02(long j) {
        synchronized (this) {
            if (this.A03) {
                A00(this, (int) j);
            } else {
                this.A04 = false;
            }
            C47002Gs r2 = new C47002Gs();
            r2.A02 = Long.valueOf((long) ((int) this.A0G));
            r2.A00 = Long.valueOf(this.A0G >> 32);
            r2.A06 = Long.valueOf((long) this.A05);
            r2.A04 = Long.valueOf(this.A06);
            long j2 = 0;
            for (long j3 = this.A0G; j3 != 0; j3 >>>= 1) {
                j2 += 1 & j3;
            }
            AnonymousClass00H r6 = this.A0B;
            C30541e7 r7 = (C30541e7) r6.get();
            int i = C30541e7.A00(r7).getInt("cumulative_bits", 0);
            C30541e7.A00(r7).edit().putInt("cumulative_bits", i + ((int) j2)).apply();
            r2.A03 = Long.valueOf((long) C30541e7.A00((C30541e7) r6.get()).getInt("cumulative_bits", 0));
            C30541e7 r1 = (C30541e7) r6.get();
            C30541e7.A00(r1).edit().putInt("bit_array_session_sequence", C30541e7.A00(r1).getInt("bit_array_session_sequence", 0) + 1).apply();
            r2.A05 = Long.valueOf((long) C30541e7.A00((C30541e7) r6.get()).getInt("bit_array_session_sequence", 0));
            r2.A01 = Long.valueOf(j);
            String str = this.A08;
            if (str != null) {
                r2.A08 = str;
            }
            Long l = this.A07;
            if (l != null) {
                r2.A07 = l;
            }
            this.A0D.CC4(r2);
            if (this.A03) {
                A01(this, SystemClock.elapsedRealtime() / 1000);
                this.A00 = 0;
            }
        }
    }
}
