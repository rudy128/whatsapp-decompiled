package X;

import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.1Wk  reason: invalid class name and case insensitive filesystem */
public final class C27521Wk implements AnonymousClass1R4, C24411Kf {
    public long A00;
    public long A01;
    public final AnonymousClass194 A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass18K A04;
    public final C200710s A05;
    public final AnonymousClass00H A06;
    public final C27511Wj A07;
    public volatile long A08;

    public C27521Wk(AnonymousClass194 r3, AnonymousClass11P r4, AnonymousClass18K r5, C27511Wj r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r8, 6);
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r6;
        this.A06 = r8;
        this.A05 = new C200710s(r7, false);
    }

    public static final void A00(C27521Wk r10) {
        if (r10.A01 > 0) {
            long j = ((r10.A08 - r10.A01) + 1) - r10.A00;
            C30991eq r9 = (C30991eq) r10.A06.get();
            long j2 = r10.A08;
            synchronized (r9) {
                C30991eq.A00(r9).putLong("timespent_last_activity_time", j2).putLong("timespent_session_total", C30991eq.A01(r9).getLong("timespent_session_total", 0) + j).apply();
            }
            r10.A01 = 0;
            r10.A08 = 0;
            r10.A00 = 0;
        }
    }

    public static final void A01(C27521Wk r7, long j) {
        long time = r7.A02.A00().getTime() / 1000;
        if (1733338680 <= j && j <= time) {
            C30991eq r6 = (C30991eq) r7.A06.get();
            synchronized (r6) {
                if (C30991eq.A01(r6).getLong("timespent_start_time", 0) == 0) {
                    C30991eq.A00(r6).putLong("timespent_start_time", j).apply();
                }
            }
        }
    }

    public static final void A02(C27521Wk r2, long j) {
        C30991eq r22 = (C30991eq) r2.A06.get();
        synchronized (r22) {
            C30991eq.A00(r22).putLong("timespent_end_time", j).apply();
        }
    }

    public static final void A03(C27521Wk r10, boolean z) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("PST8PDT"));
        instance.add(6, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis() / 1000;
        AnonymousClass00H r5 = r10.A06;
        C30991eq r4 = (C30991eq) r5.get();
        synchronized (r4) {
            C30991eq.A00(r4).putLong("timespent_rollover_time", timeInMillis).apply();
        }
        r10.A05();
        C30991eq r42 = (C30991eq) r5.get();
        synchronized (r42) {
            SharedPreferences.Editor A002 = C30991eq.A00(r42);
            long j = C30991eq.A01(r42).getLong("timespent_start_time", 0);
            if (j > 0) {
                A002.putLong("timespent_saved_start_time", j).putLong("timespent_saved_duration", (C30991eq.A01(r42).getLong("timespent_end_time", 0) - j) + 1).putLong("timespent_saved_session_total", C30991eq.A01(r42).getLong("timespent_session_total", 0)).putLong("timespent_saved_foreground_count", C30991eq.A01(r42).getLong("timespent_foreground_count", 0)).putBoolean("timespent_saved_time_altered", z);
            }
            A002.putLong("timespent_start_time", 0).putLong("timespent_session_total", 0).putLong("timespent_end_time", 0).putLong("timespent_foreground_count", 0).apply();
        }
    }

    public static final boolean A04(C27521Wk r5, long j) {
        long j2;
        C30991eq r4 = (C30991eq) r5.A06.get();
        synchronized (r4) {
            j2 = C30991eq.A01(r4).getLong("timespent_rollover_time", 0);
        }
        if (j2 < j || j < r5.A08) {
            return true;
        }
        return false;
    }

    public final void A05() {
        long j;
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z2;
        long j9;
        AnonymousClass00H r4 = this.A06;
        if (((C30991eq) r4.get()).A02() > 0) {
            C30991eq r6 = (C30991eq) r4.get();
            synchronized (r6) {
                j = C30991eq.A01(r6).getLong("timespent_summary_sequence", 0);
            }
            long A022 = ((C30991eq) r4.get()).A02();
            C30991eq r62 = (C30991eq) r4.get();
            synchronized (r62) {
                j2 = C30991eq.A01(r62).getLong("timespent_saved_duration", 0);
            }
            C30991eq r63 = (C30991eq) r4.get();
            synchronized (r63) {
                j3 = C30991eq.A01(r63).getLong("timespent_saved_session_total", 0);
            }
            C30991eq r64 = (C30991eq) r4.get();
            synchronized (r64) {
                j4 = C30991eq.A01(r64).getLong("timespent_saved_foreground_count", 0);
            }
            C30991eq r65 = (C30991eq) r4.get();
            synchronized (r65) {
                z = C30991eq.A01(r65).getBoolean("timespent_saved_time_altered", false);
            }
            AnonymousClass2GM r66 = new AnonymousClass2GM();
            r66.A03 = Long.valueOf(A022);
            r66.A00 = Long.valueOf(j2);
            r66.A02 = Long.valueOf(j3);
            Long valueOf = Long.valueOf(j);
            r66.A05 = valueOf;
            r66.A01 = Long.valueOf(j4);
            if (z) {
                j5 = 1;
            } else {
                j5 = 0;
            }
            r66.A04 = Long.valueOf(j5);
            this.A04.CC7(r66);
            C27511Wj r5 = this.A07;
            long A023 = ((C30991eq) r4.get()).A02();
            C30991eq r67 = (C30991eq) r4.get();
            synchronized (r67) {
                j6 = C30991eq.A01(r67).getLong("timespent_saved_duration", 0);
            }
            C30991eq r68 = (C30991eq) r4.get();
            synchronized (r68) {
                j7 = C30991eq.A01(r68).getLong("timespent_saved_session_total", 0);
            }
            C30991eq r69 = (C30991eq) r4.get();
            synchronized (r69) {
                j8 = C30991eq.A01(r69).getLong("timespent_saved_foreground_count", 0);
            }
            C30991eq r610 = (C30991eq) r4.get();
            synchronized (r610) {
                z2 = C30991eq.A01(r610).getBoolean("timespent_saved_time_altered", false);
            }
            AnonymousClass2GI r611 = new AnonymousClass2GI();
            r611.A03 = Long.valueOf(A023);
            r611.A00 = Long.valueOf(j6);
            r611.A02 = Long.valueOf(j7);
            r611.A05 = valueOf;
            r611.A01 = Long.valueOf(j8);
            if (z2) {
                j9 = 1;
            } else {
                j9 = 0;
            }
            r611.A04 = Long.valueOf(j9);
            r5.A00.CC7(r611);
            long j10 = (j % 9999) + 1;
            C30991eq r612 = (C30991eq) r4.get();
            synchronized (r612) {
                C30991eq.A00(r612).putLong("timespent_saved_start_time", 0).putLong("timespent_saved_duration", 0).putLong("timespent_saved_session_total", 0).putLong("timespent_saved_foreground_count", 0).putBoolean("timespent_saved_time_altered", false).putLong("timespent_summary_sequence", j10).apply();
            }
        }
    }

    public void BlT() {
        this.A05.execute(new C448925e(this, 7));
    }

    public void onAppBackgrounded() {
        this.A05.execute(new AnonymousClass7RC(this, 18));
    }

    public void Bvh() {
        A05();
    }
}
