package X;

import android.os.Process;
import java.io.File;

/* renamed from: X.8KW  reason: invalid class name */
public class AnonymousClass8KW extends C20025A3t {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public final long[] A06 = new long[3];
    public final String A07;

    public static boolean A00(AnonymousClass8KW r6, long[] jArr) {
        try {
            String A012 = C20025A3t.A01(C108945cZ.A17(r6.A07));
            if (A012 == null) {
                return false;
            }
            String[] split = A012.split("\\s+");
            jArr[0] = Long.parseLong(split[0]);
            jArr[1] = Long.parseLong(split[1]);
            jArr[2] = Long.parseLong(split[2]);
            return true;
        } catch (Throwable unused) {
            r6.A05 = false;
            return false;
        }
    }

    public AnonymousClass8KW(int i) {
        boolean z = true;
        this.A04 = true;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("/proc/");
        A10.append(Process.myPid());
        A10.append("/task/");
        A10.append(i);
        String A0y = AnonymousClass000.A0y("/schedstat", A10);
        this.A07 = A0y;
        File A17 = C108945cZ.A17(A0y);
        this.A05 = (!A17.exists() || !A17.canRead()) ? false : z;
    }

    public AnonymousClass8KW() {
        boolean z = true;
        this.A04 = true;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("/proc/");
        A10.append(Process.myPid());
        String A0y = AnonymousClass000.A0y("/schedstat", A10);
        this.A07 = A0y;
        File A17 = C108945cZ.A17(A0y);
        this.A05 = (!A17.exists() || !A17.canRead()) ? false : z;
    }
}
