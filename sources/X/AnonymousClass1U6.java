package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1U6  reason: invalid class name */
public class AnonymousClass1U6 {
    public final AnonymousClass11S A00;
    public final AnonymousClass1RK A01;
    public final AnonymousClass1U5 A02;
    public final AnonymousClass1U2 A03;
    public final AnonymousClass1MR A04;
    public final C19830z4 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r12 >= r10.A02) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C62512rW A00(X.C199410f r9, X.C62512rW r10, int r11, long r12, boolean r14) {
        /*
            r3 = r12
            if (r14 != 0) goto L_0x000c
            if (r10 == 0) goto L_0x000c
            long r1 = r10.A02
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            boolean r0 = X.C62832s4.A02(r9)
            r2 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 1
        L_0x0015:
            if (r1 == 0) goto L_0x0024
            r5 = 0
            r7 = 0
            r9 = 0
        L_0x001d:
            X.2rW r0 = new X.2rW
            r1 = r11
            r0.<init>((int) r1, (int) r2, (long) r3, (long) r5, (long) r7, (long) r9)
            return r0
        L_0x0024:
            X.C17960vV.A07(r10)
            long r5 = r10.A02
            X.C17960vV.A07(r10)
            long r7 = r10.A04
            X.C17960vV.A07(r10)
            long r9 = r10.A03
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1U6.A00(X.10f, X.2rW, int, long, boolean):X.2rW");
    }

    public static boolean A01(AnonymousClass1U6 r7, UserJid userJid, long j, long j2) {
        C62512rW A052 = r7.A04.A05(userJid);
        if (j > 0 && A052 != null) {
            long j3 = A052.A02;
            if (j < j3 && j2 == j3 && A052.A04 < ((SharedPreferences) r7.A05.A00.get()).getLong("adv_last_device_job_ts", 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("contactsyncDevicesupdater/update/usync fetch error, expectedTs=");
                sb.append(j2);
                sb.append("; responseTs=");
                sb.append(j);
                Log.e(sb.toString());
                AnonymousClass1U2 r0 = r7.A03;
                r0.A00.CC7(new AnonymousClass2ER());
                return true;
            }
        }
        return false;
    }

    public AnonymousClass1U6(AnonymousClass11S r1, C19830z4 r2, AnonymousClass1RK r3, AnonymousClass1U5 r4, AnonymousClass1U2 r5, AnonymousClass1MR r6) {
        this.A00 = r1;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }
}
