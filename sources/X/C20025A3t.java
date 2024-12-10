package X;

import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.File;

/* renamed from: X.A3t  reason: case insensitive filesystem */
public abstract class C20025A3t {
    public final long A00 = (1000 / Os.sysconf(OsConstants._SC_CLK_TCK));

    public static void A02(StringBuilder sb, long j, long j2) {
        long j3 = (j * 1000) / j2;
        long j4 = j3 / 10;
        sb.append(j4);
        if (j4 < 10) {
            long j5 = j3 - (j4 * 10);
            if (j5 != 0) {
                sb.append('.');
                sb.append(j5);
            }
        }
    }

    public static String A01(File file) {
        BufferedReader A0V = AnonymousClass8BW.A0V(file);
        try {
            return A0V.readLine();
        } finally {
            A0V.close();
        }
    }
}
