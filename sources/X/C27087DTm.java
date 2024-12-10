package X;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DTm  reason: case insensitive filesystem */
public abstract class C27087DTm implements Runnable, Delayed {
    public long A00;
    public long A01;
    public String A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27087DTm)) {
            return false;
        }
        C27087DTm dTm = (C27087DTm) obj;
        if (this.A00 == dTm.A00) {
            String str = this.A02;
            String str2 = dTm.A02;
            if (str != null ? str.equals(str2) : str2 == null) {
                if (this.A01 == dTm.A01) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void A00(C27087DTm dTm) {
        int i = C26096CsG.A00;
        C26096CsG.A00 = i - 1;
        dTm.A00 = ((long) i) << 32;
    }

    public static void A01(C27087DTm dTm, String str) {
        dTm.A02 = str;
        dTm.A01 = 0;
        C26096CsG.A00().A00.add(dTm);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r1 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1 > 0) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1 < 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.concurrent.Delayed r9 = (java.util.concurrent.Delayed) r9
            boolean r0 = r9 instanceof X.C27087DTm
            if (r0 == 0) goto L_0x002a
            X.DTm r9 = (X.C27087DTm) r9
            long r1 = r8.A01
            long r3 = r9.A01
            r7 = 0
            r5 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            long r1 = r8.A00
            long r3 = r9.A00
            long r1 = r1 - r3
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
        L_0x001c:
            r7 = -1
        L_0x001d:
            return r7
        L_0x001e:
            long r1 = r1 - r3
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            goto L_0x001c
        L_0x0024:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
            r7 = 1
            return r7
        L_0x002a:
            java.lang.String r0 = "Comparing a Dispatchable to a non-Dispatchable."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27087DTm.compareTo(java.lang.Object):int");
    }

    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01 - SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0105, code lost:
        if (r2 != null) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C22791BPe
            if (r0 == 0) goto L_0x001a
            r0 = r7
            X.BPe r0 = (X.C22791BPe) r0
            X.CtA r1 = r0.A00
            boolean r0 = X.C26146CtA.A0C
            r0 = 0
            r1.A0B = r0
            X.CtA r0 = r1.A06
            if (r0 != 0) goto L_0x0019
            X.CtA r0 = r1.A07
            if (r0 != 0) goto L_0x0019
            r1.A03()
        L_0x0019:
            return
        L_0x001a:
            boolean r0 = r7 instanceof X.C22787BPa
            if (r0 == 0) goto L_0x0023
            java.util.Vector r3 = X.C25782Clt.A02
            monitor-enter(r3)
            goto L_0x018d
        L_0x0023:
            boolean r0 = r7 instanceof X.BPZ
            if (r0 == 0) goto L_0x004b
            java.util.List r0 = X.C26101CsL.A08
            java.util.ListIterator r1 = r0.listIterator()
        L_0x002d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r1.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.E0g r0 = (X.C28415E0g) r0
            if (r0 == 0) goto L_0x0047
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
            goto L_0x002d
        L_0x0047:
            r1.remove()
            goto L_0x002d
        L_0x004b:
            boolean r0 = r7 instanceof X.C22790BPd
            if (r0 == 0) goto L_0x0066
            r0 = r7
            X.BPd r0 = (X.C22790BPd) r0
            X.CUZ r1 = r0.A00
            r0 = 0
            r1.A0Q = r0
            X.E0f r2 = r1.A0L
            X.BIS r2 = (X.BIS) r2
            X.EBQ r1 = r2.A0S
            java.lang.String r0 = "gesture_single_long_tap"
            r1.CHV(r0)
            X.BIS.A07(r2)
            return
        L_0x0066:
            boolean r0 = r7 instanceof X.C22789BPc
            if (r0 == 0) goto L_0x00c3
            r0 = r7
            X.BPc r0 = (X.C22789BPc) r0
            X.CUZ r0 = r0.A00
            X.E0f r6 = r0.A0L
            float r5 = r0.A09
            float r4 = r0.A0A
            X.BIS r6 = (X.BIS) r6
            X.BIS.A07(r6)
            X.DA3 r0 = r6.A0O
            if (r0 == 0) goto L_0x009a
            boolean r0 = r0.A07(r5, r4)
            if (r0 == 0) goto L_0x009a
            X.DAE r3 = r6.A0M
            X.DA3 r2 = r6.A0O
            X.DA3 r1 = r3.A0D
            if (r1 == 0) goto L_0x0097
            if (r1 == r2) goto L_0x0097
            boolean r0 = r1 instanceof X.BPT
            if (r0 == 0) goto L_0x0097
            X.BPT r1 = (X.BPT) r1
            r1.A09()
        L_0x0097:
            r3.A0D = r2
            return
        L_0x009a:
            X.EBQ r1 = r6.A0S
            java.lang.String r0 = "gesture_single_tap"
            r1.CHV(r0)
            X.DAE r3 = r6.A0M
            r2 = 0
            X.DA3 r1 = r3.A0D
            if (r1 == 0) goto L_0x00b1
            boolean r0 = r1 instanceof X.BPT
            if (r0 == 0) goto L_0x00b1
            X.BPT r1 = (X.BPT) r1
            r1.A09()
        L_0x00b1:
            r3.A0D = r2
            X.DAE r0 = r6.A0M
            X.E45 r1 = r0.A0B
            if (r1 == 0) goto L_0x0019
            X.CtJ r0 = r0.A0R
            X.AEc r0 = r0.A05(r5, r4)
            r1.BxY(r0)
            return
        L_0x00c3:
            boolean r0 = r7 instanceof X.C22792BPf
            if (r0 == 0) goto L_0x00ed
            r0 = r7
            X.BPf r0 = (X.C22792BPf) r0
            android.content.Context r0 = r0.A00
            java.io.File r5 = r0.getCacheDir()
            long r3 = r5.getFreeSpace()
            r1 = 30
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2097152(0x200000, float:2.938736E-39)
            if (r0 < 0) goto L_0x00e4
            r1 = 5242880(0x500000, float:7.34684E-39)
        L_0x00e4:
            java.lang.String r0 = ".facebook_cache"
            java.io.File r2 = X.C17880vN.A0e(r5, r0)
            long r0 = (long) r1
            goto L_0x01a5
        L_0x00ed:
            boolean r0 = r7 instanceof X.C22794BPh
            if (r0 == 0) goto L_0x0130
            r6 = r7
            X.BPh r6 = (X.C22794BPh) r6
            X.BPS r0 = r6.A04
            int r5 = r6.A01
            int r4 = r6.A02
            int r3 = r6.A03
            X.CtA r2 = r0.A09(r5, r4, r3)
            X.CtA r0 = X.C28618EAq.A00
            if (r2 == r0) goto L_0x0118
            r0 = 0
            if (r2 == 0) goto L_0x010d
        L_0x0107:
            r2.A02 = r5
            r2.A03 = r4
            r2.A04 = r3
        L_0x010d:
            X.BPg r1 = new X.BPg
            r1.<init>(r6, r2, r0)
            android.os.Handler r0 = X.C26096CsG.A01
            r0.post(r1)
            return
        L_0x0118:
            int r1 = r2.A01
            int r0 = r2.A00
            X.CtA r2 = new X.CtA
            r2.<init>(r1, r0)
            android.graphics.Bitmap r1 = X.C26146CtA.A0F
            monitor-enter(r2)
            android.graphics.Bitmap r0 = r2.A05     // Catch:{ all -> 0x01c2 }
            if (r0 == r1) goto L_0x012b
            X.C26146CtA.A01(r2)     // Catch:{ all -> 0x01c2 }
        L_0x012b:
            r2.A05 = r1     // Catch:{ all -> 0x01c2 }
            monitor-exit(r2)
            r0 = 1
            goto L_0x0107
        L_0x0130:
            boolean r0 = r7 instanceof X.C22793BPg
            if (r0 == 0) goto L_0x0172
            r3 = r7
            X.BPg r3 = (X.C22793BPg) r3
            X.BPh r6 = r3.A00
            X.BPS r5 = r6.A04
            X.DAE r0 = r5.A07
            X.BIS r0 = r0.A0Q
            int r2 = r0.A0G
            X.CtA r1 = r3.A01
            if (r1 == 0) goto L_0x01c9
            X.Cqg r0 = r5.A09
            r0.A03(r1)
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0019
            int r1 = r6.A03
            int r0 = r2 + 1
            if (r1 > r0) goto L_0x0019
            r5.A03()
            java.util.ArrayList r3 = X.BPS.A0C
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0019
            int r2 = r3.size()
            r1 = 0
        L_0x0164:
            if (r1 >= r2) goto L_0x01c5
            java.lang.Object r0 = r3.get(r1)
            X.DA3 r0 = (X.DA3) r0
            r0.A03()
            int r1 = r1 + 1
            goto L_0x0164
        L_0x0172:
            r0 = r7
            X.BPb r0 = (X.C22788BPb) r0
            X.BIS r2 = r0.A00
            double r0 = X.BIS.A0n
            java.util.Queue r0 = r2.A0T
            if (r0 == 0) goto L_0x0019
        L_0x017d:
            java.util.Queue r0 = r2.A0T
            java.lang.Object r1 = r0.poll()
            X.E46 r1 = (X.E46) r1
            if (r1 == 0) goto L_0x01e4
            X.DAE r0 = r2.A0M
            r1.Bxa(r0)
            goto L_0x017d
        L_0x018d:
            int r2 = r3.size()     // Catch:{ all -> 0x01a2 }
            r1 = 0
        L_0x0192:
            if (r1 >= r2) goto L_0x01a0
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x01a2 }
            X.Clt r0 = (X.C25782Clt) r0     // Catch:{ all -> 0x01a2 }
            r0.A01()     // Catch:{ all -> 0x01a2 }
            int r1 = r1 + 1
            goto L_0x0192
        L_0x01a0:
            monitor-exit(r3)     // Catch:{ all -> 0x01a2 }
            return
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01a2 }
            throw r0
        L_0x01a5:
            X.AiJ r0 = X.C21334AiJ.A00(r2, r0)     // Catch:{ IOException -> 0x01bc }
            X.C22797BPk.A05 = r0     // Catch:{ IOException -> 0x01bc }
            r0 = 0
            X.Ajp r1 = new X.Ajp     // Catch:{ IOException -> 0x01bc }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01bc }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ IOException -> 0x01bc }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01bc }
            X.C22797BPk.A02 = r0     // Catch:{ IOException -> 0x01bc }
            r0.start()     // Catch:{ IOException -> 0x01bc }
            return
        L_0x01bc:
            X.Ct1 r0 = X.C26138Ct1.A08
            r0.A02()
            return
        L_0x01c2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01c5:
            r3.clear()
            return
        L_0x01c9:
            int r4 = r6.A00
            if (r4 <= 0) goto L_0x01de
            int r3 = r6.A03
            r0 = -1
            if (r3 == r0) goto L_0x01d4
            if (r3 != r2) goto L_0x01de
        L_0x01d4:
            int r2 = r6.A01
            int r1 = r6.A02
            int r0 = r4 + -1
            r5.A0B(r2, r1, r3, r0)
            return
        L_0x01de:
            X.CtA r0 = r6.A05
            r0.A04()
            return
        L_0x01e4:
            r0 = 0
            r2.A0T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27087DTm.run():void");
    }
}
