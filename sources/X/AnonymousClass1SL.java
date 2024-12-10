package X;

import android.content.SharedPreferences;
import android.os.Build;
import java.util.List;

/* renamed from: X.1SL  reason: invalid class name */
public class AnonymousClass1SL implements AnonymousClass1SK {
    public final AnonymousClass11P A00;
    public final AnonymousClass11E A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public static int A00(AnonymousClass1LR r4) {
        if (r4 != null) {
            int i = r4.A00;
            if (r4.A04) {
                if (Build.VERSION.SDK_INT >= 29 && i == 20) {
                    return 3;
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 0;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                        return 1;
                    case 13:
                    case 15:
                        return 2;
                    default:
                        return 5;
                }
            } else if (r4.A06) {
                return 4;
            }
        }
        return 5;
    }

    public synchronized void BBK(C26551So r8, int i, long j, long j2) {
        int A002 = A00(this.A01.A04());
        int A012 = (int) ((((AnonymousClass11P.A01(this.A00) / 1000) / 60) / 60) % 24);
        if (!(A002 == 0 || A002 == 5 || ((r8 != C26551So.A0E && r8 != C26551So.A0K && r8 != C26551So.A0t && r8 != C26551So.A0V) || j < 51200 || j2 < 100))) {
            AnonymousClass00H r2 = this.A03;
            C58872lO r1 = new C58872lO(((C199139zV) r2.get()).A01(i, A012, A002));
            r1.A01((int) (((float) j) / ((float) j2)));
            List list = r1.A00;
            C18070vi.A0d(list, 4);
            ((SharedPreferences) ((C199139zV) r2.get()).A01.getValue()).edit().putString(C199139zV.A00(i, A012, A002), C29431cG.A0g(",", "", ",", list, (C22821Di) null)).apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d1, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Float BNL(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.11E r0 = r8.A01     // Catch:{ all -> 0x00d2 }
            X.1LR r0 = r0.A04()     // Catch:{ all -> 0x00d2 }
            int r3 = A00(r0)     // Catch:{ all -> 0x00d2 }
            X.11P r0 = r8.A00     // Catch:{ all -> 0x00d2 }
            long r6 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x00d2 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            r0 = 60
            long r6 = r6 / r0
            long r6 = r6 / r0
            r0 = 24
            long r6 = r6 % r0
            int r5 = (int) r6     // Catch:{ all -> 0x00d2 }
            X.00H r6 = r8.A03     // Catch:{ all -> 0x00d2 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x00d2 }
            X.9zV r0 = (X.C199139zV) r0     // Catch:{ all -> 0x00d2 }
            java.util.ArrayList r0 = r0.A01(r9, r5, r3)     // Catch:{ all -> 0x00d2 }
            X.2lO r4 = new X.2lO     // Catch:{ all -> 0x00d2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00d2 }
            boolean r0 = r4.A02()     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x00bc
            X.0ve r2 = r8.A02     // Catch:{ all -> 0x00d2 }
            r1 = 154(0x9a, float:2.16E-43)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00d2 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r1 = r6.get()     // Catch:{ all -> 0x00d2 }
            X.9zV r1 = (X.C199139zV) r1     // Catch:{ all -> 0x00d2 }
            int r0 = r5 + 23
            int r0 = r0 % 24
            java.util.ArrayList r2 = r1.A01(r9, r0, r3)     // Catch:{ all -> 0x00d2 }
            java.lang.Object r1 = r6.get()     // Catch:{ all -> 0x00d2 }
            X.9zV r1 = (X.C199139zV) r1     // Catch:{ all -> 0x00d2 }
            int r0 = r5 + 1
            int r0 = r0 % 24
            java.util.ArrayList r0 = r1.A01(r9, r0, r3)     // Catch:{ all -> 0x00d2 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x00d2 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00d2 }
            r1 = 0
        L_0x0064:
            boolean r0 = r4.A02()     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x00a7
            if (r1 != 0) goto L_0x007e
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x00d2 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00d2 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00d2 }
            r1 = 1
            goto L_0x008f
        L_0x007e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x00d2 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00d2 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00d2 }
            r1 = 0
        L_0x008f:
            r4.A01(r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x0064
        L_0x0093:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x00d2 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00d2 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00d2 }
            goto L_0x008f
        L_0x00a4:
            monitor-exit(r8)
            r0 = 0
            return r0
        L_0x00a7:
            boolean r0 = r4.A02()     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x00b0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00b7
        L_0x00b0:
            java.util.List r0 = r4.A00     // Catch:{ all -> 0x00d2 }
            double r0 = X.C50272Tu.A00(r0)     // Catch:{ all -> 0x00d2 }
            float r2 = (float) r0     // Catch:{ all -> 0x00d2 }
        L_0x00b7:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d0
        L_0x00bc:
            boolean r0 = r4.A02()     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x00c5
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00cc
        L_0x00c5:
            java.util.List r0 = r4.A00     // Catch:{ all -> 0x00d2 }
            double r0 = X.C50272Tu.A00(r0)     // Catch:{ all -> 0x00d2 }
            float r2 = (float) r0     // Catch:{ all -> 0x00d2 }
        L_0x00cc:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            monitor-exit(r8)
            return r0
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SL.BNL(int):java.lang.Float");
    }

    public Float BNM(int i) {
        return null;
    }

    public AnonymousClass1SL(AnonymousClass11E r1, AnonymousClass11P r2, C18030ve r3, AnonymousClass00H r4) {
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r1;
    }
}
