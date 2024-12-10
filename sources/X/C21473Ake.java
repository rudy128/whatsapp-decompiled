package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ake  reason: case insensitive filesystem */
public final class C21473Ake implements Runnable, C71993Kd {
    public long A00;
    public final List A01;
    public final long A02;
    public final Handler A03;
    public final AIF A04;
    public final AnonymousClass9OU A05;

    public void A00(long j, boolean z) {
        if (C30221da.A02.A00.get()) {
            this.A00 = SystemClock.uptimeMillis() + j;
            this.A03.postDelayed(this, j);
            if (z) {
                for (BA5 CQJ : this.A01) {
                    CQJ.CQJ();
                }
            }
        }
    }

    public void BKR(boolean z) {
        Handler handler = this.A03;
        if (z) {
            handler.removeCallbacks(this);
            A00(0, false);
            return;
        }
        handler.removeCallbacks(this);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.9h2, java.lang.Object] */
    public void run() {
        AnonymousClass8Ka r8;
        long j;
        int size;
        AIF aif = this.A04;
        synchronized (aif) {
            r8 = aif.A02;
        }
        if (r8 == null || r8.A04 != -1) {
            j = this.A02;
        } else {
            List list = r8.A04;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (size >= 5) {
                A00(this.A02, false);
                return;
            }
            long j2 = this.A02;
            long j3 = ((long) (size + 1)) * j2;
            long j4 = r8.A04;
            if (j4 == -1) {
                j4 = SystemClock.uptimeMillis();
            }
            long j5 = j4 - r8.A02;
            if (j5 < j3) {
                j = j3 - j5;
            } else {
                long j6 = this.A00;
                long j7 = j5 - j3;
                while (j7 > j2) {
                    j7 -= j2;
                }
                A00(j2 - j7, false);
                ? obj = new Object();
                long uptimeMillis = SystemClock.uptimeMillis();
                obj.A02 = uptimeMillis;
                obj.A00 = uptimeMillis - j6;
                Thread thread = r8.A03;
                if (thread != null) {
                    try {
                        obj.A04 = thread.getState().name();
                        obj.A06 = C30221da.A02.A00.get();
                        obj.A07 = thread.getStackTrace();
                        if (AnonymousClass000.A1P((r8.A04 > -1 ? 1 : (r8.A04 == -1 ? 0 : -1)))) {
                            C188479hU r6 = new C188479hU();
                            Iterator it = this.A01.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                BA5 ba5 = (BA5) it.next();
                                if (r8.A04 != -1) {
                                    obj.A05 = true;
                                    break;
                                }
                                SystemClock.uptimeMillis();
                                ba5.BEX(r6);
                                SystemClock.uptimeMillis();
                            }
                            obj.A03 = r6;
                        } else {
                            obj.A05 = true;
                        }
                    } catch (Throwable unused) {
                    }
                    obj.A01 = SystemClock.uptimeMillis();
                    List list2 = r8.A04;
                    if (list2 == null) {
                        list2 = AnonymousClass000.A13();
                        r8.A04 = list2;
                    }
                    list2.add(obj);
                    return;
                }
                return;
            }
        }
        A00(j, true);
    }

    public C21473Ake(AIF aif, AnonymousClass9OU r4, C197769xE r5, List list) {
        this.A04 = aif;
        this.A01 = list;
        this.A05 = r4;
        C185279cK r0 = C185279cK.A02;
        if (r0 == null) {
            r0 = new C185279cK();
            C185279cK.A02 = r0;
        }
        this.A03 = r0.A00;
        this.A02 = AnonymousClass8BR.A05(r5.A01.A00, 8339);
        C30221da.A02.A00(this);
    }
}
