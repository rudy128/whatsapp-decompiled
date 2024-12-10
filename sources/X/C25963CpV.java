package X;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CpV  reason: case insensitive filesystem */
public class C25963CpV {
    public static final long A0C = TimeUnit.HOURS.toMillis(2);
    public static final long A0D = TimeUnit.MINUTES.toMillis(30);
    public long A00;
    public long A01 = 41943040;
    public final CEU A02;
    public final C8D A03;
    public final C28590E9f A04;
    public final C25106CYa A05;
    public final C26192CuK A06 = C26192CuK.A01();
    public final E4N A07;
    public final Object A08 = C17880vN.A0p();
    public final Set A09;
    public final CountDownLatch A0A;
    public final CET A0B;

    public static boolean A00(C25963CpV cpV) {
        boolean z;
        long j;
        C25963CpV cpV2 = cpV;
        E4N e4n = cpV2.A07;
        long now = e4n.now();
        C25106CYa cYa = cpV2.A05;
        synchronized (cYa) {
            z = cYa.A02;
        }
        if (z) {
            long j2 = cpV2.A00;
            if (j2 != -1 && now - j2 <= A0D) {
                return false;
            }
        }
        long now2 = e4n.now();
        long j3 = A0C + now2;
        try {
            long j4 = 0;
            int i = 0;
            for (CWT cwt : cpV2.A04.BRL()) {
                i++;
                long j5 = cwt.A00;
                if (j5 < 0) {
                    j5 = cwt.A02.A00.length();
                    cwt.A00 = j5;
                }
                j4 += j5;
                if (cwt.A00() > j3) {
                    if (cwt.A00 < 0) {
                        cwt.A00 = cwt.A02.A00.length();
                    }
                    cwt.A00();
                }
            }
            synchronized (cYa) {
                j = cYa.A00;
            }
            long j6 = (long) i;
            if (!(j == j6 && cYa.A00() == j4)) {
                synchronized (cYa) {
                    cYa.A00 = j6;
                    cYa.A01 = j4;
                    cYa.A02 = true;
                }
            }
            cpV2.A00 = now2;
            return true;
        } catch (IOException e) {
            e.getMessage();
            return false;
        }
    }

    public C25963CpV(CET cet, CEU ceu, C8D c8d, C28590E9f e9f) {
        this.A04 = e9f;
        this.A03 = c8d;
        this.A00 = -1;
        this.A02 = ceu;
        this.A0B = cet;
        this.A05 = new C25106CYa();
        this.A07 = DBM.A00;
        this.A09 = C17880vN.A12();
        this.A0A = new CountDownLatch(0);
    }
}
