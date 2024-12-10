package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2Dl  reason: invalid class name and case insensitive filesystem */
public class C46172Dl extends C28801av {
    public final AnonymousClass1Ca A00;
    public final long A01;
    public final AnonymousClass11P A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46172Dl(X.AnonymousClass11P r15, X.C22591Cl r16, X.AnonymousClass1Ca r17, java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock r18, boolean r19) {
        /*
            r14 = this;
            r7 = r19
            r0 = r18
            r1 = r16
            r14.<init>(r1, r0, r7)
            r14.A02 = r15
            r8 = r17
            r14.A00 = r8
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x00d9
            long r0 = android.os.SystemClock.uptimeMillis()
        L_0x0017:
            r14.A01 = r0
            boolean r0 = r14.A00
            if (r0 != 0) goto L_0x00d5
            X.1Ev r0 = r14.A02
            java.lang.String r3 = r0.A02
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1CX r9 = r8.A02
            int r1 = r9.A01
            if (r1 <= 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A03
            int r2 = r0.incrementAndGet()
            if (r2 <= r1) goto L_0x0077
            long r4 = android.os.SystemClock.uptimeMillis()
            long r0 = r9.A00
            long r12 = r4 - r0
            X.0vl r0 = r9.A04
            java.lang.Object r0 = r0.getValue()
            long r10 = X.C17880vN.A05(r0)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DBHealthTracker - detected large number of simultaneous sessions, sessionCount = "
            java.lang.String r6 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.String r1 = "DBHealthTracker/detected large number of open database sessions."
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            com.whatsapp.util.Log.e(r6, r0)
            X.00H r0 = r9.A02
            java.lang.Object r6 = r0.get()
            X.190 r6 = (X.AnonymousClass190) r6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "open sessions count: "
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r1, r2)
            r1 = 1
            java.lang.String r0 = "dbHealth-sessions-count"
            r6.A0G(r0, r2, r1)
            r9.A00 = r4
        L_0x0077:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x00d5
            if (r19 == 0) goto L_0x00d5
            X.1CZ r4 = r8.A00
            int r5 = X.C60802od.A00(r3)
            java.lang.ThreadLocal r0 = X.C60802od.A00
            java.lang.Object r2 = r0.get()
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            int[] r2 = (int[]) r2
            r1 = 0
        L_0x0092:
            if (r1 >= r5) goto L_0x00d5
            r0 = r2[r1]
            if (r0 <= 0) goto L_0x00d6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DbWriteDeadlockTracker/dbWriteSessionOpen/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ":dbTransactionsCount:"
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r2)
            X.C18070vi.A0X(r0)
            X.C17890vO.A19(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DbWriteDeadlockTracker/possible-db-deadlock/dbName="
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r3, r1)
            java.lang.String r1 = "DbWriteDeadlockTracker/possible-db-deadlock"
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            com.whatsapp.util.Log.e(r2, r0)
            X.00H r0 = r4.A00
            java.lang.Object r2 = r0.get()
            X.190 r2 = (X.AnonymousClass190) r2
            java.lang.String r1 = "dbHealth-write-deadlock"
            r0 = 1
            r2.A0G(r1, r3, r0)
        L_0x00d5:
            return
        L_0x00d6:
            int r1 = r1 + 1
            goto L_0x0092
        L_0x00d9:
            r0 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46172Dl.<init>(X.11P, X.1Cl, X.1Ca, java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock, boolean):void");
    }

    public void close() {
        AnonymousClass1Ca r2;
        long j;
        if (!this.A00 && (r2 = this.A00) != null) {
            if (r2.A05) {
                j = SystemClock.uptimeMillis() - this.A01;
            } else {
                j = 0;
            }
            AnonymousClass1CX r1 = r2.A02;
            if (r1.A01 > 0) {
                r1.A03.decrementAndGet();
            }
            AnonymousClass1CW r3 = r2.A01;
            long j2 = r3.A00;
            if (j2 > 0 && j > j2) {
                Log.e(C17890vO.A0a("DBHealthTracker - detected long session, transaction time = ", AnonymousClass000.A10(), j), new Throwable("DBHealthTracker/Long running database session detected."));
                ((AnonymousClass190) r3.A01.get()).A0G("dbHealth-slow-database-session", C17890vO.A0a("session time: ", AnonymousClass000.A10(), j), true);
            }
        }
        super.close();
    }
}
