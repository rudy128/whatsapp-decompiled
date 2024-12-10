package X;

import android.net.Uri;

/* renamed from: X.D9t  reason: case insensitive filesystem */
public final class C26695D9t implements E7O {
    public long A00;
    public long A01 = -1;
    public long A02;
    public C26115Csd A03;
    public boolean A04 = true;
    public final C24761CIy A05 = new Object();
    public final Uri A06;
    public final CPC A07;
    public final E9Q A08;
    public final C25717Ckn A09;
    public volatile boolean A0A;
    public final /* synthetic */ D9O A0B;

    public void BET() {
        this.A0A = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        r0 = r11.A02;
        r4.A00 = r0;
        r5.A00 = r0 - r5.A03.A01;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010a A[SYNTHETIC, Splitter:B:69:0x010a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhb() {
        /*
            r17 = this;
            r7 = 0
            r6 = 0
        L_0x0002:
            r5 = r17
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x010e
            r9 = 1
            X.CIy r4 = r5.A05     // Catch:{ all -> 0x0105 }
            long r2 = r4.A00     // Catch:{ all -> 0x0105 }
            X.Csd r0 = X.C26115Csd.A09     // Catch:{ all -> 0x0105 }
            android.net.Uri r12 = r5.A06     // Catch:{ all -> 0x0105 }
            X.D9O r8 = r5.A0B     // Catch:{ all -> 0x0105 }
            r15 = -1
            X.Csd r11 = new X.Csd     // Catch:{ all -> 0x0105 }
            r13 = r2
            r11.<init>(r12, r13, r15)     // Catch:{ all -> 0x0105 }
            r5.A03 = r11     // Catch:{ all -> 0x0105 }
            X.E9Q r10 = r5.A08     // Catch:{ all -> 0x0105 }
            long r0 = r10.CAj(r11)     // Catch:{ all -> 0x0105 }
            r5.A01 = r0     // Catch:{ all -> 0x0105 }
            int r11 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x002c
            long r0 = r0 + r2
            r5.A01 = r0     // Catch:{ all -> 0x0105 }
        L_0x002c:
            X.Cqw r11 = new X.Cqw     // Catch:{ all -> 0x0105 }
            r12 = r10
            r15 = r0
            r11.<init>(r12, r13, r15)     // Catch:{ all -> 0x0105 }
            X.CPC r1 = r5.A07     // Catch:{ all -> 0x00f6 }
            android.net.Uri r13 = r10.Bb3()     // Catch:{ all -> 0x00f6 }
            X.E8y r12 = r1.A00     // Catch:{ all -> 0x00f6 }
            if (r12 != 0) goto L_0x005e
            X.E8y[] r15 = r1.A02     // Catch:{ all -> 0x00f6 }
            int r14 = r15.length     // Catch:{ all -> 0x00f6 }
            r12 = 0
        L_0x0041:
            if (r12 >= r14) goto L_0x0055
            r0 = r15[r12]     // Catch:{ all -> 0x00f6 }
            boolean r16 = r0.CNV(r11)     // Catch:{ EOFException -> 0x004e, all -> 0x00f2 }
            if (r16 == 0) goto L_0x004e
            r1.A00 = r0     // Catch:{ EOFException -> 0x004e, all -> 0x00f2 }
            goto L_0x0053
        L_0x004e:
            r11.A01 = r7     // Catch:{ all -> 0x00f6 }
            int r12 = r12 + 1
            goto L_0x0041
        L_0x0053:
            r11.A01 = r7     // Catch:{ all -> 0x00f6 }
        L_0x0055:
            X.E8y r12 = r1.A00     // Catch:{ all -> 0x00f6 }
            if (r12 == 0) goto L_0x00ad
            X.D9O r0 = r1.A01     // Catch:{ all -> 0x00f6 }
            r12.Bd7(r0)     // Catch:{ all -> 0x00f6 }
        L_0x005e:
            boolean r0 = r5.A04     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x0069
            long r0 = r5.A02     // Catch:{ all -> 0x00f6 }
            r12.CH9(r2, r0)     // Catch:{ all -> 0x00f6 }
            r5.A04 = r7     // Catch:{ all -> 0x00f6 }
        L_0x0069:
            boolean r0 = r5.A0A     // Catch:{ all -> 0x00f6 }
            if (r0 != 0) goto L_0x0098
            X.Ckn r14 = r5.A09     // Catch:{ all -> 0x00f6 }
            monitor-enter(r14)     // Catch:{ all -> 0x00f6 }
        L_0x0070:
            boolean r0 = r14.A00     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x0078
            r14.wait()     // Catch:{ all -> 0x00aa }
            goto L_0x0070
        L_0x0078:
            monitor-exit(r14)     // Catch:{ all -> 0x00f6 }
            int r6 = r12.CDJ(r11, r4)     // Catch:{ all -> 0x00f6 }
            long r0 = r11.A02     // Catch:{ all -> 0x00f6 }
            r15 = 1048576(0x100000, double:5.180654E-318)
            long r15 = r15 + r2
            int r13 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x0092
            r2 = r0
            r14.A00()     // Catch:{ all -> 0x00f6 }
            android.os.Handler r1 = r8.A0O     // Catch:{ all -> 0x00f6 }
            java.lang.Runnable r0 = r8.A0V     // Catch:{ all -> 0x00f6 }
            r1.post(r0)     // Catch:{ all -> 0x00f6 }
        L_0x0092:
            if (r6 == 0) goto L_0x0069
            if (r6 != r9) goto L_0x0098
            r6 = 0
            goto L_0x00a3
        L_0x0098:
            long r0 = r11.A02
            r4.A00 = r0
            X.Csd r2 = r5.A03
            long r2 = r2.A01
            long r0 = r0 - r2
            r5.A00 = r0
        L_0x00a3:
            r10.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            if (r6 != 0) goto L_0x010e
            goto L_0x0002
        L_0x00aa:
            r1 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00f6 }
            goto L_0x00f5
        L_0x00ad:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = ""
            r2.append(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "  Content Length: "
            r2.append(r0)     // Catch:{ all -> 0x00f6 }
            long r0 = r11.A04     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "None of the available extractors ("
            java.lang.StringBuilder r2 = X.AnonymousClass8BT.A0y(r0, r3)     // Catch:{ all -> 0x00f6 }
            r1 = 0
        L_0x00d0:
            if (r1 >= r14) goto L_0x00e3
            r0 = r15[r1]     // Catch:{ all -> 0x00f6 }
            X.C17900vP.A0a(r0, r2)     // Catch:{ all -> 0x00f6 }
            int r0 = r14 + -1
            if (r1 >= r0) goto L_0x00e0
            java.lang.String r0 = ", "
            r2.append(r0)     // Catch:{ all -> 0x00f6 }
        L_0x00e0:
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x00e3:
            X.AnonymousClass8BS.A1D(r2, r3)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = ") could read the stream."
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r7, r3)     // Catch:{ all -> 0x00f6 }
            X.BOJ r1 = new X.BOJ     // Catch:{ all -> 0x00f6 }
            r1.<init>(r0, r13)     // Catch:{ all -> 0x00f6 }
            goto L_0x00f5
        L_0x00f2:
            r1 = move-exception
            r11.A01 = r7     // Catch:{ all -> 0x00f6 }
        L_0x00f5:
            throw r1     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r7 = move-exception
            if (r6 == r9) goto L_0x0106
            long r2 = r11.A02
            r4.A00 = r2
            X.Csd r0 = r5.A03
            long r0 = r0.A01
            long r2 = r2 - r0
            r5.A00 = r2
            goto L_0x0106
        L_0x0105:
            r7 = move-exception
        L_0x0106:
            X.E9Q r0 = r5.A08
            if (r0 == 0) goto L_0x010d
            r0.close()     // Catch:{ IOException -> 0x010d }
        L_0x010d:
            throw r7
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26695D9t.Bhb():void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CIy, java.lang.Object] */
    public C26695D9t(Uri uri, CPC cpc, D9O d9o, E9Q e9q, C25717Ckn ckn) {
        this.A0B = d9o;
        C26056CrS.A01(uri);
        this.A06 = uri;
        C26056CrS.A01(e9q);
        this.A08 = e9q;
        C26056CrS.A01(cpc);
        this.A07 = cpc;
        this.A09 = ckn;
    }
}
