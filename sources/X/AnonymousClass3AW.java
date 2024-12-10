package X;

/* renamed from: X.3AW  reason: invalid class name */
public class AnonymousClass3AW implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass3AW(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04b8, code lost:
        if ((((X.C25125CYy) r2.A08.get()).A00() & 1) != 0) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04c2, code lost:
        if (r1 != X.C26551So.A0j) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04c4, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r21) {
        /*
            r20 = this;
            r12 = r21
            r1 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x01a8;
                case 1: goto L_0x0505;
                case 2: goto L_0x046e;
                case 3: goto L_0x0443;
                case 4: goto L_0x00f1;
                case 5: goto L_0x03d4;
                case 6: goto L_0x0390;
                case 7: goto L_0x0341;
                case 8: goto L_0x0301;
                case 9: goto L_0x02c3;
                case 10: goto L_0x029a;
                case 11: goto L_0x004f;
                case 12: goto L_0x027b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r5 = r1.A01
            X.2k3 r5 = (X.C58042k3) r5
            java.lang.Object r2 = r1.A02
            X.34B r2 = (X.AnonymousClass34B) r2
            java.lang.Object r4 = r1.A03
            X.6iw r4 = (X.C130136iw) r4
            X.1TJ r0 = r2.A0B
            java.lang.Object r1 = r0.A00()
            X.2ex r1 = (X.C54942ex) r1
            if (r1 == 0) goto L_0x002c
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x002c
            java.io.File r0 = r1.A01
            r0.delete()
        L_0x002c:
            X.2g5 r3 = r2.A03()
            if (r3 == 0) goto L_0x0043
            int r0 = r3.A00
            if (r0 != 0) goto L_0x0043
            X.1KB r0 = r5.A02
            java.util.concurrent.Executor r2 = r0.A05
            X.7Qx r1 = new X.7Qx
            r1.<init>(r3, r4)
        L_0x003f:
            r2.execute(r1)
        L_0x0042:
            return
        L_0x0043:
            X.1KB r0 = r5.A02
            java.util.concurrent.Executor r2 = r0.A05
            r0 = 46
            X.Ajs r1 = new X.Ajs
            r1.<init>((java.lang.Object) r4, (int) r0)
            goto L_0x003f
        L_0x004f:
            java.lang.Object r14 = r1.A01
            X.1hY r14 = (X.C32661hY) r14
            java.lang.Object r11 = r1.A02
            X.206 r11 = (X.AnonymousClass206) r11
            java.lang.Object r13 = r1.A03
            X.36w r13 = (X.C693536w) r13
            X.6uk r12 = (X.C136996uk) r12
            r0 = 3
            X.C18070vi.A0d(r12, r0)
            X.36u r0 = r11.A0O()
            if (r0 == 0) goto L_0x009b
            byte[] r0 = r12.A0G()
            if (r0 == 0) goto L_0x009b
            boolean r0 = r11 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x008a
            X.1gV r1 = r14.A0A
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r1.A0J(r11, r0)
            X.36u r0 = r11.A0O()
            if (r0 == 0) goto L_0x008a
            X.1gW r0 = r14.A09
            r15 = 47
            X.3Cr r10 = new X.3Cr
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (int) r15)
            r0.A00(r11, r10)
        L_0x008a:
            X.73o r0 = r12.A01()
            if (r0 == 0) goto L_0x0042
            int r1 = r0.A01
            r0 = 5
            if (r1 != r0) goto L_0x0042
            X.1hX r2 = r14.A07
            java.lang.String r3 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnail"
            goto L_0x051a
        L_0x009b:
            boolean r0 = r11 instanceof X.AnonymousClass210
            r2 = -1
            if (r0 == 0) goto L_0x00e7
            byte[] r0 = r12.A0G()
            if (r0 == 0) goto L_0x00e7
            java.lang.String r4 = r13.A05
            if (r4 == 0) goto L_0x00e7
            java.lang.String r3 = r13.A06
            r1 = 1
            boolean r0 = X.AnonymousClass1YF.A0T(r4)
            r0 = r0 ^ 1
            if (r0 == r1) goto L_0x00c0
            if (r3 == 0) goto L_0x0042
            boolean r0 = X.AnonymousClass1YF.A0T(r3)
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x0042
            r4 = r3
        L_0x00c0:
            X.17r r0 = r14.A01
            java.io.File r3 = r0.A0d(r4)
            byte[] r0 = r12.A0G()     // Catch:{ IOException -> 0x00d8 }
            X.C64062u9.A0L(r3, r0)     // Catch:{ IOException -> 0x00d8 }
            r3.getAbsolutePath()     // Catch:{ IOException -> 0x00d8 }
            r13.A0A = r1     // Catch:{ IOException -> 0x00d8 }
            X.121 r0 = r14.A04     // Catch:{ IOException -> 0x00d8 }
            r0.CQx(r11, r2)     // Catch:{ IOException -> 0x00d8 }
            goto L_0x008a
        L_0x00d8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ThumbnailDownloadManager/whenDownloadComplete, exception when creating thumbnail file"
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
            goto L_0x008a
        L_0x00e7:
            boolean r0 = r11 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x008a
            X.121 r0 = r14.A04
            r0.CQx(r11, r2)
            goto L_0x008a
        L_0x00f1:
            java.lang.Object r0 = r1.A01
            X.1hs r0 = (X.C32861hs) r0
            java.lang.Object r10 = r1.A02
            X.2tS r10 = (X.C63642tS) r10
            X.2ex r12 = (X.C54942ex) r12
            java.util.concurrent.CopyOnWriteArrayList r11 = r10.A03
            r11.size()
            X.1ho r5 = r0.A0A
            java.io.File r9 = r12.A01
            X.0ve r8 = r5.A01
            r4 = 0
            X.C18070vi.A0d(r8, r4)
            r7 = 11380(0x2c74, float:1.5947E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r8, r7)
            if (r0 == 0) goto L_0x0137
            X.21V r0 = r10.A01()
            X.2rc r0 = X.AnonymousClass206.A00(r0)
            X.C18070vi.A0X(r0)
            java.io.File r15 = r0.A0G
        L_0x0121:
            int r3 = r11.size()
            java.util.concurrent.atomic.AtomicInteger r0 = r12.A03
            r0.addAndGet(r3)
            boolean r0 = r9.equals(r15)
            if (r0 == 0) goto L_0x014b
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.A02
            r0 = 1
            r1.set(r0)
            return
        L_0x0137:
            X.21V r1 = r10.A01()
            monitor-enter(r1)
            X.21V r0 = r10.A01()     // Catch:{ all -> 0x0590 }
            X.2rc r0 = X.AnonymousClass206.A00(r0)     // Catch:{ all -> 0x0590 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0590 }
            java.io.File r15 = r0.A0G     // Catch:{ all -> 0x0590 }
            monitor-exit(r1)     // Catch:{ all -> 0x0590 }
            goto L_0x0121
        L_0x014b:
            if (r3 == 0) goto L_0x0042
            X.1Ns r14 = r5.A00
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            r14.A06(r9, r3, r0)
            long r5 = r12.A00
            r12 = 0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0174
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SendMediaMessageCallback/applyMediaFileReference file size from reference is 0.  file size computed from file is = "
            r12.append(r0)
            long r0 = r9.length()
            r12.append(r0)
            X.C17890vO.A0w(r12)
        L_0x0174:
            java.util.Iterator r11 = X.C29431cG.A0o(r11)
        L_0x0178:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x019c
            X.21V r1 = X.C17880vN.A0b(r11)
            boolean r0 = X.C18020vd.A05(r2, r8, r7)
            if (r0 == 0) goto L_0x0191
            X.2rc r0 = X.AnonymousClass206.A00(r1)
            r0.A0G = r9
            r1.A01 = r5
            goto L_0x0178
        L_0x0191:
            monitor-enter(r1)
            X.2rc r0 = X.AnonymousClass206.A00(r1)     // Catch:{ all -> 0x0566 }
            r0.A0G = r9     // Catch:{ all -> 0x0566 }
            r1.A01 = r5     // Catch:{ all -> 0x0566 }
            monitor-exit(r1)     // Catch:{ all -> 0x0566 }
            goto L_0x0178
        L_0x019c:
            if (r15 == 0) goto L_0x0042
            X.21V r0 = r10.A01()
            int r2 = r0.A0u
            r18 = 0
            goto L_0x0569
        L_0x01a8:
            java.lang.Object r4 = r1.A01
            X.2Km r4 = (X.C47922Km) r4
            java.lang.Object r3 = r1.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.lang.Object r2 = r1.A03
            X.Af0 r2 = (X.C21132Af0) r2
            java.util.List r12 = (java.util.List) r12
            X.10I r0 = r4.A09
            r0.CEz(r3)
            java.util.Iterator r1 = r12.iterator()
            r10 = 1
        L_0x01c0:
            r5 = 1
        L_0x01c1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r0 = r1.next()
            if (r5 == 0) goto L_0x01d2
            boolean r0 = r0 instanceof X.C46192Dn
            if (r0 == 0) goto L_0x01d2
            goto L_0x01c0
        L_0x01d2:
            r5 = 0
            goto L_0x01c1
        L_0x01d4:
            if (r5 == 0) goto L_0x0234
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            X.2Dn r1 = new X.2Dn
            r1.<init>(r0)
        L_0x01df:
            r2.A0B(r1)
            X.11Q r0 = r4.A06
            android.content.SharedPreferences$Editor r3 = X.AnonymousClass11Q.A00(r0)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "critical_bootstrap_completed_timestamp"
            X.C17880vN.A1D(r3, r0, r1)
            if (r5 == 0) goto L_0x0042
            X.2g1 r3 = r4.A01
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startNonCriticalBootstrapPhase started"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11S r0 = r3.A00
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x020e
            X.10I r2 = r3.A05
            r1 = 42
            X.4rg r0 = new X.4rg
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
        L_0x020e:
            X.126 r1 = r4.A07
            r0 = 3
            r1.A0P(r0, r10)
            X.1M9 r0 = r4.A04
            java.util.ArrayList r0 = r0.A0L()
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x0222:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0241
            X.1E7 r0 = X.C17880vN.A0O(r1)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass1E7.A01(r0)
            r7.add(r0)
            goto L_0x0222
        L_0x0234:
            java.lang.String r1 = "Critical Sync Failed"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.5yg r1 = new X.5yg
            r1.<init>(r0)
            goto L_0x01df
        L_0x0241:
            r6 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            X.C17960vV.A0C(r10)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            int r2 = r7.size()
        L_0x024f:
            if (r5 >= r2) goto L_0x0260
            int r1 = r5 + r6
            int r0 = java.lang.Math.min(r2, r1)
            java.util.List r0 = r7.subList(r5, r0)
            r3.add(r0)
            r5 = r1
            goto L_0x024f
        L_0x0260:
            java.util.Iterator r1 = r3.iterator()
        L_0x0264:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r8 = r1.next()
            java.util.Collection r8 = (java.util.Collection) r8
            X.12E r5 = r4.A05
            X.2R1 r7 = X.AnonymousClass2R1.A0N
            X.2qq r6 = X.C62132qq.A0D
            r9 = 0
            r5.A04(r6, r7, r8, r9, r10)
            goto L_0x0264
        L_0x027b:
            java.lang.Object r9 = r1.A01
            X.6xb r9 = (X.C138736xb) r9
            java.lang.Object r10 = r1.A02
            java.lang.Object r11 = r1.A03
            r0 = 3
            X.C18070vi.A0d(r12, r0)
            X.00H r0 = r9.A0H
            java.lang.Object r0 = r0.get()
            X.1KB r0 = (X.AnonymousClass1KB) r0
            r13 = 48
            X.3Cr r8 = new X.3Cr
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (int) r13)
            r0.A0J(r8)
            return
        L_0x029a:
            java.lang.Object r5 = r1.A01
            X.1hB r5 = (X.C32431hB) r5
            java.lang.Object r4 = r1.A02
            X.21V r4 = (X.AnonymousClass21V) r4
            java.lang.Object r3 = r1.A03
            byte[] r12 = (byte[]) r12
            X.36u r0 = r4.A0O()
            if (r0 == 0) goto L_0x02bb
            int r0 = r12.length
            if (r0 <= 0) goto L_0x02bb
            X.1gW r2 = r5.A0B
            r1 = 23
            X.7R0 r0 = new X.7R0
            r0.<init>(r4, r12, r3, r1)
            r2.A00(r4, r0)
        L_0x02bb:
            X.1KB r1 = r5.A03
            r0 = 12
            r5.A0C(r1, r4, r0)
            return
        L_0x02c3:
            java.lang.Object r5 = r1.A01
            X.1hs r5 = (X.C32861hs) r5
            java.lang.Object r4 = r1.A02
            X.2tS r4 = (X.C63642tS) r4
            java.lang.String r12 = (java.lang.String) r12
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.A03
            r0.size()
            X.1ho r3 = r5.A0A
            java.util.Iterator r2 = X.C29431cG.A0o(r0)
        L_0x02d8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02fb
            X.21V r1 = X.C17880vN.A0b(r2)
            boolean r0 = X.C18020vd.A07(r3)
            if (r0 == 0) goto L_0x02ef
            X.2rc r0 = X.AnonymousClass206.A00(r1)
            r0.A0L = r12
            goto L_0x02d8
        L_0x02ef:
            monitor-enter(r1)
            X.2rc r0 = X.AnonymousClass206.A00(r1)     // Catch:{ all -> 0x02f8 }
            r0.A0L = r12     // Catch:{ all -> 0x02f8 }
            monitor-exit(r1)     // Catch:{ all -> 0x02f8 }
            goto L_0x02d8
        L_0x02f8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02f8 }
            throw r0
        L_0x02fb:
            X.1KB r2 = r5.A01
            r0 = 15
            goto L_0x03ce
        L_0x0301:
            java.lang.Object r5 = r1.A01
            X.1hs r5 = (X.C32861hs) r5
            java.lang.Object r4 = r1.A02
            X.2tS r4 = (X.C63642tS) r4
            X.2eu r12 = (X.C54912eu) r12
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.A03
            r0.size()
            X.1ho r3 = r5.A0A
            java.util.Iterator r2 = X.C29431cG.A0o(r0)
        L_0x0316:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x033b
            X.21V r1 = X.C17880vN.A0b(r2)
            boolean r0 = X.C18020vd.A07(r3)
            if (r0 == 0) goto L_0x032e
            X.2rc r0 = X.AnonymousClass206.A00(r1)
            X.C32821ho.A00(r0, r3, r12, r1)
            goto L_0x0316
        L_0x032e:
            monitor-enter(r1)
            X.2rc r0 = X.AnonymousClass206.A00(r1)     // Catch:{ all -> 0x0338 }
            X.C32821ho.A00(r0, r3, r12, r1)     // Catch:{ all -> 0x0338 }
            monitor-exit(r1)     // Catch:{ all -> 0x0338 }
            goto L_0x0316
        L_0x0338:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0338 }
            throw r0
        L_0x033b:
            X.1KB r2 = r5.A01
            r0 = 12
            goto L_0x03ce
        L_0x0341:
            java.lang.Object r5 = r1.A01
            X.1hs r5 = (X.C32861hs) r5
            java.lang.Object r4 = r1.A02
            X.2tS r4 = (X.C63642tS) r4
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.A03
            r0.size()
            X.1ho r8 = r5.A0A
            java.util.Iterator r7 = X.C29431cG.A0o(r0)
        L_0x0354:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x038b
            X.21V r6 = X.C17880vN.A0b(r7)
            boolean r0 = X.C18020vd.A07(r8)
            if (r0 == 0) goto L_0x0375
            X.2rc r3 = X.AnonymousClass206.A00(r6)
            r2 = 1
            r6.A0a(r2)
            r3.A0f = r2
            r0 = 0
            r3.A0C = r0
            r3.A0Q = r2
            goto L_0x0354
        L_0x0375:
            monitor-enter(r6)
            X.2rc r3 = X.AnonymousClass206.A00(r6)     // Catch:{ all -> 0x0388 }
            r2 = 1
            r6.A0a(r2)     // Catch:{ all -> 0x0388 }
            r3.A0f = r2     // Catch:{ all -> 0x0388 }
            r0 = 0
            r3.A0C = r0     // Catch:{ all -> 0x0388 }
            r3.A0Q = r2     // Catch:{ all -> 0x0388 }
            monitor-exit(r6)     // Catch:{ all -> 0x0388 }
            goto L_0x0354
        L_0x0388:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0388 }
            throw r0
        L_0x038b:
            X.1KB r2 = r5.A01
            r0 = 18
            goto L_0x03ce
        L_0x0390:
            java.lang.Object r5 = r1.A01
            X.1hs r5 = (X.C32861hs) r5
            java.lang.Object r4 = r1.A02
            X.2tS r4 = (X.C63642tS) r4
            X.2fe r12 = (X.C55362fe) r12
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.A03
            r0.size()
            X.1ho r3 = r5.A0A
            java.util.Iterator r2 = X.C29431cG.A0o(r0)
        L_0x03a5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03ca
            X.21V r1 = X.C17880vN.A0b(r2)
            boolean r0 = X.C18020vd.A07(r3)
            if (r0 == 0) goto L_0x03bd
            X.2rc r0 = X.AnonymousClass206.A00(r1)
            X.C32821ho.A01(r0, r3, r12, r1)
            goto L_0x03a5
        L_0x03bd:
            monitor-enter(r1)
            X.2rc r0 = X.AnonymousClass206.A00(r1)     // Catch:{ all -> 0x03c7 }
            X.C32821ho.A01(r0, r3, r12, r1)     // Catch:{ all -> 0x03c7 }
            monitor-exit(r1)     // Catch:{ all -> 0x03c7 }
            goto L_0x03a5
        L_0x03c7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03c7 }
            throw r0
        L_0x03ca:
            X.1KB r2 = r5.A01
            r0 = 19
        L_0x03ce:
            X.7Qr r1 = new X.7Qr
            r1.<init>(r5, r4, r0)
            goto L_0x043f
        L_0x03d4:
            java.lang.Object r4 = r1.A01
            X.1hs r4 = (X.C32861hs) r4
            java.lang.Object r3 = r1.A02
            X.2tS r3 = (X.C63642tS) r3
            X.2ew r12 = (X.C54932ew) r12
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.A03
            r0.size()
            X.1ho r5 = r4.A0A
            java.util.Iterator r6 = X.C29431cG.A0o(r0)
        L_0x03e9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0436
            X.21V r2 = X.C17880vN.A0b(r6)
            boolean r0 = X.C18020vd.A07(r5)
            if (r0 == 0) goto L_0x0415
            X.2rc r1 = X.AnonymousClass206.A00(r2)
            java.io.File r0 = r12.A01
            r1.A0G = r0
            java.lang.String r0 = r12.A02
            r2.A09 = r0
            long r0 = r12.A00
            r2.A01 = r0
            X.36u r0 = r2.A0O()
            if (r0 == 0) goto L_0x03e9
            byte[] r0 = r12.A03
            r2.A0p(r0)
            goto L_0x03e9
        L_0x0415:
            monitor-enter(r2)
            X.2rc r1 = X.AnonymousClass206.A00(r2)     // Catch:{ all -> 0x0433 }
            java.io.File r0 = r12.A01     // Catch:{ all -> 0x0433 }
            r1.A0G = r0     // Catch:{ all -> 0x0433 }
            java.lang.String r0 = r12.A02     // Catch:{ all -> 0x0433 }
            r2.A09 = r0     // Catch:{ all -> 0x0433 }
            long r0 = r12.A00     // Catch:{ all -> 0x0433 }
            r2.A01 = r0     // Catch:{ all -> 0x0433 }
            X.36u r0 = r2.A0O()     // Catch:{ all -> 0x0433 }
            if (r0 == 0) goto L_0x0431
            byte[] r0 = r12.A03     // Catch:{ all -> 0x0433 }
            r2.A0p(r0)     // Catch:{ all -> 0x0433 }
        L_0x0431:
            monitor-exit(r2)     // Catch:{ all -> 0x0433 }
            goto L_0x03e9
        L_0x0433:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0433 }
            throw r0
        L_0x0436:
            X.1KB r2 = r4.A01
            r0 = 17
            X.7Qr r1 = new X.7Qr
            r1.<init>(r4, r3, r0)
        L_0x043f:
            r2.CGP(r1)
            return
        L_0x0443:
            java.lang.Object r6 = r1.A01
            X.1hs r6 = (X.C32861hs) r6
            java.lang.Object r0 = r1.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r1.A03
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            java.util.Iterator r4 = r0.iterator()
        L_0x0453:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x046a
            java.lang.Object r3 = r4.next()
            X.1KB r2 = r6.A01
            r1 = 14
            X.7Qr r0 = new X.7Qr
            r0.<init>(r6, r3, r1)
            r2.CGP(r0)
            goto L_0x0453
        L_0x046a:
            r5.run()
            return
        L_0x046e:
            java.lang.Object r5 = r1.A01
            X.1T6 r5 = (X.AnonymousClass1T6) r5
            java.lang.Object r4 = r1.A02
            X.34B r4 = (X.AnonymousClass34B) r4
            java.lang.Object r3 = r1.A03
            X.2gh r3 = (X.C55982gh) r3
            X.2fe r12 = (X.C55362fe) r12
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            X.1Sa r1 = r5.A0A
            java.lang.String r0 = r4.A04()
            r1.A02(r0, r2)
            java.io.File r2 = r12.A00
            if (r2 == 0) goto L_0x0496
            r0 = 0
            X.2ex r1 = new X.2ex
            r1.<init>(r2, r0)
            X.1TJ r0 = r4.A0B
            r0.A04(r1)
        L_0x0496:
            X.1TJ r0 = r4.A0H
            r0.A04(r12)
            X.1Sj r2 = r5.A06
            X.2kI r0 = r4.A02()
            X.1So r1 = r0.A06
            boolean r0 = X.C63972u0.A04(r1)
            if (r0 == 0) goto L_0x04bf
            X.00H r0 = r2.A08
            java.lang.Object r0 = r0.get()
            X.CYy r0 = (X.C25125CYy) r0
            int r0 = r0.A00()
            r2 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x04c4
        L_0x04ba:
            X.73e r1 = r4.A0O
            monitor-enter(r1)
            r0 = 1
            goto L_0x04c6
        L_0x04bf:
            X.1So r0 = X.C26551So.A0j
            r2 = 1
            if (r1 == r0) goto L_0x04ba
        L_0x04c4:
            r2 = 0
            goto L_0x04ba
        L_0x04c6:
            r1.A0I = r0     // Catch:{ all -> 0x0502 }
            monitor-exit(r1)
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x04fe
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x04fe
            if (r2 != 0) goto L_0x04fe
            X.9i7 r0 = new X.9i7
            r0.<init>()
            r1.A0D(r0)
            r0 = 14
            r4.A00 = r0
            r4.A06(r0)
        L_0x04e4:
            X.1TJ r0 = r3.A02
            r0.A01()
            X.1TJ r0 = r3.A04
            r0.A01()
            X.1TJ r0 = r3.A05
            r0.A01()
            X.1TJ r0 = r3.A01
            r0.A01()
            X.1TJ r0 = r3.A03
            r0.A01()
            return
        L_0x04fe:
            X.AnonymousClass1T6.A05(r5, r4, r12)
            goto L_0x04e4
        L_0x0502:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0505:
            java.lang.Object r3 = r1.A01
            X.1To r3 = (X.C26811To) r3
            java.lang.Object r2 = r1.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Object r1 = r1.A03
            X.10I r0 = r3.A0W
            r0.CEz(r2)
            X.1Ta r0 = r3.A09
            r0.unregisterObserver(r1)
            return
        L_0x051a:
            X.1Cd r0 = r2.A03     // Catch:{ Exception -> 0x0561 }
            X.1au r4 = r0.A05()     // Catch:{ Exception -> 0x0561 }
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x0557 }
            r0 = 0
            X.C60502o8.A01(r11, r0)     // Catch:{ all -> 0x054d }
            X.00H r0 = r2.A04     // Catch:{ all -> 0x054d }
            X.1W6 r1 = X.C17880vN.A0c(r0)     // Catch:{ all -> 0x054d }
            r0 = -1
            r1.A05(r11, r0)     // Catch:{ all -> 0x054d }
            X.1hW r2 = r2.A01     // Catch:{ all -> 0x054d }
            long r0 = r11.A0x     // Catch:{ all -> 0x054d }
            int r2 = r2.A00(r4, r0)     // Catch:{ all -> 0x054d }
            r5.A00()     // Catch:{ all -> 0x054d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x054d }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnail deleting rows:"
            X.C17900vP.A0j(r0, r1, r2)     // Catch:{ all -> 0x054d }
            r5.close()     // Catch:{ all -> 0x0557 }
            r4.close()     // Catch:{ Exception -> 0x0561 }
            return
        L_0x054d:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0552 }
            goto L_0x0556
        L_0x0552:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0557 }
        L_0x0556:
            throw r1     // Catch:{ all -> 0x0557 }
        L_0x0557:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x055c }
            goto L_0x0560
        L_0x055c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0561 }
        L_0x0560:
            throw r1     // Catch:{ Exception -> 0x0561 }
        L_0x0561:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            return
        L_0x0566:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0566 }
            throw r0
        L_0x0569:
            X.17r r1 = r14.A00     // Catch:{ IOException -> 0x0580 }
            boolean r0 = r1.A0m(r15)     // Catch:{ IOException -> 0x0580 }
            if (r0 != 0) goto L_0x057d
            boolean r0 = r1.A0l(r15)     // Catch:{ IOException -> 0x0580 }
            if (r0 == 0) goto L_0x0586
            boolean r0 = r1.A0n(r15)     // Catch:{ IOException -> 0x0580 }
            if (r0 != 0) goto L_0x0586
        L_0x057d:
            r18 = 1
            goto L_0x0586
        L_0x0580:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/isPrivateManagedMediaFile "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0586:
            r19 = r4
            r17 = r3
            r16 = r2
            r14.A05(r15, r16, r17, r18, r19)
            return
        L_0x0590:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0590 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AW.accept(java.lang.Object):void");
    }
}
