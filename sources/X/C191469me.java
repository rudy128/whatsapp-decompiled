package X;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9me  reason: invalid class name and case insensitive filesystem */
public final class C191469me {
    public final AnonymousClass9Z8 A00;
    public final AnonymousClass11P A01;
    public final C189769jo A02;
    public final C695137m A03;
    public final AnonymousClass9Z7 A04 = new AnonymousClass9Z7();

    public C20132A8s A00(String str, int i, int i2) {
        C194679s7 r2;
        int i3;
        C189769jo r1 = this.A02;
        int i4 = i2;
        int i5 = i;
        int A002 = r1.A00(Integer.valueOf(i4), i5);
        String str2 = str;
        if (str == null) {
            i3 = C20104A7i.A00(r1.A00, i5).A01;
        } else {
            C20104A7i a7i = r1.A00;
            C20104A7i.A02(a7i);
            ConcurrentHashMap concurrentHashMap = a7i.A03;
            if (concurrentHashMap == null || (r2 = (C194679s7) concurrentHashMap.get(str)) == null) {
                r2 = new C194679s7(str, -1, 812974081);
                ConcurrentHashMap concurrentHashMap2 = a7i.A03;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.put(str, r2);
                }
            }
            i3 = r2.A01;
        }
        long j = ((long) i4) & 4294967295L;
        C695137m r5 = this.A03;
        AnonymousClass11P r4 = this.A01;
        AnonymousClass9Z7 r6 = this.A04;
        C20132A8s a8s = new C20132A8s(r4, r5, r6, str2, i3, A002, j | ((((long) i5) << 32) & -4294967296L), SystemClock.elapsedRealtimeNanos());
        a8s.A0L("using_backup_start_time", false);
        a8s.A0L("using_capped_backup_start_time", false);
        C695137m r0 = a8s.A04;
        if (r0.A03.isMarkerOn(a8s.A02, a8s.A01)) {
            r6.A00.put(Long.valueOf(a8s.A03), a8s);
        }
        return a8s;
    }

    public C191469me(AnonymousClass11P r2, C189769jo r3, C695137m r4) {
        C18070vi.A0o(r2, r4, r3);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = new AnonymousClass9Z8(r2);
    }
}
