package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1DP  reason: invalid class name */
public abstract class AnonymousClass1DP {
    public final AnonymousClass1DT A00 = new AnonymousClass1DS(0);
    public final AnonymousClass1Cd A01;
    public final AnonymousClass1DK A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1DN A05;

    public void A00() {
        if (!(this instanceof AnonymousClass2Ds)) {
            AnonymousClass1DR r1 = (AnonymousClass1DR) this;
            AnonymousClass1Cd r0 = r1.A01;
            r0.A06();
            r0.A04.unlock();
            AnonymousClass00H r12 = r1.A00;
            if (r12.get() != null) {
                ((C203911y) r12.get()).A03(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if ((r8 instanceof X.AnonymousClass2Ds) != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r4 = (X.AnonymousClass1DR) r4;
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        if (r1.get() == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        ((X.C203911y) r1.get()).A03(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        r0 = r4.A01;
        r0.A06();
        r0.A04.lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.AnonymousClass1CJ.A01(r8.A04);
        r1 = new java.lang.StringBuilder();
        r1.append("BaseForceMigrationManager/processMigrations, running forced migrations. blocking = ");
        r1.append(r9);
        com.whatsapp.util.Log.i(r1.toString());
        r3.A05(new X.C56792i2(new X.C37431pX[0]), r2, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
        A01(r2, r9);
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(boolean r9) {
        /*
            r8 = this;
            X.1Cd r0 = r8.A01
            r0.A06()
            boolean r0 = r0.A08
            r5 = 0
            if (r0 == 0) goto L_0x00e5
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.1DK r0 = r8.A02
            X.10w r0 = r0.A00()
            X.10e r0 = r0.values()
            X.1IZ r7 = r0.iterator()
        L_0x001d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r6 = r7.next()
            X.1a4 r6 = (X.C28381a4) r6
            boolean r0 = r8 instanceof X.AnonymousClass1DR
            if (r0 == 0) goto L_0x0046
            boolean r0 = r6.A0E()
        L_0x0031:
            if (r0 == 0) goto L_0x001d
        L_0x0033:
            int r1 = r6.A01()
            r0 = 3
            if (r1 != r0) goto L_0x001d
            boolean r0 = r6.A0D()
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = r6.A05
            r2.add(r0)
            goto L_0x001d
        L_0x0046:
            X.1a0 r1 = r6.A04
            java.lang.String r4 = r6.A05
            java.util.Set r0 = r1.A02
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0033
            X.0ve r3 = r1.A00
            r1 = 242(0xf2, float:3.39E-43)
            X.0vf r0 = X.C18040vf.A02
            java.lang.String r0 = X.C18020vd.A01(r0, r3, r1)
            boolean r0 = X.C28351a0.A00(r0, r4)
            goto L_0x0031
        L_0x0061:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00e5
            X.1DN r3 = r8.A05
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A08
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00e5
            monitor-enter(r8)
            X.1DT r4 = r8.A00     // Catch:{ all -> 0x00e2 }
            java.lang.Object r0 = r4.A06()     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00e2 }
            r1 = 1
            if (r0 == 0) goto L_0x0085
            int r0 = r0.intValue()     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x0085
            monitor-exit(r8)     // Catch:{ all -> 0x00e2 }
            return
        L_0x0085:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00e2 }
            r4.A0E(r0)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r8)     // Catch:{ all -> 0x00e2 }
            r4 = r8
            boolean r0 = r8 instanceof X.AnonymousClass2Ds
            if (r0 != 0) goto L_0x00af
            X.1DR r4 = (X.AnonymousClass1DR) r4
            X.00H r1 = r4.A00
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r0 = r1.get()
            X.11y r0 = (X.C203911y) r0
            r0.A03(r5)
        L_0x00a5:
            X.1Cd r0 = r4.A01
            r0.A06()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A04
            r0.lock()
        L_0x00af:
            X.1CJ r0 = r8.A04     // Catch:{ all -> 0x00da }
            X.AnonymousClass1CJ.A01(r0)     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r1.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "BaseForceMigrationManager/processMigrations, running forced migrations. blocking = "
            r1.append(r0)     // Catch:{ all -> 0x00da }
            r1.append(r9)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00da }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00da }
            X.1pX[] r0 = new X.C37431pX[r5]     // Catch:{ all -> 0x00da }
            X.2i2 r1 = new X.2i2     // Catch:{ all -> 0x00da }
            r1.<init>(r0)     // Catch:{ all -> 0x00da }
            r0 = 7
            r3.A05(r1, r2, r0)     // Catch:{ all -> 0x00da }
            r8.A01(r2, r9)
            r8.A00()
            return
        L_0x00da:
            r0 = move-exception
            r8.A01(r2, r9)
            r8.A00()
            throw r0
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e2 }
            throw r0
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DP.A02(boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1DT, X.1DS] */
    public AnonymousClass1DP(AnonymousClass190 r3, AnonymousClass1CJ r4, AnonymousClass1Cd r5, AnonymousClass1DN r6, AnonymousClass1DK r7) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r7;
        this.A01 = r5;
        this.A05 = r6;
    }

    public void A01(Set set, boolean z) {
        StringBuilder sb;
        AnonymousClass1DT r1;
        int i;
        Iterator it = set.iterator();
        boolean z2 = true;
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C28381a4 A012 = this.A02.A01(str);
            if (A012 != null && !A012.A0D()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("BaseForceMigrationManager/afterForcedMigration, failed to migrate ");
                sb2.append(str);
                sb2.append(", blocking = ");
                sb2.append(z);
                Log.e(sb2.toString());
                if (z3 || A012.A0B()) {
                    z2 = false;
                } else {
                    z2 = false;
                    z3 = true;
                }
            }
        }
        if (z2) {
            sb.append("BaseForceMigrationManager/afterForcedMigration, successfully migrated all forced migration, blocking = ");
            sb.append(z);
            Log.i(sb.toString());
            r1 = this.A00;
            i = 5;
        } else {
            sb = new StringBuilder();
            sb.append("BaseForceMigrationManager/afterForcedMigration, failed to migrate all forced migration. blocking = ");
            sb.append(z);
            Log.i(sb.toString());
            this.A03.A0G("ForcedDatabaseMigrationManager/failedToMigrate", "failedToMigrate", true);
            r1 = this.A00;
            if (!z) {
                i = 2;
            } else {
                i = 4;
                if (z3) {
                    i = 3;
                }
            }
        }
        r1.A0E(Integer.valueOf(i));
    }
}
