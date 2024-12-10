package X;

import android.os.Process;
import android.os.SystemClock;

public class AIH implements BA5 {
    public static AIH A03;
    public final AnonymousClass8KW A00 = new AnonymousClass8KW(Process.myPid());
    public final AnonymousClass8KX A01 = new AnonymousClass8KX();
    public final AnonymousClass8KX A02 = new AnonymousClass8KX(Process.myPid());

    public void BEX(C188479hU r12) {
        r12.A09 = this.A02.A01();
        r12.A08 = this.A01.A01();
        AnonymousClass8KW r10 = this.A00;
        String str = null;
        if (r10.A05) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long[] jArr = r10.A06;
            if (AnonymousClass8KW.A00(r10, jArr)) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = j - r10.A01;
                long j5 = j2 - r10.A02;
                long j6 = j3 - r10.A00;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(j4);
                A10.append(',');
                A10.append(j5);
                A10.append(',');
                A10.append(j6);
                A10.append(',');
                str = C17880vN.A0u(A10, uptimeMillis - r10.A03);
            }
        }
        r12.A0A = str;
    }

    public void CQJ() {
        this.A02.A02();
        this.A01.A02();
        AnonymousClass8KW r10 = this.A00;
        if (r10.A05) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long[] jArr = r10.A06;
            if (AnonymousClass8KW.A00(r10, jArr)) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                if (r10.A04) {
                    r10.A01 = j;
                    r10.A02 = j2;
                    r10.A00 = j3;
                } else {
                    r10.A03 = uptimeMillis;
                    r10.A01 = j;
                    r10.A02 = j2;
                    r10.A00 = j3;
                }
                r10.A04 = false;
            }
        }
    }
}
